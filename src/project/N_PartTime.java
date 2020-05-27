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

	Font bonusfont = new Font("HY�߰��", Font.BOLD, 10);
	Font ������Ʈ = new Font("�޸յձ�������", Font.PLAIN, 20);
	Font btnfont = new Font("HY������M", Font.BOLD, 15);
	Font Ȱ�����ù�ư��Ʈ = new Font("HY�߰��", Font.BOLD, 15);
	Font Ȱ��������Ʈ = new Font("HY�߰��", Font.PLAIN, 12);
	Font powerfont = new Font("HY������M", Font.BOLD, 15);

	JButton Ȱ�����ù�ư = new JButton("Ȱ������");
	JButton �ϰ������� = new JButton("�ϰ� ����");
	JButton ��ȭ���˹� = new JButton("��ȭ�� �˹��ϱ�");
	JButton �������˹� = new JButton("������ �˹��ϱ�");
	JButton �н�ƮǪ��˹� = new JButton("�н�ƮǪ�� �˹��ϱ�");

	JLabel ü��Ȯ�η��̺� = new JLabel("" + init.Power);

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

	N_PartTime() {
		setTitle("�˹ٰ���");
		contentPane = getContentPane();
		setLayout(null);

		�˹ټ���.setLayout(null);
		�˹ټ���.setBounds(0, 100, 640, 290);

		����.setBounds(57, 125, 640, 640);
		����.setFont(������Ʈ);

		����1.setBounds(260, 155, 640, 640);
		����1.setFont(������Ʈ);

		����2.setBounds(180, 185, 640, 640);
		����2.setFont(������Ʈ);

		��ȭ���˹�.setBounds(120, 380, 90, 25);
		��ȭ���˹�.setBorderPainted(false);
		��ȭ���˹�.setFocusPainted(false);
		��ȭ���˹�.setBackground(Color.WHITE);

		�н�ƮǪ��˹�.setBounds(260, 380, 90, 25);
		�н�ƮǪ��˹�.setBorderPainted(false);
		�н�ƮǪ��˹�.setFocusPainted(false);
		�н�ƮǪ��˹�.setBackground(Color.WHITE);

		�������˹�.setBounds(430, 380, 90, 25);
		�������˹�.setBorderPainted(false);
		�������˹�.setFocusPainted(false);
		�������˹�.setBackground(Color.WHITE);

		contentPane.add(�˹ټ���);
		contentPane.add(����);
		contentPane.add(����1);
		contentPane.add(����2);
		contentPane.add(��ȭ���˹�);
		contentPane.add(�н�ƮǪ��˹�);
		contentPane.add(�������˹�);

		contentPane.setBounds(0, 290, 640, 349);
		contentPane.setBackground(Color.WHITE);

		��ȭ���˹�.addActionListener(event -> {

			theater.setVisible(true);
			theater.setLayout(null);
			theater.setBounds(0, 70, 640, 640);
			contentPane.add(theater);
			�˹ټ���.setVisible(false);
			�н�ƮǪ��˹�.setVisible(false);
			��ȭ���˹�.setVisible(false);
			�������˹�.setVisible(false);

		});

		�н�ƮǪ��˹�.addActionListener(event -> {

			contentPane.add(Ȱ�����ù�ư);
			Ȱ�����ù�ư.setBounds(0, 73, 130, 30);
			Ȱ�����ù�ư.setBackground(new Color(225, 80, 80));
			Ȱ�����ù�ư.setFont(btnfont);
			Ȱ�����ù�ư.setBorderPainted(false);
			Ȱ�����ù�ư.setFocusPainted(false);
			Ȱ�����ù�ư.setVisible(true);
			contentPane.add(�ϰ�������);
			�ϰ�������.setFont(btnfont);
			�ϰ�������.setBackground(new Color(225, 80, 80));
			�ϰ�������.setBounds(0, 110, 130, 30);
			�ϰ�������.setBorderPainted(false);
			�ϰ�������.setFocusPainted(false);
			�ϰ�������.setVisible(true);
			Font ������Ʈ = new Font("HY�߰��", Font.PLAIN, 18);
			Font ����6��Ʈ = new Font("HY�߰��", Font.BOLD, 12);
			����.setText("���� �н�ƮǪ������ ����߾�. ���� ��, 300���� ���� �ڽ��� ����� ��. ");
			����.setBounds(10, 120, 640, 640);
			����1.setText("���ž��� ���ڸ� �� ����, 12:00 ���� �غ� ���¾�.");
			����1.setBounds(10, 140, 640, 640);

			����2.setText(". . . ����� �ֹ��� �з����� �����߾�!");
			����2.setBounds(10, 160, 640, 640);
			����3.setText("���� �ֹ濡 �ֹ� ����Ʈ���� �����߾�. ���� ���Ŀ� �� �� ����ð���?!!");
			����3.setBounds(10, 180, 640, 640);
			����4.setText("��ħ�� ���������� ��ġ�� ���Ը� ���Ծ�!");
			����4.setBounds(10, 200, 640, 640);
			����5.setText(". . .[�Ƹ�����Ʈ�� �������ϴ�.]");
			����5.setBounds(360, 200, 640, 640);

			����.setFont(������Ʈ);
			����1.setFont(������Ʈ);
			����2.setFont(������Ʈ);
			����3.setFont(������Ʈ);
			����4.setFont(������Ʈ);
			����5.setFont(����6��Ʈ);
			����6.setFont(����6��Ʈ);

			pizza.setLayout(null);
			pizza.setBounds(0, 0, 640, 410);
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
			powers.setVisible(true);
			powers.setBounds(550, 510, 190, 80);
			ü��Ȯ�η��̺�.setText("" + init.Power);
			ü��Ȯ�η��̺�.setBounds(570, 525, 100, 30);
			ü��Ȯ�η��̺�.setFont(btnfont);

			contentPane.add(ü��Ȯ�η��̺�);
			contentPane.add(powers);

			ü��Ȯ�η��̺�.setVisible(true);
			contentPane.setBounds(0, 410, 640, 140);
			contentPane.add(pizza);
			�˹ټ���.setVisible(false);

			�н�ƮǪ��˹�.setVisible(false);
			��ȭ���˹�.setVisible(false);
			�������˹�.setVisible(false);

			pizza.setVisible(true);
			contentPane.setBackground(Color.WHITE);
			contentPane.setVisible(true);
		});

		�������˹�.addActionListener(event -> {

			bakery.setVisible(true);
			bakery.setLayout(null);
			bakery.setBounds(0, 90, 640, 640);
			contentPane.add(bakery);
			�˹ټ���.setVisible(false);
			�н�ƮǪ��˹�.setVisible(false);
			��ȭ���˹�.setVisible(false);
			�������˹�.setVisible(false);

		});

		Ȱ�����ù�ư.addActionListener(event -> {

			JOptionPane.showMessageDialog(null, "Ȱ�� �������� �̵��մϴ�", "�̵�", JOptionPane.INFORMATION_MESSAGE); // �޽���
			dispose();

		});

		�ϰ�������.addActionListener(event -> {

		});

		setSize(650, 655);
		setVisible(true);
	}

}
