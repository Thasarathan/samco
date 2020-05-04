package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.Objects;

public class BookEntry {

	private String orderNumber;
	private String exchange;
	private String symbolName;
	private String tradingSymbol;
	private String symbolDescription;
	private String scripToken;
	private String transactionType;
	private String productCode;
	private String marketProtection;
	private String orderValue;
	private String instrumentName;
	private String orderTime;
	private String userId;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getTradingSymbol() {
		return tradingSymbol;
	}

	public void setTradingSymbol(String tradingSymbol) {
		this.tradingSymbol = tradingSymbol;
	}

	public String getSymbolDescription() {
		return symbolDescription;
	}

	public void setSymbolDescription(String symbolDescription) {
		this.symbolDescription = symbolDescription;
	}

	public String getScripToken() {
		return scripToken;
	}

	public void setScripToken(String scripToken) {
		this.scripToken = scripToken;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getMarketProtection() {
		return marketProtection;
	}

	public void setMarketProtection(String marketProtection) {
		this.marketProtection = marketProtection;
	}

	public String getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		BookEntry that = (BookEntry) o;
		return Objects.equals(orderNumber, that.orderNumber) && Objects.equals(exchange, that.exchange)
				&& Objects.equals(symbolName, that.symbolName) && Objects.equals(tradingSymbol, that.tradingSymbol)
				&& Objects.equals(symbolDescription, that.symbolDescription)
				&& Objects.equals(scripToken, that.scripToken) && Objects.equals(transactionType, that.transactionType)
				&& Objects.equals(productCode, that.productCode)
				&& Objects.equals(marketProtection, that.marketProtection)
				&& Objects.equals(orderValue, that.orderValue) && Objects.equals(instrumentName, that.instrumentName)
				&& Objects.equals(orderTime, that.orderTime) && Objects.equals(userId, that.userId);

	}

	@Override
	public int hashCode() {
		return Objects.hash(orderNumber, exchange, tradingSymbol, symbolDescription, scripToken, transactionType,
				productCode, marketProtection, orderValue, instrumentName, orderTime, userId);
	}

	@Override
	public String toString() {
		return "OrderBookEntry{" + ", orderNumber='" + orderNumber + '\'' + ", exchange='" + exchange + '\''
				+ ", symbolName='" + symbolName + '\'' + ", tradingSymbol='" + tradingSymbol + '\''
				+ ", symbolDescription='" + symbolDescription + '\'' + ", scripToken='" + scripToken + '\''
				+ ", transactionType='" + transactionType + '\'' + ", productCode='" + productCode + '\'' + '\''
				+ ", marketProtection='" + marketProtection + '\'' + '\'' + '\'' + ", instrumentName='" + instrumentName
				+ '\'' + ", orderTime='" + orderTime + '\'' + ", userId='" + userId + '\'' + '}';
	}

}
