package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IntelliEnding extends JFrame {
	Container contentPane;
	subImagePanel IntEdPanel = new subImagePanel(new ImageIcon("./image/IntelliEnding.png").getImage());

	Font f2 = new Font("HY견고딕", Font.BOLD, 20);

	IntelliEnding() {
		setTitle("대학원 엔딩");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);

		IntEdPanel.setLayout(null);
		IntEdPanel.setBounds(0, 0, 670, 670);

		JLabel Lb = new JLabel("4년 내내 과탑을 하며 졸업을 했어.");
		Lb.setFont(f2);
		Lb.setBounds(10, 390, 670, 45);
		
		JLabel Lb1 = new JLabel("나는 공부가 내 적성에 맞다는걸 하루하루 느끼고 있어");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 420, 670, 45);
		
		JLabel Lb2 = new JLabel("대학원에 가서 좀 더 많은걸 연구하고싶어");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 450, 670, 45);

		JLabel Lb3 = new JLabel("<나는 총 90의 이해도 능력치를 얻었어>");
		Lb3.setFont(f2);
		Lb3.setBounds(250, 580, 670, 45);

		contentPane.setBackground(Color.WHITE);
		
		contentPane.add(Lb);
		contentPane.add(Lb1);
		contentPane.add(Lb2);
		contentPane.add(Lb3);
		
		contentPane.add(IntEdPanel);
	}
}
