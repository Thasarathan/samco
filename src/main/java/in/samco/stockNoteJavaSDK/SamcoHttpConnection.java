package in.samco.stockNoteJavaSDK;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import in.samco.entity.Login;
import in.samco.utils.Utils;

public class SamcoHttpConnection {

	RestTemplate restTemplate = new RestTemplate();
	Routes routes = new Routes();
	Utils utils = new Utils();

	private String sessionToken;

	public String getLoginSession(String userId, String password, String yob) throws IOException {
		String session = null;
		try {
			String loginUrl = Routes.loginUrl;

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			Login login = new Login(userId, password, yob);
			ObjectMapper obj = new ObjectMapper();
			String reqString = obj.writeValueAsString(login);

			HttpEntity<String> request = new HttpEntity<String>(reqString, headers);

			utils.setTimeout(restTemplate);
			ResponseEntity<String> response = restTemplate.postForEntity(loginUrl, request, String.class);

			String responseBody = response.getBody();
			Gson gson = new Gson();
			SamcoHttpConnection json = gson.fromJson(responseBody, SamcoHttpConnection.class);

			if (json.sessionToken != null) {
				session = json.sessionToken;
			}
		} catch (Exception e) {
			System.out.println("Exception " + e);
			System.out.println("Exception getMessage " + e.getMessage());

			if (e.getMessage().contains("Read timed out")) {
				String response = utils.getSamcoException("Time Out Exception while reading option chain api.");
				session = utils.prettyJson(response);
				return session;

			} else if (e.getMessage().contains("Connection refused")) {

				String response = utils.getSamcoException("Connection refused while reading option chain api.");
				session = utils.prettyJson(response);
				return session;
			}
		}

		return session;
	}

	public String getOptionChainDetails(String session, String exchange, String symbol, String expiryDate,
			String strikePrice, String optionType) throws JSONException, IOException {
		String prettyJsonString = null;

		try {

			String optionChainUrl = Routes.optionChain.replace(":exchange", "exchange=" + exchange).replace(":symbol",
					"&searchSymbolName=" + symbol);

			if (expiryDate != null) {
				optionChainUrl = optionChainUrl.replaceAll(":expiryDate", "&expiryDate=" + expiryDate);
			} else {
				optionChainUrl = optionChainUrl.replaceAll(":expiryDate", "");
			}

			if (strikePrice != null) {
				optionChainUrl = optionChainUrl.replaceAll(":strikePrice", "&strikePrice=" + strikePrice);
			} else {
				optionChainUrl = optionChainUrl.replaceAll(":strikePrice", "");
			}

			if (optionType != null) {
				optionChainUrl = optionChainUrl.replaceAll(":optionType", "&optionType=" + optionType);
			} else {
				optionChainUrl = optionChainUrl.replaceAll(":optionType", "");
			}

			Map<String, String> params = new HashMap<String, String>();
			params.put("exchange", exchange);
			params.put("searchSymbolName", symbol);
			params.put("expiryDate", expiryDate);
			params.put("strikePrice", strikePrice);
			params.put("optionType", optionType);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", session);

			HttpEntity<String> entity = new HttpEntity<String>(headers);

			utils.setTimeout(restTemplate);
			HttpEntity<String> response = restTemplate.exchange(optionChainUrl, HttpMethod.GET, entity, String.class,
					params);

			String responseBody = response.getBody();
			prettyJsonString = utils.prettyJson(responseBody);

		} catch (Exception e) {
			System.out.println("Exception " + e);
			System.out.println("Exception getMessage " + e.getMessage());

			if (e.getMessage().contains("Read timed out")) {
				String response = utils.getSamcoException("Time Out Exception while reading option chain api.");
				prettyJsonString = utils.prettyJson(response);
				return prettyJsonString;

			} else if (e.getMessage().contains("Connection refused")) {

				String response = utils.getSamcoException("Connection refused while reading option chain api.");
				prettyJsonString = utils.prettyJson(response);
				return prettyJsonString;
			}
		}

		return prettyJsonString;
	}

}
