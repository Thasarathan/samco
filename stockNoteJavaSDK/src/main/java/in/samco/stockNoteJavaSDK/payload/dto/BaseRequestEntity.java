package in.samco.stockNoteJavaSDK.payload.dto;

import java.util.Objects;

public class BaseRequestEntity {

	private String requestTime = String.valueOf(System.currentTimeMillis());
	private String msgId;
	private String userId;

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String serverTime) {
		this.requestTime = serverTime;
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		BaseRequestEntity that = (BaseRequestEntity) o;
		return Objects.equals(requestTime, that.requestTime) && Objects.equals(msgId, that.msgId)
				&& Objects.equals(userId, that.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestTime, msgId, userId);
	}

	@Override
	public String toString() {
		return "BaseRequestEntity{" + "requestTime='" + requestTime + '\'' + ", msgId='" + msgId + '\'' + ", userId='"
				+ userId + '\'' + '}';
	}
}
