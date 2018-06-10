import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuBar;

public class Main_frame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static ArrayList<Client> clientobj = new ArrayList<Client>();
	public static ArrayList<Book> bookobj = new ArrayList<Book>();

	//�����˻� �Լ�
	public void findSystem(String findWord, ArrayList<Book> bookList, int tipe) {//findname = �˻���, tipe : ������=0, ����=1, ���ǻ�=2
		//���ϱ� ������ å�̸��� �ҹ��ڷ� ��ȯ, ��������
		ArrayList<String> inputString = new ArrayList<String>();//���μҹ����̰� ������� �˻���


		for(int i=1; i<201; i++) {
			String target_word;
			if(tipe == 0){//������ �˻�
				target_word = bookList.get(i).title.toLowerCase();//���� �ҹ��ڷ�
			}
			else if(tipe == 1){//���� �˻�
				target_word = bookList.get(i).author.toLowerCase();//���� �ҹ��ڷ�
			}
			else{
				target_word = bookList.get(i).publisher.toLowerCase();//���� �ҹ��ڷ�
			}
			target_word = target_word.trim();//��������
			inputString.add(target_word);
		}
		//

		findWord = findWord.toLowerCase();//�ҹ��ڷ�
		String[] target = findWord.split(" ");//�˻�� ����� ����
		int[] bookcheck = new int[201];// �̹� �ش��ϴ� �˻�� �־� ��µ� å�� 1, �ƴ� å�� 0

		//��ü �˻�� ���� �˻� ���
		findWord = findWord.trim();//��������
		for(int i=1; i<201; i++) {
			String book = inputString.get(i);
			if(book.contains(findWord) && bookcheck[i]==0) {//�˻�� å �̸��� ���Ե� ���
				bookcheck[i]=1;
				//gui�� bookobj.get(i)�� ���
			}
		}
		//

		//����� ������ �˻�� ���� ���
		for(int i=0; i<target.length; i++) {
			for(int j=1; j<201; j++) {
				String book = inputString.get(j);
				if(book.contains(target[i]) && bookcheck[j]==0) {//�˻�� å �̸��� ���Ե� ���
					bookcheck[j]=1;
					//gui�� bookobj.get(i)�� ���
				}
			}
		}
	}
	//

	public static void main(String[] args) throws IOException {
		Reader1 reading1= new Reader1();		//client ���� �о studentobj, professorobj�� �����ϴ� reading1
		clientobj = reading1.read();
		
		Reader reading = new Reader();		//å���� �о bookobj�� �����ϴ� reading
		bookobj = reading.read();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_frame frame = new Main_frame();
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
	public Main_frame(){
		
		setTitle("Library Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uAD50\uC218");
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(62, 133, 61, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uD559\uC0DD");
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(141, 133, 81, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblName = new JLabel("�̸�:");
		lblName.setBounds(28, 68, 57, 15);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(28, 104, 57, 15);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("\uD655\uC778");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String client_name=textField.getText();
				String client_id=textField_1.getText();
				
				int name_flag=0;
				for(int i=1; i<clientobj.size(); i++) {
					if(clientobj.get(i).name.matches(client_name)) {
						name_flag=i;
					}
				}
				if(name_flag==0) {
					Error_frame frame = new Error_frame();
					frame.setVisible(true);
				}
				else{
					if(clientobj.get(name_flag).id.matches(client_id)) {
					}
					else {
						Error_frame frame = new Error_frame();
						frame.setVisible(true);
					}
					
					if(rdbtnNewRadioButton.isSelected()&&(clientobj.get(name_flag).statusflag==1)) {
						frame frame5 = new frame();
						frame5.setVisible(true);
					}
					else if(rdbtnNewRadioButton_1.isSelected()&&(clientobj.get(name_flag).statusflag==0)) {
						frame frame5 = new frame();
						frame5.setVisible(true);
					}
					else {
						Error_frame frame = new Error_frame();
						frame.setVisible(true);
					}
				}
				
			}
		});
		button.setBounds(85, 171, 97, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("\uB85C\uADF8\uC778");
		lblNewLabel_1.setFont(new Font("���� ���� B", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(101, 10, 70, 45);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(62, 65, 151, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 101, 151, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}


