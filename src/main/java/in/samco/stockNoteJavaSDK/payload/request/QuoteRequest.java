package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class QuoteRequest extends BaseRequestEntity {

	private String exchange;

	private String searchSymbolName;

	private String instrumentType;

	public QuoteRequest() {

	}

	public QuoteRequest(String sessionToken, String exchange, String searchSymbolName) {
		super(sessionToken);
		this.exchange = exchange;
		this.searchSymbolName = searchSymbolName;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getSearchSymbolName() {
		return searchSymbolName;
	}

	public void setSearchSymbolName(String searchSymbolName) {
		this.searchSymbolName = searchSymbolName;
	}

	public String getInstrumentType() {
		return instrumentType;
	}

	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		QuoteRequest that = (QuoteRequest) o;
		return Objects.equals(exchange, that.exchange) && Objects.equals(searchSymbolName, that.searchSymbolName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exchange, searchSymbolName);
	}

	@Override
	public String toString() {
		return "QuoteRequest [exchange=" + exchange + ", searchSymbolName=" + searchSymbolName + ", instrumentType="
				+ instrumentType + "]";
	}

}
