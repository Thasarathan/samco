package in.samco.stockNoteJavaSDK.service;

import java.io.IOException;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientResponseException;

import com.google.gson.Gson;

import in.samco.stockNoteJavaSDK.payload.request.EquitySearchRequest;
import in.samco.stockNoteJavaSDK.payload.request.LoginRequest;
import in.samco.stockNoteJavaSDK.payload.request.OptionChainRequest;
import in.samco.stockNoteJavaSDK.payload.request.OrderRequest;
import in.samco.stockNoteJavaSDK.payload.request.OrderStatusRequest;
import in.samco.stockNoteJavaSDK.payload.request.QuoteRequest;
import in.samco.stockNoteJavaSDK.payload.request.UserLimitRequest;
import in.samco.stockNoteJavaSDK.payload.response.EquitySearchResponse;
import in.samco.stockNoteJavaSDK.payload.response.LoginResponse;
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

	public LoginResponse getLoginSession(LoginRequest loginRequest) {
		LoginResponse loginResponse = null;
		try {
			String loginUrl = routes.get("login");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<LoginRequest> entity = new HttpEntity<LoginRequest>(loginRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(loginUrl, "POST", entity, LoginResponse.class);
				loginResponse = (LoginResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				loginResponse = gson.fromJson(e.getResponseBodyAsString(), LoginResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
		}

		return loginResponse;
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

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", optionChainRequest.getSessionToken());
			HttpEntity<OptionChainRequest> entity = new HttpEntity<OptionChainRequest>(optionChainRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(optionChainUrl, "GET", entity,
						OptionChainResponse.class);
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

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", equitySearchRequest.getSessionToken());
			HttpEntity<EquitySearchRequest> entity = new HttpEntity<EquitySearchRequest>(equitySearchRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(equitySearchUrl, "GET", entity,
						EquitySearchResponse.class);
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

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", quoteRequest.getSessionToken());
			HttpEntity<QuoteRequest> entity = new HttpEntity<QuoteRequest>(quoteRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(equitySearchUrl, "GET", entity, QuoteResponse.class);
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

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", orderRequest.getSessionToken());
			HttpEntity<OrderRequest> entity = new HttpEntity<OrderRequest>(orderRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(placeOrderUrl, "POST", entity, OrderResponse.class);
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

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", orderStatusRequest.getSessionToken());
			HttpEntity<OrderStatusRequest> entity = new HttpEntity<OrderStatusRequest>(orderStatusRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(orderStatusUrl, "GET", entity,
						OrderStatusResponse.class);
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

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", userLimitRequest.getSessionToken());
			HttpEntity<UserLimitRequest> entity = new HttpEntity<UserLimitRequest>(userLimitRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(userLimitUrl, "GET", entity, UserLimitResponse.class);
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
