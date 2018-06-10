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

public class Return_frame extends JFrame {

	private JPanel contentPane;

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
	public Return_frame() {
		
		setTitle("Return Book");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1162, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB3C4\uC11C\uBC18\uB0A9");
		lblNewLabel.setFont(new Font("�޸�����ü", Font.BOLD, 16));
		lblNewLabel.setIcon(new ImageIcon(Return_frame.class.getResource("/pac/\uC218\uC8154.png")));
		lblNewLabel.setBounds(12, 6, 124, 55);
		contentPane.add(lblNewLabel);
		
		String category2[] = {"����", "����", "���ǻ�", "û����ȣ", "�뿩��Ȳ"};
		DefaultTableModel model2 = new DefaultTableModel(category2, 30);		//30�� å �Ǽ��� �ٲٸ� ��. ex) len(book)
		
		//button �ݺ������� å �Ǽ���ŭ �����(button���� �̷���� ��̷�. button[0], button[1], button[2], button[3] ���)
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
		
		JButton btnNewButton_1 = new JButton("\uBC18\uB0A9");		//�ݳ� ��ư
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int book = personTable.getSelectedRow();    	//���°�� �����ߴ��� �˾Ƴ��� ����
				/*
				 * ���°������ �̿��ؼ� book[i]��°�� �뿩�� Ȯ���� borrowable ���� ����
				 * �뿩�� �ٸ���� �����޽���
				 */
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 13));
		btnNewButton_1.setBounds(1065, 273, 69, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uB300\uC5EC \uB3C4\uC11C \uBAA9\uB85D");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_1.setBounds(162, 16, 476, 35);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
