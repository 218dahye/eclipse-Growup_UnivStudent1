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

	Font f2 = new Font("HY�߰��", Font.BOLD, 20);

	ExerciseEnding() {
		setTitle("� ����");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);

		ExcEdPanel.setLayout(null);
		ExcEdPanel.setBounds(0, 0, 670, 670);

		JLabel Lb = new JLabel("���� ��� - (�ｺŬ���� Ŭ������ �� ��ſ� ���̴�)�� ���� ");
		Lb.setFont(f2);
		Lb.setBounds(10, 390, 670, 45);

		JLabel Lb1 = new JLabel("�ｺ�� �����ߴµ� �ʹ� �� �����̾�");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 420, 670, 45);

		JLabel Lb2 = new JLabel("������ ����������");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 450, 670, 45);

		JLabel Lb3 = new JLabel("???: ����? ");
		Lb3.setFont(f2);
		Lb3.setBounds(10, 470, 670, 45);

		JLabel Lb5 = new JLabel("��: �ｺ�� ���±�");
		Lb5.setFont(f2);
		Lb5.setBounds(10, 500, 670, 45);

		JLabel Lb6 = new JLabel("???: ��? ��?");
		Lb6.setFont(f2);
		Lb6.setBounds(10, 530, 670, 45);

		JLabel Lb4 = new JLabel("<���� �� 35 ��ݱٷ� �ɷ�ġ�� �����>");
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
