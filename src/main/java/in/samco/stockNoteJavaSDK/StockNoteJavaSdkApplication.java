package in.samco.stockNoteJavaSDK;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.samco.stockNoteJavaSDK.payload.request.EquitySearchRequest;
import in.samco.stockNoteJavaSDK.payload.response.EquitySearchResponse;
import in.samco.stockNoteJavaSDK.service.SamcoHttpConnection;

@SpringBootApplication
public class StockNoteJavaSdkApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(StockNoteJavaSdkApplication.class, args);

//		SamcoHttpConnection httpConnection = new SamcoHttpConnection();
		SamcoHttpConnection httpConnection = new SamcoHttpConnection("uat");
//		ObjectMapper objectMapper = new ObjectMapper();
		String prettyJsonResponse;

		try {

//			LoginRequest login = new LoginRequest("DA35672", "avinash@4", "1993");
//			LoginResponse loginResponse = httpConnection.getLoginSession(login);
//
//			ObjectMapper objectMapper = new ObjectMapper();
//			String prettyJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginResponse);
//			System.out.println("login session ----->>> " + prettyJsonString);

//			LoginRequest loginRequest = new LoginRequest("DT30974", "Password@123", "1993");
//			LoginResponse loginResponse = httpConnection.getLoginSession(loginRequest);
//			String session = loginResponse.getSessionToken();
//			System.out.println("session " + session);

			EquitySearchRequest equitySearchRequest = new EquitySearchRequest("12d2a66bad113984b274c4286c419548", "MCX",
					"GOLD");
			EquitySearchResponse equitySearchDetails = httpConnection.getEquitySearchDetails(equitySearchRequest);

			ObjectMapper objectMapper = new ObjectMapper();
			String prettyJsonString = objectMapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(equitySearchDetails);
			System.out.println("equity search res --->>>  " + prettyJsonString);

		} catch (JSONException ex) {
			System.out.println("Exception caught while fetching trade api : " + ex);
		}

	}

}
