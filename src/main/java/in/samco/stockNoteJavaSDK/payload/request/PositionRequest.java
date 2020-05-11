package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

public class PositionRequest extends UserRequest {

	private String positionType;

	public PositionRequest(String sessionToken, String positionType) {
		super(sessionToken);
		this.positionType = positionType;
	}

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PositionRequest that = (PositionRequest) o;
		return Objects.equals(positionType, that.positionType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(positionType);
	}

	@Override
	public String toString() {
		return "PositionRequest{" + "positionType='" + positionType + '\'' + '}';
	}

}
