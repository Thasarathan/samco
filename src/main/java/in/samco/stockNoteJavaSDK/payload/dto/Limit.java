package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Limit {

	private String grossAvailableMargin;
	private String payInToday;
	private String notionalCash;
	private String collateralMarginAgainstShares;
	private String marginUsed;
	private String netAvailableMargin;

	@Override
	public String toString() {
		return "Limit{" + "grossAvailableMargin='" + grossAvailableMargin + '\'' + ", payInToday='" + payInToday + '\''
				+ ", notionalCash='" + notionalCash + '\'' + ", CollateralMarginAgainstShares='"
				+ collateralMarginAgainstShares + '\'' + ", marginUsed='" + marginUsed + '\'' + ", netAvailableMargin='"
				+ netAvailableMargin + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Limit limit = (Limit) o;
		return Objects.equals(grossAvailableMargin, limit.grossAvailableMargin)
				&& Objects.equals(payInToday, limit.payInToday) && Objects.equals(notionalCash, limit.notionalCash)
				&& Objects.equals(collateralMarginAgainstShares, limit.collateralMarginAgainstShares)
				&& Objects.equals(marginUsed, limit.marginUsed)
				&& Objects.equals(netAvailableMargin, limit.netAvailableMargin);
	}

	@Override
	public int hashCode() {
		return Objects.hash(grossAvailableMargin, payInToday, notionalCash, collateralMarginAgainstShares, marginUsed,
				netAvailableMargin);
	}

	public String getGrossAvailableMargin() {
		return grossAvailableMargin;
	}

	public void setGrossAvailableMargin(String grossAvailableMargin) {
		this.grossAvailableMargin = grossAvailableMargin;
	}

	public String getPayInToday() {
		return payInToday;
	}

	public void setPayInToday(String payInToday) {
		this.payInToday = payInToday;
	}

	public String getNotionalCash() {
		return notionalCash;
	}

	public void setNotionalCash(String notionalCash) {
		this.notionalCash = notionalCash;
	}

	public String getCollateralMarginAgainstShares() {
		return collateralMarginAgainstShares;
	}

	public void setCollateralMarginAgainstShares(String collateralMarginAgainstShares) {
		collateralMarginAgainstShares = collateralMarginAgainstShares;
	}

	public String getMarginUsed() {
		return marginUsed;
	}

	public void setMarginUsed(String marginUsed) {
		this.marginUsed = marginUsed;
	}

	public String getNetAvailableMargin() {
		return netAvailableMargin;
	}

	public void setNetAvailableMargin(String netAvailableMargin) {
		this.netAvailableMargin = netAvailableMargin;
	}

}
