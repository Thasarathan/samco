package in.samco.stockNoteJavaSDK.payload.response;

import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseResponseEntity;
import in.samco.stockNoteJavaSDK.payload.dto.OrderDetails;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class OrderStatusResponse extends BaseResponseEntity {

	private String orderNumber;
	private String orderStatus;
	private String statusMessage;
	private OrderDetails orderDetails;

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		OrderStatusResponse that = (OrderStatusResponse) o;
		return Objects.equals(orderNumber, that.orderNumber) && Objects.equals(orderStatus, that.orderStatus)
				&& Objects.equals(statusMessage, that.statusMessage) && Objects.equals(orderDetails, that.orderDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderNumber, orderStatus, statusMessage, orderDetails);
	}

	@Override
	public String toString() {
		return "OrderStatusResponse{" + "orderNumber='" + orderNumber + '\'' + ", orderStatus='" + orderStatus + '\''
				+ ", statusMessage='" + statusMessage + '\'' + ", orderDetails=" + orderDetails + '}';
	}

}
