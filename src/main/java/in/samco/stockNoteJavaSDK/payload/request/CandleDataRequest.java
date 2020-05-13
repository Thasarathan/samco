package in.samco.stockNoteJavaSDK.payload.request;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class CandleDataRequest extends BaseRequestEntity {

	private String exchange;

	private String symbolName;

	private String fromDate;

	private String toDate;

	public CandleDataRequest() {

	}

	public CandleDataRequest(String sessionToken, String exchange, String symbolName, String fromDate, String toDate) {
		super(sessionToken);
		this.exchange = exchange;
		this.symbolName = symbolName;
		this.fromDate = fromDate;
		this.toDate = toDate;
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

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}
