package in.samco.stockNoteJavaSDK.payload.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class CommodityDerivativeResponse {

	private String tradingSymbol;
	private String symbolCode;
	private String instrumentName;
	private String symbol;
	private String quantityInLots;
	private String exchange;

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getTradingSymbol() {
		return tradingSymbol;
	}

	public void setTradingSymbol(String tradingSymbol) {
		this.tradingSymbol = tradingSymbol;
	}

	public String getSymbolCode() {
		return symbolCode;
	}

	public void setSymbolCode(String symbolCode) {
		this.symbolCode = symbolCode;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getQuantityInLots() {
		return quantityInLots;
	}

	public void setQuantityInLots(String quantityInLots) {
		this.quantityInLots = quantityInLots;
	}

	@Override
	public String toString() {
		return "CommodityDerivativeResponse [tradingSymbol=" + tradingSymbol + ", symbolCode=" + symbolCode
				+ ", instrumentName=" + instrumentName + ", symbol=" + symbol + ", quantityInLots=" + quantityInLots
				+ ", exchange=" + exchange + "]";
	}

}
