package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExerciseEnding extends JFrame {
	Container contentPane;
	subImagePanel ExcEdPanel = new subImagePanel(new ImageIcon("./image/exercise.png").getImage());

	Font f2 = new Font("HY견고딕", Font.BOLD, 20);

	ExerciseEnding() {
		setTitle("운동 엔딩");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);

		ExcEdPanel.setLayout(null);
		ExcEdPanel.setBounds(0, 0, 670, 670);

		JLabel Lb = new JLabel("근육 어록 - (헬스클럽은 클럽보다 더 즐거운 곳이다)을 보고 ");
		Lb.setFont(f2);
		Lb.setBounds(10, 390, 670, 45);

		JLabel Lb1 = new JLabel("헬스를 시작했는데 너무 내 적성이야");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 420, 670, 45);

		JLabel Lb2 = new JLabel("따르릉 따르르르릉");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 450, 670, 45);

		JLabel Lb3 = new JLabel("???: 어디야? ");
		Lb3.setFont(f2);
		Lb3.setBounds(10, 470, 670, 45);

		JLabel Lb5 = new JLabel("나: 헬스장 가는길");
		Lb5.setFont(f2);
		Lb5.setBounds(10, 500, 670, 45);

		JLabel Lb6 = new JLabel("???: 뭐? 또?");
		Lb6.setFont(f2);
		Lb6.setBounds(10, 530, 670, 45);

		JLabel Lb4 = new JLabel("<나는 총 35 골격근량 능력치를 얻었어>");
		Lb4.setFont(f2);
		Lb4.setBounds(250, 580, 670, 45);

		contentPane.setBackground(Color.WHITE);

		contentPane.add(Lb);
		contentPane.add(Lb1);
		contentPane.add(Lb2);
		contentPane.add(Lb3);
		contentPane.add(Lb4);
		contentPane.add(Lb5);
		contentPane.add(Lb6);

		contentPane.add(ExcEdPanel);
	}
}
