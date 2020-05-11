package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Portfolio {

	private String averagePrice;
	@JsonIgnore
	private String changeValue;
	@JsonIgnore
	private String changePercent;
	private String dayGainAndLoss;
	private String exchange;
	private String markToMarketPrice;
	private String lastTradedPrice;
	private String previousClose;
	private String productCode;
	@JsonIgnore
	private String symbol;
	private String symbolName;
	private String symbolDescription;
	private String tradingSymbol;
	private String totalGainAndLoss;
	private String calculatedNetQuantity;

	public String getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(String averagePrice) {
		this.averagePrice = averagePrice;
	}

	public String getChangeValue() {
		return changeValue;
	}

	public void setChangeValue(String changeValue) {
		this.changeValue = changeValue;
	}

	public String getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(String changePercent) {
		this.changePercent = changePercent;
	}

	public String getDayGainAndLoss() {
		return dayGainAndLoss;
	}

	public void setDayGainAndLoss(String dayGainAndLoss) {
		this.dayGainAndLoss = dayGainAndLoss;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getMarkToMarketPrice() {
		return markToMarketPrice;
	}

	public void setMarkToMarketPrice(String markToMarketPrice) {
		this.markToMarketPrice = markToMarketPrice;
	}

	public String getLastTradedPrice() {
		return lastTradedPrice;
	}

	public void setLastTradedPrice(String lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}

	public String getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(String previousClose) {
		this.previousClose = previousClose;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
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

	public String getTotalGainAndLoss() {
		return totalGainAndLoss;
	}

	public void setTotalGainAndLoss(String totalGainAndLoss) {
		this.totalGainAndLoss = totalGainAndLoss;
	}

	public String getCalculatedNetQuantity() {
		return calculatedNetQuantity;
	}

	public void setCalculatedNetQuantity(String calculatedNetQuantity) {
		this.calculatedNetQuantity = calculatedNetQuantity;
	}

	public String getSymbolDescription() {
		return symbolDescription;
	}

	public void setSymbolDescription(String symbolDescription) {
		this.symbolDescription = symbolDescription;
	}

}
