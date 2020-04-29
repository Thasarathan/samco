package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class LoginRequest extends BaseRequestEntity {

	private String userId;
	
	private String password;
	
	private String yob;

	public LoginRequest() {

	}

	public LoginRequest(String userId, String password, String yob) {
		super();
		this.userId = userId;
		this.password = password;
		this.yob = yob;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getYob() {
		return yob;
	}

	public void setYob(String yob) {
		this.yob = yob;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LoginRequest that = (LoginRequest) o;
		return userId.equals(that.userId) && password.equals(that.password) && yob.equals(that.yob);
	}

	@Override
	public String toString() {
		return "LoginRequest{" + "userId='" + userId + '\'' + ", password='" + password + '\'' + ", yob='" + yob + '\''
				+ '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, password, yob);
	}

}
