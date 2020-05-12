package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class PositionConversionRequest extends BaseRequestEntity {

	@JsonIgnore
	private String sessionToken;
	private String symbolName;
	private String exchange;
	private String transactionType;
	private String positionType;
	private String netQuantity;
	private String quantityToConvert;
	private String fromProductType;

	private String toProductType;
	@JsonIgnore
	private String boardLotQuantity;

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public String getNetQuantity() {
		return netQuantity;
	}

	public void setNetQuantity(String netQuantity) {
		this.netQuantity = netQuantity;
	}

	public String getQuantityToConvert() {
		return quantityToConvert;
	}

	public void setQuantityToConvert(String quantityToConvert) {
		this.quantityToConvert = quantityToConvert;
	}

	public String getFromProductType() {
		return fromProductType;
	}

	public void setFromProductType(String fromProductType) {
		this.fromProductType = fromProductType;
	}

	public String getToProductType() {
		return toProductType;
	}

	public void setToProductType(String toProductType) {
		this.toProductType = toProductType;
	}

	public String getBoardLotQuantity() {
		return boardLotQuantity;
	}

	public void setBoardLotQuantity(String boardLotQuantity) {
		this.boardLotQuantity = boardLotQuantity;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PositionConversionRequest that = (PositionConversionRequest) o;
		return Objects.equals(sessionToken, that.sessionToken) && Objects.equals(symbolName, that.symbolName)
				&& Objects.equals(exchange, that.exchange) && Objects.equals(transactionType, that.transactionType)
				&& Objects.equals(positionType, that.positionType) && Objects.equals(netQuantity, that.netQuantity)
				&& Objects.equals(quantityToConvert, that.quantityToConvert)
				&& Objects.equals(fromProductType, that.fromProductType)
				&& Objects.equals(toProductType, that.toProductType)
				&& Objects.equals(boardLotQuantity, that.boardLotQuantity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sessionToken, symbolName, exchange, transactionType, positionType, netQuantity,
				quantityToConvert, fromProductType, toProductType, boardLotQuantity);
	}

	@Override
	public String toString() {
		return "PositionConversionRequest{" + "sessionToken='" + sessionToken + '\'' + ", symbolName='" + symbolName
				+ '\'' + ", exchange='" + exchange + '\'' + ", transactionType='" + transactionType + '\''
				+ ", positionType='" + positionType + '\'' + ", netQuantity='" + netQuantity + '\''
				+ ", quantityToConvert='" + quantityToConvert + '\'' + ", fromProductType='" + fromProductType + '\''
				+ ", toProductType='" + toProductType + '\'' + ", boardLotQuantity='" + boardLotQuantity + '\'' + '}';
	}

}
