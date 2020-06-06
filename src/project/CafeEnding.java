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

	Font f2 = new Font("HY견고딕", Font.BOLD, 20);

	CafeEnding() {
		setTitle("카페 엔딩");
		contentPane = getContentPane();
		setLayout(null);
		setSize(670, 670);
		setVisible(true);
		
		CafeEdPanel.setLayout(null);
		CafeEdPanel.setBounds(0, 0, 670, 670);
		
		JLabel Lb = new JLabel("대출과 모은 돈으로 갬성있는 카페를 차렸어.");
		Lb.setFont(f2);
		Lb.setBounds(10, 450, 670, 45);
		
		JLabel Lb1 = new JLabel("갬성카페라고 인별그램에 많이 태그되는 인기있는 카페가 되었어. ");
		Lb1.setFont(f2);
		Lb1.setBounds(10, 470, 670, 45);
		
		JLabel Lb2 = new JLabel("성적은 좋지않았지만.. 나쁘지 않은 삶인거같아");
		Lb2.setFont(f2);
		Lb2.setBounds(10, 490, 670, 45);
		
		JLabel Lb3 = new JLabel("<나는 총 50만원의 돈 능력치를 얻었어>");
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
