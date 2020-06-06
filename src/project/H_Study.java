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
   subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());// �̹��� �г� ��ü ����
   subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());   
   subImagePanel H_Selectpanel = new subImagePanel(new ImageIcon("./image/H_select_home.png").getImage());
   
   Font f1 = new Font("�޸յձ�������", Font.PLAIN, 30);
   Font f2 = new Font("HY�߰��", Font.BOLD, 15);
   Font f3 = new Font("HY�߰��", Font.PLAIN, 12);
   Font powerfont = new Font("HY������M", Font.BOLD, 15);
   Font btnfont = new Font("HY������M", Font.BOLD, 15);
   Font f4 = new Font("HY�߰��", Font.PLAIN, 23);
   Font f5 = new Font("HY�߰��", Font.BOLD, 18);
   
   JButton SelectBtn = new JButton("Ȩ �̵�");
//   JButton EndBtn = new JButton("�ϰ� ����");
   ImageIcon OS = new ImageIcon("./image/OS.png");
   JButton button1 = new JButton(OS);
   ImageIcon DB = new ImageIcon("./image/DB.png");
   JButton button2 = new JButton(DB);
   ImageIcon IP = new ImageIcon("./image/IP.png");
   JButton button3 = new JButton(IP);

   JLabel OSLb = new JLabel("���¼ҽ�����Ʈ����");
   JLabel DBLb = new JLabel("�����ͺ��̽�");
   JLabel IPLb = new JLabel("������ȣ");

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

   JLabel ���� = new JLabel("� ������ ���θ� �غ���?");

   JLabel ���� = new JLabel();
   JLabel ����1 = new JLabel();
   JLabel ����2 = new JLabel();

   H_Study(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
      setTitle("�����ϱ�");
      contentPane = getContentPane();
      setLayout(null);
      setSize(655, 655);
      SelectPanel.setLayout(null);
      SelectPanel.setBounds(0, 0, 670, 670);

      ����.setBounds(130, 170, 670, 670);
      ����.setFont(f1);

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

      SelectPanel.add(����);
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

         ü��Ȯ�η��̺�.setText("" + init.Power);
         ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
         ü��Ȯ�η��̺�.setFont(btnfont);
         powers.add(ü��Ȯ�η��̺�);
         powers.setBounds(359, 559, 190, 80);
         contentPane.add(powers);

         ����Ȯ�η��̺�.setText("" + init.Intelli);
         ����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
         ����Ȯ�η��̺�.setFont(btnfont);
         intellis.add(����Ȯ�η��̺�);
         intellis.setBounds(430, 559, 190, 80);
         contentPane.add(intellis);

         ��Ȯ�η��̺�.setText("" + init.Money);
         ��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
         ��Ȯ�η��̺�.setFont(btnfont);
         moneys.add(��Ȯ�η��̺�);
         moneys.setBounds(490, 559, 190, 80);
         contentPane.add(moneys);

         ģ��Ȯ�η��̺�.setText("" + init.Friend);
         ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
         ģ��Ȯ�η��̺�.setFont(btnfont);
         friends.add(ģ��Ȯ�η��̺�);
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


         ����.setText("���¼ҽ�����Ʈ���� ���θ� �ؾ���! ");
         ����.setBounds(10, 150, 640, 640);

         ����1.setText("������~");
         ����1.setBounds(10, 190, 640, 640);

         ����2.setText("[�����ϱⰡ �������ϴ�.]");
         ����2.setBounds(10, 230, 640, 640);

         ����.setFont(f4);
         ����1.setFont(f4);
         ����2.setFont(f4);

         contentPane.add(����);
         contentPane.add(����1);
         contentPane.add(����2);

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

         ü��Ȯ�η��̺�.setText("" + init.Power);
         ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
         ü��Ȯ�η��̺�.setFont(btnfont);
         powers.add(ü��Ȯ�η��̺�);
         powers.setBounds(359, 559, 190, 80);
         contentPane.add(powers);

         ����Ȯ�η��̺�.setText("" + init.Intelli);
         ����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
         ����Ȯ�η��̺�.setFont(btnfont);
         intellis.add(����Ȯ�η��̺�);
         intellis.setBounds(430, 559, 190, 80);
         contentPane.add(intellis);

         ��Ȯ�η��̺�.setText("" + init.Money);
         ��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
         ��Ȯ�η��̺�.setFont(btnfont);
         moneys.add(��Ȯ�η��̺�);
         moneys.setBounds(490, 559, 190, 80);
         contentPane.add(moneys);

         ģ��Ȯ�η��̺�.setText("" + init.Friend);
         ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
         ģ��Ȯ�η��̺�.setFont(btnfont);
         friends.add(ģ��Ȯ�η��̺�);
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



         ����.setText("�����ͺ��̽� ���θ� �ؾ���! ");
         ����.setBounds(10, 130, 640, 640);

         ����1.setText("������~");
         ����1.setBounds(10, 170, 640, 640);

         ����2.setText("[�����ϱⰡ �������ϴ�.]");
         ����2.setBounds(10, 210, 640, 640);

         ����.setFont(f4);
         ����1.setFont(f4);
         ����2.setFont(f4);

         contentPane.add(����);
         contentPane.add(����1);
         contentPane.add(����2);

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

         ü��Ȯ�η��̺�.setText("" + init.Power);
         ü��Ȯ�η��̺�.setBounds(15, 5, 50, 50);
         ü��Ȯ�η��̺�.setFont(btnfont);
         powers.add(ü��Ȯ�η��̺�);
         powers.setBounds(359, 559, 190, 80);
         contentPane.add(powers);

         ����Ȯ�η��̺�.setText("" + init.Intelli);
         ����Ȯ�η��̺�.setBounds(18, 5, 50, 50);
         ����Ȯ�η��̺�.setFont(btnfont);
         intellis.add(����Ȯ�η��̺�);
         intellis.setBounds(430, 559, 190, 80);
         contentPane.add(intellis);

         ��Ȯ�η��̺�.setText("" + init.Money);
         ��Ȯ�η��̺�.setBounds(5, 13, 100, 50);
         ��Ȯ�η��̺�.setFont(btnfont);
         moneys.add(��Ȯ�η��̺�);
         moneys.setBounds(490, 559, 190, 80);
         contentPane.add(moneys);

         ģ��Ȯ�η��̺�.setText("" + init.Friend);
         ģ��Ȯ�η��̺�.setBounds(25, 5, 150, 50);
         ģ��Ȯ�η��̺�.setFont(btnfont);
         friends.add(ģ��Ȯ�η��̺�);
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

   
         ����.setText("������ȣ ���θ� �ؾ���! ");
         ����.setBounds(10, 130, 640, 640);

         ����1.setText("������~");
         ����1.setBounds(10, 170, 640, 640);

         ����2.setText("[�����ϱⰡ �������ϴ�.]");
         ����2.setBounds(10, 210, 640, 640);

         ����.setFont(f4);
         ����1.setFont(f4);
         ����2.setFont(f4);

         contentPane.add(����);
         contentPane.add(����1);
         contentPane.add(����2);

         IPPanel.setLayout(null);
         IPPanel.setBounds(200, 10, 670, 670);
         contentPane.add(IPPanel);
         IPPanel.setVisible(true);
         SelectPanel.setVisible(false);
         contentPane.setBackground(Color.WHITE);
         contentPane.setVisible(true);
      });
      SelectBtn.addActionListener(event -> {
         JOptionPane.showMessageDialog(null, "Ȩ ȭ������ �̵��մϴ�.", "Ȩ ȭ������ �̵�", JOptionPane.INFORMATION_MESSAGE);
         new H_Home(PL, IL, ML, FL, DL);

         SelectBtn.setVisible(false);
//         EndBtn.setVisible(false);

         JLabel dateLb = new JLabel();
         dateLb.setText("Today 2020 " + init.Month + "��" + init.Day + "��  " + init.Today + "����");
         Font datefont = new Font("HY�߰��", Font.PLAIN, 23);
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

         ����.setVisible(false);
         ����1.setVisible(false);
         ����2.setVisible(false);
      

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
         ����.setVisible(false);
         ����1.setVisible(false);
         ����2.setVisible(false);
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