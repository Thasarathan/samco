package in.samco.stockNoteJavaSDK.payload.request;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class TriggerOrderRequest extends BaseRequestEntity {

	private String sessionToken;

	private String orderNumber;

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public TriggerOrderRequest() {
		super();
	}

	public TriggerOrderRequest(String sessionToken, String orderNumber) {
		super();
		this.sessionToken = sessionToken;
		this.orderNumber = orderNumber;
	}

}
