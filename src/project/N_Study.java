package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class N_Study extends JFrame {
	Container contentPane;
	// subImagePanel SelectPanel = new subImagePanel(new
	// ImageIcon("./image/Study.png").getImage());
	subImagePanel OSPanel = new subImagePanel(new ImageIcon("./image/OS.png").getImage());
	subImagePanel DBPanel = new subImagePanel(new ImageIcon("./image/pizza.jpg").getImage());
	subImagePanel IPPanel = new subImagePanel(new ImageIcon("./image/bakery.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());

	Font ������Ʈ = new Font("�޸յձ�������", Font.PLAIN, 30);
	Font Ȱ�����ù�ư��Ʈ = new Font("HY�߰��", Font.BOLD, 15);
	Font Ȱ��������Ʈ = new Font("HY�߰��", Font.PLAIN, 12);
	Font powerfont = new Font("HY������M", Font.BOLD, 15);

	JButton Ȱ�����ù�ư = new JButton("Ȱ������");
	JButton �ϰ������� = new JButton("�ϰ� ����");
	ImageIcon OS = new ImageIcon("./image/OS.png");
	JButton button1 = new JButton(OS);
	ImageIcon DB = new ImageIcon("./image/DB.png");
	JButton button2 = new JButton(DB);
	ImageIcon IP = new ImageIcon("./image/IP.png");
	JButton button3 = new JButton(IP);
	
	JLabel OSLb = new JLabel("���¼ҽ�����Ʈ����");
	JLabel DBLb = new JLabel("�����ͺ��̽�");
	JLabel IPLb = new JLabel("������ȣ");

	JLabel ü��Ȯ�η��̺� = new JLabel("" + init.Power);
	JLabel ���� = new JLabel("� ������ ���θ� �غ���?");

	JLabel ���� = new JLabel();
	JLabel ����1 = new JLabel();
	JLabel ����2 = new JLabel();
	JLabel ����3 = new JLabel();
	JLabel ����4 = new JLabel();
	JLabel ����5 = new JLabel();
	JLabel ����6 = new JLabel();

	N_Study() {
		setTitle("�����ϱ�");
		contentPane = getContentPane();
		setLayout(null);

		/*
		 * SelectPanel.setLayout(null); SelectPanel.setBounds(0, 100, 640, 290);
		 */

		����.setBounds(130, 170, 650, 650);
		����.setFont(������Ʈ);

		button1.setBounds(0, 100, 220, 275);
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setBackground(Color.WHITE);
		button1.setFont(Ȱ�����ù�ư��Ʈ);

		button2.setBounds(220, 100, 220, 275);
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setBackground(Color.WHITE);
		button2.setFont(Ȱ�����ù�ư��Ʈ);

		button3.setBounds(440, 100, 210, 275);
		button3.setBorderPainted(false);
		button3.setFocusPainted(false);
		button3.setBackground(Color.WHITE);
		button3.setFont(Ȱ�����ù�ư��Ʈ);

		OSLb.setBounds(39, 90, 650, 650);
		OSLb.setBackground(Color.WHITE);
		OSLb.setFont(Ȱ�����ù�ư��Ʈ);

		DBLb.setBounds(280, 90, 650, 650);
		DBLb.setBackground(Color.WHITE);
		DBLb.setFont(Ȱ�����ù�ư��Ʈ);
		
		IPLb.setBounds(510, 90, 650, 650);
		IPLb.setBackground(Color.WHITE);
		IPLb.setFont(Ȱ�����ù�ư��Ʈ);
		
		/* contentPane.add(SelectPanel); */
		contentPane.add(����);
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(OSLb);
		contentPane.add(DBLb);
		contentPane.add(IPLb);

		contentPane.setBounds(0, 290, 640, 349);
		contentPane.setBackground(Color.WHITE);

		button1.addActionListener(event -> {

			OSPanel.setVisible(true);
			OSPanel.setLayout(null);
			OSPanel.setBounds(0, 70, 640, 640);
			contentPane.add(OSPanel);
			// SelectPanel.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);

		});

		button2.addActionListener(event -> {

			DBPanel.setVisible(true);
			DBPanel.setLayout(null);
			DBPanel.setBounds(0, 70, 640, 640);
			contentPane.add(DBPanel);
			// SelectPanel.setVisible(false);
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);

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
