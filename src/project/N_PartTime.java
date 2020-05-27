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

class lectureImagePanel extends JPanel {
	private Image lectureimg;

	public lectureImagePanel(Image lectureimg) {
		this.lectureimg = lectureimg;
		setSize(new Dimension(lectureimg.getWidth(null), lectureimg.getHeight(null)));
		setPreferredSize(new Dimension(lectureimg.getWidth(null), lectureimg.getHeight(null)));
		setLayout(null);
		setSize(650, 655);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(lectureimg, 0, 0, null);
	}
}

class N_PartTime extends JFrame {
	Container contentPane;
	subImagePanel 알바선택 = new subImagePanel(new ImageIcon("./image/career4.png").getImage());
	subImagePanel theater = new subImagePanel(new ImageIcon("./image/theater.jpg").getImage());
	subImagePanel pizza = new subImagePanel(new ImageIcon("./image/pizza.jpg").getImage());
	subImagePanel bakery = new subImagePanel(new ImageIcon("./image/bakery.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	
	Font bonusfont = new Font("HY견고딕", Font.BOLD, 10);
	Font 설명폰트 = new Font("휴먼둥근헤드라인", Font.PLAIN, 20);
	Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
	Font 활동선택버튼폰트 = new Font("HY견고딕", Font.BOLD, 15);
	Font 활동선택폰트 = new Font("HY견고딕", Font.PLAIN, 12);
	Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
	
	JButton 활동선택버튼 = new JButton("활동선택");
	JButton 일과끝내기 = new JButton("일과 종료");
	JButton button1 = new JButton("제과점");
	JButton button2 = new JButton("영화관");
	JButton button3 = new JButton("피자");
	JButton button4 = new JButton("뒤로가기");

	JLabel 체력확인레이블 = new JLabel("" + init.Power);
	JLabel pdetailL = new JLabel("[얻을 수 있는 능력치: 돈 + 40000]");
	JLabel bonus = new JLabel("보너스를 받을 수 있을지도?");
	JLabel pdetail = new JLabel();
	
	JLabel 설명 = new JLabel("알바 면접을 합격한 곳은 제과점, 영화관, 패스트푸드점");
	JLabel 설명1 = new JLabel("단 3곳이야");
	JLabel 설명2 = new JLabel("어떤 직종의 알바를 해볼까?");
	
	JButton 영화관알바 = new JButton("알바하기");
	JButton 제과점알바 = new JButton("알바하기");
	JButton 패스트푸드알바 = new JButton("알바하기");
	JLabel 내용 = new JLabel();
	JLabel 내용1 = new JLabel();
	JLabel 내용2 = new JLabel();
	JLabel 내용3 = new JLabel();
	JLabel 내용4 = new JLabel();
	JLabel 내용5 = new JLabel();
	JLabel 내용6 = new JLabel();
	

	N_PartTime(JLabel Lb1, JLabel Lb2) {
		setTitle("알바가기");
		contentPane = getContentPane();
		setLayout(null);

		pdetail.setText("[요구 능력치: 체력 50]");

		pdetail.setFont(활동선택폰트);
		pdetail.setBounds(371, 143, 200, 30);
		pdetailL.setFont(활동선택폰트);
		pdetailL.setBounds(371, 163, 200, 30);
		bonus.setFont(bonusfont);
		bonus.setBounds(403, 183, 200, 30);
		
		설명.setFont(설명폰트);
		설명1.setFont(설명폰트);
		설명2.setFont(설명폰트);
		
		알바선택.setLayout(null);
		알바선택.setBounds(0, 100, 640, 290);
		설명.setBounds(57, 125, 640, 640);
		설명1.setBounds(260, 155, 640, 640);
		설명2.setBounds(180, 185, 640, 640);
		
		영화관알바.setBounds(120, 380, 90, 25);
		패스트푸드알바.setBounds(260, 380, 90, 25);
		제과점알바.setBounds(430, 380, 90, 25);
		영화관알바.setBorderPainted(false);
		영화관알바.setFocusPainted(false);
		패스트푸드알바.setBorderPainted(false);
		패스트푸드알바.setFocusPainted(false);
		제과점알바.setBorderPainted(false);
		제과점알바.setFocusPainted(false);
		영화관알바.setBackground(Color.WHITE);
		패스트푸드알바.setBackground(Color.WHITE);
		제과점알바.setBackground(Color.WHITE);
		
		contentPane.add(설명);
		contentPane.add(설명1);
		contentPane.add(설명2);
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(영화관알바);
		contentPane.add(패스트푸드알바);
		contentPane.add(제과점알바);
		contentPane.add(알바선택);
		
		contentPane.setBounds(0, 290, 640, 349);
		contentPane.setBackground(Color.WHITE);
		
		영화관알바.addActionListener(event -> {

			theater.setVisible(true);
			theater.setLayout(null);
			theater.setBounds(0, 70, 640, 640);
			contentPane.add(theater);
			알바선택.setVisible(false);
			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);

		});

		패스트푸드알바.addActionListener(event -> {

			contentPane.add(활동선택버튼);
			활동선택버튼.setBounds(0, 73, 130, 30);
			활동선택버튼.setBackground(new Color(225, 80, 80));
			활동선택버튼.setFont(btnfont);
			활동선택버튼.setBorderPainted(false);
			활동선택버튼.setFocusPainted(false);
			활동선택버튼.setVisible(true);
			contentPane.add(일과끝내기);
			일과끝내기.setFont(btnfont);
			일과끝내기.setBackground(new Color(225, 80, 80));
			일과끝내기.setBounds(0, 110, 130, 30);
			일과끝내기.setBorderPainted(false);
			일과끝내기.setFocusPainted(false);
			일과끝내기.setVisible(true);
			Font 내용폰트 = new Font("HY견고딕", Font.PLAIN, 18);
			Font 내용6폰트 = new Font("HY견고딕", Font.BOLD, 12);
			내용.setText("피자 패스트푸드점에 출근했어. 오픈 전, 300개의 포장 박스를 접어야 해. ");
			내용.setBounds(10, 120, 640, 640);
			내용1.setText("정신없이 상자를 다 접고, 12:00 오픈 준비를 끝냈어.");
			내용1.setBounds(10, 140, 640, 640);

			내용2.setText(". . . 잠시후 주문이 밀려오기 시작했어!");
			내용2.setBounds(10, 160, 640, 640);
			내용3.setText("나는 주방에 주문 리스트들을 전달했어. 슬슬 지쳐올 때 쯤 교대시간이?!!");
			내용3.setBounds(10, 180, 640, 640);
			내용4.setText("마침내 교대정산을 마치고 가게를 나왔어!");
			내용4.setBounds(10, 200, 640, 640);
			내용5.setText(". . .[아르바이트가 끝났습니다.]");
			내용5.setBounds(360, 200, 640, 640);

			내용.setFont(내용폰트);
			내용1.setFont(내용폰트);
			내용2.setFont(내용폰트);
			내용3.setFont(내용폰트);
			내용4.setFont(내용폰트);
			내용5.setFont(내용6폰트);
			내용6.setFont(내용6폰트);

			pizza.setLayout(null);
			pizza.setBounds(0, 0, 640, 410);
			contentPane.add(내용);
			contentPane.add(내용1);
			contentPane.add(내용2);
			contentPane.add(내용3);
			contentPane.add(내용4);
			contentPane.add(내용5);
			contentPane.add(내용6);
			내용.setVisible(true);
			내용1.setVisible(true);
			내용2.setVisible(true);
			내용3.setVisible(true);
			내용4.setVisible(true);
			내용5.setVisible(true);
			pizza.setVisible(true);
			powers.setVisible(true);
			powers.setBounds(550, 510, 190, 80);
			체력확인레이블.setText("" + init.Power);
			체력확인레이블.setBounds(570, 525, 100, 30);
			체력확인레이블.setFont(btnfont);
			powers.add(체력확인레이블);

			contentPane.add(체력확인레이블);
			contentPane.add(powers);
			
			체력확인레이블.setVisible(true);
			contentPane.setBounds(0, 410, 640, 140);
			contentPane.add(pizza);
			알바선택.setVisible(false);
	
			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);

			pizza.setVisible(true);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		제과점알바.addActionListener(event -> {

			bakery.setVisible(true);
			bakery.setLayout(null);
			bakery.setBounds(0, 90, 640, 640);
			contentPane.add(bakery);
			알바선택.setVisible(false);
			패스트푸드알바.setVisible(false);
			영화관알바.setVisible(false);
			제과점알바.setVisible(false);

		});

		활동선택버튼.addActionListener(event -> {

			JOptionPane.showMessageDialog(null, "활동 선택으로 이동합니다", "이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			dispose();
			
		});

		일과끝내기.addActionListener(event -> {
			
			
		});
		/*
		 * JLabel PtLb1 = new JLabel(); PtLb1.setText("어느 직종의 알바를 가시겠습니까?");
		 * PtLb1.setBounds(270, 140, 600, 20);
		 * 
		 * Font label4font = new Font("monospaced", Font.BOLD, 30);
		 * PtLb1.setFont(label4font);
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
		 * lectureImagePanel Panel = new lectureImagePanel(new
		 * ImageIcon("./image/lecture.jpg").getImage()); Panel.setLayout(null);
		 * Panel.add(PtLb1); Panel.add(button1); Panel.add(button2); Panel.add(button3);
		 * Panel.add(button4);
		 * 
		 * contentPane.add(Panel);
		 * 
		 * button1.addActionListener(event -> { init.N_money_up(); Lb1.setText("종강까지 D-"
		 * + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " +
		 * init.Today + "요일"); Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli +
		 * " 돈 " + init.Money + " 친화력 " + init.Friend); dispose(); });
		 * button2.addActionListener(event -> { init.N_money_up(); Lb1.setText("종강까지 D-"
		 * + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " +
		 * init.Today + "요일"); Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli +
		 * " 돈 " + init.Money + " 친화력 " + init.Friend); dispose(); });
		 * button3.addActionListener(event -> { init.N_money_up(); Lb1.setText("종강까지 D-"
		 * + init.DdayNumber + " 2020년  " + init.Month + "월  " + init.Day + "일  " +
		 * init.Today + "요일"); Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli +
		 * " 돈 " + init.Money + " 친화력 " + init.Friend); dispose(); });
		 * 
		 * button4.addActionListener(event -> { JOptionPane.showMessageDialog(null,
		 * "뒤로 이동합니다", "뒤로 이동", JOptionPane.INFORMATION_MESSAGE); // 메시지 dispose(); });
		 */

		setSize(650, 655);
		setVisible(true);
	}

}
