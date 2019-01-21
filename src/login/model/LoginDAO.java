package login.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	
	private Connection getConn() throws SQLException{
		//2
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@211.63.89.143:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		con = DriverManager.getConnection(url, id, pass);
		
		return con;
		
	}//getConn
	

}
