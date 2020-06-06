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

class H_Study extends JFrame {
   Container contentPane;
   JPanel SelectPanel = new JPanel();
   
   subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
   subImagePanel OSPanel = new subImagePanel(new ImageIcon("./image/OS_1.png").getImage());
   subImagePanel DBPanel = new subImagePanel(new ImageIcon("./image/DB_1.png").getImage());
   subImagePanel IPPanel = new subImagePanel(new ImageIcon("./image/IP_1.png").getImage());
   subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
   subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
   subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
   subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());// 이미지 패널 객체 생성
   subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());   
   subImagePanel H_Selectpanel = new subImagePanel(new ImageIcon("./image/H_select_home.png").getImage());
   
   Font f1 = new Font("휴먼둥근헤드라인", Font.PLAIN, 30);
   Font f2 = new Font("HY견고딕", Font.BOLD, 15);
   Font f3 = new Font("HY견고딕", Font.PLAIN, 12);
   Font powerfont = new Font("HY헤드라인M", Font.BOLD, 15);
   Font btnfont = new Font("HY헤드라인M", Font.BOLD, 15);
   Font f4 = new Font("HY견고딕", Font.PLAIN, 23);
   Font f5 = new Font("HY견고딕", Font.BOLD, 18);
   
   JButton SelectBtn = new JButton("홈 이동");
//   JButton EndBtn = new JButton("일과 종료");
   ImageIcon OS = new ImageIcon("./image/OS.png");
   JButton button1 = new JButton(OS);
   ImageIcon DB = new ImageIcon("./image/DB.png");
   JButton button2 = new JButton(DB);
   ImageIcon IP = new ImageIcon("./image/IP.png");
   JButton button3 = new JButton(IP);

   JLabel OSLb = new JLabel("오픈소스소프트웨어");
   JLabel DBLb = new JLabel("데이터베이스");
   JLabel IPLb = new JLabel("정보보호");

   JButton H_lecturebtn = new JButton("이동");
   JButton H_partbtn = new JButton("이동");
   JButton H_restbtn = new JButton("이동");
   JButton H_studybtn = new JButton("이동");
   JButton H_fitnessbtn = new JButton("이동");
   JButton H_MoveBtn = new JButton("활동하기");

   JLabel 체력확인레이블 = new JLabel();
   JLabel 지식확인레이블 = new JLabel();
   JLabel 돈확인레이블 = new JLabel();
   JLabel 친구확인레이블 = new JLabel();

   JLabel 설명 = new JLabel("어떤 과목의 공부를 해볼까?");

   JLabel 내용 = new JLabel();
   JLabel 내용1 = new JLabel();
   JLabel 내용2 = new JLabel();

   H_Study(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
      setTitle("공부하기");
      contentPane = getContentPane();
      setLayout(null);
      setSize(655, 655);
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
      setVisible(true);
      button1.addActionListener(event -> {
         init.H_Study();

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

         dates.setLayout(null);
         dates.setBounds(275, 559, 100, 100);
         DL.setText("D- " + init.DdayNumber);
         DL.setBounds(12, 16, 150, 50);
         DL.setFont(powerfont);
         dates.add(DL);
         dates.setVisible(true);
         contentPane.add(dates);
         
         SelectBtn.setBounds(0, 30, 130, 30);
         SelectBtn.setBackground(new Color(225, 80, 80));
         SelectBtn.setFont(btnfont);
         SelectBtn.setBorderPainted(false);
         SelectBtn.setFocusPainted(false);
         contentPane.add(SelectBtn);


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
         init.H_Study();

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

         dates.setLayout(null);
         dates.setBounds(275, 559, 100, 100);
         DL.setText("D- " + init.DdayNumber);
         DL.setBounds(12, 16, 150, 50);
         DL.setFont(powerfont);
         dates.add(DL);
         dates.setVisible(true);
         contentPane.add(dates);
         
         SelectBtn.setBounds(0, 30, 130, 30);
         SelectBtn.setBackground(new Color(225, 80, 80));
         SelectBtn.setFont(btnfont);
         SelectBtn.setBorderPainted(false);
         SelectBtn.setFocusPainted(false);
         contentPane.add(SelectBtn);



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
         init.H_Study();

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

         dates.setLayout(null);
         dates.setBounds(275, 559, 100, 100);
         DL.setText("D- " + init.DdayNumber);
         DL.setBounds(12, 16, 150, 50);
         DL.setFont(powerfont);
         dates.add(DL);
         dates.setVisible(true);
         contentPane.add(dates);
         
         SelectBtn.setBounds(0, 30, 130, 30);
         SelectBtn.setBackground(new Color(225, 80, 80));
         SelectBtn.setFont(btnfont);
         SelectBtn.setBorderPainted(false);
         SelectBtn.setFocusPainted(false);
         contentPane.add(SelectBtn);

   
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
         JOptionPane.showMessageDialog(null, "홈 화면으로 이동합니다.", "홈 화면으로 이동", JOptionPane.INFORMATION_MESSAGE);
         new H_Home(PL, IL, ML, FL, DL);

         SelectBtn.setVisible(false);
//         EndBtn.setVisible(false);

         JLabel dateLb = new JLabel();
         dateLb.setText("Today 2020 " + init.Month + "월" + init.Day + "일  " + init.Today + "요일");
         Font datefont = new Font("HY견고딕", Font.PLAIN, 23);
         dateLb.setFont(datefont);
         dateLb.setBounds(310, 10, 600, 40);
         dateLb.setVisible(true);
         HomePanel.add(dateLb);

         H_MoveBtn.setFont(f1);
         H_MoveBtn.setBackground(Color.WHITE);
         H_MoveBtn.setBounds(0, 410, 250, 45);
         H_MoveBtn.setBorderPainted(false);
         H_MoveBtn.setFocusPainted(false);
         HomePanel.add(H_MoveBtn);

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

         내용.setVisible(false);
         내용1.setVisible(false);
         내용2.setVisible(false);
      

      SelectPanel.setVisible(false);
         OSPanel.setVisible(false);
         DBPanel.setVisible(false);
         IPPanel.setVisible(false);

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

      

      H_MoveBtn.addActionListener(event -> {

         H_lecturebtn.setBounds(220, 175, 80, 30);
         H_lecturebtn.setBackground(new Color(148, 233, 86));
         H_lecturebtn.setFont(f5);
         H_lecturebtn.setFocusPainted(false);
         H_lecturebtn.setBorderPainted(false);
         H_lecturebtn.setVisible(true);
         H_Selectpanel.add(H_lecturebtn);

         H_partbtn.setBounds(440, 175, 80, 30);
         H_partbtn.setBackground(new Color(246, 233, 92));
         H_partbtn.setFont(f5);
         H_partbtn.setFocusPainted(false);
         H_partbtn.setBorderPainted(false);
         H_partbtn.setVisible(true);
         H_Selectpanel.add(H_partbtn);
         
         H_restbtn.setBounds(130, 400, 80, 30);
         H_restbtn.setBackground(new Color(90, 204, 240));
         H_restbtn.setFont(f5);
         H_restbtn.setFocusPainted(false);
         H_restbtn.setBorderPainted(false);
         H_restbtn.setVisible(true);
         H_Selectpanel.add(H_restbtn);

         H_studybtn.setBounds(320, 425, 80, 30);
         H_studybtn.setBackground(new Color(208, 100, 238));
         H_studybtn.setFont(f5);
         H_studybtn.setFocusPainted(false);
         H_studybtn.setBorderPainted(false);
         H_studybtn.setVisible(true);
         H_Selectpanel.add(H_studybtn);

         H_fitnessbtn.setBounds(510, 386, 80, 30);
         H_fitnessbtn.setBackground(new Color(239, 89, 179));
         H_fitnessbtn.setFont(f5);
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
         내용.setVisible(false);
         내용1.setVisible(false);
         내용2.setVisible(false);
         H_Selectpanel.setVisible(true);

         H_Selectpanel.setLayout(null);
         H_Selectpanel.setBounds(0, 100, 650, 500);
         contentPane.add(H_Selectpanel);
         contentPane.setLayout(null);
         contentPane.setBounds(0, 550, 650, 100);
         contentPane.setVisible(true);
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


      
      
   }

}