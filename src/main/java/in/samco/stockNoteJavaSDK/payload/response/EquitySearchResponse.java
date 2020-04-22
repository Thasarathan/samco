package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.ScripDetails;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class EquitySearchResponse extends SimpleResponse {

//	private String serverTime;
	List<ScripDetails> searchResults;
	public List<CurrencyResponse> currencyValues;
	public List<CommodityDerivativeResponse> commodityValues;
	public List<EquityDerivativeResponse> equityDertivativeValues;

	public List<CurrencyResponse> getCurrencyValues() {
		return currencyValues;
	}

	@Override
	public String getServerTime() {
		return "";
	}

	public void setCurrencyValues(List<CurrencyResponse> currencyValues) {
		this.currencyValues = currencyValues;
	}

	public List<CommodityDerivativeResponse> getCommodityValues() {
		return commodityValues;
	}

	public void setCommodityValues(List<CommodityDerivativeResponse> commodityValues) {
		this.commodityValues = commodityValues;
	}

	public List<EquityDerivativeResponse> getEquityDertivativeValues() {
		return equityDertivativeValues;
	}

	public void setEquityDertivativeValues(List<EquityDerivativeResponse> equityDertivativeValues) {
		this.equityDertivativeValues = equityDertivativeValues;
	}

	public List<ScripDetails> getSearchResults() {
		return searchResults;
	}

	public void setSearchResults(List<ScripDetails> searchResults) {
		this.searchResults = searchResults;
	}

	@Override
	public String toString() {
		return "EquitySearchResponse [searchResults=" + searchResults + ", currencyValues=" + currencyValues
				+ ", commodityValues=" + commodityValues + ", equityDertivativeValues=" + equityDertivativeValues + "]";
	}

}
