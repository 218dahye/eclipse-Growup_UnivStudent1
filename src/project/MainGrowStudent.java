package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {

		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));// pack()한 후 프레임 사이즈가 맞게 나오지 않을 때 설정해줌.
		setLayout(null);

	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

class subImagePanel extends JPanel {
	private Image subimg;

	public subImagePanel(Image subimg) {
		this.subimg = subimg;
		setSize(new Dimension(subimg.getWidth(null), subimg.getHeight(null)));
		setPreferredSize(new Dimension(subimg.getWidth(null), subimg.getHeight(null)));// pack()한 후 프레임 사이즈가 맞게 나오지 않을 때
																						// 설정해줌.
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(subimg, 0, 0, null);
	}
}

public class MainGrowStudent extends JFrame {
	Container contentPane;
	
	MainGrowStudent() {

		setTitle("<< 대학생 키우기 >>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null);

		ImagePanel StartPanel = new ImagePanel(new ImageIcon("./image/main.jpg").getImage());
		subImagePanel MenuPanel = new subImagePanel(new ImageIcon("./image/main.jpg").getImage());

		JLabel label1, label1_1;
		label1 = new JLabel("대학생 ");
		label1.setBounds(170, 40, 450, 200);

		label1_1 = new JLabel("키우기");
		label1_1.setBounds(170, 132, 450, 200);

		Font f = new Font("휴먼옛체", Font.PLAIN, 103);
		label1.setForeground(new Color(204, 204, 051));
		label1_1.setForeground(new Color(204, 204, 051));

		label1.setFont(f);
		label1_1.setFont(f);

		Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);
		JButton StartBt, EndBt;

		StartBt = new JButton(">> 게임 시작");
		StartBt.setFont(f1);
		StartBt.setBackground(new Color(255, 255, 255));
		StartBt.setBounds(0, 410, 360, 45);
		StartBt.setBorderPainted(false);

		EndBt = new JButton(" 게임 종료 <<");
		EndBt.setFont(f1);
		EndBt.setBackground(new Color(255, 255, 255));
		EndBt.setBounds(290, 470, 360, 45);
		EndBt.setBorderPainted(false);

		StartPanel.add(label1);
		StartPanel.add(label1_1);
		StartPanel.add(StartBt);
		StartPanel.add(EndBt);
		StartPanel.setVisible(true);
		contentPane.add(StartPanel);
	
		EndBt.addActionListener(e -> {
			System.exit(0);
		});

		init.MT();
		JLabel Lb1 = new JLabel();
		Lb1.setBounds(30, 140, 600, 40);
		Lb1.setText(
				"종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " + init.Today + "요일");
		MenuPanel.add(Lb1);

		JLabel Lb2 = new JLabel();
		Lb2.setBounds(50, 180, 600, 30);
		Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
		MenuPanel.add(Lb2);

		Font f2 = new Font("monospaced", Font.BOLD , 30);
		Font f3 = new Font("monospaced", Font.BOLD, 30);
		Lb1.setFont(f2);
		Lb2.setFont(f3);
		Lb1.setForeground(Color.lightGray);
		Lb2.setForeground(Color.lightGray);
		
		JButton LBtn = new JButton("강의듣기");
		MenuPanel.add(LBtn);
		LBtn.setBounds(170, 258, 300, 48);
		LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력

			} else
				new Lecture(Lb1, Lb2);
		});

		JButton SBtn = new JButton("공부하기");
		MenuPanel.add(SBtn);
		SBtn.setBounds(170, 328, 300, 48);
		SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new Study(Lb1, Lb2);
		});

		JButton PtBtn = new JButton("알바가기");
		MenuPanel.add(PtBtn);
		PtBtn.setBounds(170, 398, 300, 48);
		PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new PartTime(Lb1, Lb2);
		});

		JButton PlayBtn = new JButton("친구와 놀러가기");
		MenuPanel.add(PlayBtn);
		PlayBtn.setBounds(170, 468, 300, 48);
		PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력
			} else
				new Play(Lb1, Lb2);
		});

		JButton RestBtn = new JButton("휴식하기");
		MenuPanel.add(RestBtn);
		RestBtn.setBounds(170, 538, 300, 48);
		RestBtn.addActionListener(event -> {
			new Rest(Lb1, Lb2);
		});
		
		Font f4 = new Font("휴먼엑스포", Font.BOLD, 25);
		LBtn.setFont(f4);
		SBtn.setFont(f4);
		PtBtn.setFont(f4);
		PlayBtn.setFont(f4);
		RestBtn.setFont(f4);
		
		LBtn.setBackground(Color.WHITE);
		SBtn.setBackground(Color.WHITE);
		PtBtn.setBackground(Color.WHITE);
		PlayBtn.setBackground(Color.WHITE);
		RestBtn.setBackground(Color.WHITE);

		StartBt.addActionListener(e -> {
			MenuPanel.add(Lb1);
			MenuPanel.add(Lb2);
			MenuPanel.add(LBtn);
			MenuPanel.add(SBtn);
			MenuPanel.add(PtBtn);
			MenuPanel.add(PlayBtn);
			MenuPanel.add(RestBtn);
			contentPane.add(MenuPanel);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);
		});

		pack();
		setSize(800, 680);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}
}
