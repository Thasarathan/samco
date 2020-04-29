package in.samco.stockNoteJavaSDK.payload.request;

public class OrderRequestCO extends OrderRequest {

	public OrderRequestCO() {
		super.setProductType("CO");
	}

	private String productType = "CO";
	private String squareOffValue;
	private String stopLossValue;
	private String valueType;
	private String trailingStopLoss;
	private String triggerPrice;
	private String priceType;

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

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public String getTrailingStopLoss() {
		return trailingStopLoss;
	}

	public void setTrailingStopLoss(String trailingStopLoss) {
		this.trailingStopLoss = trailingStopLoss;
	}

	public String getTriggerPrice() {
		return triggerPrice;
	}

	public void setTriggerPrice(String triggerPrice) {
		this.triggerPrice = triggerPrice;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	@Override
	public String toString() {
		return "OrderRequestCO [productType=" + productType + ", squareOffValue=" + squareOffValue + ", stopLossValue="
				+ stopLossValue + ", valueType=" + valueType + ", trailingStopLoss=" + trailingStopLoss
				+ ", triggerPrice=" + triggerPrice + ", priceType=" + priceType + "]";
	}

}
