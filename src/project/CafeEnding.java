package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CafeEnding extends JFrame {
	Container contentPane;
	subImagePanel CafeEdPanel = new subImagePanel(new ImageIcon("./image/cafe.jpg").getImage());

	Font f2 = new Font("HY�߰��", Font.BOLD, 20);

	CafeEnding() {
		setTitle("ī�� ����");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);
		
		CafeEdPanel.setLayout(null);
		CafeEdPanel.setBounds(0, 0, 670, 670);
		
		JLabel Lb = new JLabel("����� ���� ������ �����ִ� ī�並 ���Ⱦ�.");
		Lb.setFont(f2);
		Lb.setBounds(10, 450, 670, 45);
		
		JLabel Lb1 = new JLabel("����ī���� �κ��׷��� ���� �±׵Ǵ� �α��ִ� ī�䰡 �Ǿ���. ");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 470, 670, 45);
		
		JLabel Lb2 = new JLabel("������ �����ʾ�����.. ������ ���� ���ΰŰ���");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 490, 670, 45);
		
		JLabel Lb3 = new JLabel("<���� �� 50������ �� �ɷ�ġ�� �����>");
		Lb3.setFont(f2);
		Lb3.setBounds(250, 580, 670, 45);

		contentPane.setBackground(Color.WHITE);
		
		contentPane.add(Lb);
		contentPane.add(Lb1);
		contentPane.add(Lb2);
		contentPane.add(Lb3);
		contentPane.add(CafeEdPanel);

	}

}
