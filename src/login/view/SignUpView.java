package login.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import login.controller.SignUpController;


@SuppressWarnings("serial")
public class SignUpView extends JDialog {

	private JTextField jtfId,jtfTel1,jtfTel2,jtfTel3,jtfEmail1,jtfEmail2;
	private JPasswordField jpfPw1,jpfPw2;
	private JButton jbSignUp,jbCancel;
	private JComboBox<String> jcbEmail;
	
//	public SignUpView() {
	
	
	public SignUpView(LoginView lv) {
		super(lv, "회원가입", true);
	
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
		jbSignUp = new JButton("회원가입");
		jbCancel = new JButton("취소");
		
//		DefaultComboBoxModel<String> dlmEmail
//			= new DefaultComboBoxModel<String>();
//		dlmEmail.addElement("naver.com");
		String[] mail = {"naver.com", "daum.net", "google.com","직접입력"};
		jcbEmail = new JComboBox<String>(mail);
		
		
		
		
		setLayout(null);
		
		add(new JLabel("아이디")).setBounds(85, 80, 100, 30);
		add(new JLabel("비밀번호")).setBounds(75, 120, 100, 30);
		add(new JLabel("비밀번호 확인")).setBounds(45, 160, 100, 30);
		add(new JLabel("핸드폰")).setBounds(85, 200, 100, 30);
		add(new JLabel("이메일")).setBounds(85, 240, 100, 30);
		add(new JLabel("-")).setBounds(192, 208, 15, 15);
		add(new JLabel("-")).setBounds(252, 208, 15, 15);
		add(new JLabel("@")).setBounds(215, 245, 15, 15);
		
		jtfId.setBounds(140, 80, 170, 30);
		jpfPw1.setBounds(140, 120, 170, 30);
		jpfPw2.setBounds(140, 160, 170, 30);
		jtfTel1.setBounds(140, 200, 50	, 30);
		jtfTel2.setBounds(200, 200, 50, 30);
		jtfTel3.setBounds(260, 200, 50, 30);
		jtfEmail1.setBounds(140, 240, 70, 30);
		jtfEmail2.setBounds(235, 240, 70, 30);
		jcbEmail.setBounds(320, 240, 90, 30);
		
		jlJoin.setBounds(160, 20, 150, 50);
		jbSignUp.setBounds(100, 300, 100, 30);
		jbCancel.setBounds(230, 300, 100, 30);
		
		add(jlJoin);
		add(jtfId);
		add(jpfPw1);
		add(jpfPw2);
		add(jtfTel1);
		add(jtfTel2);
		add(jtfTel3);
		add(jtfEmail1);
		add(jtfEmail2);
		add(jcbEmail);
		add(jbSignUp);
		add(jbCancel);
		
	setBounds(/*lv.getX()+*/100, /*lv.getY()+*/100, 450, 400);
	setVisible(true);
//	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//다이알로그 닫을 시엔 JFrame과 다르게  DISPOSE_ON_CLOSE로 닫는다.
	//EXIT_ON_CLOSE아님
	
	SignUpController suc =new SignUpController(this);
	addWindowListener(suc);
	jbSignUp.addActionListener(suc);
	jbCancel.addActionListener(suc);
	
	
	
	}//생성자

	public JTextField getJtfId() {
		return jtfId;
	}

	public JTextField getJtfTel1() {
		return jtfTel1;
	}

	public JTextField getJtfTel2() {
		return jtfTel2;
	}

	public JTextField getJtfTel3() {
		return jtfTel3;
	}

	public JTextField getJtfEmail1() {
		return jtfEmail1;
	}

	public JTextField getJtfEmail2() {
		return jtfEmail2;
	}

	public JPasswordField getJpfPw1() {
		return jpfPw1;
	}

	public JPasswordField getJpfPw2() {
		return jpfPw2;
	}

	public JButton getJbSignUp() {
		return jbSignUp;
	}

	public JButton getJbCancel() {
		return jbCancel;
	}

	public JComboBox<String> getJcbEmail() {
		return jcbEmail;
	}
	//getter생성
	
	
	
	
}
