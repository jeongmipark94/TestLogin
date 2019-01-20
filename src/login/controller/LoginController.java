package login.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import login.view.LoginView;
import login.view.SignUpView;

public class LoginController extends WindowAdapter implements ActionListener,MouseListener {
	
	private LoginView lv;
	
	public LoginController(LoginView lv) {
		this.lv= lv;
		
	}//LoginController 생성자
	
	@Override
	public void windowClosing(WindowEvent we) {
		lv.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == lv.getJbLogin()) {
			//아이디 비밀번호 공백인지 확인 하고 받아옴.
			
			//LoginVO로 로그인 인증 수행한 결과를 받는다.
			
			//로그인 성공시 UserView를 띄운다.
//			new UserView();
			
			lv.dispose();
			
			//로그인 버튼 눌려졌을 때.	
		}else{
			new SignUpView(lv);
		}
		
		
	}//actionPerformed

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	
	
	
	

	@Override
	public void mousePressed(MouseEvent e) {
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
	}
}//class
