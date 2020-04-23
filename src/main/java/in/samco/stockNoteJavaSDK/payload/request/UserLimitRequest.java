package in.samco.stockNoteJavaSDK.payload.request;

import javax.validation.constraints.NotBlank;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class UserLimitRequest extends BaseRequestEntity {

	@NotBlank(message = "Session token is mandatory")
	private String sessionToken;

	public UserLimitRequest(@NotBlank(message = "Session token is mandatory") String sessionToken) {
		super();
		this.sessionToken = sessionToken;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

}
