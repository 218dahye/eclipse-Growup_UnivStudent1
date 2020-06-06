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

   JButton �뷡�� = new JButton("�̵�");
   JButton ��ȭ�� = new JButton("�̵�");
   JButton ���̰��� = new JButton("�̵�");

   JButton lecturebtn = new JButton("�̵�");
   JButton partbtn = new JButton("�̵�");
   JButton restbtn = new JButton("�̵�");
   JButton studybtn = new JButton("�̵�");
   JButton fitnessbtn = new JButton("�̵�");
   JButton N_MoveBtn = new JButton("Ȱ���ϱ�");

   JLabel ü��Ȯ�η��̺� = new JLabel();
   JLabel ����Ȯ�η��̺� = new JLabel();
   JLabel ��Ȯ�η��̺� = new JLabel();
   JLabel ģ��Ȯ�η��̺� = new JLabel();

   JButton SelectBtn = new JButton("Ȩ �̵�");
//   JButton EndBtn = new JButton("�ϰ� ����");

   Font btnfont = new Font("HY������M", Font.BOLD, 15);
   Font powerfont = new Font("HY������M", Font.BOLD, 15);
   Font f1 = new Font("�޸յձ�������", Font.PLAIN, 22);
   Font f3 = new Font("HY�߰��", Font.BOLD, 18);

   N_Rest(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
      setTitle("�޽��ϱ�");
      contentPane = getContentPane();
      setLayout(null);
      setSize(655, 655);
      Font restfont = new Font("�޸յձ�������", Font.PLAIN, 11);

      Restpanel.setVisible(true);
      Restpanel.setBounds(1, 110, 650, 470);

      �뷡��.setBounds(553, 140, 57, 30);
      �뷡��.setBackground(new Color(127,127,127));
      �뷡��.setFont(restfont);
      �뷡��.setBorderPainted(false);
      �뷡��.setFocusPainted(false);
      �뷡��.setVisible(true);
      Restpanel.add(�뷡��);

      ��ȭ��.setBounds(423, 260, 57, 30);
      ��ȭ��.setBackground(new Color(127,127,127));
      ��ȭ��.setFont(restfont);
      ��ȭ��.setBorderPainted(false);
      ��ȭ��.setFocusPainted(false);
      ��ȭ��.setVisible(true);
      Restpanel.add(��ȭ��);

      ���̰���.setBounds(553, 378, 57, 30);
      ���̰���.setBackground(new Color(127,127,127));
      ���̰���.setFont(restfont);
      ���̰���.setBorderPainted(false);
      ���̰���.setFocusPainted(false);
      ���̰���.setVisible(true);
      Restpanel.add(���̰���);

      contentPane.setBounds(0, 0, 655, 110);
      ü��Ȯ�η��̺�.setText("" + init.Power);
      ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
      ü��Ȯ�η��̺�.setFont(btnfont);
      powers.add(ü��Ȯ�η��̺�);
      powers.setBounds(359, 10, 190, 80);
      contentPane.add(powers);

      ����Ȯ�η��̺�.setText("" + init.Intelli);
      ����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
      ����Ȯ�η��̺�.setFont(btnfont);
      intellis.add(����Ȯ�η��̺�);
      intellis.setBounds(430, 10, 190, 80);
      contentPane.add(intellis);

      ��Ȯ�η��̺�.setText("" + init.Money);
      ��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
      ��Ȯ�η��̺�.setFont(btnfont);
      moneys.add(��Ȯ�η��̺�);
      moneys.setBounds(490, 10, 190, 80);
      contentPane.add(moneys);

      ģ��Ȯ�η��̺�.setText("" + init.Friend);
      ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
      ģ��Ȯ�η��̺�.setFont(btnfont);
      friends.add(ģ��Ȯ�η��̺�);
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

/*      EndBtn.setBounds(0, 70, 130, 30);
      EndBtn.setBackground(new Color(225, 80, 80));
      EndBtn.setFont(btnfont);
      EndBtn.setBorderPainted(false);
      EndBtn.setFocusPainted(false);
      contentPane.add(EndBtn);*/

      contentPane.add(Restpanel);
      contentPane.setBackground(Color.WHITE);
      contentPane.setVisible(true);
      setSize(655, 655);
      setVisible(true);

      �뷡��.addActionListener(event -> {

         contentPane.setBounds(0, 0, 655, 110);
         init.N_sing();
         init.N_rest();
         ü��Ȯ�η��̺�.setText("" + init.Power);
         ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
         ü��Ȯ�η��̺�.setFont(btnfont);
         powers.add(ü��Ȯ�η��̺�);
         powers.setBounds(359, 10, 190, 80);
         contentPane.add(powers);

         ����Ȯ�η��̺�.setText("" + init.Intelli);
         ����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
         ����Ȯ�η��̺�.setFont(btnfont);
         intellis.add(����Ȯ�η��̺�);
         intellis.setBounds(430, 10, 190, 80);
         contentPane.add(intellis);

         ��Ȯ�η��̺�.setText("" + init.Money);
         ��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
         ��Ȯ�η��̺�.setFont(btnfont);
         moneys.add(��Ȯ�η��̺�);
         moneys.setBounds(490, 10, 190, 80);
         contentPane.add(moneys);

         ģ��Ȯ�η��̺�.setText("" + init.Friend);
         ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
         ģ��Ȯ�η��̺�.setFont(btnfont);
         friends.add(ģ��Ȯ�η��̺�);
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
         �뷡��.setVisible(false);
         ��ȭ��.setVisible(false);
         ���̰���.setVisible(false);

         SelectBtn.setBounds(0, 30, 130, 30);
         SelectBtn.setBackground(new Color(225, 80, 80));
         SelectBtn.setFont(btnfont);
         SelectBtn.setBorderPainted(false);
         SelectBtn.setFocusPainted(false);
         contentPane.add(SelectBtn);

   /*      EndBtn.setBounds(0, 70, 130, 30);
         EndBtn.setBackground(new Color(225, 80, 80));
         EndBtn.setFont(btnfont);
         EndBtn.setBorderPainted(false);
         EndBtn.setFocusPainted(false);
         contentPane.add(EndBtn);*/

         contentPane.add(singpanel);
         contentPane.setBounds(0, 428, 665, 227);
         contentPane.setBackground(Color.WHITE);
         contentPane.setVisible(true);
         JOptionPane.showMessageDialog(null, "���� 1�б��� �߹����� �ҷ���!", "�뷡��", JOptionPane.INFORMATION_MESSAGE);

//         dispose();
      });

      ��ȭ��.addActionListener(event -> {

         init.N_cinema();
         contentPane.setBounds(0, 0, 655, 110);
         init.N_rest();

         ü��Ȯ�η��̺�.setText("" + init.Power);
         ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
         ü��Ȯ�η��̺�.setFont(btnfont);
         powers.add(ü��Ȯ�η��̺�);
         powers.setBounds(359, 10, 190, 80);
         contentPane.add(powers);

         ����Ȯ�η��̺�.setText("" + init.Intelli);
         ����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
         ����Ȯ�η��̺�.setFont(btnfont);
         intellis.add(����Ȯ�η��̺�);
         intellis.setBounds(430, 10, 190, 80);
         contentPane.add(intellis);

         ��Ȯ�η��̺�.setText("" + init.Money);
         ��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
         ��Ȯ�η��̺�.setFont(btnfont);
         moneys.add(��Ȯ�η��̺�);
         moneys.setBounds(490, 10, 190, 80);
         contentPane.add(moneys);

         ģ��Ȯ�η��̺�.setText("" + init.Friend);
         ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
         ģ��Ȯ�η��̺�.setFont(btnfont);
         friends.add(ģ��Ȯ�η��̺�);
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
         �뷡��.setVisible(false);
         ��ȭ��.setVisible(false);
         ���̰���.setVisible(false);

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
         JOptionPane.showMessageDialog(null, "����ī,�ܵ� ��,�ϸ����� ��ī��, �� ����� ������ �״� �� ����", "��ȭ��",
               JOptionPane.INFORMATION_MESSAGE);

         // dispose();
      });

      ���̰���.addActionListener(event -> {
         init.N_park();

         contentPane.setBounds(0, 0, 655, 110);
         init.N_rest();
         ü��Ȯ�η��̺�.setText("" + init.Power);
         ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
         ü��Ȯ�η��̺�.setFont(btnfont);
         powers.add(ü��Ȯ�η��̺�);
         powers.setBounds(359, 10, 190, 80);
         contentPane.add(powers);

         ����Ȯ�η��̺�.setText("" + init.Intelli);
         ����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
         ����Ȯ�η��̺�.setFont(btnfont);
         intellis.add(����Ȯ�η��̺�);
         intellis.setBounds(430, 10, 190, 80);
         contentPane.add(intellis);

         ��Ȯ�η��̺�.setText("" + init.Money);
         ��Ȯ�η��̺�.setBounds(15, 13, 100, 50);
         ��Ȯ�η��̺�.setFont(btnfont);
         moneys.add(��Ȯ�η��̺�);
         moneys.setBounds(490, 10, 190, 80);
         contentPane.add(moneys);

         ģ��Ȯ�η��̺�.setText("" + init.Friend);
         ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
         ģ��Ȯ�η��̺�.setFont(btnfont);
         friends.add(ģ��Ȯ�η��̺�);
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
         �뷡��.setVisible(false);
         ��ȭ��.setVisible(false);
         ���̰���.setVisible(false);

         SelectBtn.setBounds(0, 30, 130, 30);
         SelectBtn.setBackground(new Color(225, 80, 80));
         SelectBtn.setFont(btnfont);
         SelectBtn.setBorderPainted(false);
         SelectBtn.setFocusPainted(false);
         contentPane.add(SelectBtn);

/*         EndBtn.setBounds(0, 70, 130, 30);
         EndBtn.setBackground(new Color(225, 80, 80));
         EndBtn.setFont(btnfont);
         EndBtn.setBorderPainted(false);
         EndBtn.setFocusPainted(false);
         contentPane.add(EndBtn);*/

         contentPane.add(parkpanel);
         contentPane.setBounds(0, 428, 665, 227);
         contentPane.setBackground(Color.WHITE);

         JOptionPane.showMessageDialog(null, "�Ҳɳ��� �۷��̵尡 ���� ������", "���̰���", JOptionPane.INFORMATION_MESSAGE);

         // dispose();
      });

      SelectBtn.addActionListener(event -> {
         JOptionPane.showMessageDialog(null, "Ȩ ȭ������ �̵��մϴ�.", "Ȩ ȭ������ �̵�", JOptionPane.INFORMATION_MESSAGE);
         new N_Home(PL, IL, ML, FL, DL);

         SelectBtn.setVisible(false);
//         EndBtn.setVisible(false);

         JLabel dateLb = new JLabel();
         dateLb.setText("Today 2020 " + init.Month + "��" + init.Day + "��  " + init.Today + "����");
         Font datefont = new Font("HY�߰��", Font.PLAIN, 23);
         dateLb.setFont(datefont);
         dateLb.setBounds(310, 10, 600, 40);
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