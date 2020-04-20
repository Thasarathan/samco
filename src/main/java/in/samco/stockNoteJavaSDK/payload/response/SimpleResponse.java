package in.samco.stockNoteJavaSDK.payload.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.samco.stockNoteJavaSDK.payload.dto.BaseResponseEntity;


@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class SimpleResponse extends BaseResponseEntity {
	
	private String status;
	private String statusMessage;

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
