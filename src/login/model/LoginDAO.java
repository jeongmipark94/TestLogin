package login.model;

public class LoginDAO {
	
	private static LoginDAO l_dao;//다른 곳에서 접근 못하게
	
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
