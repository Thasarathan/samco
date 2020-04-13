package in.samco.stockNoteJavaSDK;

import java.io.IOException;

import org.json.JSONException;

public class Test {

	public static void main(String[] args) {
		SamcoHttpConnection kiteConnect = new SamcoHttpConnection();
		try {
//			String loginSession = kiteConnect.getLoginSession("DA35672", "avinash@4", "1993");
//			System.out.println("login "+loginSession);

			String optionChainDetails = kiteConnect.getOptionChainDetails("ab5b97220a2e08785ef1f166d1484ec7", "MCX",
					"GOLD", "2020-07-27", "44000", null);
			System.out.println("option chain res *****   :  " + optionChainDetails);

		} catch (JSONException ex) {
			System.out.println("Exception caught while fetching trade api : " + ex);
		} catch (IOException ex) {
			System.out.println("Exception caught while fetching trade api : " + ex);
		}
	}
}
