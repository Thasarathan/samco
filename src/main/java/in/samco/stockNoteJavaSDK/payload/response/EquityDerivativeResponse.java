package in.samco.stockNoteJavaSDK.payload.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class EquityDerivativeResponse {

	private String tradingSymbol;
	private String instrument;
	private String exchange;
	private String boardLotQuantity;

	public String getBoardLotQuantity() {
		return boardLotQuantity;
	}

	public void setBoardLotQuantity(String boardLotQuantity) {
		this.boardLotQuantity = boardLotQuantity;
	}

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

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "EquityDerivativeResponse [tradingSymbol=" + tradingSymbol + ", instrument=" + instrument + ", exchange="
				+ exchange + ", boardLotQuantity=" + boardLotQuantity + "]";
	}

}
