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

	Font f2 = new Font("HY견고딕", Font.BOLD, 20);

	FriendEnding() {
		setTitle("인싸 엔딩");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);

		contentPane.setBackground(Color.WHITE);

		FriendEdPanel.setLayout(null);
		FriendEdPanel.setBounds(0, 0, 670, 670);

		JLabel Lb = new JLabel("나는 우리 과 선,후배 동기들 다 알아!");
		Lb.setFont(f2);
		Lb.setBounds(10, 430, 670, 45);

		JLabel Lb1 = new JLabel("같이 놀면 에너지를 더 받는 느낌이야!");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 459, 670, 45);

		JLabel Lb2 = new JLabel("계속 같이 놀고싶어!");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 480, 670, 45);

		JLabel Lb3 = new JLabel("<나는 총 90의 친화력 능력치를 얻었어>");
		Lb3.setFont(f2);
		Lb3.setBounds(250, 580, 670, 45);

		contentPane.add(Lb);
		contentPane.add(Lb1);
		contentPane.add(Lb2);
		contentPane.add(Lb3);

		contentPane.add(FriendEdPanel);

	}
}
