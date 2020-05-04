package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class TriggerOrder {

	private String stopLossOrderNo;
	private String targetOrderNo;
	private String orderStatus;
	private String orderPrice;
	private String triggerPrice;
	private String stopLoss;

	private String mainOrderNo;

	private String mainOrderStatus;

	public String getMainOrderNo() {
		return mainOrderNo;
	}

	public void setMainOrderNo(String mainOrderNo) {
		this.mainOrderNo = mainOrderNo;
	}

	public String getMainOrderStatus() {
		return mainOrderStatus;
	}

	public void setMainOrderStatus(String mainOrderStatus) {
		this.mainOrderStatus = mainOrderStatus;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getTriggerPrice() {
		return triggerPrice;
	}

	public void setTriggerPrice(String triggerPrice) {
		this.triggerPrice = triggerPrice;
	}

	public String getStopLoss() {
		return stopLoss;
	}

	public void setStopLoss(String stopLoss) {
		this.stopLoss = stopLoss;
	}

	public String getStopLossOrderNo() {
		return stopLossOrderNo;
	}

	public void setStopLossOrderNo(String stopLossOrderNo) {
		this.stopLossOrderNo = stopLossOrderNo;
	}

	public String getTargetOrderNo() {
		return targetOrderNo;
	}

	public void setTargetOrderNo(String targetOrderNo) {
		this.targetOrderNo = targetOrderNo;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
