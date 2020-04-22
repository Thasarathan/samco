package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import javax.validation.constraints.NotBlank;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class QuoteRequest extends BaseRequestEntity {

	@NotBlank(message = "Session token is mandatory.")
	private String sessionToken;

	@NotBlank(message = "Exchange is mandatory.")
	private String exchange;

	@NotBlank(message = "Search Symbol Name is mandatory")
	private String searchSymbolName;

	private String instrumentType;

	public QuoteRequest(@NotBlank(message = "Session token is mandatory.") String sessionToken,
			@NotBlank(message = "Exchange is mandatory.") String exchange,
			@NotBlank(message = "Search Symbol Name is mandatory") String searchSymbolName) {
		super();
		this.sessionToken = sessionToken;
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

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
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
		return Objects.equals(exchange, that.exchange) && Objects.equals(sessionToken, that.sessionToken)
				&& Objects.equals(searchSymbolName, that.searchSymbolName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exchange, sessionToken, searchSymbolName);
	}

	@Override
	public String toString() {
		return "EquitySearchRequest{" + "exchange='" + exchange + '\'' + ", sessionToken='" + sessionToken + '\''
				+ ", searchString='" + searchSymbolName + '\'' + '}';
	}

}
