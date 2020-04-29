package in.samco.stockNoteJavaSDK.payload.request;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class UserLimitRequest extends BaseRequestEntity {

	public UserLimitRequest(String sessionToken) {
		super(sessionToken);
	}

}
