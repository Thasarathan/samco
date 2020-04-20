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

	};

	public String get(String key) {
		return baseUrl + routes.get(key);
	}

}
