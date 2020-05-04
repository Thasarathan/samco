package in.samco.stockNoteJavaSDK.payload.request;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class UserRequest extends BaseRequestEntity {

	public UserRequest(String sessionToken) {
		super(sessionToken);
	}

}
