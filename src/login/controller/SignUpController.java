package login.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import login.view.SignUpView;

public class SignUpController extends WindowAdapter implements ActionListener {

	private SignUpView suv;

	public SignUpController(SignUpView suv) {
		this.suv = suv;
	}// SignUpController

	@Override
	public void windowClosing(WindowEvent we) {
		suv.dispose();
	}// windowClosing

	///////////////////////////////////////////////////버튼 눌러도 동작 안됨
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == suv.getJbSignUp()) {
//			signUp();
			JOptionPane.showMessageDialog(suv, "회원가입 신청완료");
			System.out.println("회원 가입 신청완료");
		}//end if
		
		if (ae.getSource() == suv.getJbCancel()) {
				suv.dispose();
		}//end if
		

	}// actionPerformed

}//class
