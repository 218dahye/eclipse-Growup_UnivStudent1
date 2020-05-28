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
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());// �̹��� �г� ��ü ����

	Font f1 = new Font("�޸յձ�������", Font.PLAIN, 30);
	Font f2 = new Font("HY�߰��", Font.BOLD, 15);
	Font f3 = new Font("HY�߰��", Font.PLAIN, 12);
	Font powerfont = new Font("HY������M", Font.BOLD, 15);
	Font btnfont = new Font("HY������M", Font.BOLD, 15);
	Font f4 = new Font("HY�߰��", Font.PLAIN, 23);

	JButton SelectBtn = new JButton("Ȱ������");
	JButton EndBtn = new JButton("�ϰ� ����");
	ImageIcon OS = new ImageIcon("./image/OS.png");
	JButton button1 = new JButton(OS);
	ImageIcon DB = new ImageIcon("./image/DB.png");
	JButton button2 = new JButton(DB);
	ImageIcon IP = new ImageIcon("./image/IP.png");
	JButton button3 = new JButton(IP);

	JLabel OSLb = new JLabel("���¼ҽ�����Ʈ����");
	JLabel DBLb = new JLabel("�����ͺ��̽�");
	JLabel IPLb = new JLabel("������ȣ");

	JLabel ü��Ȯ�η��̺� = new JLabel();
	JLabel ����Ȯ�η��̺� = new JLabel();
	JLabel ��Ȯ�η��̺� = new JLabel();
	JLabel ģ��Ȯ�η��̺� = new JLabel();

	JLabel ���� = new JLabel("� ������ ���θ� �غ���?");

	JLabel ���� = new JLabel();
	JLabel ����1 = new JLabel();
	JLabel ����2 = new JLabel();

	N_Study(JLabel PL, JLabel IL, JLabel ML, JLabel FL) {
		setTitle("�����ϱ�");
		contentPane = getContentPane();
		setLayout(null);

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

		button1.addActionListener(event -> {
			init.N_Study();

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
			init.N_Study();

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
			init.N_Study();
			
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
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			JOptionPane.showMessageDialog(null, "Ȱ�� �������� �̵��մϴ�", "�̵�", JOptionPane.INFORMATION_MESSAGE); // �޽���
			dispose();
		});
		EndBtn.addActionListener(event -> {
			PL.setText("" + init.Power);
			IL.setText("" + init.Intelli);
			ML.setText("" + init.Money);
			FL.setText("" + init.Friend);
			JOptionPane.showMessageDialog(null, "������ �̵��մϴ�.", "�̵�", JOptionPane.INFORMATION_MESSAGE); // �޽���
			dispose();
		});
		/*
		 * JLabel SLb1 = new JLabel(); SLb1.setText("� ������ ���θ� �Ͻðڽ��ϱ�?");
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
		 * Font f4 = new Font("�޸տ�����", Font.BOLD, 25); button1.setFont(f4);
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
		 * Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " +
		 * init.Day + "��  " + init.Today + "����"); Lb2.setText("ü�� " + init.Power +
		 * " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
		 * dispose(); }); button2.addActionListener(event -> { init.N_intelli_up();
		 * Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " +
		 * init.Day + "��  " + init.Today + "����"); Lb2.setText("ü�� " + init.Power +
		 * " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
		 * dispose(); }); button3.addActionListener(event -> { init.N_intelli_up();
		 * Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " +
		 * init.Day + "��  " + init.Today + "����"); Lb2.setText("ü�� " + init.Power +
		 * " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
		 * dispose(); }); button4.addActionListener(event -> {
		 * JOptionPane.showMessageDialog(null, "�ڷ� �̵��մϴ�", "�ڷ� �̵�",
		 * JOptionPane.INFORMATION_MESSAGE); // �޽��� dispose(); });
		 */

		setSize(670, 670);
		setVisible(true);
	}

}
