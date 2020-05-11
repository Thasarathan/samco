package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class PositionSummary {

	private String gainingTodayCount;
	private String losingTodayCount;
	private String totalGainAndLossAmount;
	private String dayGainAndLossAmount;

	public String getGainingTodayCount() {
		return gainingTodayCount;
	}

	public void setGainingTodayCount(String gainingTodayCount) {
		this.gainingTodayCount = gainingTodayCount;
	}

	public String getLosingTodayCount() {
		return losingTodayCount;
	}

	public void setLosingTodayCount(String losingTodayCount) {
		this.losingTodayCount = losingTodayCount;
	}

	public String getTotalGainAndLossAmount() {
		return totalGainAndLossAmount;
	}

	public void setTotalGainAndLossAmount(String totalGainAndLossAmount) {
		this.totalGainAndLossAmount = totalGainAndLossAmount;
	}

	public String getDayGainAndLossAmount() {
		return dayGainAndLossAmount;
	}

	public void setDayGainAndLossAmount(String dayGainAndLossAmount) {
		this.dayGainAndLossAmount = dayGainAndLossAmount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PositionSummary that = (PositionSummary) o;
		return Objects.equals(gainingTodayCount, that.gainingTodayCount)
				&& Objects.equals(losingTodayCount, that.losingTodayCount)
				&& Objects.equals(totalGainAndLossAmount, that.totalGainAndLossAmount)
				&& Objects.equals(dayGainAndLossAmount, that.dayGainAndLossAmount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(gainingTodayCount, losingTodayCount, totalGainAndLossAmount, dayGainAndLossAmount);
	}

	@Override
	public String toString() {
		return "PositionSummary{" + "gainingTodayCount='" + gainingTodayCount + '\'' + ", losingTodayCount='"
				+ losingTodayCount + '\'' + ", totalGainAndLossAmount='" + totalGainAndLossAmount + '\''
				+ ", dayGainAndLossAmount='" + dayGainAndLossAmount + '\'' + '}';
	}

}
