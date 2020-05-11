package in.samco.stockNoteJavaSDK.payload.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class HoldingSummary extends PositionSummary {

	String portfolioValue;

	public String getPortfolioValue() {
		return portfolioValue;
	}

	public void setPortfolioValue(String portfolioValue) {
		this.portfolioValue = portfolioValue;
	}
}
