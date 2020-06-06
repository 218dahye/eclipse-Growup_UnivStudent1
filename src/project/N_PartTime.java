package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class N_PartTime extends JFrame {
   Container contentPane;

   subImagePanel �˹ټ��� = new subImagePanel(new ImageIcon("./image/career4.png").getImage());
   subImagePanel theater = new subImagePanel(new ImageIcon("./image/theater.jpg").getImage());
   subImagePanel pizza = new subImagePanel(new ImageIcon("./image/pizza.jpg").getImage());
   subImagePanel bakery = new subImagePanel(new ImageIcon("./image/bakery.jpg").getImage());

   subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
   subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
   subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
   subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
   subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());

   subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
   subImagePanel N_Selectpanel = new subImagePanel(new ImageIcon("./image/N_select_home.png").getImage());

   JButton lecturebtn = new JButton("�̵�");
   JButton partbtn = new JButton("�̵�");
   JButton restbtn = new JButton("�̵�");
   JButton studybtn = new JButton("�̵�");

   JButton fitnessbtn = new JButton("�̵�");
   JButton N_MoveBtn = new JButton("Ȱ���ϱ�");

   Font bonusfont = new Font("HY�߰��", Font.BOLD, 10);
   Font ������Ʈ = new Font("�޸յձ�������", Font.PLAIN, 20);
   Font btnfont = new Font("HY������M", Font.BOLD, 15);
   Font Ȱ�����ù�ư��Ʈ = new Font("HY�߰��", Font.BOLD, 15);
   Font Ȱ��������Ʈ = new Font("HY�߰��", Font.PLAIN, 12);
   Font powerfont = new Font("HY������M", Font.BOLD, 15);
   Font f3 = new Font("HY�߰��", Font.BOLD, 18);
   Font ������Ʈ = new Font("HY�߰��", Font.PLAIN, 18);
   Font ����6��Ʈ = new Font("HY�߰��", Font.BOLD, 12);
   Font f1 = new Font("�޸յձ�������", Font.PLAIN, 22);

   JButton Ȱ�����ù�ư = new JButton("Ȱ������");
   JButton �ϰ������� = new JButton("�ϰ� ����");
   JButton ��ȭ���˹� = new JButton("��ȭ�� �˹� �̵�");
   JButton �������˹� = new JButton("������ �˹� �̵�");
   JButton �н�ƮǪ��˹� = new JButton("�н�ƮǪ�� �˹� �̵�");

   JButton SelectBtn = new JButton("Ȩ �̵�");
//   JButton EndBtn = new JButton("�ϰ� ����");

   JLabel ���� = new JLabel("�˹� ������ �հ��� ���� ������, ��ȭ��, �н�ƮǪ����");
   JLabel ����1 = new JLabel("�� 3���̾�");
   JLabel ����2 = new JLabel("� ������ �˹ٸ� �غ���?");

   JLabel ���� = new JLabel();
   JLabel ����1 = new JLabel();
   JLabel ����2 = new JLabel();
   JLabel ����3 = new JLabel();
   JLabel ����4 = new JLabel();
   JLabel ����5 = new JLabel();
   JLabel ����6 = new JLabel();

   N_PartTime(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
      setTitle("�˹ٰ���");
      contentPane = getContentPane();
      setLayout(null);
      setSize(655, 655);
      setVisible(true);

      �˹ټ���.setLayout(null);
      �˹ټ���.setBounds(0, 100, 655, 290);

      ����.setBounds(57, 125, 655, 640);
      ����.setFont(������Ʈ);

      ����1.setBounds(260, 155, 655, 640);
      ����1.setFont(������Ʈ);

      ����2.setBounds(180, 185, 655, 640);
      ����2.setFont(������Ʈ);

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

      ��ȭ���˹�.setBounds(75, 55, 150, 25);
      ��ȭ���˹�.setBorderPainted(false);
      ��ȭ���˹�.setFocusPainted(false);
      ��ȭ���˹�.setBackground(Color.WHITE);
      ��ȭ���˹�.setVisible(true);

      �н�ƮǪ��˹�.setBounds(250, 55, 150, 25);
      �н�ƮǪ��˹�.setBorderPainted(false);
      �н�ƮǪ��˹�.setFocusPainted(false);
      �н�ƮǪ��˹�.setBackground(Color.WHITE);
      �н�ƮǪ��˹�.setVisible(true);

      �������˹�.setBounds(420, 55, 150, 25);
      �������˹�.setBorderPainted(false);
      �������˹�.setFocusPainted(false);
      �������˹�.setBackground(Color.WHITE);
      �������˹�.setVisible(true);

      �������˹�.setFont(Ȱ��������Ʈ);
      ��ȭ���˹�.setFont(Ȱ��������Ʈ);
      �н�ƮǪ��˹�.setFont(Ȱ��������Ʈ);

      ��ȭ���˹�.setVisible(true);
      �н�ƮǪ��˹�.setVisible(true);
      �������˹�.setVisible(true);

      �˹ټ���.add(��ȭ���˹�);
      �˹ټ���.add(�н�ƮǪ��˹�);
      �˹ټ���.add(�������˹�);

      contentPane.setBounds(0, 290, 655, 349);
      contentPane.setBackground(Color.WHITE);
      contentPane.add(�˹ټ���);
      contentPane.add(����);
      contentPane.add(����1);
      contentPane.add(����2);

      contentPane.setVisible(true);

      ��ȭ���˹�.addActionListener(event -> {

         PL.setText("" + init.Power);
         IL.setText("" + init.Intelli);
         ML.setText("" + init.Money);
         FL.setText("" + init.Friend);
         DL.setText("D- " + init.DdayNumber);

         contentPane.setBackground(Color.WHITE);

         SelectBtn.setBounds(0, 30, 110, 30);
         SelectBtn.setBackground(new Color(93, 115, 145));
         SelectBtn.setFont(btnfont);
         SelectBtn.setBorderPainted(false);
         SelectBtn.setFocusPainted(false);
         theater.add(SelectBtn);

/*         EndBtn.setBounds(0, 70, 110, 30);
         EndBtn.setBackground(new Color(93, 115, 145));
         EndBtn.setFont(btnfont);
         EndBtn.setBorderPainted(false);
         EndBtn.setFocusPainted(false);
         theater.add(EndBtn);*/

         Font ������Ʈ = new Font("HY�߰��", Font.PLAIN, 18);
         Font ����6��Ʈ = new Font("HY�߰��", Font.BOLD, 12);

         ����.setText("��ȭ���� ����߾�. ���� ���� �������� ����ؾ���. ");
         ����.setBounds(10, 180, 655, 640);
         ����1.setText("�մԵ��� ������ ��, ��Ḧ ������ �Һ��ϰ� ����� ��Ų�� ä�� ��");
         ����1.setBounds(10, 200, 655, 640);
         ����2.setText("���ѷ� ���� ��踦 ���Ⱦ�. ����� �մԵ��� �������� �����߾�!");
         ����2.setBounds(10, 220, 655, 640);
         ����3.setText("�ֹ� ��� �� �ֹ� ���� ���ĵ��� �غ��ؾ��ؼ� ������ ������.");
         ����3.setBounds(10, 240, 655, 640);
         ����4.setText("�α� �ִ� ��ȭ�� ���۵Ǹ� ��� �� �� �־���! �̷��� �ݺ��� �ϴ� ��!!");
         ����4.setBounds(10, 260, 655, 640);
         ����5.setText("��ħ�� ���� �ð��� �Ծ�!! ���� �� ��ȭ������ ���Ծ�! ");
         ����5.setBounds(10, 280, 655, 640);
         ����6.setText("[. . .�˹ٰ� �������ϴ�.]");
         ����6.setBounds(470, 280, 655, 640);

         ����.setFont(������Ʈ);
         ����1.setFont(������Ʈ);
         ����2.setFont(������Ʈ);
         ����3.setFont(������Ʈ);
         ����4.setFont(������Ʈ);
         ����5.setFont(������Ʈ);
         ����6.setFont(����6��Ʈ);

         theater.setVisible(true);
         theater.setLayout(null);
         theater.setBounds(0, 0, 655, 420);

         contentPane.add(theater);
         contentPane.add(����);
         contentPane.add(����1);
         contentPane.add(����2);
         contentPane.add(����3);
         contentPane.add(����4);
         contentPane.add(����5);
         contentPane.add(����6);

         ����.setVisible(true);
         ����1.setVisible(true);
         ����2.setVisible(true);
         ����3.setVisible(true);
         ����4.setVisible(true);
         ����5.setVisible(true);

         init.N_money_up();

         powers.setLayout(null);
         powers.setBounds(25, 425, 100, 100);
         PL.setText("" + init.Power);
         PL.setBounds(15, 5, 50, 50);
         PL.setFont(powerfont);
         powers.add(PL);
         powers.setVisible(true);
         contentPane.add(powers);

         intellis.setLayout(null);
         intellis.setBounds(110, 425, 100, 100);
         IL.setText("" + init.Intelli);
         IL.setBounds(18, 5, 50, 50);
         IL.setFont(powerfont);
         intellis.add(IL);
         intellis.setVisible(true);
         contentPane.add(intellis);

         moneys.setLayout(null);
         moneys.setBounds(190, 420, 100, 100);
         ML.setText("" + init.Money);
         ML.setBounds(5, 13, 100, 50);
         ML.setFont(powerfont);
         moneys.add(ML);
         moneys.setVisible(true);
         contentPane.add(moneys);

         friends.setLayout(null);
         friends.setBounds(290, 430, 100, 100);
         FL.setText("" + init.Friend);
         FL.setBounds(25, 5, 150, 50);
         FL.setFont(powerfont);
         friends.add(FL);
         friends.setVisible(true);
         contentPane.add(friends);

         dates.setLayout(null);
         dates.setBounds(390, 420, 100, 100);
         DL.setText("D- " + init.DdayNumber);
         DL.setBounds(12, 16, 150, 50);
         DL.setFont(powerfont);
         dates.add(DL);
         dates.setVisible(true);
         contentPane.add(dates);

         contentPane.setBounds(0, 410, 655, 140);
         contentPane.add(pizza);
         �˹ټ���.setVisible(false);
         �˹ټ���.setVisible(false);
         �н�ƮǪ��˹�.setVisible(false);
         ��ȭ���˹�.setVisible(false);
         �������˹�.setVisible(false);

         ����.setVisible(false);
         ����1.setVisible(false);
         ����2.setVisible(false);
         // ����3.setVisible(false);
         // ����4.setVisible(false);
         pizza.setVisible(false);

         contentPane.setBounds(0, 430, 655, 120);

         contentPane.setVisible(true);
      
      });

      �н�ƮǪ��˹�.addActionListener(event -> {

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
         pizza.add(SelectBtn);

   /*      EndBtn.setBounds(0, 70, 110, 30);
         EndBtn.setBackground(new Color(93, 115, 145));
         EndBtn.setFont(btnfont);
         EndBtn.setBorderPainted(false);
         EndBtn.setFocusPainted(false);
         pizza.add(EndBtn);*/

         ����.setText("���� �н�ƮǪ������ ����߾�. ���� ��, 300���� ���� �ڽ��� ����� ��. ");
         ����.setBounds(10, 190, 650, 640);
         ����1.setText("���ž��� ���ڸ� �� ����, 12:00 ���� �غ� ���¾�.");
         ����1.setBounds(10, 210, 640, 640);
         ����2.setText(". . . ����� �ֹ��� �з����� �����߾�!");
         ����2.setBounds(10, 230, 650, 640);
         ����3.setText("���� �ֹ濡 �ֹ� ����Ʈ���� �����߾�. ���� ���Ŀ� �� �� ����ð���?!!");
         ����3.setBounds(10, 250, 650, 640);
         ����4.setText("��ħ�� ���������� ��ġ�� ���Ը� ���Ծ�!");
         ����4.setBounds(10, 270, 650, 640);
         ����5.setText(". . .[�Ƹ�����Ʈ�� �������ϴ�.]");
         ����5.setBounds(360, 270, 650, 640);

         ����.setFont(������Ʈ);
         ����1.setFont(������Ʈ);
         ����2.setFont(������Ʈ);
         ����3.setFont(������Ʈ);
         ����4.setFont(������Ʈ);
         ����5.setFont(����6��Ʈ);
         ����6.setFont(����6��Ʈ);

         pizza.setLayout(null);
         pizza.setBounds(0, 0, 655, 410);
         contentPane.add(����);
         contentPane.add(����1);
         contentPane.add(����2);
         contentPane.add(����3);
         contentPane.add(����4);
         contentPane.add(����5);
         contentPane.add(����6);
         ����.setVisible(true);
         ����1.setVisible(true);
         ����2.setVisible(true);
         ����3.setVisible(true);
         ����4.setVisible(true);
         ����5.setVisible(true);
         pizza.setVisible(true);

         init.N_money_up();

         powers.setLayout(null);
         powers.setBounds(25, 425, 100, 100);
         PL.setText("" + init.Power);
         PL.setBounds(15, 5, 50, 50);
         PL.setFont(powerfont);
         powers.add(PL);
         powers.setVisible(true);
         contentPane.add(powers);

         intellis.setLayout(null);
         intellis.setBounds(110, 425, 100, 100);
         IL.setText("" + init.Intelli);
         IL.setBounds(18, 5, 50, 50);
         IL.setFont(powerfont);
         intellis.add(IL);
         intellis.setVisible(true);
         contentPane.add(intellis);

         moneys.setLayout(null);
         moneys.setBounds(190, 420, 100, 100);
         ML.setText("" + init.Money);
         ML.setBounds(5, 13, 100, 50);
         ML.setFont(powerfont);
         moneys.add(ML);
         moneys.setVisible(true);
         contentPane.add(moneys);

         friends.setLayout(null);
         friends.setBounds(290, 430, 100, 100);
         FL.setText("" + init.Friend);
         FL.setBounds(25, 5, 150, 50);
         FL.setFont(powerfont);
         friends.add(FL);
         friends.setVisible(true);
         contentPane.add(friends);

         dates.setLayout(null);
         dates.setBounds(390, 420, 100, 100);
         DL.setText("D- " + init.DdayNumber);
         DL.setBounds(12, 16, 150, 50);
         DL.setFont(powerfont);
         dates.add(DL);
         dates.setVisible(true);
         contentPane.add(dates);

         contentPane.setBounds(0, 410, 655, 140);
         contentPane.add(pizza);
         �˹ټ���.setVisible(false);

         �н�ƮǪ��˹�.setVisible(false);
         ��ȭ���˹�.setVisible(false);
         �������˹�.setVisible(false);

         ����.setVisible(false);
         ����1.setVisible(false);
         ����2.setVisible(false);
         // ����3.setVisible(false);
         // ����4.setVisible(false);
         pizza.setVisible(true);
         contentPane.setBackground(Color.WHITE);
         contentPane.setVisible(true);
      
         

      });

      �������˹�.addActionListener(event -> {

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
         bakery.add(SelectBtn);

   /*      EndBtn.setBounds(0, 70, 110, 30);
         EndBtn.setBackground(new Color(93, 115, 145));
         EndBtn.setFont(btnfont);
         EndBtn.setBorderPainted(false);
         EndBtn.setFocusPainted(false);
         bakery.add(EndBtn);*/

         contentPane.setBackground(Color.WHITE);

         Font ������Ʈ = new Font("HY�߰��", Font.PLAIN, 16);
         Font ����6��Ʈ = new Font("HY�߰��", Font.BOLD, 12);

         ����.setText("�������� ����߾�. ���� ���������� ���� �԰� �Ӹ��� ���� �� ���ڸ�  ���.");
         ����.setBounds(10, 175, 655, 640);
         ����1.setText("������ �����ϱ� �����߾�. ������ ..������ �������� �ʹ� �������..������ ������ ��");
         ����1.setBounds(10, 195, 655, 640);
         ����2.setText("���� �̸��� ��ġ�� �ܿ����ؼ� �����⸦ ���� �ϱ⸦ �ϸ� ī���Ϳ� �� �־���.");
         ����2.setBounds(10, 215, 655, 640);
         ����3.setText("����� ���� �ֹ��� ���ͼ� ��������� ���� ����� �մԿ��� �����߾�!");
         ����3.setBounds(10, 235, 655, 640);
         ����4.setText("�Ϸ� ���� ������ ����ȭ�� ����� ������ �䱸�ϴ� �մԵ�� ���� �ָ� �Ծ���..");
         ����4.setBounds(10, 255, 655, 640);
         ����5.setText("���� ���Ŀ� �� �� ���� �� ���������� ���Ծ�! ");
         ����5.setBounds(10, 275, 655, 640);
         ����6.setText("[. . .�˹ٰ� �������ϴ�.]");
         ����6.setBounds(360, 275, 655, 640);

         ����.setFont(������Ʈ);
         ����1.setFont(������Ʈ);
         ����2.setFont(������Ʈ);
         ����3.setFont(������Ʈ);
         ����4.setFont(������Ʈ);
         ����5.setFont(������Ʈ);

         bakery.setVisible(true);
         bakery.setLayout(null);
         bakery.setBounds(0, 0, 655, 410);
         contentPane.add(bakery);

         contentPane.add(theater);
         contentPane.add(����);
         contentPane.add(����1);
         contentPane.add(����2);
         contentPane.add(����3);
         contentPane.add(����4);
         contentPane.add(����5);
         contentPane.add(����6);

         ����.setVisible(true);
         ����1.setVisible(true);
         ����2.setVisible(true);
         ����3.setVisible(true);
         ����4.setVisible(true);
         ����5.setVisible(true);

         init.N_money_up();

         powers.setLayout(null);
         powers.setBounds(25, 425, 100, 100);
         PL.setText("" + init.Power);
         PL.setBounds(15, 5, 50, 50);
         PL.setFont(powerfont);
         powers.add(PL);
         powers.setVisible(true);
         contentPane.add(powers);

         intellis.setLayout(null);
         intellis.setBounds(110, 425, 100, 100);
         IL.setText("" + init.Intelli);
         IL.setBounds(18, 5, 50, 50);
         IL.setFont(powerfont);
         intellis.add(IL);
         intellis.setVisible(true);
         contentPane.add(intellis);

         moneys.setLayout(null);
         moneys.setBounds(190, 420, 100, 100);
         ML.setText("" + init.Money);
         ML.setBounds(5, 13, 100, 50);
         ML.setFont(powerfont);
         moneys.add(ML);
         moneys.setVisible(true);
         contentPane.add(moneys);

         friends.setLayout(null);
         friends.setBounds(290, 430, 100, 100);
         FL.setText("" + init.Friend);
         FL.setBounds(25, 5, 150, 50);
         FL.setFont(powerfont);
         friends.add(FL);
         friends.setVisible(true);
         contentPane.add(friends);

         dates.setLayout(null);
         dates.setBounds(390, 420, 100, 100);
         DL.setText("D- " + init.DdayNumber);
         DL.setBounds(12, 16, 150, 50);
         DL.setFont(powerfont);
         dates.add(DL);
         dates.setVisible(true);
         contentPane.add(dates);

         contentPane.setBounds(0, 410, 655, 140);
         contentPane.add(pizza);
         �˹ټ���.setVisible(false);
         �˹ټ���.setVisible(false);
         �н�ƮǪ��˹�.setVisible(false);
         ��ȭ���˹�.setVisible(false);
         �������˹�.setVisible(false);

         ����.setVisible(false);
         ����1.setVisible(false);
         ����2.setVisible(false);
         // ����3.setVisible(false);
         // ����4.setVisible(false);
         pizza.setVisible(false);
         theater.setVisible(false);
         contentPane.setBounds(0, 430, 655, 120);

         contentPane.setVisible(true);
         

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

         ����.setVisible(false);
         ����1.setVisible(false);
         ����2.setVisible(false);
         ����3.setVisible(false);
         ����4.setVisible(false);
         ����5.setVisible(false);
         ����6.setVisible(false);

         �˹ټ���.setVisible(false);
         pizza.setVisible(false);
         theater.setVisible(false);
         bakery.setVisible(false);

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

         ����.setVisible(false);
         ����1.setVisible(false);
         ����2.setVisible(false);
         ����3.setVisible(false);
         ����4.setVisible(false);
         ����5.setVisible(false);
         ����6.setVisible(false);

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