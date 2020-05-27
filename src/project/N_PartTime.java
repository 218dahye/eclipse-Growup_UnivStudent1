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
	JButton button1 = new JButton("������");
	JButton button2 = new JButton("��ȭ��");
	JButton button3 = new JButton("����");
	JButton button4 = new JButton("�ڷΰ���");

	JLabel ü��Ȯ�η��̺� = new JLabel("" + init.Power);
	JLabel pdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: �� + 40000]");
	JLabel bonus = new JLabel("���ʽ��� ���� �� ��������?");
	JLabel pdetail = new JLabel();
	
	JLabel ���� = new JLabel("�˹� ������ �հ��� ���� ������, ��ȭ��, �н�ƮǪ����");
	JLabel ����1 = new JLabel("�� 3���̾�");
	JLabel ����2 = new JLabel("� ������ �˹ٸ� �غ���?");
	
	JButton ��ȭ���˹� = new JButton("�˹��ϱ�");
	JButton �������˹� = new JButton("�˹��ϱ�");
	JButton �н�ƮǪ��˹� = new JButton("�˹��ϱ�");
	JLabel ���� = new JLabel();
	JLabel ����1 = new JLabel();
	JLabel ����2 = new JLabel();
	JLabel ����3 = new JLabel();
	JLabel ����4 = new JLabel();
	JLabel ����5 = new JLabel();
	JLabel ����6 = new JLabel();
	

	N_PartTime(JLabel Lb1, JLabel Lb2) {
		setTitle("�˹ٰ���");
		contentPane = getContentPane();
		setLayout(null);

		pdetail.setText("[�䱸 �ɷ�ġ: ü�� 50]");

		pdetail.setFont(Ȱ��������Ʈ);
		pdetail.setBounds(371, 143, 200, 30);
		pdetailL.setFont(Ȱ��������Ʈ);
		pdetailL.setBounds(371, 163, 200, 30);
		bonus.setFont(bonusfont);
		bonus.setBounds(403, 183, 200, 30);
		
		����.setFont(������Ʈ);
		����1.setFont(������Ʈ);
		����2.setFont(������Ʈ);
		
		�˹ټ���.setLayout(null);
		�˹ټ���.setBounds(0, 100, 640, 290);
		����.setBounds(57, 125, 640, 640);
		����1.setBounds(260, 155, 640, 640);
		����2.setBounds(180, 185, 640, 640);
		
		��ȭ���˹�.setBounds(120, 380, 90, 25);
		�н�ƮǪ��˹�.setBounds(260, 380, 90, 25);
		�������˹�.setBounds(430, 380, 90, 25);
		��ȭ���˹�.setBorderPainted(false);
		��ȭ���˹�.setFocusPainted(false);
		�н�ƮǪ��˹�.setBorderPainted(false);
		�н�ƮǪ��˹�.setFocusPainted(false);
		�������˹�.setBorderPainted(false);
		�������˹�.setFocusPainted(false);
		��ȭ���˹�.setBackground(Color.WHITE);
		�н�ƮǪ��˹�.setBackground(Color.WHITE);
		�������˹�.setBackground(Color.WHITE);
		
		contentPane.add(����);
		contentPane.add(����1);
		contentPane.add(����2);
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(��ȭ���˹�);
		contentPane.add(�н�ƮǪ��˹�);
		contentPane.add(�������˹�);
		contentPane.add(�˹ټ���);
		
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
			powers.add(ü��Ȯ�η��̺�);

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
		/*
		 * JLabel PtLb1 = new JLabel(); PtLb1.setText("��� ������ �˹ٸ� ���ðڽ��ϱ�?");
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
		 * Font f4 = new Font("�޸տ�����", Font.BOLD, 25); button1.setFont(f4);
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
		 * button1.addActionListener(event -> { init.N_money_up(); Lb1.setText("�������� D-"
		 * + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " +
		 * init.Today + "����"); Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli +
		 * " �� " + init.Money + " ģȭ�� " + init.Friend); dispose(); });
		 * button2.addActionListener(event -> { init.N_money_up(); Lb1.setText("�������� D-"
		 * + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " +
		 * init.Today + "����"); Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli +
		 * " �� " + init.Money + " ģȭ�� " + init.Friend); dispose(); });
		 * button3.addActionListener(event -> { init.N_money_up(); Lb1.setText("�������� D-"
		 * + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " +
		 * init.Today + "����"); Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli +
		 * " �� " + init.Money + " ģȭ�� " + init.Friend); dispose(); });
		 * 
		 * button4.addActionListener(event -> { JOptionPane.showMessageDialog(null,
		 * "�ڷ� �̵��մϴ�", "�ڷ� �̵�", JOptionPane.INFORMATION_MESSAGE); // �޽��� dispose(); });
		 */

		setSize(650, 655);
		setVisible(true);
	}

}
