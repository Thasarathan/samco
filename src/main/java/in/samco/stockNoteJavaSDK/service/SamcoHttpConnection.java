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

import in.samco.stockNoteJavaSDK.payload.request.CancelOrderRequest;
import in.samco.stockNoteJavaSDK.payload.request.CandleDataRequest;
import in.samco.stockNoteJavaSDK.payload.request.EquitySearchRequest;
import in.samco.stockNoteJavaSDK.payload.request.ExitBORequest;
import in.samco.stockNoteJavaSDK.payload.request.IndexCandleDataRequest;
import in.samco.stockNoteJavaSDK.payload.request.LoginRequest;
import in.samco.stockNoteJavaSDK.payload.request.ModifyOrderRequest;
import in.samco.stockNoteJavaSDK.payload.request.OptionChainRequest;
import in.samco.stockNoteJavaSDK.payload.request.OrderRequest;
import in.samco.stockNoteJavaSDK.payload.request.OrderRequestBO;
import in.samco.stockNoteJavaSDK.payload.request.OrderRequestCO;
import in.samco.stockNoteJavaSDK.payload.request.OrderStatusRequest;
import in.samco.stockNoteJavaSDK.payload.request.PositionConversionRequest;
import in.samco.stockNoteJavaSDK.payload.request.PositionRequest;
import in.samco.stockNoteJavaSDK.payload.request.QuoteRequest;
import in.samco.stockNoteJavaSDK.payload.request.TriggerOrderRequest;
import in.samco.stockNoteJavaSDK.payload.request.UserRequest;
import in.samco.stockNoteJavaSDK.payload.response.CancelOrderResponse;
import in.samco.stockNoteJavaSDK.payload.response.EquitySearchResponse;
import in.samco.stockNoteJavaSDK.payload.response.ExitBOResponse;
import in.samco.stockNoteJavaSDK.payload.response.HistoricalCandleResponse;
import in.samco.stockNoteJavaSDK.payload.response.HoldingResponse;
import in.samco.stockNoteJavaSDK.payload.response.IndexCandleDataResponse;
import in.samco.stockNoteJavaSDK.payload.response.IndexIntraDayCandleDataResponse;
import in.samco.stockNoteJavaSDK.payload.response.IntradayCandleResponse;
import in.samco.stockNoteJavaSDK.payload.response.LoginResponse;
import in.samco.stockNoteJavaSDK.payload.response.LogoutResponse;
import in.samco.stockNoteJavaSDK.payload.response.OptionChainResponse;
import in.samco.stockNoteJavaSDK.payload.response.OrderBookResponse;
import in.samco.stockNoteJavaSDK.payload.response.OrderResponse;
import in.samco.stockNoteJavaSDK.payload.response.OrderStatusResponse;
import in.samco.stockNoteJavaSDK.payload.response.PositionConversionResponse;
import in.samco.stockNoteJavaSDK.payload.response.PositionResponse;
import in.samco.stockNoteJavaSDK.payload.response.QuoteResponse;
import in.samco.stockNoteJavaSDK.payload.response.TradeBookResponse;
import in.samco.stockNoteJavaSDK.payload.response.TriggerOrdersResponse;
import in.samco.stockNoteJavaSDK.payload.response.UserLimitResponse;
import in.samco.stockNoteJavaSDK.utils.Utils;

public class SamcoHttpConnection {

	private static final Logger log = LoggerFactory.getLogger(SamcoHttpConnection.class);
	private static final Routes routes = new Routes();
	private static final Utils utils = new Utils();
	private static final Gson gson = new Gson();

	public SamcoHttpConnection() {

	}

	public SamcoHttpConnection(String environment, int connTimeOut, int readTimeOut) {
		routes.environment = environment;
		utils.connTimeOut = connTimeOut;
		utils.readTimeOut = readTimeOut;
	}

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
			loginResponse = new LoginResponse();
			loginResponse.setStatus("failure");
			loginResponse.setStatusMessage(e.getMessage());
			return loginResponse;
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
			optionChainResponse = new OptionChainResponse();
			optionChainResponse.setStatus("failure");
			optionChainResponse.setStatusMessage(e.getMessage());
			return optionChainResponse;
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
			equitySearchResponse = new EquitySearchResponse();
			equitySearchResponse.setStatus("failure");
			equitySearchResponse.setStatusMessage(e.getMessage());
			return equitySearchResponse;
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
			quoteResponse = new QuoteResponse();
			quoteResponse.setStatus("failure");
			quoteResponse.setStatusMessage(e.getMessage());
			return quoteResponse;
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
			orderResponse = new OrderResponse();
			orderResponse.setStatus("failure");
			orderResponse.setStatusMessage(e.getMessage());
			return orderResponse;
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
			orderStatusResponse = new OrderStatusResponse();
			orderStatusResponse.setOrderStatus("failure");
			orderStatusResponse.setStatusMessage(e.getMessage());
			return orderStatusResponse;
		}

		return orderStatusResponse;
	}

	public UserLimitResponse getUserLimits(UserRequest userLimitRequest) throws JSONException, IOException {
		UserLimitResponse userLimitResponse = null;

		try {
			String userLimitUrl = routes.get("user.limit");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", userLimitRequest.getSessionToken());
			HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userLimitRequest, headers);

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
			userLimitResponse = new UserLimitResponse();
			userLimitResponse.setStatus("failure");
			userLimitResponse.setStatusMessage(e.getMessage());
			return userLimitResponse;
		}

		return userLimitResponse;
	}

	public OrderResponse placeOrderCO(OrderRequestCO orderRequestCO) throws JSONException, IOException {
		return placeOrder(orderRequestCO);
	}

	public OrderResponse placeOrderBO(OrderRequestBO orderRequestBO) throws JSONException, IOException {
		return placeOrder(orderRequestBO);
	}

	public CancelOrderResponse cancelOrder(CancelOrderRequest cancelOrderRequest) throws JSONException, IOException {
		CancelOrderResponse cancelOrderResponse = null;

		try {
			String cancelOrderUrl = routes.get("cancel.order").replace(":orderNumber",
					"orderNumber=" + cancelOrderRequest.getOrderNumber());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", cancelOrderRequest.getSessionToken());
			HttpEntity<CancelOrderRequest> entity = new HttpEntity<CancelOrderRequest>(cancelOrderRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(cancelOrderUrl, "DELETE", entity,
						CancelOrderResponse.class);
				cancelOrderResponse = (CancelOrderResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				cancelOrderResponse = gson.fromJson(e.getResponseBodyAsString(), CancelOrderResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			cancelOrderResponse = new CancelOrderResponse();
			cancelOrderResponse.setStatus("failure");
			cancelOrderResponse.setStatusMessage(e.getMessage());
			return cancelOrderResponse;
		}

		return cancelOrderResponse;
	}

	public OrderResponse modifyOrder(ModifyOrderRequest modifyOrderRequest) throws JSONException, IOException {
		OrderResponse modifyOrderResponse = null;

		try {
			String modifyOrderUrl = routes.get("modify.order").replace(":orderNumber",
					modifyOrderRequest.getOrderNumber());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", modifyOrderRequest.getSessionToken());
			HttpEntity<ModifyOrderRequest> entity = new HttpEntity<ModifyOrderRequest>(modifyOrderRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(modifyOrderUrl, "PUT", entity, OrderResponse.class);
				modifyOrderResponse = (OrderResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				modifyOrderResponse = gson.fromJson(e.getResponseBodyAsString(), OrderResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			modifyOrderResponse = new OrderResponse();
			modifyOrderResponse.setStatus("failure");
			modifyOrderResponse.setStatusMessage(e.getMessage());
			return modifyOrderResponse;
		}

		return modifyOrderResponse;
	}

	public TriggerOrdersResponse getTriggerOrderNumbers(TriggerOrderRequest triggerOrderRequest)
			throws JSONException, IOException {
		TriggerOrdersResponse triggerOrdersResponse = null;

		try {
			String triggerOrderUrl = routes.get("trigger.order").replace(":orderNumber",
					"orderNumber=" + triggerOrderRequest.getOrderNumber());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", triggerOrderRequest.getSessionToken());
			HttpEntity<TriggerOrderRequest> entity = new HttpEntity<TriggerOrderRequest>(triggerOrderRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(triggerOrderUrl, "GET", entity,
						TriggerOrdersResponse.class);
				triggerOrdersResponse = (TriggerOrdersResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				triggerOrdersResponse = gson.fromJson(e.getResponseBodyAsString(), TriggerOrdersResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			triggerOrdersResponse = new TriggerOrdersResponse();
			triggerOrdersResponse.setStatus("failure");
			triggerOrdersResponse.setStatusMessage(e.getMessage());
			return triggerOrdersResponse;
		}

		return triggerOrdersResponse;
	}

	public OrderBookResponse getOrderBook(UserRequest userRequest) throws JSONException, IOException {
		OrderBookResponse orderBookResponse = null;

		try {
			String equitySearchUrl = routes.get("order.book");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", userRequest.getSessionToken());
			HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(equitySearchUrl, "GET", entity, OrderBookResponse.class);
				orderBookResponse = (OrderBookResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				orderBookResponse = gson.fromJson(e.getResponseBodyAsString(), OrderBookResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			orderBookResponse = new OrderBookResponse();
			orderBookResponse.setStatus("failure");
			orderBookResponse.setStatusMessage(e.getMessage());
			return orderBookResponse;
		}

		return orderBookResponse;
	}

	public CancelOrderResponse cancelOrderCO(CancelOrderRequest cancelOrderRequest) throws JSONException, IOException {
		CancelOrderResponse cancelOrderResponse = null;

		try {
			String cancelOrderCOUrl = routes.get("exit.co").replace(":orderNumber",
					"orderNumber=" + cancelOrderRequest.getOrderNumber());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", cancelOrderRequest.getSessionToken());
			HttpEntity<CancelOrderRequest> entity = new HttpEntity<CancelOrderRequest>(cancelOrderRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(cancelOrderCOUrl, "DELETE", entity,
						CancelOrderResponse.class);
				cancelOrderResponse = (CancelOrderResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				cancelOrderResponse = gson.fromJson(e.getResponseBodyAsString(), CancelOrderResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			cancelOrderResponse = new CancelOrderResponse();
			cancelOrderResponse.setStatus("failure");
			cancelOrderResponse.setStatusMessage(e.getMessage());
			return cancelOrderResponse;
		}

		return cancelOrderResponse;
	}

	public ExitBOResponse cancelOrderBO(ExitBORequest exitBORequest) throws JSONException, IOException {
		ExitBOResponse exitBOResponse = null;

		try {
			String cancelOrderCOUrl = routes.get("exit.bo").replace(":orderNumber",
					"orderNumber=" + exitBORequest.getOrderNumber());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", exitBORequest.getSessionToken());
			HttpEntity<ExitBORequest> entity = new HttpEntity<ExitBORequest>(exitBORequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(cancelOrderCOUrl, "DELETE", entity,
						ExitBOResponse.class);
				exitBOResponse = (ExitBOResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				exitBOResponse = gson.fromJson(e.getResponseBodyAsString(), ExitBOResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			exitBOResponse = new ExitBOResponse();
			exitBOResponse.setStatus("failure");
			exitBOResponse.setStatusMessage(e.getMessage());
			return exitBOResponse;
		}

		return exitBOResponse;
	}

	public TradeBookResponse getTradeBook(UserRequest userRequest) throws JSONException, IOException {
		TradeBookResponse tradeBookResponse = null;

		try {
			String tradeBookUrl = routes.get("trade.book");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", userRequest.getSessionToken());
			HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(tradeBookUrl, "GET", entity, TradeBookResponse.class);
				tradeBookResponse = (TradeBookResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				tradeBookResponse = gson.fromJson(e.getResponseBodyAsString(), TradeBookResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			tradeBookResponse = new TradeBookResponse();
			tradeBookResponse.setStatus("failure");
			tradeBookResponse.setStatusMessage(e.getMessage());
			return tradeBookResponse;
		}

		return tradeBookResponse;
	}

	public HoldingResponse getHolding(UserRequest userRequest) throws JSONException, IOException {
		HoldingResponse holdingResponse = null;

		try {
			String tradeBookUrl = routes.get("holding");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", userRequest.getSessionToken());
			HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(tradeBookUrl, "GET", entity, HoldingResponse.class);
				holdingResponse = (HoldingResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				holdingResponse = gson.fromJson(e.getResponseBodyAsString(), HoldingResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			holdingResponse = new HoldingResponse();
			holdingResponse.setStatus("failure");
			holdingResponse.setStatusMessage(e.getMessage());
			return holdingResponse;
		}

		return holdingResponse;
	}

	public PositionResponse getPositions(PositionRequest positionRequest) throws JSONException, IOException {
		PositionResponse positionResponse = null;

		try {
			String positionUrl = routes.get("position").replace(":positionType",
					"positionType=" + positionRequest.getPositionType());
			;

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", positionRequest.getSessionToken());
			HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(positionRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(positionUrl, "GET", entity, PositionResponse.class);
				positionResponse = (PositionResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				positionResponse = gson.fromJson(e.getResponseBodyAsString(), PositionResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			positionResponse = new PositionResponse();
			positionResponse.setStatus("failure");
			positionResponse.setStatusMessage(e.getMessage());
			return positionResponse;
		}

		return positionResponse;
	}

	public PositionConversionResponse convertPosition(PositionConversionRequest positionConversionRequest)
			throws JSONException, IOException {
		PositionConversionResponse positionConversionResponse = null;

		try {
			String convertPositionUrl = routes.get("convert.position");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", positionConversionRequest.getSessionToken());
			HttpEntity<PositionConversionRequest> entity = new HttpEntity<PositionConversionRequest>(
					positionConversionRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(convertPositionUrl, "POST", entity,
						PositionConversionResponse.class);
				positionConversionResponse = (PositionConversionResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				positionConversionResponse = gson.fromJson(e.getResponseBodyAsString(),
						PositionConversionResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			positionConversionResponse = new PositionConversionResponse();
			positionConversionResponse.setStatus("failure");
			positionConversionResponse.setStatusMsg(e.getMessage());
			return positionConversionResponse;
		}

		return positionConversionResponse;
	}

	public HistoricalCandleResponse getHistoricalCandleData(CandleDataRequest candleDataRequest)
			throws JSONException, IOException {
		HistoricalCandleResponse historicalCandleResponse = null;

		try {
			String historicalCandleDataUrl = routes.get("history.candleData")
					.replace(":exchange", "exchange=" + candleDataRequest.getExchange())
					.replace(":symbolName", "&symbolName=" + candleDataRequest.getSymbolName())
					.replace(":fromDate", "&fromDate=" + candleDataRequest.getFromDate())
					.replace(":toDate", "&toDate=" + candleDataRequest.getToDate());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", candleDataRequest.getSessionToken());
			HttpEntity<CandleDataRequest> entity = new HttpEntity<CandleDataRequest>(candleDataRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(historicalCandleDataUrl, "GET", entity,
						HistoricalCandleResponse.class);
				historicalCandleResponse = (HistoricalCandleResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				historicalCandleResponse = gson.fromJson(e.getResponseBodyAsString(), HistoricalCandleResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			historicalCandleResponse = new HistoricalCandleResponse();
			historicalCandleResponse.setStatus("failure");
			historicalCandleResponse.setStatusMessage(e.getMessage());
			return historicalCandleResponse;
		}

		return historicalCandleResponse;
	}

	public IndexCandleDataResponse getIndexCandleData(IndexCandleDataRequest indexCandleDataRequest)
			throws JSONException, IOException {
		IndexCandleDataResponse indexCandleDataResponse = null;

		try {
			String historicalCandleDataUrl = routes.get("history.indexCandleData")
					.replace(":indexName", "indexName=" + indexCandleDataRequest.getIndexName())
					.replace(":fromDate", "&fromDate=" + indexCandleDataRequest.getFromDate())
					.replace(":toDate", "&toDate=" + indexCandleDataRequest.getToDate());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", indexCandleDataRequest.getSessionToken());
			HttpEntity<IndexCandleDataRequest> entity = new HttpEntity<IndexCandleDataRequest>(indexCandleDataRequest,
					headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(historicalCandleDataUrl, "GET", entity,
						IndexCandleDataResponse.class);
				indexCandleDataResponse = (IndexCandleDataResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				indexCandleDataResponse = gson.fromJson(e.getResponseBodyAsString(), IndexCandleDataResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			indexCandleDataResponse = new IndexCandleDataResponse();
			indexCandleDataResponse.setStatus("failure");
			indexCandleDataResponse.setStatusMessage(e.getMessage());
			return indexCandleDataResponse;
		}

		return indexCandleDataResponse;
	}

	public IntradayCandleResponse getIntradayCandleData(CandleDataRequest candleDataRequest)
			throws JSONException, IOException {
		IntradayCandleResponse intradayCandleResponse = null;

		try {
			String historicalCandleDataUrl = routes.get("intraday.candleData")
					.replace(":exchange", "exchange=" + candleDataRequest.getExchange())
					.replace(":symbolName", "&symbolName=" + candleDataRequest.getSymbolName())
					.replace(":fromDate", "&fromDate=" + candleDataRequest.getFromDate())
					.replace(":toDate", "&toDate=" + candleDataRequest.getToDate());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", candleDataRequest.getSessionToken());
			HttpEntity<CandleDataRequest> entity = new HttpEntity<CandleDataRequest>(candleDataRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(historicalCandleDataUrl, "GET", entity,
						IntradayCandleResponse.class);
				intradayCandleResponse = (IntradayCandleResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				intradayCandleResponse = gson.fromJson(e.getResponseBodyAsString(), IntradayCandleResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			intradayCandleResponse = new IntradayCandleResponse();
			intradayCandleResponse.setStatus("failure");
			intradayCandleResponse.setStatusMessage(e.getMessage());
			return intradayCandleResponse;
		}

		return intradayCandleResponse;
	}

	public IndexIntraDayCandleDataResponse getIndexIntradayCandleData(IndexCandleDataRequest indexCandleDataRequest)
			throws JSONException, IOException {
		IndexIntraDayCandleDataResponse indexIntraDayCandleDataResponse = null;

		try {
			String historicalCandleDataUrl = routes.get("intraday.indexCandleData")
					.replace(":indexName", "indexName=" + indexCandleDataRequest.getIndexName())
					.replace(":fromDate", "&fromDate=" + indexCandleDataRequest.getFromDate())
					.replace(":toDate", "&toDate=" + indexCandleDataRequest.getToDate());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", indexCandleDataRequest.getSessionToken());
			HttpEntity<IndexCandleDataRequest> entity = new HttpEntity<IndexCandleDataRequest>(indexCandleDataRequest,
					headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(historicalCandleDataUrl, "GET", entity,
						IndexIntraDayCandleDataResponse.class);
				indexIntraDayCandleDataResponse = (IndexIntraDayCandleDataResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				indexIntraDayCandleDataResponse = gson.fromJson(e.getResponseBodyAsString(),
						IndexIntraDayCandleDataResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			indexIntraDayCandleDataResponse = new IndexIntraDayCandleDataResponse();
			indexIntraDayCandleDataResponse.setStatus("failure");
			indexIntraDayCandleDataResponse.setStatusMessage(e.getMessage());
			return indexIntraDayCandleDataResponse;
		}

		return indexIntraDayCandleDataResponse;
	}

	public LogoutResponse Logout(UserRequest userRequest) throws JSONException, IOException {
		LogoutResponse logoutResponse = null;

		try {
			String logoutUrl = routes.get("logout");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("x-session-token", userRequest.getSessionToken());
			HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userRequest, headers);

			ResponseEntity<?> responseEntity = null;
			try {
				responseEntity = utils.getRestTemplateResponse(logoutUrl, "DELETE", entity, LogoutResponse.class);
				log.info("responseEntity.getBody() *********** "+responseEntity.getBody());
				logoutResponse = (LogoutResponse) responseEntity.getBody();

			} catch (RestClientResponseException e) {
				log.error("e.getResponseBodyAsString() ************    "+e.getResponseBodyAsString());
				logoutResponse = gson.fromJson(e.getResponseBodyAsString(), LogoutResponse.class);
			}

		} catch (Exception e) {
			log.error("Exception " + e);
			log.error("Exception getMessage " + e.getMessage());
			logoutResponse = new LogoutResponse();
			logoutResponse.setStatus("failure");
			logoutResponse.setStatusMessage(e.getMessage());
			return logoutResponse;
		}

		return logoutResponse;
	}

}
