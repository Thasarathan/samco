package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class CancelOrderRequest extends BaseRequestEntity {

	private String orderNumber;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public CancelOrderRequest() {

	}

	public CancelOrderRequest(String sessionToken, String orderNumber) {
		super(sessionToken);
		this.orderNumber = orderNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CancelOrderRequest that = (CancelOrderRequest) o;
		return Objects.equals(orderNumber, that.orderNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderNumber);
	}

	@Override
	public String toString() {
		return "CancelOrderRequest [orderNumber=" + orderNumber + "]";
	}

}
