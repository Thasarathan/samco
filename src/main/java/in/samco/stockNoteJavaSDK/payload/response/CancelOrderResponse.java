package in.samco.stockNoteJavaSDK.payload.response;

import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseResponseEntity;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class CancelOrderResponse extends BaseResponseEntity {

	private String status;
	private String orderNumber;
	private String statusMessage;

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

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CancelOrderResponse that = (CancelOrderResponse) o;
		return Objects.equals(status, that.status) && Objects.equals(orderNumber, that.orderNumber)
				&& Objects.equals(statusMessage, that.statusMessage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, orderNumber, statusMessage);
	}

	@Override
	public String toString() {
		return "CancelOrderResponse{" + "status='" + status + '\'' + ", orderNumber='" + orderNumber + '\''
				+ ", statusMessage='" + statusMessage + '\'' + '}';
	}

}
