package in.samco.stockNoteJavaSDK.service;

import java.io.IOException;
import java.util.HashMap;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import in.samco.stockNoteJavaSDK.payload.request.EquitySearchRequest;
import in.samco.stockNoteJavaSDK.payload.request.LoginRequest;
import in.samco.stockNoteJavaSDK.payload.request.OptionChainRequest;
import in.samco.stockNoteJavaSDK.payload.request.OrderRequest;
import in.samco.stockNoteJavaSDK.payload.request.QuoteRequest;
import in.samco.stockNoteJavaSDK.utils.Utils;

public class SamcoHttpConnection {

	private final Logger log = LoggerFactory.getLogger(SamcoHttpConnection.class);
	RestTemplate restTemplate = new RestTemplate();
	Routes routes = new Routes();
	Utils utils = new Utils();

	private String sessionToken;

	public String getLoginSession(LoginRequest loginRequest) throws IOException {
		String session = null;
		try {
			String loginUrl = routes.get("login");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			ObjectMapper obj = new ObjectMapper();
			String reqString = obj.writeValueAsString(loginRequest);

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

	public String getOptionChainDetails(OptionChainRequest optionChainRequest) throws JSONException, IOException {
		String prettyJsonString = null;

		try {

			log.info("option chain url : " + routes.get("option.chain"));
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

			utils.setTimeout(restTemplate);
			HttpEntity<String> response = null;
			String responseBodyAsString = null;
			try {
				response = restTemplate.exchange(optionChainUrl, HttpMethod.GET, entity, String.class, params);
			} catch (RestClientResponseException e) {
				responseBodyAsString = e.getResponseBodyAsString();
			}

			String responseBody;
			if (response != null) {
				responseBody = response.getBody();
			} else {
				responseBody = responseBodyAsString;
			}

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

	public String getEquitySearchDetails(EquitySearchRequest equitySearchRequest) throws JSONException, IOException {
		String prettyJsonString = null;

		try {

			log.info("equitySearchUrl  " + routes.get("equity.search"));
			log.info("equitySearchRequest.getSessionToken() "+equitySearchRequest.getSessionToken());
			String equitySearchUrl = routes.get("equity.search")
					.replace(":exchange", "exchange=" + equitySearchRequest.getExchange())
					.replace(":searchSymbolName", "&searchSymbolName=" + equitySearchRequest.getSearchSymbolName());

			ObjectMapper objectMapper = new ObjectMapper();
			HashMap<String, String> params = objectMapper.convertValue(equitySearchRequest, HashMap.class);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", equitySearchRequest.getSessionToken());

			HttpEntity<String> entity = new HttpEntity<String>(headers);

//			utils.setTimeout(restTemplate);
			HttpEntity<String> response = null;
			String responseBodyAsString = null;
			try {
				response = restTemplate.exchange(equitySearchUrl, HttpMethod.GET, entity, String.class, params);
			} catch (RestClientResponseException e) {
				responseBodyAsString = e.getResponseBodyAsString();
			}

			String responseBody;
			if (response != null) {
				responseBody = response.getBody();
			} else {
				responseBody = responseBodyAsString;
			}

			prettyJsonString = utils.prettyJson(responseBody);

		} catch (Exception e) {
			System.out.println("Exception " + e);
			System.out.println("Exception getMessage " + e.getMessage());

			if (e.getMessage().contains("Read timed out")) {
				String response = utils.getSamcoException("Time Out Exception while fetching Equity Search .");
				prettyJsonString = utils.prettyJson(response);
				return prettyJsonString;

			} else if (e.getMessage().contains("Connection refused")) {

				String response = utils.getSamcoException("Connection refused while fetching Equity Search .");
				prettyJsonString = utils.prettyJson(response);
				return prettyJsonString;
			}
		}

		return prettyJsonString;
	}

	public String getQuoteDetails(QuoteRequest quoteRequest) throws JSONException, IOException {
		String prettyJsonString = null;

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

//			utils.setTimeout(restTemplate);
			HttpEntity<String> response = null;
			String responseBodyAsString = null;
			try {
				response = restTemplate.exchange(equitySearchUrl, HttpMethod.GET, entity, String.class, params);
			} catch (RestClientResponseException e) {
				responseBodyAsString = e.getResponseBodyAsString();
			}

			String responseBody;
			if (response != null) {
				responseBody = response.getBody();
			} else {
				responseBody = responseBodyAsString;
			}

			prettyJsonString = utils.prettyJson(responseBody);

		} catch (Exception e) {
			System.out.println("Exception " + e);
			System.out.println("Exception getMessage " + e.getMessage());

			if (e.getMessage().contains("Read timed out")) {
				String response = utils.getSamcoException("Time Out Exception while fetching Quote data.");
				prettyJsonString = utils.prettyJson(response);
				return prettyJsonString;

			} else if (e.getMessage().contains("Connection refused")) {

				String response = utils.getSamcoException("Connection refused while fetching Quote data.");
				prettyJsonString = utils.prettyJson(response);
				return prettyJsonString;
			}
		}

		return prettyJsonString;
	}

	public String placeOrder(OrderRequest orderRequest) throws JSONException, IOException {
		String prettyJsonString = null;

		try {

			String placeOrderUrl = routes.get("place.order");

			ObjectMapper obj = new ObjectMapper();
			String reqString = obj.writeValueAsString(orderRequest);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", orderRequest.getSessionToken());

			HttpEntity<String> entity = new HttpEntity<String>(reqString, headers);

			utils.setTimeout(restTemplate);
			HttpEntity<String> response = null;
			String responseBodyAsString = null;
			try {
				response = restTemplate.postForEntity(placeOrderUrl, entity, String.class);
			} catch (RestClientResponseException e) {
				responseBodyAsString = e.getResponseBodyAsString();
			}

			String responseBody;
			if (response != null) {
				responseBody = response.getBody();
			} else {
				responseBody = responseBodyAsString;
			}

			prettyJsonString = utils.prettyJson(responseBody);

		} catch (Exception e) {
			System.out.println("Exception " + e);
			System.out.println("Exception getMessage " + e.getMessage());

			if (e.getMessage().contains("Read timed out")) {
				String response = utils.getSamcoException("Time Out Exception while Placing Order.");
				prettyJsonString = utils.prettyJson(response);
				return prettyJsonString;

			} else if (e.getMessage().contains("Connection refused")) {

				String response = utils.getSamcoException("Connection refused while Placing Order.");
				prettyJsonString = utils.prettyJson(response);
				return prettyJsonString;
			}
		}

		return prettyJsonString;
	}

}
