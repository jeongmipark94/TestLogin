package login.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import login.controller.LoginController;

@SuppressWarnings("serial")
public class LoginView extends JFrame {
	private JTextField jtfId;
	private JPasswordField jpfPw;
	private JButton jbLogin, jbSignup;
	private JLabel jlForgotPass;
	
	public LoginView() {
		super("�α��� â");
	
		JLabel jlName = new JLabel("Simple Login");
		jlName.setFont(new Font("Monospaced", Font.BOLD, 23));
		jtfId = new JTextField();
		jtfId.setBorder(new TitledBorder("���̵�"));
		
		jpfPw = new JPasswordField();
		jpfPw.setBorder(new TitledBorder("��й�ȣ"));
		
		jbLogin = new JButton("�� ��");
		jbSignup = new JButton("ȸ������");
		
		jlForgotPass = new JLabel("��й�ȣ ã��");
		
		
		setLayout(null);
		
		jlName.setBounds(55, 10, 200, 50);
		jtfId.setBounds(45, 50, 200, 40);
		jpfPw.setBounds(45, 105, 200, 40);
		jbLogin.setBounds(40, 160, 100, 40);
		jbSignup.setBounds(150, 160, 100, 40);
		jlForgotPass.setBounds(100, 200, 100, 40);
		
		add(jlName);
		add(jtfId);
		add(jpfPw);
		add(jbLogin);
		add(jbSignup);
		add(jlForgotPass);
		
		
		setBounds(200, 200, 300, 300);
		setVisible(true);
		
		//�̺�Ʈ ó�� ���
		LoginController lc= new LoginController(this);
		addWindowListener(lc);
		jbLogin.addActionListener(lc);
		jbSignup.addActionListener(lc);
		jlForgotPass.addMouseListener(lc);
		//jlabel�� addactionlistner �� �ȸԾ ���콺 ������ ����
		
		
		
		
	}//������ 

	public JTextField getJtfId() {
		return jtfId;
	}

	public JPasswordField getJpfPw() {
		return jpfPw;
	}

	public JButton getJbLogin() {
		return jbLogin;
	}

	public JButton getJbSignup() {
		return jbSignup;
	}

	public JLabel getJlForgotPass() {
		return jlForgotPass;
	}
	
	//getter����
	
}//class
