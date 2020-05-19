package in.samco.stockNoteJavaSDK.service;

import java.util.HashMap;

public class Routes {
	public String environment;

	public HashMap<String, String> routes;

	public Routes() {

		routes = new HashMap<String, String>();
		routes.put("local", "http://localhost:9092/tradeapi");
		routes.put("uat", "http://dev-api.stocknote.com/tr-api");
		routes.put("production", "https://api.stocknote.com");

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
		routes.put("trade.book", "/trade/tradeBook");
		routes.put("holding", "/holding/getHoldings");
		routes.put("position", "/position/getPositions?:positionType");
		routes.put("convert.position", "/position/convertPosition");
		routes.put("history.candleData", "/history/candleData?:exchange:symbolName:fromDate:toDate");
		routes.put("history.indexCandleData", "/history/indexCandleData?:indexName:fromDate:toDate");
		routes.put("intraday.candleData", "/intraday/candleData?:exchange:symbolName:fromDate:toDate");
		routes.put("intraday.indexCandleData", "/intraday/indexCandleData?:indexName:fromDate:toDate");
		routes.put("logout", "/logout");

	};

	public String get(String key) {
		System.out.println("environment **********      " + routes.get(environment).toLowerCase() + routes.get(key));
		return routes.get(environment).toLowerCase() + routes.get(key);
	}

}
