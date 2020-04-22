package in.samco.stockNoteJavaSDK.payload.dto;

public class EquitySearch {

	private String tradingSymbol;

	private String instrumentName;

	private String quantityInLots;

	private String exchange;

	public String getTradingSymbol() {
		return tradingSymbol;
	}

	public void setTradingSymbol(String tradingSymbol) {
		this.tradingSymbol = tradingSymbol;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public String getQuantityInLots() {
		return quantityInLots;
	}

	public void setQuantityInLots(String quantityInLots) {
		this.quantityInLots = quantityInLots;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@Override
	public String toString() {
		return "EquitySearch [tradingSymbol=" + tradingSymbol + ", instrumentName=" + instrumentName
				+ ", quantityInLots=" + quantityInLots + ", exchange=" + exchange + "]";
	}

}
