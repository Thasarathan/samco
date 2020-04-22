package in.samco.stockNoteJavaSDK.payload.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class CurrencyResponse {

	private String tradingSymbol;
	private String exchange;
	private String boardLotQuanity;

	public String getBoardLotQuanity() {
		return boardLotQuanity;
	}

	public void setBoardLotQuanity(String boardLotQuanity) {
		this.boardLotQuanity = boardLotQuanity;
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

	@Override
	public String toString() {
		return "CurrencyResponse [tradingSymbol=" + tradingSymbol + ", exchange=" + exchange + ", boardLotQuanity="
				+ boardLotQuanity + "]";
	}

}
