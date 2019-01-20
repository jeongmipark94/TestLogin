package login.vo;

public class UserInfoVO {
	private String id,password,tel,email,ssn,address,answer;

	public UserInfoVO(String id, String password, String tel, String email, String ssn, String address, String answer) {
		this.id = id;
		this.password = password;
		this.tel = tel;
		this.email = email;
		this.ssn = ssn;
		this.address = address;
		this.answer = answer;
	}//昔切 持失切

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getSsn() {
		return ssn;
	}

	public String getAddress() {
		return address;
	}

	public String getAnswer() {
		return answer;
	}
	

}//UserInfoVO
