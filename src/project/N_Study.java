package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class N_Study extends JFrame {
	Container contentPane;
	JPanel SelectPanel = new JPanel();
	subImagePanel OSPanel = new subImagePanel(new ImageIcon("./image/OS_1.png").getImage());
	subImagePanel DBPanel = new subImagePanel(new ImageIcon("./image/DB_1.png").getImage());
	subImagePanel IPPanel = new subImagePanel(new ImageIcon("./image/IP_1.png").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());// 이미지 패널 객체 생성

	Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 30);
	Font f2 = new Font("HY견고딕", Font.BOLD, 15);
	Font f3 = new Font("HY견고딕", Font.PLAIN, 12);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font f4 = new Font("HY견고딕", Font.PLAIN, 23);

	JButton SelectBtn = new JButton("활동선택");
	JButton EndBtn = new JButton("일과 종료");
	ImageIcon OS = new ImageIcon("./image/OS.png");
	JButton button1 = new JButton(OS);
	ImageIcon DB = new ImageIcon("./image/DB.png");
	JButton button2 = new JButton(DB);
	ImageIcon IP = new ImageIcon("./image/IP.png");
	JButton button3 = new JButton(IP);

	JLabel OSLb = new JLabel("오픈소스소프트웨어");
	JLabel DBLb = new JLabel("데이터베이스");
	JLabel IPLb = new JLabel("정보보호");

	JLabel 체력확인레이블 = new JLabel();
	JLabel 지식확인레이블 = new JLabel();
	JLabel 돈확인레이블 = new JLabel();
	JLabel 친구확인레이블 = new JLabel();

	JLabel 설명 = new JLabel("어떤 과목의 공부를 해볼까?");

	JLabel 내용 = new JLabel();
	JLabel 내용1 = new JLabel();
	JLabel 내용2 = new JLabel();

	N_Study(JLabel PL, JLabel IL, JLabel ML, JLabel FL) {
		setTitle("공부하기");
		contentPane = getContentPane();
		setLayout(null);

		SelectPanel.setLayout(null);
		SelectPanel.setBounds(0, 0, 670, 670);

		설명.setBounds(130, 170, 670, 670);
		설명.setFont(f1);

		button1.setBounds(0, 100, 220, 300);
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setBackground(Color.WHITE);
		button1.setFont(f2);

		button2.setBounds(220, 100, 220, 300);
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setBackground(Color.WHITE);
		button2.setFont(f2);

		button3.setBounds(440, 100, 210, 300);
		button3.setBorderPainted(false);
		button3.setFocusPainted(false);
		button3.setBackground(Color.WHITE);
		button3.setFont(f2);

		OSLb.setBounds(39, 90, 650, 650);
		OSLb.setBackground(Color.WHITE);
		OSLb.setFont(f2);

		DBLb.setBounds(280, 90, 650, 650);
		DBLb.setBackground(Color.WHITE);
		DBLb.setFont(f2);

		IPLb.setBounds(510, 90, 650, 650);
		IPLb.setBackground(Color.WHITE);
		IPLb.setFont(f2);

		SelectPanel.add(설명);
		SelectPanel.add(button1);
		SelectPanel.add(button2);
		SelectPanel.add(button3);
		SelectPanel.add(OSLb);
		SelectPanel.add(DBLb);
		SelectPanel.add(IPLb);
		SelectPanel.setBackground(Color.WHITE);
		contentPane.add(SelectPanel);

		button1.addActionListener(event -> {
			init.N_Study();

			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 559, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 559, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 559, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 570, 190, 80);
			contentPane.add(friends);

			SelectBtn.setBounds(0, 30, 130, 30);
			SelectBtn.setBackground(new Color(225, 80, 80));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			contentPane.add(SelectBtn);

			EndBtn.setBounds(0, 70, 130, 30);
			EndBtn.setBackground(new Color(225, 80, 80));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			contentPane.add(EndBtn);

			내용.setText("오픈소스소프트웨어 공부를 해야지! ");
			내용.setBounds(10, 150, 640, 640);

			내용1.setText("공부중~");
			내용1.setBounds(10, 190, 640, 640);

			내용2.setText("[공부하기가 끝났습니다.]");
			내용2.setBounds(10, 230, 640, 640);

			내용.setFont(f4);
			내용1.setFont(f4);
			내용2.setFont(f4);

			contentPane.add(내용);
			contentPane.add(내용1);
			contentPane.add(내용2);

			OSPanel.setLayout(null);
			OSPanel.setBounds(200, 10, 650, 650);

			contentPane.add(OSPanel);
			OSPanel.setVisible(true);
			SelectPanel.setVisible(false);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		button2.addActionListener(event -> {
			init.N_Study();

			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 559, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 559, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 559, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 570, 190, 80);
			contentPane.add(friends);
			
			SelectBtn.setBounds(0, 30, 130, 30);
			SelectBtn.setBackground(new Color(225, 80, 80));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			contentPane.add(SelectBtn);

			EndBtn.setBounds(0, 70, 130, 30);
			EndBtn.setBackground(new Color(225, 80, 80));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			contentPane.add(EndBtn);

			내용.setText("데이터베이스 공부를 해야지! ");
			내용.setBounds(10, 130, 640, 640);

			내용1.setText("공부중~");
			내용1.setBounds(10, 170, 640, 640);

			내용2.setText("[공부하기가 끝났습니다.]");
			내용2.setBounds(10, 210, 640, 640);

			내용.setFont(f4);
			내용1.setFont(f4);
			내용2.setFont(f4);

			contentPane.add(내용);
			contentPane.add(내용1);
			contentPane.add(내용2);

			DBPanel.setLayout(null);
			DBPanel.setBounds(200, 10, 670, 670);
			contentPane.add(DBPanel);
			DBPanel.setVisible(true);
			SelectPanel.setVisible(false);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		button3.addActionListener(event -> {
			init.N_Study();
			
			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(15, 5, 50, 50);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);
			powers.setBounds(359, 559, 190, 80);
			contentPane.add(powers);

			지식확인레이블.setText("" + init.Intelli);
			지식확인레이블.setBounds(18, 5, 50, 50);
			지식확인레이블.setFont(btnfont);
			intellis.add(지식확인레이블);
			intellis.setBounds(430, 559, 190, 80);
			contentPane.add(intellis);

			돈확인레이블.setText("" + init.Money);
			돈확인레이블.setBounds(5, 13, 100, 50);
			돈확인레이블.setFont(btnfont);
			moneys.add(돈확인레이블);
			moneys.setBounds(490, 559, 190, 80);
			contentPane.add(moneys);

			친구확인레이블.setText("" + init.Friend);
			친구확인레이블.setBounds(25, 5, 150, 50);
			친구확인레이블.setFont(btnfont);
			friends.add(친구확인레이블);
			friends.setBounds(570, 570, 190, 80);
			contentPane.add(friends);
			
			SelectBtn.setBounds(0, 30, 130, 30);
			SelectBtn.setBackground(new Color(225, 80, 80));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			contentPane.add(SelectBtn);

			EndBtn.setBounds(0, 70, 130, 30);
			EndBtn.setBackground(new Color(225, 80, 80));
			EndBtn.setFont(btnfont);
			EndBtn.setBorderPainted(false);
			EndBtn.setFocusPainted(false);
			contentPane.add(EndBtn);

			내용.setText("정보보호 공부를 해야지! ");
			내용.setBounds(10, 130, 640, 640);

			내용1.setText("공부중~");
			내용1.setBounds(10, 170, 640, 640);

			내용2.setText("[공부하기가 끝났습니다.]");
			내용2.setBounds(10, 210, 640, 640);

			내용.setFont(f4);
			내용1.setFont(f4);
			내용2.setFont(f4);

			contentPane.add(내용);
			contentPane.add(내용1);
			contentPane.add(내용2);

			IPPanel.setLayout(null);
			IPPanel.setBounds(200, 10, 670, 670);
			contentPane.add(IPPanel);
			IPPanel.setVisible(true);
			SelectPanel.setVisible(false);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		SelectBtn.addActionListener(event -> {
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			JOptionPane.showMessageDialog(null, "활동 선택으로 이동합니다", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			dispose();
		});
		EndBtn.addActionListener(event -> {
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			JOptionPane.showMessageDialog(null, "집으로 이동합니다.", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			dispose();
		});
		/*
		 * JLabel SLb1 = new JLabel(); SLb1.setText("어떤 과목의 공부를 하시겠습니까?");
		 * SLb1.setBounds(270, 140, 600, 20);
		 * 
		 * Font label4font = new Font("monospaced", Font.BOLD, 30);
		 * SLb1.setFont(label4font);
		 * 
		 * button1.setEnabled(true); button2.setEnabled(true); button3.setEnabled(true);
		 * button4.setEnabled(true);
		 * 
		 * button1.setBounds(235, 260, 300, 50); button2.setBounds(235, 330, 300, 50);
		 * button3.setBounds(235, 400, 300, 50); button4.setBounds(235, 470, 300, 50);
		 * 
		 * Font f4 = new Font("휴먼엑스포", Font.BOLD, 25); button1.setFont(f4);
		 * button2.setFont(f4); button3.setFont(f4); button4.setFont(f4);
		 * 
		 * button1.setBackground(Color.WHITE); button2.setBackground(Color.WHITE);
		 * button3.setBackground(Color.WHITE); button4.setBackground(Color.WHITE);
		 * 
		 * bookImagePanel Panel = new bookImagePanel(new
		 * ImageIcon("./image/book.png").getImage()); Panel.setLayout(null);
		 * Panel.add(SLb1); Panel.add(button1); Panel.add(button2); Panel.add(button3);
		 * Panel.add(button4);
		 * 
		 * contentPane.add(Panel);
		 * 
		 * button1.addActionListener(event -> { init.N_intelli_up();
		 * Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " +
		 * init.Day + "일  " + init.Today + "요일"); Lb2.setText("체력 " + init.Power +
		 * " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
		 * dispose(); }); button2.addActionListener(event -> { init.N_intelli_up();
		 * Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " +
		 * init.Day + "일  " + init.Today + "요일"); Lb2.setText("체력 " + init.Power +
		 * " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
		 * dispose(); }); button3.addActionListener(event -> { init.N_intelli_up();
		 * Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년  " + init.Month + "월  " +
		 * init.Day + "일  " + init.Today + "요일"); Lb2.setText("체력 " + init.Power +
		 * " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
		 * dispose(); }); button4.addActionListener(event -> {
		 * JOptionPane.showMessageDialog(null, "뒤로 이동합니다", "뒤로 이동",
		 * JOptionPane.INFORMATION_MESSAGE); // 메시지 dispose(); });
		 */

		setSize(670, 670);
		setVisible(true);
	}

}
