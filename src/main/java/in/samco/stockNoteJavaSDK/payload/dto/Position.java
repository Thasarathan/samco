package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Position extends Portfolio {

	private String averageBuyPrice;
	private String averageSellPrice;
	private String boardLotQuantity;
	private String boughtPrice;
	@JsonIgnore
	private String breakEvenPrice;
	private String buyQuantity;
	@JsonIgnore
	private String carryForwardAveragePrice;
	private String carryForwardQuantity;
	private String carryForwardValue;
	@JsonIgnore
	private String displayInstrumentType;
	@JsonIgnore
	private String displayNetQuantity;
	@JsonIgnore
	private String instrumentType;
	@JsonIgnore
	private String lotSize;

	@JsonIgnore
	private String marginBlocked;
	private String multiplier;
	@JsonIgnore
	private String netAveragePrice;
	private String netPositionValue;
	private String netQuantity;
	@JsonIgnore
	private String netQuantityPositionConversionFlag;
	private String netValue;
	@JsonIgnore
	private String positionFlag;
	private String positionType;
	private List<String> positionConversions;
	@JsonIgnore
	private String sellQuantity;
	private String soldValue;
	@JsonIgnore
	private String squareOffFlag;
	private String transactionType;
	private String strikePrice;
	@JsonIgnore
	private String exchangeSegment;
	private String realizedGainAndLoss;
	private String unrealizedGainAndLoss;
	private String companyName;
	@JsonIgnore
	private String scripToken;
	private String expiryDate;
	private String displayExpiryDate;
	private String optionType;
	private String displayStrikePrice;

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getDisplayExpiryDate() {
		return displayExpiryDate;
	}

	public void setDisplayExpiryDate(String displayExpiryDate) {
		this.displayExpiryDate = displayExpiryDate;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getDisplayStrikePrice() {
		return displayStrikePrice;
	}

	public void setDisplayStrikePrice(String displayStrikePrice) {
		this.displayStrikePrice = displayStrikePrice;
	}

	public String getScripToken() {
		return scripToken;
	}

	public void setScripToken(String scripToken) {
		this.scripToken = scripToken;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRealizedGainAndLoss() {
		return realizedGainAndLoss;
	}

	public void setRealizedGainAndLoss(String realizedGainAndLoss) {
		this.realizedGainAndLoss = realizedGainAndLoss;
	}

	public String getUnrealizedGainAndLoss() {
		return unrealizedGainAndLoss;
	}

	public void setUnrealizedGainAndLoss(String unrealizedGainAndLoss) {
		this.unrealizedGainAndLoss = unrealizedGainAndLoss;
	}

	public String getExchangeSegment() {
		return exchangeSegment;
	}

	public void setExchangeSegment(String exchangeSegment) {
		this.exchangeSegment = exchangeSegment;
	}

	public String getAverageBuyPrice() {
		return averageBuyPrice;
	}

	public void setAverageBuyPrice(String averageBuyPrice) {
		this.averageBuyPrice = averageBuyPrice;
	}

	public String getAverageSellPrice() {
		return averageSellPrice;
	}

	public void setAverageSellPrice(String averageSellPrice) {
		this.averageSellPrice = averageSellPrice;
	}

	public String getBoardLotQuantity() {
		return boardLotQuantity;
	}

	public void setBoardLotQuantity(String boardLotQuantity) {
		this.boardLotQuantity = boardLotQuantity;
	}

	public String getBoughtPrice() {
		return boughtPrice;
	}

	public void setBoughtPrice(String boughtPrice) {
		this.boughtPrice = boughtPrice;
	}

	public String getBreakEvenPrice() {
		return breakEvenPrice;
	}

	public void setBreakEvenPrice(String breakEvenPrice) {
		this.breakEvenPrice = breakEvenPrice;
	}

	public String getBuyQuantity() {
		return buyQuantity;
	}

	public void setBuyQuantity(String buyQuantity) {
		this.buyQuantity = buyQuantity;
	}

	public String getCarryForwardAveragePrice() {
		return carryForwardAveragePrice;
	}

	public void setCarryForwardAveragePrice(String carryForwardAveragePrice) {
		this.carryForwardAveragePrice = carryForwardAveragePrice;
	}

	public String getCarryForwardQuantity() {
		return carryForwardQuantity;
	}

	public void setCarryForwardQuantity(String carryForwardQuantity) {
		this.carryForwardQuantity = carryForwardQuantity;
	}

	public String getCarryForwardValue() {
		return carryForwardValue;
	}

	public void setCarryForwardValue(String carryForwardValue) {
		this.carryForwardValue = carryForwardValue;
	}

	public String getDisplayInstrumentType() {
		return displayInstrumentType;
	}

	public void setDisplayInstrumentType(String displayInstrumentType) {
		this.displayInstrumentType = displayInstrumentType;
	}

	public String getDisplayNetQuantity() {
		return displayNetQuantity;
	}

	public void setDisplayNetQuantity(String displayNetQuantity) {
		this.displayNetQuantity = displayNetQuantity;
	}

	public String getInstrumentType() {
		return instrumentType;
	}

	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}

	public String getLotSize() {
		return lotSize;
	}

	public void setLotSize(String lotSize) {
		this.lotSize = lotSize;
	}

	public String getMarginBlocked() {
		return marginBlocked;
	}

	public void setMarginBlocked(String marginBlocked) {
		this.marginBlocked = marginBlocked;
	}

	public String getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(String multiplier) {
		this.multiplier = multiplier;
	}

	public String getNetAveragePrice() {
		return netAveragePrice;
	}

	public void setNetAveragePrice(String netAveragePrice) {
		this.netAveragePrice = netAveragePrice;
	}

	public String getNetPositionValue() {
		return netPositionValue;
	}

	public void setNetPositionValue(String netPositionValue) {
		this.netPositionValue = netPositionValue;
	}

	public String getNetQuantity() {
		return netQuantity;
	}

	public void setNetQuantity(String netQuantity) {
		this.netQuantity = netQuantity;
	}

	public String getNetQuantityPositionConversionFlag() {
		return netQuantityPositionConversionFlag;
	}

	public void setNetQuantityPositionConversionFlag(String netQuantityPositionConversionFlag) {
		this.netQuantityPositionConversionFlag = netQuantityPositionConversionFlag;
	}

	public String getNetValue() {
		return netValue;
	}

	public void setNetValue(String netValue) {
		this.netValue = netValue;
	}

	public String getPositionFlag() {
		return positionFlag;
	}

	public void setPositionFlag(String positionFlag) {
		this.positionFlag = positionFlag;
	}

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public List<String> getPositionConversions() {
		return positionConversions;
	}

	public void setPositionConversions(List<String> positionConversions) {
		this.positionConversions = positionConversions;
	}

	public String getSellQuantity() {
		return sellQuantity;
	}

	public void setSellQuantity(String sellQuantity) {
		this.sellQuantity = sellQuantity;
	}

	public String getSoldValue() {
		return soldValue;
	}

	public void setSoldValue(String soldValue) {
		this.soldValue = soldValue;
	}

	public String getSquareOffFlag() {
		return squareOffFlag;
	}

	public void setSquareOffFlag(String squareOffFlag) {
		this.squareOffFlag = squareOffFlag;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Position position = (Position) o;
		return Objects.equals(averageBuyPrice, position.averageBuyPrice)
				&& Objects.equals(averageSellPrice, position.averageSellPrice)
				&& Objects.equals(boardLotQuantity, position.boardLotQuantity)
				&& Objects.equals(boughtPrice, position.boughtPrice)
				&& Objects.equals(breakEvenPrice, position.breakEvenPrice)
				&& Objects.equals(buyQuantity, position.buyQuantity)
				&& Objects.equals(carryForwardAveragePrice, position.carryForwardAveragePrice)
				&& Objects.equals(carryForwardQuantity, position.carryForwardQuantity)
				&& Objects.equals(carryForwardValue, position.carryForwardValue)
				&& Objects.equals(displayInstrumentType, position.displayInstrumentType)
				&& Objects.equals(displayNetQuantity, position.displayNetQuantity)
				&& Objects.equals(instrumentType, position.instrumentType) && Objects.equals(lotSize, position.lotSize)
				&& Objects.equals(marginBlocked, position.marginBlocked)
				&& Objects.equals(multiplier, position.multiplier)
				&& Objects.equals(netAveragePrice, position.netAveragePrice)
				&& Objects.equals(netPositionValue, position.netPositionValue)
				&& Objects.equals(netQuantity, position.netQuantity)
				&& Objects.equals(netQuantityPositionConversionFlag, position.netQuantityPositionConversionFlag)
				&& Objects.equals(netValue, position.netValue) && Objects.equals(positionFlag, position.positionFlag)
				&& Objects.equals(positionType, position.positionType)
				&& Objects.equals(positionConversions, position.positionConversions)
				&& Objects.equals(sellQuantity, position.sellQuantity) && Objects.equals(soldValue, position.soldValue)
				&& Objects.equals(squareOffFlag, position.squareOffFlag)
				&& Objects.equals(transactionType, position.transactionType)
				&& Objects.equals(exchangeSegment, position.exchangeSegment)
				&& Objects.equals(realizedGainAndLoss, position.realizedGainAndLoss)
				&& Objects.equals(unrealizedGainAndLoss, position.unrealizedGainAndLoss)
				&& Objects.equals(companyName, position.companyName) && Objects.equals(scripToken, position.scripToken);
	}

	@Override
	public int hashCode() {
		return Objects.hash(averageBuyPrice, averageSellPrice, boardLotQuantity, boughtPrice, breakEvenPrice,
				buyQuantity, carryForwardAveragePrice, carryForwardQuantity, carryForwardValue, displayInstrumentType,
				displayNetQuantity, instrumentType, lotSize, marginBlocked, multiplier, netAveragePrice,
				netPositionValue, netQuantity, netQuantityPositionConversionFlag, netValue, positionFlag, positionType,
				positionConversions, sellQuantity, soldValue, squareOffFlag, transactionType, exchangeSegment,
				realizedGainAndLoss, unrealizedGainAndLoss, companyName, scripToken);
	}

	@Override
	public String toString() {
		return "Position [averageBuyPrice=" + averageBuyPrice + ", averageSellPrice=" + averageSellPrice
				+ ", boardLotQuantity=" + boardLotQuantity + ", boughtPrice=" + boughtPrice + ", breakEvenPrice="
				+ breakEvenPrice + ", buyQuantity=" + buyQuantity + ", carryForwardAveragePrice="
				+ carryForwardAveragePrice + ", carryForwardQuantity=" + carryForwardQuantity + ", carryForwardValue="
				+ carryForwardValue + ", displayInstrumentType=" + displayInstrumentType + ", displayNetQuantity="
				+ displayNetQuantity + ", instrumentType=" + instrumentType + ", lotSize=" + lotSize
				+ ", marginBlocked=" + marginBlocked + ", multiplier=" + multiplier + ", netAveragePrice="
				+ netAveragePrice + ", netPositionValue=" + netPositionValue + ", netQuantity=" + netQuantity
				+ ", netQuantityPositionConversionFlag=" + netQuantityPositionConversionFlag + ", netValue=" + netValue
				+ ", positionFlag=" + positionFlag + ", positionType=" + positionType + ", positionConversions="
				+ positionConversions + ", sellQuantity=" + sellQuantity + ", soldValue=" + soldValue
				+ ", squareOffFlag=" + squareOffFlag + ", transactionType=" + transactionType + ", exchangeSegment="
				+ exchangeSegment + ", realizedGainAndLoss=" + realizedGainAndLoss + ", unrealizedGainAndLoss="
				+ unrealizedGainAndLoss + ", companyName=" + companyName + ", scripToken=" + scripToken
				+ ", StrikePrice=" + strikePrice + ", expiryDate=" + expiryDate + ", displayExpiryDate="
				+ displayExpiryDate + ", optionType=" + optionType + ", displayStrikePrice=" + displayStrikePrice + "]";
	}

}
