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

class H_Rest extends JFrame {
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
   subImagePanel H_Selectpanel = new subImagePanel(new ImageIcon("./image/H_select_home.png").getImage());

   JButton �뷡�� = new JButton("�̵�");
   JButton ��ȭ�� = new JButton("�̵�");
   JButton ���̰��� = new JButton("�̵�");

   JButton H_lecturebtn = new JButton("�̵�");
   JButton H_partbtn = new JButton("�̵�");
   JButton H_restbtn = new JButton("�̵�");
   JButton H_studybtn = new JButton("�̵�");
   JButton H_fitnessbtn = new JButton("�̵�");
   JButton H_MoveBtn = new JButton("Ȱ���ϱ�");

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

   H_Rest(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
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


      contentPane.add(Restpanel);
      contentPane.setBackground(Color.WHITE);
      contentPane.setVisible(true);
      setSize(655, 655);
      setVisible(true);

      �뷡��.addActionListener(event -> {

         contentPane.setBounds(0, 0, 655, 110);
         init.H_sing();
         init.H_rest();
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

   

         contentPane.add(singpanel);
         contentPane.setBounds(0, 428, 665, 227);
         contentPane.setBackground(Color.WHITE);
         contentPane.setVisible(true);
         JOptionPane.showMessageDialog(null, "���� 1�б��� �߹����� �ҷ���!", "�뷡��", JOptionPane.INFORMATION_MESSAGE);

//         dispose();
      });

      ��ȭ��.addActionListener(event -> {

         init.H_cinema();
         contentPane.setBounds(0, 0, 655, 110);
         init.H_rest();

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
         init.H_park();

         contentPane.setBounds(0, 0, 655, 110);
         init.H_rest();
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



         contentPane.add(parkpanel);
         contentPane.setBounds(0, 428, 665, 227);
         contentPane.setBackground(Color.WHITE);

         JOptionPane.showMessageDialog(null, "�Ҳɳ��� �۷��̵尡 ���� ������", "���̰���", JOptionPane.INFORMATION_MESSAGE);

         // dispose();
      });

      SelectBtn.addActionListener(event -> {
         JOptionPane.showMessageDialog(null, "Ȩ ȭ������ �̵��մϴ�.", "Ȩ ȭ������ �̵�", JOptionPane.INFORMATION_MESSAGE);
         new H_Home(PL, IL, ML, FL, DL);

         SelectBtn.setVisible(false);
//         EndBtn.setVisible(false);

         JLabel dateLb = new JLabel();
         dateLb.setText("Today 2020�� " + init.Month + "��" + init.Day + "��  " );
         Font datefont = new Font("HY�߰��", Font.PLAIN, 23);
         dateLb.setFont(datefont);
         dateLb.setBounds(380, 10, 600, 40);
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

      H_MoveBtn.addActionListener(event -> {

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