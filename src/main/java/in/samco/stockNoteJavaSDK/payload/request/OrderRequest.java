package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class OrderRequest extends BaseRequestEntity {

	private String symbolName;
	private String exchange;
	private String transactionType;
	private String orderType;
	private String quantity;
	private String disclosedQuantity;
	private String price;
	private String priceType;
	private String marketProtection;
	private String orderValidity;
	private String afterMarketOrderFlag;

	// bracket Order
	private String productType;
	private String squareOffValue;
	private String stopLossValue;
	private String valueType;
	private String trailingStopLoss;

	// SL & SL-M
	private String triggerPrice;
	@JsonIgnore
	private String instrumentType;
	private String userId;

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSquareOffValue() {
		return squareOffValue;
	}

	public void setSquareOffValue(String squareOffValue) {
		this.squareOffValue = squareOffValue;
	}

	public String getStopLossValue() {
		return stopLossValue;
	}

	public void setStopLossValue(String stopLossValue) {
		this.stopLossValue = stopLossValue;
	}

	public String getTrailingStopLoss() {
		return trailingStopLoss;
	}

	public void setTrailingStopLoss(String trailingStopLoss) {
		this.trailingStopLoss = trailingStopLoss;
	}

	public void setMarketProtection(String marketProtection) {
		this.marketProtection = marketProtection;
	}

	public String getMarketProtection() {
		return marketProtection;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
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

	public String getDisclosedQuantity() {
		return disclosedQuantity;
	}

	public void setDisclosedQuantity(String disclosedQuantity) {
		this.disclosedQuantity = disclosedQuantity;
	}

	public String getTriggerPrice() {
		return triggerPrice;
	}

	public void setTriggerPrice(String triggerPrice) {
		this.triggerPrice = triggerPrice;
	}

	public String getAfterMarketOrderFlag() {
		return afterMarketOrderFlag;
	}

	public void setAfterMarketOrderFlag(String afterMarketOrderFlag) {
		this.afterMarketOrderFlag = afterMarketOrderFlag;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		OrderRequest that = (OrderRequest) o;
		return Objects.equals(symbolName, that.symbolName) && Objects.equals(exchange, that.exchange)
				&& Objects.equals(transactionType, that.transactionType) && Objects.equals(orderType, that.orderType)
				&& Objects.equals(quantity, that.quantity) && Objects.equals(disclosedQuantity, that.disclosedQuantity)
				&& Objects.equals(price, that.price) && Objects.equals(priceType, that.priceType)
				&& Objects.equals(marketProtection, that.marketProtection)
				&& Objects.equals(orderValidity, that.orderValidity)
				&& Objects.equals(afterMarketOrderFlag, that.afterMarketOrderFlag)
				&& Objects.equals(productType, that.productType) && Objects.equals(squareOffValue, that.squareOffValue)
				&& Objects.equals(stopLossValue, that.stopLossValue) && Objects.equals(valueType, that.valueType)
				&& Objects.equals(trailingStopLoss, that.trailingStopLoss)
				&& Objects.equals(triggerPrice, that.triggerPrice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(symbolName, exchange, transactionType, orderType, quantity, disclosedQuantity, price,
				priceType, marketProtection, orderValidity, afterMarketOrderFlag, productType, squareOffValue,
				stopLossValue, valueType, trailingStopLoss, triggerPrice);
	}

	@Override
	public String toString() {
		return "OrderRequest [symbolName=" + symbolName + ", exchange=" + exchange + ", transactionType="
				+ transactionType + ", orderType=" + orderType + ", quantity=" + quantity + ", disclosedQuantity="
				+ disclosedQuantity + ", price=" + price + ", priceType=" + priceType + ", marketProtection="
				+ marketProtection + ", orderValidity=" + orderValidity + ", afterMarketOrderFlag="
				+ afterMarketOrderFlag + ", productType=" + productType + ", squareOffValue=" + squareOffValue
				+ ", stopLossValue=" + stopLossValue + ", valueType=" + valueType + ", trailingStopLoss="
				+ trailingStopLoss + ", triggerPrice=" + triggerPrice + ", instrumentType=" + instrumentType
				+ ", userId=" + userId + "]";
	}

}
