package in.samco.stockNoteJavaSDK.payload.request;

public class OrderRequestBO extends OrderRequest {

	public OrderRequestBO() {
		this.productType = "BO";
		this.exchange = "NSE";
	}

	private String productType;
	private String exchange;
	private String squareOffValue;
	private String stopLossValue;
	private String valueType;
	private String trailingStopLoss;
	private String triggerPrice;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
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

	@Override
	public String toString() {
		return "OrderRequestBO [productType=" + productType + ", exchange=" + exchange + ", squareOffValue="
				+ squareOffValue + ", stopLossValue=" + stopLossValue + ", valueType=" + valueType
				+ ", trailingStopLoss=" + trailingStopLoss + ", triggerPrice=" + triggerPrice + "]";
	}

}
