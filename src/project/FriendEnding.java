package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FriendEnding extends JFrame {
	Container contentPane;
	subImagePanel FriendEdPanel = new subImagePanel(new ImageIcon("./image/FriendEnding.jpg").getImage());

	Font f2 = new Font("HY�߰��", Font.BOLD, 20);

	FriendEnding() {
		setTitle("�ν� ����");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);

		contentPane.setBackground(Color.WHITE);

		FriendEdPanel.setLayout(null);
		FriendEdPanel.setBounds(0, 0, 670, 670);

		JLabel Lb = new JLabel("���� �츮 �� ��,�Ĺ� ����� �� �˾�!");
		Lb.setFont(f2);
		Lb.setBounds(10, 430, 670, 45);

		JLabel Lb1 = new JLabel("���� ��� �������� �� �޴� �����̾�!");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 459, 670, 45);

		JLabel Lb2 = new JLabel("��� ���� ���;�!");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 480, 670, 45);

		JLabel Lb3 = new JLabel("<���� �� 90�� ģȭ�� �ɷ�ġ�� �����>");
		Lb3.setFont(f2);
		Lb3.setBounds(250, 580, 670, 45);

		contentPane.add(Lb);
		contentPane.add(Lb1);
		contentPane.add(Lb2);
		contentPane.add(Lb3);

		contentPane.add(FriendEdPanel);

	}
}
