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

class N_Rest extends JFrame {
	Container contentPane;

	subImagePanel Restpanel = new subImagePanel(new ImageIcon("./image/rest.png").getImage());
	subImagePanel cinemapanel = new subImagePanel(new ImageIcon("./image/cinema.jpg").getImage());
	subImagePanel singpanel = new subImagePanel(new ImageIcon("./image/sing.jpg").getImage());
	subImagePanel parkpanel = new subImagePanel(new ImageIcon("./image/park.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
	subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());

	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
	subImagePanel N_Selectpanel = new subImagePanel(new ImageIcon("./image/N_select_home.png").getImage());

	JButton 노래방 = new JButton("이동");
	JButton 영화관 = new JButton("이동");
	JButton 놀이공원 = new JButton("이동");

	JButton lecturebtn = new JButton("이동");
	JButton partbtn = new JButton("이동");
	JButton restbtn = new JButton("이동");
	JButton studybtn = new JButton("이동");
	JButton fitnessbtn = new JButton("이동");
	JButton N_MoveBtn = new JButton("활동하기");

	JLabel 체력확인레이블 = new JLabel();
	JLabel 지식확인레이블 = new JLabel();
	JLabel 돈확인레이블 = new JLabel();
	JLabel 친구확인레이블 = new JLabel();

	JButton SelectBtn = new JButton("홈 이동");
//   JButton EndBtn = new JButton("일과 종료");

	Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 22);
	Font f3 = new Font("HY견고딕", Font.BOLD, 18);

	N_Rest(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
		setTitle("휴식하기");
		contentPane = getContentPane();
		setLayout(null);
		setSize(655, 655);
		Font restfont = new Font("휴먼둥근헤드라인", Font.PLAIN, 11);

		Restpanel.setVisible(true);
		Restpanel.setBounds(1, 110, 650, 470);

		노래방.setBounds(553, 140, 57, 30);
		노래방.setBackground(new Color(127, 127, 127));
		노래방.setFont(restfont);
		노래방.setBorderPainted(false);
		노래방.setFocusPainted(false);
		노래방.setVisible(true);
		Restpanel.add(노래방);

		영화관.setBounds(423, 260, 57, 30);
		영화관.setBackground(new Color(127, 127, 127));
		영화관.setFont(restfont);
		영화관.setBorderPainted(false);
		영화관.setFocusPainted(false);
		영화관.setVisible(true);
		Restpanel.add(영화관);

		놀이공원.setBounds(553, 378, 57, 30);
		놀이공원.setBackground(new Color(127, 127, 127));
		놀이공원.setFont(restfont);
		놀이공원.setBorderPainted(false);
		놀이공원.setFocusPainted(false);
		놀이공원.setVisible(true);
		Restpanel.add(놀이공원);

		contentPane.setBounds(0, 0, 655, 110);
		체력확인레이블.setText("" + init.Power);
		체력확인레이블.setBounds(15, 5, 50, 50);
		체력확인레이블.setFont(btnfont);
		powers.add(체력확인레이블);
		powers.setBounds(359, 10, 190, 80);
		contentPane.add(powers);

		지식확인레이블.setText("" + init.Intelli);
		지식확인레이블.setBounds(18, 5, 50, 50);
		지식확인레이블.setFont(btnfont);
		intellis.add(지식확인레이블);
		intellis.setBounds(430, 10, 190, 80);
		contentPane.add(intellis);

		돈확인레이블.setText("" + init.Money);
		돈확인레이블.setBounds(5, 13, 100, 50);
		돈확인레이블.setFont(btnfont);
		moneys.add(돈확인레이블);
		moneys.setBounds(490, 10, 190, 80);
		contentPane.add(moneys);

		친구확인레이블.setText("" + init.Friend);
		친구확인레이블.setBounds(25, 5, 150, 50);
		친구확인레이블.setFont(btnfont);
		friends.add(친구확인레이블);
		friends.setBounds(570, 10, 190, 80);
		contentPane.add(friends);

		dates.setLayout(null);
		dates.setBounds(270, 10, 100, 100);
		DL.setText("D- " + init.DdayNumber);
		DL.setBounds(12, 16, 150, 50);
		DL.setFont(powerfont);
		dates.add(DL);
		dates.setVisible(true);
		contentPane.add(dates);

		PL.setText("" + init.Power);
		IL.setText("" + init.Intelli);
		ML.setText("" + init.Money);
		FL.setText("" + init.Friend);
		DL.setText("D- " + init.DdayNumber);

		SelectBtn.setBounds(0, 30, 130, 30);
		SelectBtn.setBackground(new Color(225, 80, 80));
		SelectBtn.setFont(btnfont);
		SelectBtn.setBorderPainted(false);
		SelectBtn.setFocusPainted(false);
		contentPane.add(SelectBtn);

		contentPane.add(Restpanel);
		contentPane.setBackground(Color.WHITE);
		contentPane.setVisible(true);
		setSize(655, 655);
		setVisible(true);

		노래방.addActionListener(event -> {

			contentPane.setBounds(0, 0, 655, 110);
			init.N_sing();
			init.N_rest();
			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 10, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 10, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 10, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 10, 190, 80);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(270, 10, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			singpanel.setVisible(true);
			singpanel.setLayout(null);
			singpanel.setBounds(0, 80, 655, 427);

			Restpanel.setVisible(false);
			노래방.setVisible(false);
			영화관.setVisible(false);
			놀이공원.setVisible(false);

			SelectBtn.setBounds(0, 30, 130, 30);
			SelectBtn.setBackground(new Color(225, 80, 80));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			contentPane.add(SelectBtn);

			contentPane.add(singpanel);
			contentPane.setBounds(0, 428, 665, 227);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
			JOptionPane.showMessageDialog(null, "남은 1분까지 야무지게 불렀어!", "노래방", JOptionPane.INFORMATION_MESSAGE);

		});

		영화관.addActionListener(event -> {

			init.N_cinema();
			contentPane.setBounds(0, 0, 655, 110);
			init.N_rest();

			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 10, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 10, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 10, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 10, 190, 80);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(270, 10, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			cinemapanel.setVisible(true);
			cinemapanel.setLayout(null);
			cinemapanel.setBounds(0, 80, 655, 427);

			Restpanel.setVisible(false);
			노래방.setVisible(false);
			영화관.setVisible(false);
			놀이공원.setVisible(false);

			SelectBtn.setBounds(0, 30, 130, 30);
			SelectBtn.setBackground(new Color(225, 80, 80));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			contentPane.add(SelectBtn);

			contentPane.add(cinemapanel);
			contentPane.setBounds(0, 428, 665, 227);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
			JOptionPane.showMessageDialog(null, "제시카,외동 딸,일리노이 시카고, 과 선배는 김진모 그는 니 사촌", "영화관",
					JOptionPane.INFORMATION_MESSAGE);

		});

		놀이공원.addActionListener(event -> {
			init.N_park();

			contentPane.setBounds(0, 0, 655, 110);
			init.N_rest();
			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 10, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 10, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(15, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 10, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 10, 190, 80);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(270, 10, 100, 100);
			DL.setText("D- " + init.DdayNumber);
			DL.setBounds(12, 16, 150, 50);
			DL.setFont(powerfont);
			dates.add(DL);
			dates.setVisible(true);
			contentPane.add(dates);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			parkpanel.setVisible(true);
			parkpanel.setLayout(null);
			parkpanel.setBounds(0, 80, 655, 427);

			Restpanel.setVisible(false);
			노래방.setVisible(false);
			영화관.setVisible(false);
			놀이공원.setVisible(false);

			SelectBtn.setBounds(0, 30, 130, 30);
			SelectBtn.setBackground(new Color(225, 80, 80));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			contentPane.add(SelectBtn);

			
			contentPane.add(parkpanel);
			contentPane.setBounds(0, 428, 665, 227);
			contentPane.setBackground(Color.WHITE);

			JOptionPane.showMessageDialog(null, "불꽃놀이 퍼레이드가 정말 예뻤어", "놀이공원", JOptionPane.INFORMATION_MESSAGE);


		});

		SelectBtn.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "홈 화면으로 이동합니다.", "홈 화면으로 이동", JOptionPane.INFORMATION_MESSAGE);
			new N_Home(PL, IL, ML, FL, DL);

			SelectBtn.setVisible(false);

			JLabel dateLb = new JLabel();
			  dateLb.setText("Today 2020년 " + init.Month + "월" + init.Day + "일  " );
			Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
			dateLb.setFont(datefont);
			dateLb.setBounds(380, 10, 600, 40);
			dateLb.setVisible(true);
			HomePanel.add(dateLb);

			N_MoveBtn.setFont(f1);
			N_MoveBtn.setBackground(Color.WHITE);
			N_MoveBtn.setBounds(0, 410, 250, 45);
			N_MoveBtn.setBorderPainted(false);
			N_MoveBtn.setFocusPainted(false);
			HomePanel.add(N_MoveBtn);

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

			singpanel.setVisible(false);
			cinemapanel.setVisible(false);
			parkpanel.setVisible(false);

			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			DL.setText("D- " + init.DdayNumber);

			HomePanel.setLayout(null);
			HomePanel.setBounds(0, 70, 640, 452);
			HomePanel.setVisible(true);
			contentPane.add(HomePanel);

			contentPane.setLayout(null);
			contentPane.setBounds(0, 450, 640, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		N_MoveBtn.addActionListener(event -> {

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

	}

}