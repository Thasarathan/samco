package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class OptionChain {

	private String tradingSymbol;
	private String exchange;
	private String symbol;
	private String strikePrice;
	private String expiryDate;
	private String instrument;
	private String optionType;
	private String underLyingSymbol;
	private String spotPrice;
	private String lastTradedPrice;
	private String openInterest;
	private String openInterestChange;
	private String oIChangePer;
	private String volume;

	private List<BidAsk> bestBids;
	private List<BidAsk> bestAsks;

	public List<BidAsk> getBestBids() {
		return bestBids;
	}

	public void setBestBids(List<BidAsk> bestBids) {
		this.bestBids = bestBids;
	}

	public List<BidAsk> getBestAsks() {
		return bestAsks;
	}

	public void setBestAsks(List<BidAsk> bestAsks) {
		this.bestAsks = bestAsks;
	}

	public String getoIChangePer() {
		return oIChangePer;
	}

	public void setoIChangePer(String oIChangePer) {
		this.oIChangePer = oIChangePer;
	}

	public String getTradingSymbol() {
		return tradingSymbol;
	}

	public void setTradingSymbol(String tradingSymbol) {
		this.tradingSymbol = tradingSymbol;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getUnderLyingSymbol() {
		return underLyingSymbol;
	}

	public void setUnderLyingSymbol(String underLyingSymbol) {
		this.underLyingSymbol = underLyingSymbol;
	}

	public String getLastTradedPrice() {
		return lastTradedPrice;
	}

	public void setLastTradedPrice(String lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}

	public String getOpenInterest() {
		return openInterest;
	}

	public void setOpenInterest(String openInterest) {
		this.openInterest = openInterest;
	}

	public String getOpenInterestChange() {
		return openInterestChange;
	}

	public void setOpenInterestChange(String openInterestChange) {
		this.openInterestChange = openInterestChange;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getSpotPrice() {
		return spotPrice;
	}

	public void setSpotPrice(String spotPrice) {
		this.spotPrice = spotPrice;
	}

	@Override
	public String toString() {
		return "OptionChain [tradingSymbol=" + tradingSymbol + ", exchange=" + exchange + ", symbol=" + symbol
				+ ", strikePrice=" + strikePrice + ", expiryDate=" + expiryDate + ", instrument=" + instrument
				+ ", optionType=" + optionType + ", underLyingSymbol=" + underLyingSymbol + ", spotPrice=" + spotPrice
				+ ", lastTradedPrice=" + lastTradedPrice + ", openInterest=" + openInterest + ", openInterestChange="
				+ openInterestChange + ", oIChangePer=" + oIChangePer + ", volume=" + volume + ", bestBids=" + bestBids
				+ ", bestAsks=" + bestAsks + "]";
	}

}
