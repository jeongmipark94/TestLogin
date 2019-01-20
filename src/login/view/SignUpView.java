package login.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javafx.scene.text.Font;

@SuppressWarnings("serial")
public class SignUpView extends JDialog {

	private JTextField jtfId,jtfTel1,jtfTel2,jtfTel3,jtfEmail1,jtfEmail2;
	private JPasswordField jpfPw1,jpfPw2;
	private JButton jbSignUp,jbCancel;
	private JComboBox<String> jcbEmail;
	
	public SignUpView() {
	
	
//	public SignUpView(LoginView lv) {
//		super(lv, "회원가입", true);
	
		JLabel jlJoin = new JLabel("회원 가입");
		jlJoin.setFont(new java.awt.Font("Dialog", 1, 24));
		
		jtfId = new JTextField();
		jpfPw1 = new JPasswordField();
		jpfPw2 = new JPasswordField();
		jtfTel1 = new JTextField();
		jtfTel2 = new JTextField();
		jtfTel3 = new JTextField();
		jtfEmail1 = new JTextField();
		jtfEmail2 = new JTextField();
		jtfId = new JTextField();
		jtfId = new JTextField();
		jcbEmail = new JComboBox<String>();
		jbSignUp = new JButton("회원가입");
		jbCancel = new JButton("취소");
		
		
		setLayout(null);
		
		add(new JLabel("아이디")).setBounds(50, 80, 100, 30);
		add(new JLabel("비밀번호")).setBounds(50, 120, 100, 30);
		add(new JLabel("비밀번호 확인")).setBounds(50, 160, 100, 30);
		add(new JLabel("핸드폰")).setBounds(50, 200, 100, 30);
		add(new JLabel("이메일")).setBounds(50, 240, 100, 30);
		add(new JLabel("-")).setBounds(195, 208, 15, 15);
		add(new JLabel("-")).setBounds(220, 208, 15, 15);
		
		jtfId.setBounds(150, 80, 150, 30);
		jpfPw1.setBounds(150, 120, 150, 30);
		jpfPw2.setBounds(150, 160, 150, 30);
		jtfTel1.setBounds(150, 200, 40	, 30);
		jtfTel2.setBounds(205, 200, 40, 30);
		jtfTel3.setBounds(260, 200, 40, 30);
		jtfEmail1.setBounds(150, 80, 150, 30);
		jtfEmail2.setBounds(150, 80, 150, 30);
		
		jlJoin.setBounds(130, 20, 150, 50);
		
		add(jlJoin);
		add(jpfPw1);
		add(jpfPw2);
		add(jtfTel1);
		add(jtfTel2);
		add(jtfTel3);
		add(jtfEmail1);
		add(jtfEmail2);
		
	setBounds(/*lv.getX()+*/100, /*lv.getY()+*/100, 400, 500);
	setVisible(true);
	
	}//생성자
	
	
	public static void main(String[] args) {
		new SignUpView();
	}
	
	
}
