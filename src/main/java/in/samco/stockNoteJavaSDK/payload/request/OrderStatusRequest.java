package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import javax.validation.constraints.NotBlank;

public class OrderStatusRequest {

	@NotBlank(message = "Session token is mandatory")
	private String sessionToken;
	@NotBlank(message = "OrderNumber is mandatory")
	private String orderNumber;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public OrderStatusRequest(@NotBlank(message = "Session token is mandatory") String sessionToken,
			@NotBlank(message = "OrderNumber is mandatory") String orderNumber) {
		super();
		this.sessionToken = sessionToken;
		this.orderNumber = orderNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		OrderStatusRequest that = (OrderStatusRequest) o;
		return Objects.equals(sessionToken, that.sessionToken) && Objects.equals(orderNumber, that.orderNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sessionToken, orderNumber);
	}

	@Override
	public String toString() {
		return "OrderStatusRequest{" + "sessionToken='" + sessionToken + '\'' + ", orderNumber='" + orderNumber + '\''
				+ '}';
	}

}
