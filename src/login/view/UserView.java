package login.view;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UserView extends JFrame {
	private DefaultTableModel dtmUser;

	public UserView() {
		super("���� ����");
		
		//���� ���̺�
		String[] userColumns = {"���̵�","��й�ȣ","����ó","�̸���"};
		dtmUser= new DefaultTableModel(userColumns, 5) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}//isCellEditable ���� �Ұ�
		};
		JTable jtUser = new JTable(dtmUser);
		jtUser.setRowHeight(25);
		JScrollPane jspUser = new JScrollPane(jtUser);
	
		setLayout(new BorderLayout());
		add("Center", jspUser);
	
		
		
		
		setBounds(400, 400, 600, 190);
		setVisible(true);
		
		
	}
	
	
	public void loadUser(){
		
	}//loadUser
	
	public static void main(String[] args) {
		new UserView();
	}
	

}//UserView
