package login.vo;

public class LoginVO {
	private String id, pass;

	public LoginVO(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}//昔切 し持失切

	public String getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}
	//getter
}//LoginVO
