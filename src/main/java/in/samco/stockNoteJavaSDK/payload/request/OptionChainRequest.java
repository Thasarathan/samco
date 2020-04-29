package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class OptionChainRequest extends BaseRequestEntity {

	private String exchange;

	private String searchSymbolName;

	private String expiryDate;

	private String strikePrice;

	private String optionType;

	public OptionChainRequest() {

	}

	public OptionChainRequest(String sessionToken, String exchange, String searchSymbolName, String expiryDate,
			String strikePrice, String optionType) {
		super(sessionToken);
		this.exchange = exchange;
		this.searchSymbolName = searchSymbolName;
		this.expiryDate = expiryDate;
		this.strikePrice = strikePrice;
		this.optionType = optionType;
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

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		OptionChainRequest that = (OptionChainRequest) o;
		return Objects.equals(exchange, that.exchange) && Objects.equals(searchSymbolName, that.searchSymbolName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exchange, searchSymbolName);
	}

	@Override
	public String toString() {
		return "OptionChainRequest [exchange=" + exchange + ", searchSymbolName=" + searchSymbolName + ", expiryDate="
				+ expiryDate + ", strikePrice=" + strikePrice + ", optionType=" + optionType + "]";
	}

}
