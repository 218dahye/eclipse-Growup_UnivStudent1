package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BeggarEnding extends JFrame {
	Container contentPane;
	subImagePanel BeggarEdPanel = new subImagePanel(new ImageIcon("./image/Beggar.jpg").getImage());

	Font f2 = new Font("HY°ß°íµñ", Font.BOLD, 20);

	BeggarEnding() {
		setTitle("ºúÀïÀÌ ¿£µù");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);

		contentPane.setBackground(Color.WHITE);

		BeggarEdPanel.setLayout(null);
		BeggarEdPanel.setBounds(0, 0, 670, 670);

		JLabel Lb = new JLabel("¾Ñ!");
		Lb.setFont(f2);
		Lb.setBounds(10, 430, 670, 45);

		JLabel Lb1 = new JLabel("Áö°©À» ¿­¾îºÃ´õ´Ï");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 459, 670, 45);

		JLabel Lb2 = new JLabel("µ·ÀÌ ¾ø¾î¤Ð¤Ð");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 480, 670, 45);

		JLabel Lb3 = new JLabel("<³ª´Â ÃÑ 0¿øÀÇ µ· ´É·ÂÄ¡¸¦ ¾ò¾ú¾î>");
		Lb3.setFont(f2);
		Lb3.setBounds(250, 580, 670, 45);

		contentPane.add(Lb);
		contentPane.add(Lb1);
		contentPane.add(Lb2);
		contentPane.add(Lb3);

		contentPane.add(BeggarEdPanel);
	}
}
