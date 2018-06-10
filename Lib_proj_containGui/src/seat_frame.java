import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class seat_frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seat_frame frame = new seat_frame();
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
	public seat_frame() {
		setTitle("Seat");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 870, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(22, 76, 47, 73);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("\uC88C\uC11D \uBC1C\uAD8C");
		lblNewLabel.setFont(new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 16));
		lblNewLabel.setIcon(new ImageIcon(seat_frame.class.getResource("/pac/\uC88C\uC11D2.png")));
		lblNewLabel.setBounds(12, 10, 134, 55);
		contentPane.add(lblNewLabel);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(70, 76, 47, 73);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(22, 147, 47, 73);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(70, 147, 47, 73);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(22, 218, 47, 73);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(22, 289, 47, 73);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(22, 363, 47, 73);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(70, 218, 47, 73);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBounds(70, 289, 47, 73);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(70, 363, 47, 73);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(145, 76, 47, 73);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(193, 76, 47, 73);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(145, 147, 47, 73);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(193, 147, 47, 73);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(145, 218, 47, 73);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(145, 289, 47, 73);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBounds(145, 363, 47, 73);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(193, 218, 47, 73);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(193, 289, 47, 73);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBounds(193, 363, 47, 73);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBounds(263, 76, 47, 73);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBounds(311, 76, 47, 73);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(263, 147, 47, 73);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBounds(311, 147, 47, 73);
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBounds(263, 218, 47, 73);
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBounds(263, 289, 47, 73);
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBounds(263, 363, 47, 73);
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.setBounds(311, 218, 47, 73);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBounds(311, 289, 47, 73);
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBounds(311, 363, 47, 73);
		contentPane.add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBounds(385, 76, 47, 73);
		contentPane.add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBounds(433, 76, 47, 73);
		contentPane.add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBounds(385, 147, 47, 73);
		contentPane.add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBounds(433, 147, 47, 73);
		contentPane.add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setBounds(385, 218, 47, 73);
		contentPane.add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBounds(385, 289, 47, 73);
		contentPane.add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBounds(385, 363, 47, 73);
		contentPane.add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBounds(433, 218, 47, 73);
		contentPane.add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setBounds(433, 289, 47, 73);
		contentPane.add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBounds(433, 363, 47, 73);
		contentPane.add(button_39);
		
		JButton button_40 = new JButton("");
		button_40.setBounds(505, 76, 47, 73);
		contentPane.add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setBounds(553, 76, 47, 73);
		contentPane.add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setBounds(505, 147, 47, 73);
		contentPane.add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setBounds(553, 147, 47, 73);
		contentPane.add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setBounds(505, 218, 47, 73);
		contentPane.add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setBounds(505, 289, 47, 73);
		contentPane.add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setBounds(505, 363, 47, 73);
		contentPane.add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setBounds(553, 218, 47, 73);
		contentPane.add(button_47);
		
		JButton button_48 = new JButton("");
		button_48.setBounds(553, 289, 47, 73);
		contentPane.add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBounds(553, 363, 47, 73);
		contentPane.add(button_49);
		
		JButton button_50 = new JButton("");
		button_50.setBounds(626, 76, 47, 73);
		contentPane.add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setBounds(674, 76, 47, 73);
		contentPane.add(button_51);
		
		JButton button_52 = new JButton("");
		button_52.setBounds(626, 147, 47, 73);
		contentPane.add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setBounds(674, 147, 47, 73);
		contentPane.add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBounds(626, 218, 47, 73);
		contentPane.add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setBounds(626, 289, 47, 73);
		contentPane.add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setBounds(626, 363, 47, 73);
		contentPane.add(button_56);
		
		JButton button_57 = new JButton("");
		button_57.setBounds(674, 218, 47, 73);
		contentPane.add(button_57);
		
		JButton button_58 = new JButton("");
		button_58.setBounds(674, 289, 47, 73);
		contentPane.add(button_58);
		
		JButton button_59 = new JButton("");
		button_59.setBounds(674, 363, 47, 73);
		contentPane.add(button_59);
		
		JButton button_60 = new JButton("");
		button_60.setBounds(743, 76, 47, 73);
		contentPane.add(button_60);
		
		JButton button_61 = new JButton("");
		button_61.setBounds(791, 76, 47, 73);
		contentPane.add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.setBounds(743, 147, 47, 73);
		contentPane.add(button_62);
		
		JButton button_63 = new JButton("");
		button_63.setBounds(791, 147, 47, 73);
		contentPane.add(button_63);
		
		JButton button_64 = new JButton("");
		button_64.setBounds(743, 218, 47, 73);
		contentPane.add(button_64);
		
		JButton button_65 = new JButton("");
		button_65.setBounds(743, 289, 47, 73);
		contentPane.add(button_65);
		
		JButton button_66 = new JButton("");
		button_66.setBounds(743, 363, 47, 73);
		contentPane.add(button_66);
		
		JButton button_67 = new JButton("");
		button_67.setBounds(791, 218, 47, 73);
		contentPane.add(button_67);
		
		JButton button_68 = new JButton("");
		button_68.setBounds(791, 289, 47, 73);
		contentPane.add(button_68);
		
		JButton button_69 = new JButton("");
		button_69.setBounds(791, 363, 47, 73);
		contentPane.add(button_69);
		
		JLabel lblNewLabel_1 = new JLabel("\uB0A8\uC740 \uC88C\uC11D \uC218:");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 20));
		lblNewLabel_1.setBounds(158, 17, 165, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uBE44\uC5B4\uC788\uB294 \uC88C\uC11D\uC744 \uD074\uB9AD\uD558\uC138\uC694.");
		label.setBounds(673, 30, 165, 15);
		contentPane.add(label);
	}
}
