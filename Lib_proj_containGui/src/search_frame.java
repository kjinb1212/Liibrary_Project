import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class search_frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_frame frame = new search_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the frame.
	 */
	public search_frame() {
		
		setTitle("Searching Book");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1162, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB3C4\uC11C \uAC80\uC0C9");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.BOLD, 16));
		lblNewLabel.setIcon(new ImageIcon(search_frame.class.getResource("/pac/\uC218\uC8153.jpg")));
		lblNewLabel.setBounds(12, 6, 124, 55);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("굴림", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB3C4\uC11C\uBA85", "\uC800\uC790", "\uCD9C\uD310\uC0AC"}));
		comboBox.setBounds(148, 17, 77, 32);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 13));
		textField.setBounds(237, 17, 718, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String category2[] = {"제목", "저자", "출판사", "청구기호", "대여상황"};
		DefaultTableModel model2 = new DefaultTableModel(category2, 30);		//30은 책 권수로 바꾸면 됨. ex) len(book)
		
		//button 반복문으로 책 권수만큼 만들기(button으로 이루어진 어레이로. button[0], button[1], button[2], button[3] 등등)
		JTable personTable = new JTable(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
					"\uC81C\uBAA9", "\uC800\uC790\r","\uCD9C\uD310\uC0AC\r" ,"\uCCAD\uAD6C\uAE30\uD638\r", "\uB300\uC5EC\uC0C1\uD669\r"
			}
		));

		JScrollPane tbl_sp2 = new JScrollPane(personTable);
		tbl_sp2.setToolTipText("");
		tbl_sp2.setBounds(12, 59, 1037, 445);
		contentPane.add(tbl_sp2);		
		
		JButton btnNewButton = new JButton("\uB300\uC5EC");		//대여 버튼
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int book = personTable.getSelectedRow();		//몇번째열 선택했는지 나타내는 변수
				/*
				 * 몇번째열인지 알아서 book[i]번째의 borrowable 변수 확인후 수정해주고 대여자를 해당 사람으로 바꿔주면 됨
				 */
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 13));
		btnNewButton.setBounds(1065, 223, 69, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBC18\uB0A9");		//반납 버튼
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int book = personTable.getSelectedRow();    	//몇번째열 선택했는지 알아내는 변수
				/*
				 * 몇번째열인지 이용해서 book[i]번째의 대여자 확인후 borrowable 변수 수정
				 * 대여자 다를경우 에러메시지
				 */
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 13));
		btnNewButton_1.setBounds(1065, 273, 69, 40);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("\uAC80\uC0C9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				System.out.println(comboBox.getSelectedIndex());
				*/
			
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 13));
		button.setBounds(967, 17, 82, 29);
		contentPane.add(button);
		
		
	}
}
