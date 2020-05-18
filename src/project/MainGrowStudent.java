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

class ImagePanel extends JPanel { // 이미지 패널
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

class subImagePanel extends JPanel { // 서브이미지 패널
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
		setLayout(null);

		ImagePanel StartPanel = new ImagePanel(new ImageIcon("./image/main.jpg").getImage());
		subImagePanel SelectPanel = new subImagePanel(new ImageIcon("./image/main.jpg").getImage());
		subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/main.jpg").getImage());
		subImagePanel H_MenuPanel = new subImagePanel(new ImageIcon("./image/main.jpg").getImage()); // 이미지 패널 객체 생성

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
		contentPane.add(StartPanel); // StartPanel 화면

		EndBt.addActionListener(e -> {
			System.exit(0);
		}); // EndBt 버튼 누르면 창 닫기

		JLabel Lb3 = new JLabel("난이도를 ");
		Lb3.setBounds(115, 40, 500, 200);
		Lb3.setForeground(new Color(204, 204, 051));
		Lb3.setFont(f);

		JLabel Lb4 = new JLabel("선택하시오");
		Lb4.setBounds(55, 139, 550, 200);
		Lb4.setForeground(new Color(204, 204, 051));
		Lb4.setFont(f);

		JButton NormalBtn = new JButton(">> 보통");
		NormalBtn.setFont(f1);
		NormalBtn.setBackground(new Color(255, 255, 255));
		NormalBtn.setBounds(0, 410, 360, 45);
		NormalBtn.setBorderPainted(false);

		JButton HardBtn = new JButton("어려움 <<");
		HardBtn.setFont(f1);
		HardBtn.setBackground(new Color(255, 255, 255));
		HardBtn.setBounds(290, 470, 360, 45);
		HardBtn.setBorderPainted(false); // SelectPanel 화면

		StartBt.addActionListener(e -> {
			SelectPanel.add(Lb3);
			SelectPanel.add(Lb4);
			SelectPanel.add(NormalBtn);
			SelectPanel.add(NormalBtn);
			SelectPanel.add(HardBtn);
			contentPane.add(SelectPanel);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);
		}); // StartBt 버튼 누르면 SelectPanel 난이도 선택 패널로 이동

		init.MT();
		JLabel Lb1 = new JLabel();
		Lb1.setBounds(10, 140, 700, 50);
		Lb1.setText(
				"종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " + init.Today + "요일");
		N_MenuPanel.add(Lb1);
		H_MenuPanel.add(Lb1);

		JLabel Lb2 = new JLabel();
		Lb2.setBounds(25, 180, 600, 50);
		Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
		N_MenuPanel.add(Lb2);
		H_MenuPanel.add(Lb2);

		Font f2 = new Font("monospaced", Font.BOLD, 30);
		Font f3 = new Font("monospaced", Font.BOLD, 30);
		Lb1.setFont(f2);
		Lb2.setFont(f3);
		Lb1.setForeground(Color.lightGray);
		Lb2.setForeground(Color.lightGray); // (N+H)ManuPanel 화면

		JButton N_LBtn = new JButton("강의듣기");
		N_MenuPanel.add(N_LBtn);
		N_LBtn.setBounds(170, 258, 300, 48);

		N_LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력

			} else
				new N_Lecture(Lb1, Lb2);
		}); // N_Lecture 클래스 이동

		JButton N_SBtn = new JButton("공부하기");
		N_MenuPanel.add(N_SBtn);
		N_SBtn.setBounds(170, 328, 300, 48);
		N_SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new N_Study(Lb1, Lb2);
		}); // N_Study 클래스 이동

		JButton N_PtBtn = new JButton("알바가기");
		N_MenuPanel.add(N_PtBtn);
		N_PtBtn.setBounds(170, 398, 300, 48);
		N_PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new N_PartTime(Lb1, Lb2);
		}); // N_PartTime 클래스 이동

		JButton N_PlayBtn = new JButton("친구와 놀러가기");
		N_MenuPanel.add(N_PlayBtn);
		N_PlayBtn.setBounds(170, 468, 300, 48);
		N_PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력
			} else
				new N_Play(Lb1, Lb2);
		}); // N_Play 클래스 이동

		JButton N_RestBtn = new JButton("휴식하기");
		N_MenuPanel.add(N_RestBtn);
		N_RestBtn.setBounds(170, 538, 300, 48);
		N_RestBtn.addActionListener(event -> {
			new N_Rest(Lb1, Lb2);
		}); // N_Rest 클래스 이동

		NormalBtn.addActionListener(e -> {
			N_MenuPanel.add(Lb1);
			N_MenuPanel.add(Lb2);
			N_MenuPanel.add(N_LBtn);
			N_MenuPanel.add(N_SBtn);
			N_MenuPanel.add(N_PtBtn);
			N_MenuPanel.add(N_PlayBtn);
			N_MenuPanel.add(N_RestBtn);
			contentPane.add(N_MenuPanel);
			SelectPanel.setVisible(false);
			contentPane.setVisible(true);
		}); // 난이도 보통인 N_MenuPanel로 이동

		JButton H_LBtn = new JButton("강의듣기");
		H_MenuPanel.add(H_LBtn);
		H_LBtn.setBounds(170, 258, 300, 48);

		H_LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력

			} else
				new H_Lecture(Lb1, Lb2);
		}); // H_Lecture 클래스 이동

		JButton H_SBtn = new JButton("공부하기");
		H_MenuPanel.add(H_SBtn);
		H_SBtn.setBounds(170, 328, 300, 48);
		H_SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new H_Study(Lb1, Lb2);
		}); // H_Study 클래스 이동

		JButton H_PtBtn = new JButton("알바가기");
		H_MenuPanel.add(H_PtBtn);
		H_PtBtn.setBounds(170, 398, 300, 48);
		H_PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new H_PartTime(Lb1, Lb2);
		}); // H_PartTime 클래스 이동

		JButton H_PlayBtn = new JButton("친구와 놀러가기");
		H_MenuPanel.add(H_PlayBtn);
		H_PlayBtn.setBounds(170, 468, 300, 48);
		H_PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력
			} else
				new H_Play(Lb1, Lb2);
		}); // H_Play 클래스 이동

		JButton H_RestBtn = new JButton("휴식하기");
		H_MenuPanel.add(H_RestBtn);
		H_RestBtn.setBounds(170, 538, 300, 48);
		H_RestBtn.addActionListener(event -> {
			new H_Rest(Lb1, Lb2);
		}); // H_Rest 클래스 이동

		HardBtn.addActionListener(e -> {
			H_MenuPanel.add(Lb1);
			H_MenuPanel.add(Lb2);
			H_MenuPanel.add(H_LBtn);
			H_MenuPanel.add(H_SBtn);
			H_MenuPanel.add(H_PtBtn);
			H_MenuPanel.add(H_PlayBtn);
			H_MenuPanel.add(H_RestBtn);
			contentPane.add(H_MenuPanel);
			SelectPanel.setVisible(false);
			contentPane.setVisible(true);
		}); // 난이도 보통인 H_MenuPanel로 이동

		Font f4 = new Font("휴먼엑스포", Font.BOLD, 25);
		N_LBtn.setFont(f4);
		N_SBtn.setFont(f4);
		N_PtBtn.setFont(f4);
		N_PlayBtn.setFont(f4);
		N_RestBtn.setFont(f4);

		H_LBtn.setFont(f4);
		H_SBtn.setFont(f4);
		H_PtBtn.setFont(f4);
		H_PlayBtn.setFont(f4);
		H_RestBtn.setFont(f4);

		N_LBtn.setBackground(Color.WHITE);
		N_SBtn.setBackground(Color.WHITE);
		N_PtBtn.setBackground(Color.WHITE);
		N_PlayBtn.setBackground(Color.WHITE);
		N_RestBtn.setBackground(Color.WHITE);

		H_LBtn.setBackground(Color.WHITE);
		H_SBtn.setBackground(Color.WHITE);
		H_PtBtn.setBackground(Color.WHITE);
		H_PlayBtn.setBackground(Color.WHITE);
		H_RestBtn.setBackground(Color.WHITE);

		pack();
		setSize(660, 700);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}
}
