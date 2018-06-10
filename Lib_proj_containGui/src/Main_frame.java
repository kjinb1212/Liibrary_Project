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

	//도서검색 함수
	public void findSystem(String findWord, ArrayList<Book> bookList, int tipe) {//findname = 검색어, tipe : 도서명=0, 저자=1, 출판사=2
		//비교하기 쉽도록 책이름을 소문자로 변환, 공백제거
		ArrayList<String> inputString = new ArrayList<String>();//전부소문자이고 공백없는 검색어


		for(int i=1; i<201; i++) {
			String target_word;
			if(tipe == 0){//도서명 검색
				target_word = bookList.get(i).title.toLowerCase();//전부 소문자로
			}
			else if(tipe == 1){//저자 검색
				target_word = bookList.get(i).author.toLowerCase();//전부 소문자로
			}
			else{
				target_word = bookList.get(i).publisher.toLowerCase();//전부 소문자로
			}
			target_word = target_word.trim();//공백제거
			inputString.add(target_word);
		}
		//

		findWord = findWord.toLowerCase();//소문자로
		String[] target = findWord.split(" ");//검색어를 띄어쓰기로 구분
		int[] bookcheck = new int[201];// 이미 해당하는 검색어가 있어 출력된 책은 1, 아닌 책은 0

		//전체 검색어에 대한 검색 결과
		findWord = findWord.trim();//공백제거
		for(int i=1; i<201; i++) {
			String book = inputString.get(i);
			if(book.contains(findWord) && bookcheck[i]==0) {//검색어가 책 이름에 포함된 경우
				bookcheck[i]=1;
				//gui로 bookobj.get(i)를 출력
			}
		}
		//

		//띄어쓰기로 구분한 검색어에 대한 결과
		for(int i=0; i<target.length; i++) {
			for(int j=1; j<201; j++) {
				String book = inputString.get(j);
				if(book.contains(target[i]) && bookcheck[j]==0) {//검색어가 책 이름에 포함된 경우
					bookcheck[j]=1;
					//gui로 bookobj.get(i)를 출력
				}
			}
		}
	}
	//

	public static void main(String[] args) throws IOException {
		Reader1 reading1= new Reader1();		//client 정보 읽어서 studentobj, professorobj에 저장하는 reading1
		clientobj = reading1.read();
		
		Reader reading = new Reader();		//책정보 읽어서 bookobj에 저장하는 reading
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
		
		JLabel lblName = new JLabel("이름:");
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
		lblNewLabel_1.setFont(new Font("한컴 백제 B", Font.PLAIN, 25));
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


