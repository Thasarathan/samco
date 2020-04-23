package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseResponseEntity;
import in.samco.stockNoteJavaSDK.payload.dto.BidAsk;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class QuoteResponse extends BaseResponseEntity {

	private String status;
	private String statusMessage;
	private String symbolName;
	private String tradingSymbol;
	private String exchange;
	private String companyName;
	private String lastTradedTime;
	private String lastTradedPrice;
	private String previousClose;
	private String changeValue;
	private String changePercentage;
	private String lastTradedQuantity;
	private String lowerCircuitLimit;
	private String upperCircuitLimit;
	private String averagePrice;

	private String openValue;
	private String highValue;
	private String lowValue;
	private String closeValue;
	private String totalBuyQuantity;
	private String totalSellQuantity;
	private String totalTradedValue;
	private String totalTradedVolume;
	private String yearlyHighPrice;
	private String yearlyLowPrice;
	private String tickSize;
	private String openInterest;
	private List<BidAsk> bestBids;
	private List<BidAsk> bestAsks;

	private String expiryDate;

	private String spotPrice;

	private String instrument;
	private String lotQuantity;

	private String listingId;
	private String strikePrice;
	private String openInterestChange;
	@JsonIgnore
	private String prevOpenInterest;
	private String oIChangePer;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLastTradedTime() {
		return lastTradedTime;
	}

	public void setLastTradedTime(String lastTradedTime) {
		this.lastTradedTime = lastTradedTime;
	}

	public String getLastTradedPrice() {
		return lastTradedPrice;
	}

	public void setLastTradedPrice(String lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}

	public String getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(String previousClose) {
		this.previousClose = previousClose;
	}

	public String getChangeValue() {
		return changeValue;
	}

	public void setChangeValue(String changeValue) {
		this.changeValue = changeValue;
	}

	public String getChangePercentage() {
		return changePercentage;
	}

	public void setChangePercentage(String changePercentage) {
		this.changePercentage = changePercentage;
	}

	public String getLastTradedQuantity() {
		return lastTradedQuantity;
	}

	public void setLastTradedQuantity(String lastTradedQuantity) {
		this.lastTradedQuantity = lastTradedQuantity;
	}

	public String getLowerCircuitLimit() {
		return lowerCircuitLimit;
	}

	public void setLowerCircuitLimit(String lowerCircuitLimit) {
		this.lowerCircuitLimit = lowerCircuitLimit;
	}

	public String getUpperCircuitLimit() {
		return upperCircuitLimit;
	}

	public void setUpperCircuitLimit(String upperCircuitLimit) {
		this.upperCircuitLimit = upperCircuitLimit;
	}

	public String getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(String averagePrice) {
		this.averagePrice = averagePrice;
	}

	public String getOpenValue() {
		return openValue;
	}

	public void setOpenValue(String openValue) {
		this.openValue = openValue;
	}

	public String getHighValue() {
		return highValue;
	}

	public void setHighValue(String highValue) {
		this.highValue = highValue;
	}

	public String getLowValue() {
		return lowValue;
	}

	public void setLowValue(String lowValue) {
		this.lowValue = lowValue;
	}

	public String getCloseValue() {
		return closeValue;
	}

	public void setCloseValue(String closeValue) {
		this.closeValue = closeValue;
	}

	public String getTotalBuyQuantity() {
		return totalBuyQuantity;
	}

	public void setTotalBuyQuantity(String totalBuyQuantity) {
		this.totalBuyQuantity = totalBuyQuantity;
	}

	public String getTotalSellQuantity() {
		return totalSellQuantity;
	}

	public void setTotalSellQuantity(String totalSellQuantity) {
		this.totalSellQuantity = totalSellQuantity;
	}

	public String getTotalTradedValue() {
		return totalTradedValue;
	}

	public void setTotalTradedValue(String totalTradedValue) {
		this.totalTradedValue = totalTradedValue;
	}

	public String getTotalTradedVolume() {
		return totalTradedVolume;
	}

	public void setTotalTradedVolume(String totalTradedVolume) {
		this.totalTradedVolume = totalTradedVolume;
	}

	public String getYearlyHighPrice() {
		return yearlyHighPrice;
	}

	public void setYearlyHighPrice(String yearlyHighPrice) {
		this.yearlyHighPrice = yearlyHighPrice;
	}

	public String getYearlyLowPrice() {
		return yearlyLowPrice;
	}

	public void setYearlyLowPrice(String yearlyLowPrice) {
		this.yearlyLowPrice = yearlyLowPrice;
	}

	public String getTickSize() {
		return tickSize;
	}

	public void setTickSize(String tickSize) {
		this.tickSize = tickSize;
	}

	public String getOpenInterest() {
		return openInterest;
	}

	public void setOpenInterest(String openInterest) {
		this.openInterest = openInterest;
	}

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

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getSpotPrice() {
		return spotPrice;
	}

	public void setSpotPrice(String spotPrice) {
		this.spotPrice = spotPrice;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getLotQuantity() {
		return lotQuantity;
	}

	public void setLotQuantity(String lotQuantity) {
		this.lotQuantity = lotQuantity;
	}

	public String getListingId() {
		return listingId;
	}

	public void setListingId(String listingId) {
		this.listingId = listingId;
	}

	public String getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getOpenInterestChange() {
		return openInterestChange;
	}

	public void setOpenInterestChange(String openInterestChange) {
		this.openInterestChange = openInterestChange;
	}

	public String getPrevOpenInterest() {
		return prevOpenInterest;
	}

	public void setPrevOpenInterest(String prevOpenInterest) {
		this.prevOpenInterest = prevOpenInterest;
	}

	public String getoIChangePer() {
		return oIChangePer;
	}

	public void setoIChangePer(String oIChangePer) {
		this.oIChangePer = oIChangePer;
	}

	@Override
	public String toString() {
		return "QuoteResponse [status=" + status + ", statusMessage=" + statusMessage + ", symbolName=" + symbolName
				+ ", tradingSymbol=" + tradingSymbol + ", exchange=" + exchange + ", companyName=" + companyName
				+ ", lastTradedTime=" + lastTradedTime + ", lastTradedPrice=" + lastTradedPrice + ", previousClose="
				+ previousClose + ", changeValue=" + changeValue + ", changePercentage=" + changePercentage
				+ ", lastTradedQuantity=" + lastTradedQuantity + ", lowerCircuitLimit=" + lowerCircuitLimit
				+ ", upperCircuitLimit=" + upperCircuitLimit + ", averagePrice=" + averagePrice + ", openValue="
				+ openValue + ", highValue=" + highValue + ", lowValue=" + lowValue + ", closeValue=" + closeValue
				+ ", totalBuyQuantity=" + totalBuyQuantity + ", totalSellQuantity=" + totalSellQuantity
				+ ", totalTradedValue=" + totalTradedValue + ", totalTradedVolume=" + totalTradedVolume
				+ ", yearlyHighPrice=" + yearlyHighPrice + ", yearlyLowPrice=" + yearlyLowPrice + ", tickSize="
				+ tickSize + ", openInterest=" + openInterest + ", bestBids=" + bestBids + ", bestAsks=" + bestAsks
				+ ", expiryDate=" + expiryDate + ", spotPrice=" + spotPrice + ", instrument=" + instrument
				+ ", lotQuantity=" + lotQuantity + ", listingId=" + listingId + ", strikePrice=" + strikePrice
				+ ", openInterestChange=" + openInterestChange + ", prevOpenInterest=" + prevOpenInterest
				+ ", oIChangePer=" + oIChangePer + "]";
	}

}
