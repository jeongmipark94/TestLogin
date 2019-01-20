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

	///////////////////////////////////////////////////��ư ������ ���� �ȵ�
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == suv.getJbSignUp()) {
//			signUp();
			JOptionPane.showMessageDialog(suv, "ȸ������ ��û�Ϸ�");
			System.out.println("ȸ�� ���� ��û�Ϸ�");
		}//end if
		
		if (ae.getSource() == suv.getJbCancel()) {
				suv.dispose();
		}//end if
		

	}// actionPerformed

}//class
