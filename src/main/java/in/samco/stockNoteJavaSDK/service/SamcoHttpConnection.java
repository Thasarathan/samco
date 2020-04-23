package in.samco.stockNoteJavaSDK.service;

import java.io.IOException;
import java.util.HashMap;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientResponseException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import in.samco.stockNoteJavaSDK.payload.request.EquitySearchRequest;
import in.samco.stockNoteJavaSDK.payload.request.LoginRequest;
import in.samco.stockNoteJavaSDK.payload.request.OptionChainRequest;
import in.samco.stockNoteJavaSDK.payload.request.OrderRequest;
import in.samco.stockNoteJavaSDK.payload.request.OrderStatusRequest;
import in.samco.stockNoteJavaSDK.payload.request.QuoteRequest;
import in.samco.stockNoteJavaSDK.payload.request.UserLimitRequest;
import in.samco.stockNoteJavaSDK.payload.response.EquitySearchResponse;
import in.samco.stockNoteJavaSDK.payload.response.OptionChainResponse;
import in.samco.stockNoteJavaSDK.payload.response.OrderResponse;
import in.samco.stockNoteJavaSDK.payload.response.OrderStatusResponse;
import in.samco.stockNoteJavaSDK.payload.response.QuoteResponse;
import in.samco.stockNoteJavaSDK.payload.response.UserLimitResponse;
import in.samco.stockNoteJavaSDK.utils.Utils;

public class SamcoHttpConnection {

	private static final Logger log = LoggerFactory.getLogger(SamcoHttpConnection.class);
	private static final Routes routes = new Routes();
	private static final Utils utils = new Utils();
	private static final Gson gson = new Gson();
	private String sessionToken;

	public String getLoginSession(LoginRequest loginRequest) throws IOException {
		String session = null;
		try {
			String loginUrl = routes.get("login");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			ObjectMapper obj = new ObjectMapper();
			String reqString = obj.writeValueAsString(loginRequest);
			HttpEntity<String> entity = new HttpEntity<String>(reqString, headers);

			ResponseEntity<?> responseEntity = utils.getRestTemplateResponse(loginUrl, "POST", entity, String.class,
					null);

			String responseBody = (String) responseEntity.getBody();
			SamcoHttpConnection json = gson.fromJson(responseBody, SamcoHttpConnection.class);

			if (json.sessionToken != null) {
				session = json.sessionToken;
			}
		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
		}

		return session;
	}

	public OptionChainResponse getOptionChainDetails(OptionChainRequest optionChainRequest)
			throws JSONException, IOException {
		OptionChainResponse optionChainResponse = null;

		try {
			String optionChainUrl = routes.get("option.chain")
					.replace(":exchange", "exchange=" + optionChainRequest.getExchange())
					.replace(":searchSymbolName", "&searchSymbolName=" + optionChainRequest.getSearchSymbolName());

			if (optionChainRequest.getExpiryDate() != null) {
				optionChainUrl = optionChainUrl.replaceAll(":expiryDate",
						"&expiryDate=" + optionChainRequest.getExpiryDate());
			} else {
				optionChainUrl = optionChainUrl.replaceAll(":expiryDate", "");
			}

			if (optionChainRequest.getStrikePrice() != null) {
				optionChainUrl = optionChainUrl.replaceAll(":strikePrice",
						"&strikePrice=" + optionChainRequest.getStrikePrice());
			} else {
				optionChainUrl = optionChainUrl.replaceAll(":strikePrice", "");
			}

			if (optionChainRequest.getOptionType() != null) {
				optionChainUrl = optionChainUrl.replaceAll(":optionType",
						"&optionType=" + optionChainRequest.getOptionType());
			} else {
				optionChainUrl = optionChainUrl.replaceAll(":optionType", "");
			}

			ObjectMapper objectMapper = new ObjectMapper();
			HashMap<String, String> params = objectMapper.convertValue(optionChainRequest, HashMap.class);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", optionChainRequest.getSessionToken());
			HttpEntity<String> entity = new HttpEntity<String>(headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(optionChainUrl, "GET", entity, OptionChainResponse.class,
						params);
				optionChainResponse = (OptionChainResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				optionChainResponse = gson.fromJson(e.getResponseBodyAsString(), OptionChainResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
		}

		return optionChainResponse;
	}

	public EquitySearchResponse getEquitySearchDetails(EquitySearchRequest equitySearchRequest)
			throws JSONException, IOException {
		EquitySearchResponse equitySearchResponse = null;

		try {
			String equitySearchUrl = routes.get("equity.search")
					.replace(":exchange", "exchange=" + equitySearchRequest.getExchange())
					.replace(":searchSymbolName", "&searchSymbolName=" + equitySearchRequest.getSearchSymbolName());

			ObjectMapper objectMapper = new ObjectMapper();
			HashMap<String, String> params = objectMapper.convertValue(equitySearchRequest, HashMap.class);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", equitySearchRequest.getSessionToken());
			HttpEntity<String> entity = new HttpEntity<String>(headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(equitySearchUrl, "GET", entity,
						EquitySearchResponse.class, params);
				equitySearchResponse = (EquitySearchResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				equitySearchResponse = gson.fromJson(e.getResponseBodyAsString(), EquitySearchResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
		}

		return equitySearchResponse;
	}

	public QuoteResponse getQuoteDetails(QuoteRequest quoteRequest) throws JSONException, IOException {
		QuoteResponse quoteResponse = null;

		try {
			String equitySearchUrl = routes.get("quote.search")
					.replace(":exchange", "exchange=" + quoteRequest.getExchange())
					.replace(":symbolName", "&symbolName=" + quoteRequest.getSearchSymbolName());

			ObjectMapper objectMapper = new ObjectMapper();
			HashMap<String, String> params = objectMapper.convertValue(quoteRequest, HashMap.class);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", quoteRequest.getSessionToken());
			HttpEntity<String> entity = new HttpEntity<String>(headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(equitySearchUrl, "GET", entity, QuoteResponse.class,
						params);
				quoteResponse = (QuoteResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				quoteResponse = gson.fromJson(e.getResponseBodyAsString(), QuoteResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
		}

		return quoteResponse;
	}

	public OrderResponse placeOrder(OrderRequest orderRequest) throws JSONException, IOException {
		OrderResponse orderResponse = null;

		try {
			String placeOrderUrl = routes.get("place.order");

			ObjectMapper obj = new ObjectMapper();
			String reqString = obj.writeValueAsString(orderRequest);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", orderRequest.getSessionToken());
			HttpEntity<String> entity = new HttpEntity<String>(reqString, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(placeOrderUrl, "POST", entity, OrderResponse.class,
						null);
				orderResponse = (OrderResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				orderResponse = gson.fromJson(e.getResponseBodyAsString(), OrderResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
		}

		return orderResponse;
	}

	public OrderStatusResponse getOrderStatus(OrderStatusRequest orderStatusRequest) throws JSONException, IOException {
		OrderStatusResponse orderStatusResponse = null;

		try {
			String orderStatusUrl = routes.get("order.status").replace(":orderNumber",
					"orderNumber=" + orderStatusRequest.getOrderNumber());

			ObjectMapper objectMapper = new ObjectMapper();
			HashMap<String, String> params = objectMapper.convertValue(orderStatusRequest, HashMap.class);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", orderStatusRequest.getSessionToken());
			HttpEntity<String> entity = new HttpEntity<String>(headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(orderStatusUrl, "GET", entity, OrderStatusResponse.class,
						params);
				orderStatusResponse = (OrderStatusResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				orderStatusResponse = gson.fromJson(e.getResponseBodyAsString(), OrderStatusResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
		}

		return orderStatusResponse;
	}

	public UserLimitResponse getUserLimits(UserLimitRequest userLimitRequest) throws JSONException, IOException {
		UserLimitResponse userLimitResponse = null;

		try {
			String userLimitUrl = routes.get("user.limit");

			ObjectMapper objectMapper = new ObjectMapper();
			HashMap<String, String> params = objectMapper.convertValue(userLimitRequest, HashMap.class);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", userLimitRequest.getSessionToken());
			HttpEntity<String> entity = new HttpEntity<String>(headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(userLimitUrl, "GET", entity, UserLimitResponse.class,
						params);
				userLimitResponse = (UserLimitResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				userLimitResponse = gson.fromJson(e.getResponseBodyAsString(), UserLimitResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
		}

		return userLimitResponse;
	}

}
