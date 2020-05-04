package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class ModifyOrderRequest extends BaseRequestEntity {

	@JsonIgnore
	private String sessionToken;
	@JsonIgnore
	private String orderNumber;
	private String orderType;

	private String quantity;
	private String disclosedQuantity;
	private String orderValidity;
	private String price;
	private String triggerPrice;
	private String parentOrderId;
	private String marketProtection;

	public String getMarketProtection() {
		return marketProtection;

	}

	public void setMarketProtection(String marketProtection) {
		this.marketProtection = marketProtection;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDisclosedQuantity() {
		return disclosedQuantity;
	}

	public void setDisclosedQuantity(String disclosedQuantity) {
		this.disclosedQuantity = disclosedQuantity;
	}

	public String getOrderValidity() {
		return orderValidity;
	}

	public void setOrderValidity(String orderValidity) {
		this.orderValidity = orderValidity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTriggerPrice() {
		return triggerPrice;
	}

	public void setTriggerPrice(String triggerPrice) {
		this.triggerPrice = triggerPrice;
	}

	public String getParentOrderId() {
		return parentOrderId;
	}

	public void setParentOrderId(String parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ModifyOrderRequest that = (ModifyOrderRequest) o;
		return Objects.equals(sessionToken, that.sessionToken) && Objects.equals(orderNumber, that.orderNumber)
				&& Objects.equals(orderType, that.orderType) && Objects.equals(quantity, that.quantity)
				&& Objects.equals(disclosedQuantity, that.disclosedQuantity)
				&& Objects.equals(orderValidity, that.orderValidity) && Objects.equals(price, that.price)
				&& Objects.equals(triggerPrice, that.triggerPrice) && Objects.equals(parentOrderId, that.parentOrderId)
				&& Objects.equals(marketProtection, that.marketProtection);

	}

	@Override
	public int hashCode() {
		return Objects.hash(sessionToken, orderNumber, orderType, quantity, disclosedQuantity, orderValidity, price,
				triggerPrice, parentOrderId, marketProtection);
	}

	@Override
	public String toString() {
		return "ModifyOrderRequest{" + "sessionToken='" + sessionToken + '\'' + ", orderNumber='" + orderNumber + '\''
				+ ", orderType='" + orderType + '\'' + ", quantity='" + quantity + '\'' + ", disclosedQuantity='"
				+ disclosedQuantity + '\'' + ", orderValidity='" + orderValidity + '\'' + ", price='" + price + '\''
				+ ", triggerPrice='" + triggerPrice + '\'' + ", parentOrderId='" + parentOrderId + '\''
				+ ", marketProtection='" + marketProtection + '\'' +

				'}';
	}

}
