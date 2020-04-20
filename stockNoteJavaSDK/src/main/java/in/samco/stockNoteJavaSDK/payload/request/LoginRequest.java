package in.samco.stockNoteJavaSDK.payload.request;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import in.samco.stockNoteJavaSDK.payload.dto.BaseRequestEntity;

public class LoginRequest extends BaseRequestEntity {

	@NotBlank(message = "UserId is mandatory")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "please enter a valid UserId")
	private String userId;
	@NotBlank(message = "Password is mandatory")
	private String password;
	@NotBlank(message = "Year Of Birth is mandatory")
	@Pattern(regexp = "^[0-9]+$", message = "please enter a valid Year of Birth")
	private String yob;

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

	public LoginRequest(
			@NotBlank(message = "UserId is mandatory") @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "please enter a valid UserId") String userId,
			@NotBlank(message = "Password is mandatory") String password,
			@NotBlank(message = "Year Of Birth is mandatory") @Pattern(regexp = "^[0-9]+$", message = "please enter a valid Year of Birth") String yob) {
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
}
