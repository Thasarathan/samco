package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class EquitySearchRequest extends BaseRequestEntity {

	private String exchange;
	
	private String searchSymbolName;

	public EquitySearchRequest() {

	}

	public EquitySearchRequest(String sessionToken, String exchange, String searchSymbolName) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		EquitySearchRequest that = (EquitySearchRequest) o;
		return Objects.equals(exchange, that.exchange) && Objects.equals(searchSymbolName, that.searchSymbolName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exchange, searchSymbolName);
	}

	@Override
	public String toString() {
		return "EquitySearchRequest [exchange=" + exchange + ", searchSymbolName=" + searchSymbolName + "]";
	}

}
