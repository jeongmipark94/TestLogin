package login.model;

public class LoginDAO {
	
	private static LoginDAO l_dao;//�ٸ� ������ ���� ���ϰ�
	
	private LoginDAO() {
		//1.
		
		
		
	}//LoginDAO
	
	
	public static LoginDAO getInstance() {
		if(l_dao== null) {
			l_dao = new LoginDAO();
		}//end if
		return l_dao;
	}//getInstance
	
	

}
