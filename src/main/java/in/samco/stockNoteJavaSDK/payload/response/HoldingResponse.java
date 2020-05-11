package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.Holding;
import in.samco.stockNoteJavaSDK.payload.dto.HoldingSummary;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class HoldingResponse extends SimpleResponse {

	private HoldingSummary holdingSummary;
	private List<Holding> holdingDetails;

	public HoldingSummary getHoldingSummary() {
		return holdingSummary;
	}

	public void setHoldingSummary(HoldingSummary holdingSummary) {
		this.holdingSummary = holdingSummary;
	}

	public List<Holding> getHoldingDetails() {
		return holdingDetails;
	}

	public void setHoldingDetails(List<Holding> holdingDetails) {
		this.holdingDetails = holdingDetails;
	}

}
