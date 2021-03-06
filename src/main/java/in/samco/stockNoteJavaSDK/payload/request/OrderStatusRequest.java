package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class OrderStatusRequest extends BaseRequestEntity {

	private String orderNumber;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public OrderStatusRequest() {

	}

	public OrderStatusRequest(String sessionToken, String orderNumber) {
		super(sessionToken);
		this.orderNumber = orderNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		OrderStatusRequest that = (OrderStatusRequest) o;
		return Objects.equals(orderNumber, that.orderNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderNumber);
	}

	@Override
	public String toString() {
		return "OrderStatusRequest [orderNumber=" + orderNumber + "]";
	}

}
