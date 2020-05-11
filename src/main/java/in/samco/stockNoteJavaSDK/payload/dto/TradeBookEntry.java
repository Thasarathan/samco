package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class TradeBookEntry extends BookEntry {

	private String filledQuantity;
	private String orderValidityDate;
	private String fillPrice;
	@JsonIgnore
	private String expiryDate;
	private String averagePrice;
	private String unfilledQuantity;
	private String rejectionReason;
	private String exchangeConfirmationTime;
	private String lastTradedPrice;
	private String referenceLimitPrice;
	private String coverOrderPercentage;
	private String modifiedByUser;
	private String orderRemarks;
	private String exchangeOrderNumber;
	private String tradeNumber;
	private String tradePrice;
	private String tradeDate;
	private String tradeTime;
	@JsonIgnore
	private String exchangeSegment;
	private String displayExpiryDate;
	private String displatStrikePrice;
	private String strikePrice;
	private String displayInstrumentType;
	private String optionType;
	private String lastTradePrice;
	private String change;
	private String changePercentage;
	private String expiry;

	public String getExchangeSegment() {
		return exchangeSegment;
	}

	public void setExchangeSegment(String exchangeSegment) {
		this.exchangeSegment = exchangeSegment;
	}

	public String getDisplayExpiryDate() {
		return displayExpiryDate;
	}

	public void setDisplayExpiryDate(String displayExpiryDate) {
		this.displayExpiryDate = displayExpiryDate;
	}

	public String getDisplatStrikePrice() {
		return displatStrikePrice;
	}

	public void setDisplatStrikePrice(String displatStrikePrice) {
		this.displatStrikePrice = displatStrikePrice;
	}

	public String getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getDisplayInstrumentType() {
		return displayInstrumentType;
	}

	public void setDisplayInstrumentType(String displayInstrumentType) {
		this.displayInstrumentType = displayInstrumentType;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getLastTradePrice() {
		return lastTradePrice;
	}

	public void setLastTradePrice(String lastTradePrice) {
		this.lastTradePrice = lastTradePrice;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getChangePercentage() {
		return changePercentage;
	}

	public void setChangePercentage(String changePercentage) {
		this.changePercentage = changePercentage;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(String tradePrice) {
		this.tradePrice = tradePrice;
	}

	public String getLastTradedPrice() {
		return lastTradedPrice;
	}

	public void setLastTradedPrice(String lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}

	public String getTradeNumber() {
		return tradeNumber;
	}

	public void setTradeNumber(String tradeNumber) {
		this.tradeNumber = tradeNumber;
	}

	public String getFilledQuantity() {
		return filledQuantity;
	}

	public void setFilledQuantity(String filledQuantity) {
		this.filledQuantity = filledQuantity;
	}

	public String getOrderValidityDate() {
		return orderValidityDate;
	}

	public void setOrderValidityDate(String orderValidityDate) {
		this.orderValidityDate = orderValidityDate;
	}

	public String getFillPrice() {
		return fillPrice;
	}

	public void setFillPrice(String fillPrice) {
		this.fillPrice = fillPrice;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(String averagePrice) {
		this.averagePrice = averagePrice;
	}

	public String getUnfilledQuantity() {
		return unfilledQuantity;
	}

	public void setUnfilledQuantity(String unfilledQuantity) {
		this.unfilledQuantity = unfilledQuantity;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public String getExchangeConfirmationTime() {
		return exchangeConfirmationTime;
	}

	public void setExchangeConfirmationTime(String exchangeConfirmationTime) {
		this.exchangeConfirmationTime = exchangeConfirmationTime;
	}

	public String getReferenceLimitPrice() {
		return referenceLimitPrice;
	}

	public void setReferenceLimitPrice(String referenceLimitPrice) {
		this.referenceLimitPrice = referenceLimitPrice;
	}

	public String getCoverOrderPercentage() {
		return coverOrderPercentage;
	}

	public void setCoverOrderPercentage(String coverOrderPercentage) {
		this.coverOrderPercentage = coverOrderPercentage;
	}

	public String getModifiedByUser() {
		return modifiedByUser;
	}

	public void setModifiedByUser(String modifiedByUser) {
		this.modifiedByUser = modifiedByUser;
	}

	public String getOrderRemarks() {
		return orderRemarks;
	}

	public void setOrderRemarks(String orderRemarks) {
		this.orderRemarks = orderRemarks;
	}

	public String getExchangeOrderNumber() {
		return exchangeOrderNumber;
	}

	public void setExchangeOrderNumber(String exchangeOrderNumber) {
		this.exchangeOrderNumber = exchangeOrderNumber;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TradeBookEntry other = (TradeBookEntry) obj;
		if (averagePrice == null) {
			if (other.averagePrice != null)
				return false;
		} else if (!averagePrice.equals(other.averagePrice))
			return false;
		if (change == null) {
			if (other.change != null)
				return false;
		} else if (!change.equals(other.change))
			return false;
		if (changePercentage == null) {
			if (other.changePercentage != null)
				return false;
		} else if (!changePercentage.equals(other.changePercentage))
			return false;
		if (coverOrderPercentage == null) {
			if (other.coverOrderPercentage != null)
				return false;
		} else if (!coverOrderPercentage.equals(other.coverOrderPercentage))
			return false;
		if (displatStrikePrice == null) {
			if (other.displatStrikePrice != null)
				return false;
		} else if (!displatStrikePrice.equals(other.displatStrikePrice))
			return false;
		if (displayExpiryDate == null) {
			if (other.displayExpiryDate != null)
				return false;
		} else if (!displayExpiryDate.equals(other.displayExpiryDate))
			return false;
		if (displayInstrumentType == null) {
			if (other.displayInstrumentType != null)
				return false;
		} else if (!displayInstrumentType.equals(other.displayInstrumentType))
			return false;
		if (exchangeConfirmationTime == null) {
			if (other.exchangeConfirmationTime != null)
				return false;
		} else if (!exchangeConfirmationTime.equals(other.exchangeConfirmationTime))
			return false;
		if (exchangeOrderNumber == null) {
			if (other.exchangeOrderNumber != null)
				return false;
		} else if (!exchangeOrderNumber.equals(other.exchangeOrderNumber))
			return false;

		if (exchangeSegment == null) {
			if (other.exchangeSegment != null)
				return false;
		} else if (!exchangeSegment.equals(other.exchangeSegment))
			return false;

		if (expiry == null) {
			if (other.expiry != null)
				return false;
		} else if (!expiry.equals(other.expiry))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (fillPrice == null) {
			if (other.fillPrice != null)
				return false;
		} else if (!fillPrice.equals(other.fillPrice))
			return false;
		if (filledQuantity == null) {
			if (other.filledQuantity != null)
				return false;
		} else if (!filledQuantity.equals(other.filledQuantity))
			return false;
		if (lastTradePrice == null) {
			if (other.lastTradePrice != null)
				return false;
		} else if (!lastTradePrice.equals(other.lastTradePrice))
			return false;
		if (lastTradedPrice == null) {
			if (other.lastTradedPrice != null)
				return false;
		} else if (!lastTradedPrice.equals(other.lastTradedPrice))
			return false;
		if (modifiedByUser == null) {
			if (other.modifiedByUser != null)
				return false;
		} else if (!modifiedByUser.equals(other.modifiedByUser))
			return false;
		if (optionType == null) {
			if (other.optionType != null)
				return false;
		} else if (!optionType.equals(other.optionType))
			return false;
		if (orderRemarks == null) {
			if (other.orderRemarks != null)
				return false;
		} else if (!orderRemarks.equals(other.orderRemarks))
			return false;
		if (orderValidityDate == null) {
			if (other.orderValidityDate != null)
				return false;
		} else if (!orderValidityDate.equals(other.orderValidityDate))
			return false;
		if (referenceLimitPrice == null) {
			if (other.referenceLimitPrice != null)
				return false;
		} else if (!referenceLimitPrice.equals(other.referenceLimitPrice))
			return false;
		if (rejectionReason == null) {
			if (other.rejectionReason != null)
				return false;
		} else if (!rejectionReason.equals(other.rejectionReason))
			return false;
		if (strikePrice == null) {
			if (other.strikePrice != null)
				return false;
		} else if (!strikePrice.equals(other.strikePrice))
			return false;
		if (tradeDate == null) {
			if (other.tradeDate != null)
				return false;
		} else if (!tradeDate.equals(other.tradeDate))
			return false;
		if (tradeNumber == null) {
			if (other.tradeNumber != null)
				return false;
		} else if (!tradeNumber.equals(other.tradeNumber))
			return false;
		if (tradePrice == null) {
			if (other.tradePrice != null)
				return false;
		} else if (!tradePrice.equals(other.tradePrice))
			return false;
		if (tradeTime == null) {
			if (other.tradeTime != null)
				return false;
		} else if (!tradeTime.equals(other.tradeTime))
			return false;
		if (unfilledQuantity == null) {
			if (other.unfilledQuantity != null)
				return false;
		} else if (!unfilledQuantity.equals(other.unfilledQuantity))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((averagePrice == null) ? 0 : averagePrice.hashCode());
		result = prime * result + ((change == null) ? 0 : change.hashCode());
		result = prime * result + ((changePercentage == null) ? 0 : changePercentage.hashCode());
		result = prime * result + ((coverOrderPercentage == null) ? 0 : coverOrderPercentage.hashCode());
		result = prime * result + ((displatStrikePrice == null) ? 0 : displatStrikePrice.hashCode());
		result = prime * result + ((displayExpiryDate == null) ? 0 : displayExpiryDate.hashCode());
		result = prime * result + ((displayInstrumentType == null) ? 0 : displayInstrumentType.hashCode());
		result = prime * result + ((exchangeConfirmationTime == null) ? 0 : exchangeConfirmationTime.hashCode());
		result = prime * result + ((exchangeOrderNumber == null) ? 0 : exchangeOrderNumber.hashCode());
		result = prime * result + ((exchangeSegment == null) ? 0 : exchangeSegment.hashCode());
		result = prime * result + ((expiry == null) ? 0 : expiry.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((fillPrice == null) ? 0 : fillPrice.hashCode());
		result = prime * result + ((filledQuantity == null) ? 0 : filledQuantity.hashCode());
		result = prime * result + ((lastTradePrice == null) ? 0 : lastTradePrice.hashCode());
		result = prime * result + ((lastTradedPrice == null) ? 0 : lastTradedPrice.hashCode());
		result = prime * result + ((modifiedByUser == null) ? 0 : modifiedByUser.hashCode());
		result = prime * result + ((optionType == null) ? 0 : optionType.hashCode());
		result = prime * result + ((orderRemarks == null) ? 0 : orderRemarks.hashCode());
		result = prime * result + ((orderValidityDate == null) ? 0 : orderValidityDate.hashCode());
		result = prime * result + ((referenceLimitPrice == null) ? 0 : referenceLimitPrice.hashCode());
		result = prime * result + ((rejectionReason == null) ? 0 : rejectionReason.hashCode());
		result = prime * result + ((strikePrice == null) ? 0 : strikePrice.hashCode());
		result = prime * result + ((tradeDate == null) ? 0 : tradeDate.hashCode());
		result = prime * result + ((tradeNumber == null) ? 0 : tradeNumber.hashCode());
		result = prime * result + ((tradePrice == null) ? 0 : tradePrice.hashCode());
		result = prime * result + ((tradeTime == null) ? 0 : tradeTime.hashCode());
		result = prime * result + ((unfilledQuantity == null) ? 0 : unfilledQuantity.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "TradeBookEntry [filledQuantity=" + filledQuantity + ", orderValidityDate=" + orderValidityDate
				+ ", fillPrice=" + fillPrice + ", expiryDate=" + expiryDate + ", averagePrice=" + averagePrice
				+ ", unfilledQuantity=" + unfilledQuantity + ", rejectionReason=" + rejectionReason
				+ ", exchangeConfirmationTime=" + exchangeConfirmationTime + ", lastTradedPrice=" + lastTradedPrice
				+ ", referenceLimitPrice=" + referenceLimitPrice + ", coverOrderPercentage=" + coverOrderPercentage
				+ ", modifiedByUser=" + modifiedByUser + ", orderRemarks=" + orderRemarks + ", exchangeOrderNumber="
				+ exchangeOrderNumber + ", tradeNumber=" + tradeNumber + ", tradePrice=" + tradePrice + ", tradeDate="
				+ tradeDate + ", tradeTime=" + tradeTime + ", displayExpiryDate=" + displayExpiryDate
				+ ", displatStrikePrice=" + displatStrikePrice + ", strikePrice=" + strikePrice
				+ ", displayInstrumentType=" + displayInstrumentType + ", optionType=" + optionType
				+ ", lastTradePrice=" + lastTradePrice + ", change=" + change + ", changePercentage=" + changePercentage
				+ ", expiry=" + expiry + "]";
	}

}
