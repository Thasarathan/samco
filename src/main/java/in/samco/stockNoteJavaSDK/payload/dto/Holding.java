package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Holding extends Portfolio {

	private String holdingsQuantity;
	@JsonIgnore
	private String btstHoldingsQuantity;
	private String collateralQuantity;
	private String haircut;
	private String holdingsValue;
	private String isin;
	private String sellableQuantity;
	private String totalMarketToMarketPrice;

	public String getSellableQuantity() {
		return sellableQuantity;
	}

	public void setSellableQuantity(String sellableQuantity) {
		this.sellableQuantity = sellableQuantity;
	}

	public String getHoldingsQuantity() {
		return holdingsQuantity;
	}

	public void setHoldingsQuantity(String holdingsQuantity) {
		this.holdingsQuantity = holdingsQuantity;
	}

	public String getBtstHoldingsQuantity() {
		return btstHoldingsQuantity;
	}

	public void setBtstHoldingsQuantity(String BtstHoldingsQuantity) {
		this.btstHoldingsQuantity = BtstHoldingsQuantity;
	}

	public String getCollateralQuantity() {
		return collateralQuantity;
	}

	public void setCollateralQuantity(String collateralQuantity) {
		this.collateralQuantity = collateralQuantity;
	}

	public String getHaircut() {
		return haircut;
	}

	public void setHaircut(String haircut) {
		this.haircut = haircut;
	}

	public String getHoldingsValue() {
		return holdingsValue;
	}

	public void setHoldingsValue(String holdingsValue) {
		this.holdingsValue = holdingsValue;
	}

	public String getIsin() {
		return isin;
	}

	public void setISIN(String isin) {
		this.isin = isin;
	}

	public String getTotalMarketToMarketPrice() {
		return totalMarketToMarketPrice;
	}

	public void setTotalMarketToMarketPrice(String totalMarketToMarketPrice) {
		this.totalMarketToMarketPrice = totalMarketToMarketPrice;
	}

	@Override
	public String toString() {
		return "Holding [holdingsQuantity=" + holdingsQuantity + ", btstHoldingsQuantity=" + btstHoldingsQuantity
				+ ", collateralQuantity=" + collateralQuantity + ", haircut=" + haircut + ", holdingsValue="
				+ holdingsValue + ", isin=" + isin + ", sellableQuantity=" + sellableQuantity
				+ ", totalMarketToMarketPrice=" + totalMarketToMarketPrice + "]";
	}

}
