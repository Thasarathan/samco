package in.samco.entity;

public class Login {

	private String userId;

	private String password;

	private String yob;

	public Login(String userId, String password, String yob) {
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
