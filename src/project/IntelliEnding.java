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

	Font f2 = new Font("HY�߰��", Font.BOLD, 20);

	IntelliEnding() {
		setTitle("���п� ����");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);

		IntEdPanel.setLayout(null);
		IntEdPanel.setBounds(0, 0, 670, 670);

		JLabel Lb = new JLabel("4�� ���� ��ž�� �ϸ� ������ �߾�.");
		Lb.setFont(f2);
		Lb.setBounds(10, 390, 670, 45);
		
		JLabel Lb1 = new JLabel("���� ���ΰ� �� ������ �´ٴ°� �Ϸ��Ϸ� ������ �־�");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 420, 670, 45);
		
		JLabel Lb2 = new JLabel("���п��� ���� �� �� ������ �����ϰ�;�");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 450, 670, 45);

		JLabel Lb3 = new JLabel("<���� �� 90�� ���ص� �ɷ�ġ�� �����>");
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
