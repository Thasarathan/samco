package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class OrderBookEntry extends BookEntry {

	private String orderType;
	private String orderPrice;
	private String quantity;
	private String disclosedQuantity;
	private String triggerPrice;
	private String orderValidity;
	private String orderStatus;
	private String filledQuantity;
	private String fillPrice;
	private String expiryDate;
	private String averagePrice;
	private String unfilledQuantity;
	private String exchangeOrderId;
	private String rejectionReason;
	private String exchangeConfirmationTime;

	private String cancelledQuantity;
	private String referenceLimitPrice;
	private String coverOrderPercentage;
	private String modifiedByUser;
	private String orderRemarks;
	private String exchangeOrderNumber;
	private String symbol;
	private String boardLotQuantity;
	private String displayStrikePrice;
	private String displayNetQuantity;
	private String status;
	private String exchangeStatus;
	private String expiry;
	private String pendingQuantity;
	private String instrument;
	private String scripName;
	private String totalQuanity;
	private String orderSource;
	private String optionType;
	private String orderPlaceBy;
	private String lotQuantity;

	public String getOrderPlaceBy() {
		return orderPlaceBy;
	}

	public void setOrderPlaceBy(String orderPlaceBy) {
		this.orderPlaceBy = orderPlaceBy;
	}

	public String getLotQuantity() {
		return lotQuantity;
	}

	public void setLotQuantity(String lotQuantity) {
		this.lotQuantity = lotQuantity;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getBoardLotQuantity() {
		return boardLotQuantity;
	}

	public void setBoardLotQuantity(String boardLotQuantity) {
		this.boardLotQuantity = boardLotQuantity;
	}

	public String getDisplayStrikePrice() {
		return displayStrikePrice;
	}

	public void setDisplayStrikePrice(String displayStrikePrice) {
		this.displayStrikePrice = displayStrikePrice;
	}

	public String getDisplayNetQuantity() {
		return displayNetQuantity;
	}

	public void setDisplayNetQuantity(String displayNetQuantity) {
		this.displayNetQuantity = displayNetQuantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExchangeStatus() {
		return exchangeStatus;
	}

	public void setExchangeStatus(String exchangeStatus) {
		this.exchangeStatus = exchangeStatus;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getPendingQuantity() {
		return pendingQuantity;
	}

	public void setPendingQuantity(String pendingQuantity) {
		this.pendingQuantity = pendingQuantity;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getScripName() {
		return scripName;
	}

	public void setScripName(String scripName) {
		scripName = scripName;
	}

	public String getTotalQuanity() {
		return totalQuanity;
	}

	public void setTotalQuanity(String totalQuanity) {
		this.totalQuanity = totalQuanity;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDisclosedQuantity() {
		return disclosedQuantity;
	}

	public void setDisclosedQuantity(String disclosedQuantity) {
		this.disclosedQuantity = disclosedQuantity;
	}

	public String getTriggerPrice() {
		return triggerPrice;
	}

	public void setTriggerPrice(String triggerPrice) {
		this.triggerPrice = triggerPrice;
	}

	public String getOrderValidity() {
		return orderValidity;
	}

	public void setOrderValidity(String orderValidity) {
		this.orderValidity = orderValidity;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getFilledQuantity() {
		return filledQuantity;
	}

	public void setFilledQuantity(String filledQuantity) {
		this.filledQuantity = filledQuantity;
	}

	/*
	 * public String getOrderValidityDate() { return orderValidityDate; }
	 * 
	 * public void setOrderValidityDate(String orderValidityDate) {
	 * this.orderValidityDate = orderValidityDate; }
	 */
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

	public String getExchangeOrderId() {
		return exchangeOrderId;
	}

	public void setExchangeOrderId(String exchangeOrderId) {
		this.exchangeOrderId = exchangeOrderId;
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

	public String getCancelledQuantity() {
		return cancelledQuantity;
	}

	public void setCancelledQuantity(String cancelledQuantity) {
		this.cancelledQuantity = cancelledQuantity;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderBookEntry other = (OrderBookEntry) obj;
		if (scripName == null) {
			if (other.scripName != null)
				return false;
		} else if (!scripName.equals(other.scripName))
			return false;
		if (averagePrice == null) {
			if (other.averagePrice != null)
				return false;
		} else if (!averagePrice.equals(other.averagePrice))
			return false;
		if (boardLotQuantity == null) {
			if (other.boardLotQuantity != null)
				return false;
		} else if (!boardLotQuantity.equals(other.boardLotQuantity))
			return false;
		if (cancelledQuantity == null) {
			if (other.cancelledQuantity != null)
				return false;
		} else if (!cancelledQuantity.equals(other.cancelledQuantity))
			return false;
		if (coverOrderPercentage == null) {
			if (other.coverOrderPercentage != null)
				return false;
		} else if (!coverOrderPercentage.equals(other.coverOrderPercentage))
			return false;
		if (disclosedQuantity == null) {
			if (other.disclosedQuantity != null)
				return false;
		} else if (!disclosedQuantity.equals(other.disclosedQuantity))
			return false;
		if (displayNetQuantity == null) {
			if (other.displayNetQuantity != null)
				return false;
		} else if (!displayNetQuantity.equals(other.displayNetQuantity))
			return false;
		if (displayStrikePrice == null) {
			if (other.displayStrikePrice != null)
				return false;
		} else if (!displayStrikePrice.equals(other.displayStrikePrice))
			return false;
		if (exchangeConfirmationTime == null) {
			if (other.exchangeConfirmationTime != null)
				return false;
		} else if (!exchangeConfirmationTime.equals(other.exchangeConfirmationTime))
			return false;
		if (exchangeOrderId == null) {
			if (other.exchangeOrderId != null)
				return false;
		} else if (!exchangeOrderId.equals(other.exchangeOrderId))
			return false;
		if (exchangeOrderNumber == null) {
			if (other.exchangeOrderNumber != null)
				return false;
		} else if (!exchangeOrderNumber.equals(other.exchangeOrderNumber))
			return false;
		if (exchangeStatus == null) {
			if (other.exchangeStatus != null)
				return false;
		} else if (!exchangeStatus.equals(other.exchangeStatus))
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
		if (instrument == null) {
			if (other.instrument != null)
				return false;
		} else if (!instrument.equals(other.instrument))
			return false;
		if (lotQuantity == null) {
			if (other.lotQuantity != null)
				return false;
		} else if (!lotQuantity.equals(other.lotQuantity))
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
		if (orderPlaceBy == null) {
			if (other.orderPlaceBy != null)
				return false;
		} else if (!orderPlaceBy.equals(other.orderPlaceBy))
			return false;
		if (orderPrice == null) {
			if (other.orderPrice != null)
				return false;
		} else if (!orderPrice.equals(other.orderPrice))
			return false;
		if (orderRemarks == null) {
			if (other.orderRemarks != null)
				return false;
		} else if (!orderRemarks.equals(other.orderRemarks))
			return false;
		if (orderSource == null) {
			if (other.orderSource != null)
				return false;
		} else if (!orderSource.equals(other.orderSource))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (orderType == null) {
			if (other.orderType != null)
				return false;
		} else if (!orderType.equals(other.orderType))
			return false;
		if (orderValidity == null) {
			if (other.orderValidity != null)
				return false;
		} else if (!orderValidity.equals(other.orderValidity))
			return false;
		/*
		 * if (orderValidityDate == null) { if (other.orderValidityDate != null) return
		 * false; } else if (!orderValidityDate.equals(other.orderValidityDate)) return
		 * false;
		 */
		if (pendingQuantity == null) {
			if (other.pendingQuantity != null)
				return false;
		} else if (!pendingQuantity.equals(other.pendingQuantity))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
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
		/*
		 * if (segmentName == null) { if (other.segmentName != null) return false; }
		 * else if (!segmentName.equals(other.segmentName)) return false;
		 */
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		/*
		 * if (symbol == null) { if (other.symbol != null) return false; } else if
		 * (!symbol.equals(other.symbol)) return false;
		 */
		if (totalQuanity == null) {
			if (other.totalQuanity != null)
				return false;
		} else if (!totalQuanity.equals(other.totalQuanity))
			return false;
		if (triggerPrice == null) {
			if (other.triggerPrice != null)
				return false;
		} else if (!triggerPrice.equals(other.triggerPrice))
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
		result = prime * result + ((scripName == null) ? 0 : scripName.hashCode());
		result = prime * result + ((averagePrice == null) ? 0 : averagePrice.hashCode());
		result = prime * result + ((boardLotQuantity == null) ? 0 : boardLotQuantity.hashCode());
		result = prime * result + ((cancelledQuantity == null) ? 0 : cancelledQuantity.hashCode());
		result = prime * result + ((coverOrderPercentage == null) ? 0 : coverOrderPercentage.hashCode());
		result = prime * result + ((disclosedQuantity == null) ? 0 : disclosedQuantity.hashCode());
		result = prime * result + ((displayNetQuantity == null) ? 0 : displayNetQuantity.hashCode());
		result = prime * result + ((displayStrikePrice == null) ? 0 : displayStrikePrice.hashCode());
		result = prime * result + ((exchangeConfirmationTime == null) ? 0 : exchangeConfirmationTime.hashCode());
		result = prime * result + ((exchangeOrderId == null) ? 0 : exchangeOrderId.hashCode());
		result = prime * result + ((exchangeOrderNumber == null) ? 0 : exchangeOrderNumber.hashCode());
		result = prime * result + ((exchangeStatus == null) ? 0 : exchangeStatus.hashCode());
		result = prime * result + ((expiry == null) ? 0 : expiry.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((fillPrice == null) ? 0 : fillPrice.hashCode());
		result = prime * result + ((filledQuantity == null) ? 0 : filledQuantity.hashCode());
		result = prime * result + ((instrument == null) ? 0 : instrument.hashCode());
		result = prime * result + ((lotQuantity == null) ? 0 : lotQuantity.hashCode());
		result = prime * result + ((modifiedByUser == null) ? 0 : modifiedByUser.hashCode());
		result = prime * result + ((optionType == null) ? 0 : optionType.hashCode());
		result = prime * result + ((orderPlaceBy == null) ? 0 : orderPlaceBy.hashCode());
		result = prime * result + ((orderPrice == null) ? 0 : orderPrice.hashCode());
		result = prime * result + ((orderRemarks == null) ? 0 : orderRemarks.hashCode());
		result = prime * result + ((orderSource == null) ? 0 : orderSource.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((orderType == null) ? 0 : orderType.hashCode());
		result = prime * result + ((orderValidity == null) ? 0 : orderValidity.hashCode());
//		result = prime * result + ((orderValidityDate == null) ? 0 : orderValidityDate.hashCode());
		result = prime * result + ((pendingQuantity == null) ? 0 : pendingQuantity.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((referenceLimitPrice == null) ? 0 : referenceLimitPrice.hashCode());
		result = prime * result + ((rejectionReason == null) ? 0 : rejectionReason.hashCode());
//		result = prime * result + ((segmentName == null) ? 0 : segmentName.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((totalQuanity == null) ? 0 : totalQuanity.hashCode());
		result = prime * result + ((triggerPrice == null) ? 0 : triggerPrice.hashCode());
		result = prime * result + ((unfilledQuantity == null) ? 0 : unfilledQuantity.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "OrderBookEntry [orderType=" + orderType + ", orderPrice=" + orderPrice + ", quantity=" + quantity
				+ ", disclosedQuantity=" + disclosedQuantity + ", triggerPrice=" + triggerPrice + ", orderValidity="
				+ orderValidity + ", orderStatus=" + orderStatus + ", filledQuantity=" + filledQuantity
//				+ ", orderValidityDate=" + orderValidityDate + ", fillPrice=" + fillPrice + ", expiryDate=" + expiryDate
				+ ", averagePrice=" + averagePrice + ", unfilledQuantity=" + unfilledQuantity + ", exchangeOrderId="
				+ exchangeOrderId + ", rejectionReason=" + rejectionReason + ", exchangeConfirmationTime="
				+ exchangeConfirmationTime + ", cancelledQuantity=" + cancelledQuantity + ", referenceLimitPrice="
				+ referenceLimitPrice + ", coverOrderPercentage=" + coverOrderPercentage + ", modifiedByUser="
				+ modifiedByUser + ", orderRemarks=" + orderRemarks + ", exchangeOrderNumber=" + exchangeOrderNumber
				+ ",  boardLotQuantity=" + boardLotQuantity + ", displayStrikePrice=" + displayStrikePrice
				+ ", displayNetQuantity=" + displayNetQuantity + ", status=" + status + ", exchangeStatus="
				+ exchangeStatus + ", expiry=" + expiry + ", pendingQuantity=" + pendingQuantity + ", instrument="
				+ instrument + ", ScripName=" + scripName + ", totalQuanity=" + totalQuanity + ", orderSource="
				+ orderSource + ", optionType=" + optionType + ", orderPlaceBy=" + orderPlaceBy + ",lotQuantity="
				+ lotQuantity + "]";
	}

}
