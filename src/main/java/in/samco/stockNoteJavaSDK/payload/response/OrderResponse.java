package in.samco.stockNoteJavaSDK.payload.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseResponseEntity;
import in.samco.stockNoteJavaSDK.payload.dto.OrderDetails;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class OrderResponse extends BaseResponseEntity {

	private String orderNumber;
	private String status;
	private String statusMessage;
	private String exchangeOrderStatus;
	private String rejectionReason;
	private OrderDetails orderDetails;

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public String getExchangeOrderStatus() {
		return exchangeOrderStatus;
	}

	public void setExchangeOrderStatus(String exchangeOrderStatus) {
		this.exchangeOrderStatus = exchangeOrderStatus;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	public String toString() {
		return "OrderResponse{" + "orderNumber='" + orderNumber + '\'' + ", status='" + status + '\''
				+ ", statusMessage='" + statusMessage + '\'' + ", exchangeOrderStatus='" + exchangeOrderStatus + '\''
				+ ", rejectionReason='" + rejectionReason + '\'' + ", orderDetails=" + orderDetails + '}';
	}

}
