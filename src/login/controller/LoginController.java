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
		
	}//LoginController ������
	
	@Override
	public void windowClosing(WindowEvent we) {
		lv.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == lv.getJbLogin()) {
			//���̵� ��й�ȣ �������� Ȯ�� �ϰ� �޾ƿ�.
			
			//LoginVO�� �α��� ���� ������ ����� �޴´�.
			
			//�α��� ������ UserView�� ����.
//			new UserView();
			
			lv.dispose();
			
			//�α��� ��ư �������� ��.	
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
