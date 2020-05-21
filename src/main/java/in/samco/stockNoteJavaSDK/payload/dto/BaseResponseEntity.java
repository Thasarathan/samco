package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseResponseEntity extends BaseResource {

	private String serverTime;
	private String msgId;

	@JsonIgnore
	private String requestTime;

	@JsonIgnore
	private String userId;

	private String validationErrors[];

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getServerTime() {
		return serverTime;
	}

	public void setServerTime(String serverTime) {
		this.serverTime = serverTime;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String[] getValidationErrors() {
		return validationErrors;
	}

	public void setValidationErrors(String[] validationErrors) {
		this.validationErrors = validationErrors;
	}

	@Override
	public String toString() {
		return "BaseResponseEntity [serverTime=" + serverTime + ", msgId=" + msgId + ", requestTime=" + requestTime
				+ ", userId=" + userId + ", validationErrors=" + Arrays.toString(validationErrors) + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		BaseResponseEntity that = (BaseResponseEntity) o;
		return Objects.equals(serverTime, that.serverTime) && Objects.equals(msgId, that.msgId)
				&& Objects.equals(requestTime, that.requestTime) && Objects.equals(userId, that.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverTime, msgId, requestTime, userId);
	}
}
