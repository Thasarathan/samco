package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class ScripDetails {

	private String exchange;
	private String exchangeSegment;
	private String symbolName;
	private String scripDescription;
	private String tradingSymbol;

	@JsonIgnore
	private String scripToken;
	private String isin;
	@JsonIgnore
	private String bodLotQuantity;
	private String tickSize;

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getExchangeSegment() {
		return exchangeSegment;
	}

	public void setExchangeSegment(String exchangeSegment) {
		this.exchangeSegment = exchangeSegment;
	}

	public String getTradingSymbol() {
		return tradingSymbol;
	}

	public void setTradingSymbol(String tradingSymbol) {
		this.tradingSymbol = tradingSymbol;
	}

	public String getScripToken() {
		return scripToken;
	}

	public void setScripToken(String scripToken) {
		this.scripToken = scripToken;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getBodLotQuantity() {
		return bodLotQuantity;
	}

	public void setBodLotQuantity(String bodLotQuantity) {
		this.bodLotQuantity = bodLotQuantity;
	}

	public String getTickSize() {
		return tickSize;
	}

	public void setTickSize(String tickSize) {
		this.tickSize = tickSize;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getScripDescription() {
		return scripDescription;
	}

	public void setScripDescription(String scripDescription) {
		this.scripDescription = scripDescription;
	}

	@Override
	public String toString() {
		return "ScripDetails [exchange=" + exchange + ", exchangeSegment=" + exchangeSegment + ", symbolName="
				+ symbolName + ", scripDescription=" + scripDescription + ", tradingSymbol=" + tradingSymbol
				+ ", scripToken=" + scripToken + ", isin=" + isin + ", bodLotQuantity=" + bodLotQuantity + ", tickSize="
				+ tickSize + "]";
	}

}
