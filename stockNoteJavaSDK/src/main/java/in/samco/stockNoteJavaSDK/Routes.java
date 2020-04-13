package in.samco.stockNoteJavaSDK;

import java.util.HashMap;

public class Routes {

	public HashMap<String, String> routes;
	public static String loginUrl = "http://localhost:9092/tradeapi/login";
	public static String optionChain = "http://localhost:9092/tradeapi/option/optionChain?:exchange:symbol:expiryDate:strikePrice:optionType";
	String baseUrl;

	public Routes() {
//		InputStream input = null;
//		try {
//			input = new FileInputStream("application.properties");
//			Properties prop = new Properties();
//
//			prop.load(input);
//			baseUrl = prop.getProperty("base_url");
//		} catch (FileNotFoundException e) {
//			System.out.println("Exception caught while loading property file " + e);
//		} catch (IOException e) {
//			System.out.println("Exception caught while reading property file " + e);
//		} finally {
//			if (input != null) {
//				try {
//					input.close();
//				} catch (IOException e) {
//					System.out.println("Exception while closing the inputr stream");
//				}
//			}
//		}

		routes = new HashMap<String, String>();
		routes.put("login", "/login");
		routes.put("option.chain", "/option/optionChain?:exchange:symbol:expiryDate:strikePrice:optionType");
		routes.put("api.token", "/session/token");

	};

	public String get(String key) {
		return baseUrl + routes.get(key);
	}

}
