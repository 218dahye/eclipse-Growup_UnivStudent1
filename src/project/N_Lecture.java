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

@SuppressWarnings("serial")
class N_Lecture extends JFrame {
	Container contentPane;

	subImagePanel longs = new subImagePanel(new ImageIcon("./image/longp.png").getImage());
	subImagePanel shorts = new subImagePanel(new ImageIcon("./image/shortp.png").getImage());
	subImagePanel lecturelist = new subImagePanel(new ImageIcon("./image/lecturelist.png").getImage());
	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
	subImagePanel N_Selectpanel = new subImagePanel(new ImageIcon("./image/N_select_home.png").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
	subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());
	subImagePanel Lecture_panel = new subImagePanel(new ImageIcon("./image/lecture.jpg").getImage());

	JButton ���¼ҽ�����Ʈ���� = new JButton("�̵�");
	JButton �����ͺ��̽� = new JButton("�̵�");
	JButton ������ȣ = new JButton("�̵�");
	JButton N_MoveBtn = new JButton("Ȱ�� �ϱ�");

	JLabel ü��Ȯ�η��̺� = new JLabel();
	JLabel ����Ȯ�η��̺� = new JLabel();
	JLabel ��Ȯ�η��̺� = new JLabel();
	JLabel ģ��Ȯ�η��̺� = new JLabel();

	JLabel ��Ʈ1 = new JLabel();
	JLabel ��Ʈ2 = new JLabel();
	JLabel ��Ʈ3 = new JLabel();
	JLabel ��Ʈ4 = new JLabel();
	JLabel ��Ʈ5 = new JLabel();

	JButton lecturebtn = new JButton("�̵�");
	JButton partbtn = new JButton("�̵�");
	JButton restbtn = new JButton("�̵�");
	JButton studybtn = new JButton("�̵�");
	JButton fitnessbtn = new JButton("�̵�");

	JButton SelectBtn = new JButton("Ȩ �̵�");

	Font btnfont = new Font("HY������M", Font.BOLD, 15);
	Font powerfont = new Font("HY������M", Font.BOLD, 15);
	Font f1 = new Font("�޸յձ�������", Font.PLAIN, 22);
	Font f2 = new Font("HY�߰��", Font.BOLD, 20);
	Font f3 = new Font("HY�߰��", Font.BOLD, 18);
	Font f4 = new Font("HY�߰��", Font.PLAIN, 15);

	N_Lecture(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
		contentPane = getContentPane();
		setSize(655, 655);
		setLayout(null);

		lecturelist.setLayout(null);
		lecturelist.setBounds(110, 0, 640, 640);
		contentPane.setBounds(0, 0, 110, 640);
		contentPane.add(lecturelist);
		contentPane.setBackground(Color.WHITE);

		contentPane.setBounds(0, 0, 655, 110);
		ü��Ȯ�η��̺�.setText("" + init.Power);
		ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
		ü��Ȯ�η��̺�.setFont(btnfont);
		powers.add(ü��Ȯ�η��̺�);
		powers.setBounds(10, 210, 190, 80);
		contentPane.add(powers);

		����Ȯ�η��̺�.setText("" + init.Intelli);
		����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
		����Ȯ�η��̺�.setFont(btnfont);
		intellis.add(����Ȯ�η��̺�);
		intellis.setBounds(10, 280, 190, 80);
		contentPane.add(intellis);

		��Ȯ�η��̺�.setText("" + init.Money);
		��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
		��Ȯ�η��̺�.setFont(btnfont);
		moneys.add(��Ȯ�η��̺�);
		moneys.setBounds(10, 350, 190, 80);
		contentPane.add(moneys);

		ģ��Ȯ�η��̺�.setText("" + init.Friend);
		ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
		ģ��Ȯ�η��̺�.setFont(btnfont);
		friends.add(ģ��Ȯ�η��̺�);
		friends.setBounds(10, 420, 190, 80);
		contentPane.add(friends);

		dates.setLayout(null);
		dates.setBounds(10, 490, 100, 100);
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

		SelectBtn.setBounds(0, 30, 110, 30);
		SelectBtn.setBackground(new Color(93, 115, 145));
		SelectBtn.setFont(btnfont);
		SelectBtn.setBorderPainted(false);
		SelectBtn.setFocusPainted(false);
		contentPane.add(SelectBtn);

		���¼ҽ�����Ʈ����.setBounds(401, 220, 80, 25);
		���¼ҽ�����Ʈ����.setVisible(true);
		���¼ҽ�����Ʈ����.setFocusPainted(false);
		���¼ҽ�����Ʈ����.setBorderPainted(false);
		���¼ҽ�����Ʈ����.setBackground(Color.WHITE);
		���¼ҽ�����Ʈ����.setFont(f2);
		lecturelist.add(���¼ҽ�����Ʈ����);

		�����ͺ��̽�.setBounds(401, 380, 80, 25);
		�����ͺ��̽�.setVisible(true);
		�����ͺ��̽�.setFocusPainted(false);
		�����ͺ��̽�.setBorderPainted(false);
		�����ͺ��̽�.setBackground(Color.WHITE);
		�����ͺ��̽�.setFont(f2);
		lecturelist.add(�����ͺ��̽�);

		������ȣ.setBounds(401, 535, 80, 25);
		������ȣ.setVisible(true);
		������ȣ.setFocusPainted(false);
		������ȣ.setBorderPainted(false);
		������ȣ.setBackground(Color.WHITE);
		������ȣ.setFont(f2);
		lecturelist.add(������ȣ);

		���¼ҽ�����Ʈ����.addActionListener(event -> {

			init.N_Lecture_power();
			Lecture_panel.setLayout(null);
			Lecture_panel.setBounds(0, 0, 640, 400);
			contentPane.add(Lecture_panel);

			��Ʈ1.setText("'��7514 ���¼ҽ� ����Ʈ���� ���ǽǿ� �����߾�. �繰�Կ� ���� �����ڷḦ ��������.'");
			��Ʈ1.setBounds(10, 470, 640, 50);
			��Ʈ1.setFont(f4);
			contentPane.add(��Ʈ1);

			��Ʈ2.setText("'���� �����߾�! ���� �غ���.'");
			��Ʈ2.setBounds(10, 490, 640, 50);
			��Ʈ2.setFont(f4);
			contentPane.add(��Ʈ2);

			��Ʈ3.setText("������ : ��������� ��ɿ��� ��ũ, Ǯ ������Ʈ, �̽�, ��Ű�� �ֽ��ϴ�.");
			��Ʈ3.setBounds(10, 510, 640, 50);
			��Ʈ3.setFont(f4);
			contentPane.add(��Ʈ3);

			��Ʈ4.setText("���ǰ� �������ϴ�. . .");
			��Ʈ4.setBounds(10, 530, 300, 50);
			��Ʈ4.setFont(f4);
			contentPane.add(��Ʈ4);

			��Ʈ5.setText("[�˸�: ü���� 20 ���������ϴ�. ]");
			��Ʈ5.setBounds(170, 530, 300, 50);
			��Ʈ5.setFont(f4);
			contentPane.add(��Ʈ5);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);

			ü��Ȯ�η��̺�.setText("" + init.Power);
			ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
			ü��Ȯ�η��̺�.setFont(btnfont);
			powers.add(ü��Ȯ�η��̺�);
			powers.setBounds(10, 420, 190, 80);
			contentPane.add(powers);

			����Ȯ�η��̺�.setText("" + init.Intelli);
			����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
			����Ȯ�η��̺�.setFont(btnfont);
			intellis.add(����Ȯ�η��̺�);
			intellis.setBounds(80, 420, 190, 80);
			contentPane.add(intellis);

			��Ȯ�η��̺�.setText("" + init.Money);
			��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
			��Ȯ�η��̺�.setFont(btnfont);
			moneys.add(��Ȯ�η��̺�);
			moneys.setBounds(150, 420, 190, 80);
			contentPane.add(moneys);

			ģ��Ȯ�η��̺�.setText("" + init.Friend);
			ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
			ģ��Ȯ�η��̺�.setFont(btnfont);
			friends.add(ģ��Ȯ�η��̺�);
			friends.setBounds(240, 420, 190, 80);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(330, 420, 100, 100);
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

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			Lecture_panel.add(SelectBtn);

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
			init.����();

		});

		�����ͺ��̽�.addActionListener(event -> {

			init.N_Lecture_power();

			Lecture_panel.setLayout(null);
			Lecture_panel.setBounds(0, 0, 640, 400);
			contentPane.add(Lecture_panel);

			��Ʈ1.setText("'��7507 �����ͺ��̽� ���ǽǿ� �����߾�. �繰�Կ� ���� ���縦 �����;߰ھ�.'");
			��Ʈ1.setBounds(10, 470, 640, 50);
			��Ʈ1.setFont(f4);
			contentPane.add(��Ʈ1);

			��Ʈ2.setText("���� �����߾�! '������ : ������ű���� ���缭���� ���� �ܰ迡 ���� �˾ƺ��ڽ��ϴ�.'");
			��Ʈ2.setBounds(10, 490, 640, 50);
			��Ʈ2.setFont(f4);
			contentPane.add(��Ʈ2);

			��Ʈ3.setText("������ : 1970���� ��ǻ�� ���� �����Ǿ���, 80������ ��ǻ�͸� �̿���");
			��Ʈ3.setBounds(10, 510, 640, 50);
			��Ʈ3.setFont(f4);
			contentPane.add(��Ʈ3);

			��Ʈ4.setText("���� ���α׷����� ������ ó���߽��ϴ�. ");
			��Ʈ4.setBounds(10, 530, 640, 50);
			��Ʈ4.setFont(f4);
			contentPane.add(��Ʈ4);

			��Ʈ5.setText("���ǰ� �������ϴ�. . .[�˸�: ü���� 20 ���������ϴ�.]");
			��Ʈ5.setBounds(10, 550, 640, 50);
			��Ʈ5.setFont(f4);
			contentPane.add(��Ʈ5);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);

			ü��Ȯ�η��̺�.setText("" + init.Power);
			ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
			ü��Ȯ�η��̺�.setFont(btnfont);
			powers.add(ü��Ȯ�η��̺�);
			powers.setBounds(10, 420, 190, 80);
			contentPane.add(powers);

			����Ȯ�η��̺�.setText("" + init.Intelli);
			����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
			����Ȯ�η��̺�.setFont(btnfont);
			intellis.add(����Ȯ�η��̺�);
			intellis.setBounds(80, 420, 190, 80);
			contentPane.add(intellis);

			��Ȯ�η��̺�.setText("" + init.Money);
			��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
			��Ȯ�η��̺�.setFont(btnfont);
			moneys.add(��Ȯ�η��̺�);
			moneys.setBounds(150, 420, 190, 80);
			contentPane.add(moneys);

			ģ��Ȯ�η��̺�.setText("" + init.Friend);
			ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
			ģ��Ȯ�η��̺�.setFont(btnfont);
			friends.add(ģ��Ȯ�η��̺�);
			friends.setBounds(240, 430, 190, 80);
			contentPane.add(friends);

			dates.setLayout(null);
			dates.setBounds(330, 420, 100, 100);
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

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			Lecture_panel.add(SelectBtn);

		

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);

			init.����();

		});

		������ȣ.addActionListener(event -> {

			init.N_Lecture_power();

			Lecture_panel.setLayout(null);
			Lecture_panel.setBounds(0, 0, 640, 400);
			contentPane.add(Lecture_panel);

			��Ʈ1.setText("'��7714 ������ȣ ���ǽǿ� �����ߴµ� ���簡 �繰�Կ� �־�. �繰�Կ� ���� ���縦 '");
			��Ʈ1.setBounds(10, 470, 640, 50);
			��Ʈ1.setFont(f4);
			contentPane.add(��Ʈ1);

			��Ʈ2.setText("ì�� ���ǽǿ� �����ϴ� ��ħ ���ǰ� ���� ���̿���!'");
			��Ʈ2.setBounds(10, 490, 640, 50);
			��Ʈ2.setFont(f4);
			contentPane.add(��Ʈ2);

			��Ʈ3.setText("'������ : �нú� ������ ������ �޴°� �������� �������� ��Ƽ�� ������ ������ ");
			��Ʈ3.setBounds(10, 510, 640, 50);
			��Ʈ3.setFont(f4);
			contentPane.add(��Ʈ3);

			��Ʈ4.setText("������ �� �ֽ��ϴ�. ���ǰ� �������ϴ�. . .");
			��Ʈ4.setBounds(10, 530, 300, 50);
			��Ʈ4.setFont(f4);
			contentPane.add(��Ʈ4);

			��Ʈ5.setText("[�˸�: ü���� 20 ���������ϴ�.]");
			��Ʈ5.setBounds(320, 530, 300, 50);
			��Ʈ5.setFont(f4);
			contentPane.add(��Ʈ5);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);

			ü��Ȯ�η��̺�.setText("" + init.Power);
			ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
			ü��Ȯ�η��̺�.setFont(btnfont);
			powers.add(ü��Ȯ�η��̺�);
			powers.setBounds(10, 420, 190, 80);
			contentPane.add(powers);

			����Ȯ�η��̺�.setText("" + init.Intelli);
			����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
			����Ȯ�η��̺�.setFont(btnfont);
			intellis.add(����Ȯ�η��̺�);
			intellis.setBounds(80, 420, 190, 80);
			contentPane.add(intellis);

			��Ȯ�η��̺�.setText("" + init.Money);
			��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
			��Ȯ�η��̺�.setFont(btnfont);
			moneys.add(��Ȯ�η��̺�);
			moneys.setBounds(150, 420, 190, 80);
			contentPane.add(moneys);

			ģ��Ȯ�η��̺�.setText("" + init.Friend);
			ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
			ģ��Ȯ�η��̺�.setFont(btnfont);
			friends.add(ģ��Ȯ�η��̺�);
			friends.setBounds(240, 430, 190, 80);
			contentPane.add(friends);

			dates.setBounds(320, 420, 100, 100);
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

			SelectBtn.setBounds(0, 30, 110, 30);
			SelectBtn.setBackground(new Color(93, 115, 145));
			SelectBtn.setFont(btnfont);
			SelectBtn.setBorderPainted(false);
			SelectBtn.setFocusPainted(false);
			Lecture_panel.add(SelectBtn);

			
			lecturelist.setVisible(false);
			Lecture_panel.setVisible(true);

			contentPane.setBounds(0, 400, 655, 200);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);

			init.����();
	//		init.MT();

		});

		contentPane.setVisible(true);
		setVisible(true);

		SelectBtn.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "Ȩ ȭ������ �̵��մϴ�.", "Ȩ ȭ������ �̵�", JOptionPane.INFORMATION_MESSAGE);
			new N_Home(PL, IL, ML, FL, DL);

			SelectBtn.setVisible(false);
//         EndBtn.setVisible(false);

			JLabel dateLb = new JLabel();
			  dateLb.setText("Today 2020�� " + init.Month + "��" + init.Day + "��  " );
			Font datefont = new Font("HY�߰��", Font.PLAIN, 23);
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

			lecturelist.setVisible(false);
			Lecture_panel.setVisible(false);

			��Ʈ1.setVisible(false);
			��Ʈ2.setVisible(false);
			��Ʈ3.setVisible(false);
			��Ʈ4.setVisible(false);
			��Ʈ5.setVisible(false);

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
			lecturelist.setVisible(false);
			Lecture_panel.setVisible(false);

			��Ʈ1.setVisible(false);
			��Ʈ2.setVisible(false);
			��Ʈ3.setVisible(false);
			��Ʈ4.setVisible(false);
			��Ʈ5.setVisible(false);

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