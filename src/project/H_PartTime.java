package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class H_PartTime extends JFrame {
	Container contentPane;
	JButton button1 = new JButton("제과점");
	JButton button2 = new JButton("영화관");
	JButton button3 = new JButton("아이스크림");
	JButton button4 = new JButton("뒤로가기");

	H_PartTime(JLabel Lb1, JLabel Lb2) {
		setTitle("알바가기");
		contentPane = getContentPane();
		setLayout(null);

		JLabel PtLb1 = new JLabel();
		PtLb1.setText("어느 직종의 알바를 가시겠습니까?");
		PtLb1.setBounds(270, 140, 600, 20);

		Font label4font = new Font("monospaced", Font.BOLD, 30);
		PtLb1.setFont(label4font);
		
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);

		button1.setBounds(235, 260, 300, 50);
		button2.setBounds(235, 330, 300, 50);
		button3.setBounds(235, 400, 300, 50);
		button4.setBounds(235, 470, 300, 50);

		Font f4 = new Font("휴먼엑스포", Font.BOLD, 25);
		button1.setFont(f4);
		button2.setFont(f4);
		button3.setFont(f4);
		button4.setFont(f4);

		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);
		button4.setBackground(Color.WHITE);

		lectureImagePanel Panel = new lectureImagePanel(new ImageIcon("./image/lecture.jpg").getImage());
		Panel.setLayout(null);
		Panel.add(PtLb1);
		Panel.add(button1);
		Panel.add(button2);
		Panel.add(button3);
		Panel.add(button4);

		contentPane.add(Panel);

		button1.addActionListener(event -> {
			init.H_money_up();
			Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " + init.Today + "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.H_money_up();
			Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " + init.Today + "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.H_money_up();
			Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " + init.Today + "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});

		button4.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "뒤로 이동합니다", "뒤로 이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			dispose();
		});

		setSize(800, 680);
		setVisible(true);
	}

}
