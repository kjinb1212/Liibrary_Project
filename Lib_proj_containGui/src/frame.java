import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class frame extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setTitle("Library Program");
		/*
		Scanner scan = new Scanner(System.in);
		*/
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 682, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Main_frame frame = new Main_frame();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(559, 10, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\"\uD658\uC601\uD569\uB2C8\uB2E4, "+"a"+"\uB2D8\"");
		label.setBounds(366, 14, 181, 15);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("\uB3C4\uC11C \uAC80\uC0C9");
		btnNewButton_1.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 30));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon(frame.class.getResource("/pac/\uC218\uC8151.jpg")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search_frame frame = new search_frame();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(12, 42, 316, 148);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB3C4\uC11C \uBC18\uB0A9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Return_frame frame = new Return_frame();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 30));
		btnNewButton_2.setIcon(new ImageIcon(frame.class.getResource("/pac/\uC218\uC8152.png")));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(340, 43, 316, 148);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC88C\uC11D \uBC18\uB0A9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				return_seat_frame frame = new return_seat_frame();
				frame.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 28));
		btnNewButton_3.setIcon(new ImageIcon(frame.class.getResource("/pac/\uC774\uBBF8\uC9C01.png")));
		btnNewButton_3.setBounds(340, 201, 316, 147);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uC88C\uC11D \uBC1C\uAD8C");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seat_frame frame = new seat_frame();
				frame.setVisible(true);
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 28));
		btnNewButton_4.setIcon(new ImageIcon(frame.class.getResource("/pac/\uC774\uBBF8\uC9C02.png")));
		btnNewButton_4.setBounds(12, 200, 316, 148);
		contentPane.add(btnNewButton_4);
		
		JLabel lblSkkuLibrary = new JLabel("SKKU Library");
		lblSkkuLibrary.setFont(new Font("«—ƒƒ ¿±∞ÌµÒ 230", Font.BOLD, 20));
		lblSkkuLibrary.setBounds(12, 5, 160, 30);
		contentPane.add(lblSkkuLibrary);
	}

}
