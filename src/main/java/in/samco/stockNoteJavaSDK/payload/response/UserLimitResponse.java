package in.samco.stockNoteJavaSDK.payload.response;

import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.Limit;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class UserLimitResponse extends SimpleResponse {

	private Limit equityLimit;
	private Limit commodityLimit;

	public Limit getEquityLimit() {
		return equityLimit;
	}

	public void setEquityLimit(Limit equityLimit) {
		this.equityLimit = equityLimit;
	}

	public Limit getCommodityLimit() {
		return commodityLimit;
	}

	public void setCommodityLimit(Limit commodityLimit) {
		this.commodityLimit = commodityLimit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserLimitResponse that = (UserLimitResponse) o;
		return Objects.equals(equityLimit, that.equityLimit) && Objects.equals(commodityLimit, that.commodityLimit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(equityLimit, commodityLimit);
	}

	@Override
	public String toString() {
		return "LimitResponse{" + ", equityLimit=" + equityLimit + ", commodityLimit=" + commodityLimit + '}';
	}

}
