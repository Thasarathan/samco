package in.samco;

import java.io.IOException;

import org.json.JSONException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.samco.stockNoteJavaSDK.payload.request.LoginRequest;
import in.samco.stockNoteJavaSDK.payload.request.OrderRequest;
import in.samco.stockNoteJavaSDK.payload.request.QuoteRequest;
import in.samco.stockNoteJavaSDK.payload.response.LoginResponse;
import in.samco.stockNoteJavaSDK.payload.response.OrderResponse;
import in.samco.stockNoteJavaSDK.payload.response.QuoteResponse;
import in.samco.stockNoteJavaSDK.service.SamcoHttpConnection;

public class ClientApplication {
	public static void main(String[] args) {

		SamcoHttpConnection httpConnection = new SamcoHttpConnection("uat");
		ObjectMapper mapper = new ObjectMapper();
		String prettyJsonResponse;	

		try {
			LoginRequest loginRequest = new LoginRequest("DA35672", "avinash@4", "1993");
			LoginResponse loginResponse = httpConnection.getLoginSession(loginRequest);
			String session = loginResponse.getSessionToken();

			if (loginResponse.getSessionToken() != null && !"".equalsIgnoreCase(loginResponse.getSessionToken())) {
				System.out.println("session " + session);

				QuoteRequest quoteRequest = new QuoteRequest(session, "NSE", "SBIN");
				QuoteResponse quoteResponse = httpConnection.getQuoteDetails(quoteRequest);

				if ("Success".equalsIgnoreCase(quoteResponse.getStatus())) {

					OrderRequest orderRequest = new OrderRequest();
					orderRequest.setSessionToken(session);
					orderRequest.setSymbolName("RELIANCE");
					orderRequest.setExchange("BSE");
					orderRequest.setTransactionType("BUY");
					orderRequest.setOrderType("MKT");
					orderRequest.setQuantity("2");
					orderRequest.setDisclosedQuantity("");
					orderRequest.setOrderValidity("DAY");
					orderRequest.setProductType("MIS");
					orderRequest.setAfterMarketOrderFlag("NO");
					OrderResponse placeOrder = httpConnection.placeOrder(orderRequest);

					if ("Success".equalsIgnoreCase(placeOrder.getStatus())) {
						prettyJsonResponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(placeOrder);
						System.out.println("place order success response : " + prettyJsonResponse);
					} else {
						prettyJsonResponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(placeOrder);
						System.out.println("place order api failure response : " + prettyJsonResponse);
					}
				} else {
					prettyJsonResponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(quoteResponse);
					System.out.println("quote api failure response : " + prettyJsonResponse);
				}

			} else {
				prettyJsonResponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginResponse);
				System.out.println("login api failure response : " + prettyJsonResponse);
			}

		} catch (JSONException ex) {
			System.out.println("Exception caught while fetching trade api : " + ex);
		} catch (IOException ex) {
			System.out.println("Exception caught while fetching trade api : " + ex);
		}
	}
}
