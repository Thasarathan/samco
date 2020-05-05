package in.samco.stockNoteJavaSDK.service;

import java.util.HashMap;

public class Routes {

	public HashMap<String, String> routes;
	public static final String baseUrl = "http://localhost:9092/tradeapi";

	public Routes() {

		routes = new HashMap<String, String>();
		routes.put("login", "/login");
		routes.put("option.chain", "/option/optionChain?:exchange:searchSymbolName:expiryDate:strikePrice:optionType");
		routes.put("equity.search", "/eqDervSearch/search?:exchange:searchSymbolName");
		routes.put("quote.search", "/quote/getQuote?:exchange:symbolName");
		routes.put("place.order", "/order/placeOrder");
		routes.put("order.status", "/order/getOrderStatus?:orderNumber");
		routes.put("modify.order", "/order/modifyOrder/:orderNumber");
		routes.put("cancel.order", "/order/cancelOrder?:orderNumber");
		routes.put("user.limit", "/limit/getLimits");
		routes.put("trigger.order", "/order/getTriggerOrders?:orderNumber");
		routes.put("order.book", "/order/orderBook");
		routes.put("exit.co", "/order/exitCO?:orderNumber");
		routes.put("exit.bo", "/order/exitBO?:orderNumber");

	};

	public String get(String key) {
		return baseUrl + routes.get(key);
	}

}
