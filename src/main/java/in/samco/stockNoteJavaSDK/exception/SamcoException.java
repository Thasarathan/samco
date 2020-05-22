package in.samco.stockNoteJavaSDK.exception;

import org.json.JSONObject;

public class SamcoException extends RuntimeException {

	private static final long serialVersionUID = 6148667149062531572L;

	public SamcoException(String samcoException) {
		super(samcoException);
	}

	public SamcoException(Object obj, String exception) {

	}

	public String getSamcoException(String exception) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("statusMessage", exception);
		jsonObject.put("status", "Failure");
		jsonObject.put("message", "Op we have a little problem");

		return jsonObject.toString();
	}

}
