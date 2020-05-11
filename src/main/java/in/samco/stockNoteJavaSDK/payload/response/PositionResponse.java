package in.samco.stockNoteJavaSDK.payload.response;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.Position;
import in.samco.stockNoteJavaSDK.payload.dto.PositionSummary;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class PositionResponse extends SimpleResponse {

	private PositionSummary positionSummary;
	private List<Position> positionDetails;

	public PositionSummary getPositionSummary() {
		return positionSummary;
	}

	public void setPositionSummary(PositionSummary positionSummary) {
		this.positionSummary = positionSummary;
	}

	public List<Position> getPositionDetails() {
		return positionDetails;
	}

	public void setPositionDetails(List<Position> positionDetails) {
		this.positionDetails = positionDetails;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PositionResponse that = (PositionResponse) o;
		return Objects.equals(positionSummary, that.positionSummary)
				&& Objects.equals(positionDetails, that.positionDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(positionSummary, positionDetails);
	}

	@Override
	public String toString() {
		return "PositionResponse{" + "positionSummary=" + positionSummary + ", positionDetails=" + positionDetails
				+ '}';
	}

}
