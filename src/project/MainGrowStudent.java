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
		setSize(640, 640);
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
		setSize(655, 650); // 설정해줌.
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(subimg, 0, 0, null);
	}
}

public class MainGrowStudent extends JFrame {
	Container contentPane;
	ImagePanel StartPanel = new ImagePanel(new ImageIcon("./image/main.jpg").getImage());
	subImagePanel LevelPanel = new subImagePanel(new ImageIcon("./image/main.jpg").getImage());
	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
	static subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel H_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());// 이미지 패널 객체 생성
	subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());
	subImagePanel N_Selectpanel = new subImagePanel(new ImageIcon("./image/N_select_home.png").getImage());
	subImagePanel H_Selectpanel = new subImagePanel(new ImageIcon("./image/H_select_home.png").getImage());

	JLabel click = new JLabel("click");

	JButton SelectBtn = new JButton("활동선택");
	JButton EndBtn = new JButton("일과 종료");

	JButton N_MoveBtn = new JButton("활동하기");

	JButton lecturebtn = new JButton("이동");
	JButton partbtn = new JButton("이동");
	JButton restbtn = new JButton("이동");
	JButton studybtn = new JButton("이동");
	JButton fitnessbtn = new JButton("이동");

	JButton H_lecturebtn = new JButton("이동");
	JButton H_partbtn = new JButton("이동");
	JButton H_restbtn = new JButton("이동");
	JButton H_studybtn = new JButton("이동");
	JButton H_fitnessbtn = new JButton("이동");

	JLabel DL = new JLabel();
	JLabel PL = new JLabel();
	JLabel IL = new JLabel();
	JLabel ML = new JLabel();
	JLabel FL = new JLabel();

	Font 활동선택버튼폰트 = new Font("HY견고딕", Font.BOLD, 15);
	Font 활동선택폰트 = new Font("HY견고딕", Font.PLAIN, 13);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f3 = new Font("HY견고딕", Font.BOLD, 18);

	MainGrowStudent() {
		if (init.DdayNumber == 0) {
			if (init.이해도 >= 90) {
				JLabel ending = new JLabel("오픈소스소프트웨어 이해도" + init.이해도 + "입니다. A+을 받았어");
				ending.setBounds(50, 51, 640, 100);
				ending.setVisible(true);
				contentPane.add(ending);

				contentPane.setBounds(0, 0, 655, 650);
				contentPane.setBackground(Color.WHITE);
				contentPane.setVisible(true);
				JOptionPane.showMessageDialog(null, "시험이 끝났어", "종강", JOptionPane.WARNING_MESSAGE);
			}
		}
		setTitle("<< 대학생 키우기 >>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setBounds(0, 0, 640, 109);
		contentPane.setLayout(null);

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
		StartBt.setBackground(Color.WHITE);
		StartBt.setBounds(0, 410, 360, 45);
		StartBt.setBorderPainted(false);
		StartBt.setFocusPainted(false);

		EndBt = new JButton(" 게임 종료 <<");
		EndBt.setFont(f1);
		EndBt.setBackground(Color.WHITE);
		EndBt.setBounds(290, 470, 360, 45);
		EndBt.setBorderPainted(false);
		EndBt.setFocusPainted(false);

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
		NormalBtn.setBackground(Color.WHITE);
		NormalBtn.setBounds(0, 410, 360, 45);
		NormalBtn.setBorderPainted(false);

		JButton HardBtn = new JButton("어려움 <<");
		HardBtn.setFont(f1);
		HardBtn.setBackground(Color.WHITE);
		HardBtn.setBounds(290, 470, 360, 45);
		HardBtn.setBorderPainted(false);// LevelPanel 화면

		StartBt.addActionListener(e -> {
			LevelPanel.add(Lb3);
			LevelPanel.add(Lb4);
			LevelPanel.add(NormalBtn);
			LevelPanel.add(HardBtn);
			contentPane.add(LevelPanel);
			N_Selectpanel.setVisible(false);
			lecturebtn.setVisible(false);
			partbtn.setVisible(false);
			restbtn.setVisible(false);
			studybtn.setVisible(false);
			fitnessbtn.setVisible(false);
			powers.setVisible(false);
			intellis.setVisible(false);
			moneys.setVisible(false);
			friends.setVisible(false);
			dates.setVisible(false);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);
			HomePanel.setVisible(false);
			N_MoveBtn.setVisible(false);

		}); // StartBt 버튼 누르면 LevelPanel 난이도 선택 패널로 이동

//		init.MT();

		JLabel dateLb = new JLabel();
		  dateLb.setText("Today 2020년 " + init.Month + "월" + init.Day + "일  " );
		Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
		dateLb.setFont(datefont);
		dateLb.setBounds(380, 10, 600, 40);
		
		JButton N_MoveBtn = new JButton("활동하기");
		N_MoveBtn.setFont(f1);
		N_MoveBtn.setBackground(Color.WHITE);
		N_MoveBtn.setBounds(0, 410, 250, 45);
		N_MoveBtn.setBorderPainted(false);
		N_MoveBtn.setFocusPainted(false);

		JButton H_MoveBtn = new JButton("활동하기");
		H_MoveBtn.setFont(f1);
		H_MoveBtn.setBackground(Color.WHITE);
		H_MoveBtn.setBounds(0, 410, 360, 45);
		H_MoveBtn.setBorderPainted(false);
		H_MoveBtn.setFocusPainted(false);

		NormalBtn.addActionListener(e -> {
			new N_Home(PL, IL, ML, FL, DL);
			HomePanel.add(dateLb);
			HomePanel.add(N_MoveBtn);
			N_MoveBtn.setVisible(true);
			powers.setLayout(null);
			powers.setBounds(25, 5, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 5, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 5, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 5, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 0, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			HomePanel.setBounds(0, 73, 640, 452);
			HomePanel.setVisible(true);
			contentPane.setBounds(0, 452, 640, 200);
			contentPane.add(HomePanel);
			N_Selectpanel.setVisible(false);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // 난이도 보통인 HomePanel로 이동

		HardBtn.addActionListener(e -> {

			HomePanel.add(dateLb);
			HomePanel.add(H_MoveBtn);
			H_MoveBtn.setVisible(true);
			powers.setLayout(null);
			powers.setBounds(25, 5, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 5, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 5, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 5, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 0, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			HomePanel.setBounds(0, 73, 640, 452);
			HomePanel.setVisible(true);
			contentPane.setBounds(0, 452, 640, 200);
			contentPane.add(HomePanel);
			N_Selectpanel.setVisible(false);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // 난이도 보통인 HomePanel로 이동

		lecturebtn.setBounds(130, 40, 60, 30);
		lecturebtn.setBackground(new Color(148, 233, 86));
		lecturebtn.setFont(f3);
		lecturebtn.setFocusPainted(false);
		lecturebtn.setBorderPainted(false);
		lecturebtn.setVisible(true);
		N_Selectpanel.add(lecturebtn);

		partbtn.setBounds(325, 65, 120, 30);
		partbtn.setBackground(new Color(246, 233, 92));
		partbtn.setFont(f3);
		partbtn.setFocusPainted(false);
		partbtn.setBorderPainted(false);
		partbtn.setVisible(true);
		N_Selectpanel.add(partbtn);

		restbtn.setBounds(40, 290, 115, 30);
		restbtn.setBackground(new Color(90, 204, 240));
		restbtn.setFont(f3);
		restbtn.setFocusPainted(false);
		restbtn.setBorderPainted(false);
		restbtn.setVisible(true);
		N_Selectpanel.add(restbtn);

		studybtn.setBounds(229, 305, 125, 30);
		studybtn.setBackground(new Color(208, 100, 238));
		studybtn.setFont(f3);
		studybtn.setFocusPainted(false);
		studybtn.setBorderPainted(false);
		studybtn.setVisible(true);
		N_Selectpanel.add(studybtn);

		fitnessbtn.setBounds(540, 411, 80, 30);
		fitnessbtn.setBackground(new Color(239, 89, 179));
		fitnessbtn.setFont(f3);
		fitnessbtn.setFocusPainted(false);
		fitnessbtn.setBorderPainted(false);
		fitnessbtn.setVisible(true);
		N_Selectpanel.add(fitnessbtn);

		powers.setLayout(null);
		powers.setBounds(25, 5, 100, 100);
		PL.setText("" + init.Power);
		PL.setBounds(15, 5, 50, 50);
		PL.setFont(powerfont);
		powers.add(PL);
		powers.setVisible(true);
		contentPane.add(powers);

		intellis.setLayout(null);
		intellis.setBounds(110, 5, 100, 100);
		IL.setText("" + init.Intelli);
		IL.setBounds(18, 5, 50, 50);
		IL.setFont(powerfont);
		intellis.add(IL);
		intellis.setVisible(true);
		contentPane.add(intellis);

		moneys.setLayout(null);
		moneys.setBounds(190, 5, 100, 100);
		ML.setText("" + init.Money);
		ML.setBounds(5, 13, 100, 50);
		ML.setFont(powerfont);
		moneys.add(ML);
		moneys.setVisible(true);
		contentPane.add(moneys);

		friends.setLayout(null);
		friends.setBounds(290, 5, 100, 100);
		FL.setText("" + init.Friend);
		FL.setBounds(25, 5, 150, 50);
		FL.setFont(powerfont);
		friends.add(FL);
		friends.setVisible(true);
		contentPane.add(friends);

		dates.setLayout(null);
		dates.setBounds(390, 0, 100, 100);
		DL.setText("D- " + init.DdayNumber);
		DL.setBounds(12, 16, 150, 50);
		DL.setFont(powerfont);
		dates.add(DL);
		dates.setVisible(true);

		contentPane.add(dates);
		N_MoveBtn.setVisible(false);
		HomePanel.setVisible(false);

		SelectBtn.setVisible(false);
		EndBtn.setVisible(false);

		N_Selectpanel.setVisible(true);

		N_Selectpanel.setLayout(null);
		N_Selectpanel.setBounds(0, 100, 650, 500);
		contentPane.add(N_Selectpanel);
		contentPane.setLayout(null);
		contentPane.setBounds(0, 550, 650, 100);
		contentPane.setVisible(true);
		JButton N_BackBtn = new JButton("뒤로가기");
		N_BackBtn.setFont(활동선택버튼폰트);
		N_BackBtn.setBounds(430, 300, 130, 30);
		N_BackBtn.setBackground(new Color(245, 92, 183));
		N_BackBtn.setFocusPainted(false);
		N_BackBtn.setBorderPainted(false);

		N_BackBtn.addActionListener(event -> {
			HomePanel.setVisible(true);
			N_MenuPanel.setVisible(false);
			contentPane.add(HomePanel);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		N_MoveBtn.addActionListener(e -> {

			lecturebtn.setBounds(220, 180, 80, 30);
			lecturebtn.setBackground(new Color(148, 233, 86));
			lecturebtn.setFont(f3);
			lecturebtn.setFocusPainted(false);
			lecturebtn.setBorderPainted(false);
			lecturebtn.setVisible(true);
			N_Selectpanel.add(lecturebtn);

			partbtn.setBounds(440, 180, 80, 30);
			partbtn.setBackground(new Color(246, 233, 92));
			partbtn.setFont(f3);
			partbtn.setFocusPainted(false);
			partbtn.setBorderPainted(false);
			partbtn.setVisible(true);
			N_Selectpanel.add(partbtn);

			restbtn.setBounds(130, 410, 80, 30);
			restbtn.setBackground(new Color(90, 204, 240));
			restbtn.setFont(f3);
			restbtn.setFocusPainted(false);
			restbtn.setBorderPainted(false);
			restbtn.setVisible(true);
			N_Selectpanel.add(restbtn);

			studybtn.setBounds(320, 430, 80, 30);
			studybtn.setBackground(new Color(208, 100, 238));
			studybtn.setFont(f3);
			studybtn.setFocusPainted(false);
			studybtn.setBorderPainted(false);
			studybtn.setVisible(true);
			N_Selectpanel.add(studybtn);

			fitnessbtn.setBounds(510, 391, 80, 30);
			fitnessbtn.setBackground(new Color(239, 89, 179));
			fitnessbtn.setFont(f3);
			fitnessbtn.setFocusPainted(false);
			fitnessbtn.setBorderPainted(false);
			fitnessbtn.setVisible(true);
			N_Selectpanel.add(fitnessbtn);

			powers.setLayout(null);
			powers.setBounds(25, 5, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 5, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 5, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 5, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 0, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);

			contentPane.add(dates);
			N_MoveBtn.setVisible(false);
			HomePanel.setVisible(false);

			N_Selectpanel.setVisible(true);

			N_Selectpanel.setLayout(null);
			N_Selectpanel.setBounds(0, 100, 650, 500);
			contentPane.add(N_Selectpanel);
			contentPane.setLayout(null);
			contentPane.setBounds(0, 550, 650, 100);
			contentPane.setVisible(true);

		});

		H_MoveBtn.addActionListener(e -> {

			H_lecturebtn.setBounds(220, 175, 80, 30);
			H_lecturebtn.setBackground(new Color(148, 233, 86));
			H_lecturebtn.setFont(f3);
			H_lecturebtn.setFocusPainted(false);
			H_lecturebtn.setBorderPainted(false);
			H_lecturebtn.setVisible(true);
			H_Selectpanel.add(H_lecturebtn);

			H_partbtn.setBounds(440, 175, 80, 30);
			H_partbtn.setBackground(new Color(246, 233, 92));
			H_partbtn.setFont(f3);
			H_partbtn.setFocusPainted(false);
			H_partbtn.setBorderPainted(false);
			H_partbtn.setVisible(true);
			H_Selectpanel.add(H_partbtn);

			H_restbtn.setBounds(130, 400, 80, 30);
			H_restbtn.setBackground(new Color(90, 204, 240));
			H_restbtn.setFont(f3);
			H_restbtn.setFocusPainted(false);
			H_restbtn.setBorderPainted(false);
			H_restbtn.setVisible(true);
			H_Selectpanel.add(H_restbtn);

			H_studybtn.setBounds(320, 425, 80, 30);
			H_studybtn.setBackground(new Color(208, 100, 238));
			H_studybtn.setFont(f3);
			H_studybtn.setFocusPainted(false);
			H_studybtn.setBorderPainted(false);
			H_studybtn.setVisible(true);
			H_Selectpanel.add(H_studybtn);

			H_fitnessbtn.setBounds(510, 386, 80, 30);
			H_fitnessbtn.setBackground(new Color(239, 89, 179));
			H_fitnessbtn.setFont(f3);
			H_fitnessbtn.setFocusPainted(false);
			H_fitnessbtn.setBorderPainted(false);
			H_fitnessbtn.setVisible(true);
			H_Selectpanel.add(H_fitnessbtn);

			powers.setLayout(null);
			powers.setBounds(25, 5, 100, 100);
			PL.setText("" + init.Power);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 5, 100, 100);
			IL.setText("" + init.Intelli);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 5, 100, 100);
			ML.setText("" + init.Money);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 5, 100, 100);
			FL.setText("" + init.Friend);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(390, 0, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);

			contentPane.add(dates);
			H_MoveBtn.setVisible(false);
			HomePanel.setVisible(false);

			H_Selectpanel.setVisible(true);

			H_Selectpanel.setLayout(null);
			H_Selectpanel.setBounds(0, 100, 650, 500);
			contentPane.add(H_Selectpanel);
			contentPane.setLayout(null);
			contentPane.setBounds(0, 550, 650, 100);
			contentPane.setVisible(true);
		});

		lecturebtn.addActionListener(event -> {

			new N_Lecture(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		partbtn.addActionListener(event -> {

			new N_PartTime(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

		});

		restbtn.addActionListener(event -> {

			new N_Rest(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		studybtn.addActionListener(event -> {

			new N_Study(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});
		fitnessbtn.addActionListener(event -> {
			new N_Fitness(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

		});

		H_lecturebtn.addActionListener(event -> {

			new H_Lecture(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		H_partbtn.addActionListener(event -> {

			new H_PartTime(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

		});

		H_restbtn.addActionListener(event -> {

			new H_Rest(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		H_studybtn.addActionListener(event -> {

			new H_Study(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);
		});

		H_fitnessbtn.addActionListener(event -> {
			new H_Fitness(PL, IL, ML, FL, DL);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

		});
		N_Selectpanel.setVisible(false);
		lecturebtn.setVisible(false);
		partbtn.setVisible(false);
		restbtn.setVisible(false);
		studybtn.setVisible(false);
		fitnessbtn.setVisible(false);

		H_Selectpanel.setVisible(false);
		H_lecturebtn.setVisible(false);
		H_partbtn.setVisible(false);
		H_restbtn.setVisible(false);
		H_studybtn.setVisible(false);
		N_MoveBtn.setVisible(false);
		H_MoveBtn.setVisible(false);
		powers.setVisible(false);
		intellis.setVisible(false);
		moneys.setVisible(false);
		friends.setVisible(false);
		dates.setVisible(false);
		setSize(655, 650);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}

}