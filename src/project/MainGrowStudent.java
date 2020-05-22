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

class ImagePanel extends JPanel { // �̹��� �г�
	private Image img;

	public ImagePanel(Image img) {

		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));// pack()�� �� ������ ����� �°� ������ ���� �� ��������.
		setSize(640, 640);
		setLayout(null);

	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

class subImagePanel extends JPanel { // �����̹��� �г�
	private Image subimg;

	public subImagePanel(Image subimg) {
		this.subimg = subimg;
		setSize(new Dimension(subimg.getWidth(null), subimg.getHeight(null)));
		setPreferredSize(new Dimension(subimg.getWidth(null), subimg.getHeight(null)));// pack()�� �� ������ ����� �°� ������ ���� ��
		setSize(655, 650); // ��������.
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(subimg, 0, 0, null);
	}
}

public class MainGrowStudent extends JFrame {
	Container contentPane;
	ImagePanel StartPanel = new ImagePanel(new ImageIcon("./image/main.jpg").getImage());
	subImagePanel LevelPanel = new subImagePanel(new ImageIcon("./image/main.jpg").getImage());
	subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel H_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel WeekPanel = new subImagePanel(new ImageIcon("./image/week.png").getImage());// �̹��� �г� ��ü ����
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	JButton MBtn = new JButton("����ä���");
	JButton ThBtn = new JButton("����ä���");
	JButton WBtn = new JButton("����ä���");
	JButton TuBtn = new JButton("����ä���");
	JButton FBtn = new JButton("����ä���");
	JButton SatBtn = new JButton("����ä���");
	JButton SunBtn = new JButton("����ä���");
	JLabel click = new JLabel("click");
	Font f4 = new Font("�޸տ�����", Font.BOLD, 18);
	JLabel powerlabel = new JLabel("" + init.Power);
	JLabel ü��Ȯ�η��̺� = new JLabel();
	Font Ȱ�����ù�ư��Ʈ = new Font("HY�߰��", Font.BOLD, 15);
	Font Ȱ��������Ʈ = new Font("HY�߰��", Font.PLAIN, 12);
	Font powerfont = new Font("HY������M", Font.BOLD, 15);

	MainGrowStudent() {
		setTitle("<< ���л� Ű��� >>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setBounds(0, 0, 640, 109);
		contentPane.setLayout(null);

		JLabel label1, label1_1;
		label1 = new JLabel("���л� ");
		label1.setBounds(170, 40, 450, 200);

		label1_1 = new JLabel("Ű���");
		label1_1.setBounds(170, 132, 450, 200);

		Font f = new Font("�޸տ�ü", Font.PLAIN, 103);
		label1.setForeground(new Color(204, 204, 051));
		label1_1.setForeground(new Color(204, 204, 051));

		label1.setFont(f);
		label1_1.setFont(f);

		Font f1 = new Font("�޸յձ�������", Font.PLAIN, 22);
		JButton StartBt, EndBt;

		StartBt = new JButton(">> ���� ����");
		StartBt.setFont(f1);
		StartBt.setBackground(new Color(255, 255, 255));
		StartBt.setBounds(0, 410, 360, 45);
		StartBt.setBorderPainted(false);
		// StartBt.setFocusPainted(false);

		EndBt = new JButton(" ���� ���� <<");
		EndBt.setFont(f1);
		EndBt.setBackground(new Color(255, 255, 255));
		EndBt.setBounds(290, 470, 360, 45);
		EndBt.setBorderPainted(false);
		// EndBt.setFocusPainted(false);

		StartPanel.add(label1);
		StartPanel.add(label1_1);
		StartPanel.add(StartBt);
		StartPanel.add(EndBt);
		StartPanel.setVisible(true);
		contentPane.add(StartPanel); // StartPanel ȭ��

		EndBt.addActionListener(e -> {
			System.exit(0);
		}); // EndBt ��ư ������ â �ݱ�

		JLabel Lb3 = new JLabel("���̵��� ");
		Lb3.setBounds(115, 40, 500, 200);
		Lb3.setForeground(new Color(204, 204, 051));
		Lb3.setFont(f);

		JLabel Lb4 = new JLabel("�����Ͻÿ�");
		Lb4.setBounds(55, 139, 550, 200);
		Lb4.setForeground(new Color(204, 204, 051));
		Lb4.setFont(f);

		JButton NormalBtn = new JButton(">> ����");
		NormalBtn.setFont(f1);
		NormalBtn.setBackground(new Color(255, 255, 255));
		NormalBtn.setBounds(0, 410, 360, 45);
		NormalBtn.setBorderPainted(false);

		JButton HardBtn = new JButton("����� <<");
		HardBtn.setFont(f1);
		HardBtn.setBackground(new Color(255, 255, 255));
		HardBtn.setBounds(290, 470, 360, 45);
		HardBtn.setBorderPainted(false); // SelectPanel ȭ��

		StartBt.addActionListener(e -> {
			LevelPanel.add(Lb3);
			LevelPanel.add(Lb4);
			LevelPanel.add(NormalBtn);
			LevelPanel.add(HardBtn);
			contentPane.add(LevelPanel);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);
		}); // StartBt ��ư ������ SelectPanel ���̵� ���� �гη� �̵�

		init.MT();

		Font weekfont = new Font("�޸յձ�������", Font.PLAIN, 30);
		JLabel week = new JLabel();
		week.setText("�������� �� D-" + init.DdayNumber + "��!");
		week.setFont(weekfont);
		week.setBounds(340, 10, 600, 40);
		WeekPanel.add(week);
		setBackground(Color.WHITE);

		JLabel Lb1 = new JLabel();
		Lb1.setText("�������� ��, D-" + init.DdayNumber + "!");
		Lb1.setFont(weekfont);
		Lb1.setBounds(10, 0, 640, 50);

		JLabel dateLb = new JLabel();
		dateLb.setText("Today 2020 " + init.Month + "��" + init.Day + "��  " + init.Today + "����");
		Font datefont = new Font("HY�߰��", Font.PLAIN, 18);
		dateLb.setFont(datefont);
		dateLb.setBounds(45, 8, 640, 50);

		N_MenuPanel.setBounds(0, 73, 640, 640);
		H_MenuPanel.setBounds(0, 73, 640, 640);
		N_MenuPanel.add(Lb1);
		H_MenuPanel.add(Lb1);
		N_MenuPanel.add(dateLb);
		H_MenuPanel.add(dateLb); //

		JLabel Lb2 = new JLabel();
		Lb2.setBounds(25, 180, 600, 50);
		Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
		N_MenuPanel.add(Lb2);
		H_MenuPanel.add(Lb2); // (N+H)ManuPanel ȭ��

		JLabel detail = new JLabel("[�䱸 �ɷ�ġ: ü�� 25]");
		detail.setFont(Ȱ��������Ʈ);

		JLabel detailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ����+5]");
		detailL.setFont(Ȱ��������Ʈ);

		powers.setLayout(null);
		powers.setBounds(25, 5, 80, 80);

		powerlabel.setBounds(15, 15, 40, 30);
		powerlabel.setFont(powerfont);
		powers.add(powerlabel);
		powers.setVisible(true);
		contentPane.add(powers);

		JButton LBtn = new JButton("���� ���");
		LBtn.setFont(Ȱ�����ù�ư��Ʈ);
		N_MenuPanel.add(LBtn);
		N_MenuPanel.setBounds(0, 110, 640, 640);
		LBtn.setBounds(170, 258, 300, 48);

		LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "���� ��� �� �̻� �� �� �����ϴ�", "���", JOptionPane.WARNING_MESSAGE); // �޽���
																												// ���

			} else
				new N_Lecture(Lb1, Lb2);
		}); // N_Lecture Ŭ���� �̵�

		JButton N_SBtn = new JButton("�����ϱ�");
		N_MenuPanel.add(N_SBtn);
		N_SBtn.setBounds(170, 328, 300, 48);
		N_SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new N_Study(Lb1, Lb2);
		}); // N_Study Ŭ���� �̵�

		JButton N_PtBtn = new JButton("�˹ٰ���");
		N_MenuPanel.add(N_PtBtn);
		N_PtBtn.setBounds(170, 398, 300, 48);
		N_PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new N_PartTime(Lb1, Lb2);
		}); // N_PartTime Ŭ���� �̵�

		JButton N_PlayBtn = new JButton("ģ���� �����");
		N_MenuPanel.add(N_PlayBtn);
		N_PlayBtn.setBounds(170, 468, 300, 48);
		N_PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "���� ��� �� �̻� �� �� �����ϴ�", "���", JOptionPane.WARNING_MESSAGE); // �޽���
																												// ���
			} else
				new N_Play(Lb1, Lb2);
		}); // N_Play Ŭ���� �̵�

		JButton N_RestBtn = new JButton("�޽��ϱ�");
		N_MenuPanel.add(N_RestBtn);
		N_RestBtn.setBounds(170, 538, 300, 48);
		N_RestBtn.addActionListener(event -> {
			new N_Rest(Lb1, Lb2);
		}); // N_Rest Ŭ���� �̵�

		NormalBtn.addActionListener(e -> {
			WeekPanel.add(MBtn);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			/*
			 * N_MenuPanel.add(Lb1); N_MenuPanel.add(Lb2); N_MenuPanel.add(LBtn);
			 * N_MenuPanel.add(N_SBtn); N_MenuPanel.add(N_PtBtn);
			 * N_MenuPanel.add(N_PlayBtn); N_MenuPanel.add(N_RestBtn);
			 * contentPane.add(N_MenuPanel);
			 */
		}); // ���̵� ������ N_MenuPanel�� �̵�

		H_MenuPanel.add(LBtn);
		LBtn.setBounds(170, 258, 300, 48);

		LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "���� ��� �� �̻� �� �� �����ϴ�", "���", JOptionPane.WARNING_MESSAGE); // �޽���
																												// ���

			} else
				new H_Lecture(Lb1, Lb2);
		}); // H_Lecture Ŭ���� �̵�

		JButton H_SBtn = new JButton("�����ϱ�");
		H_MenuPanel.add(H_SBtn);
		H_SBtn.setBounds(170, 328, 300, 48);
		H_SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new H_Study(Lb1, Lb2);
		}); // H_Study Ŭ���� �̵�

		JButton H_PtBtn = new JButton("�˹ٰ���");
		H_MenuPanel.add(H_PtBtn);
		H_PtBtn.setBounds(170, 398, 300, 48);
		H_PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new H_PartTime(Lb1, Lb2);
		}); // H_PartTime Ŭ���� �̵�

		JButton H_PlayBtn = new JButton("ģ���� �����");
		H_MenuPanel.add(H_PlayBtn);
		H_PlayBtn.setBounds(170, 468, 300, 48);
		H_PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "���� ��� �� �̻� �� �� �����ϴ�", "���", JOptionPane.WARNING_MESSAGE); // �޽���
																												// ���
			} else
				new H_Play(Lb1, Lb2);
		}); // H_Play Ŭ���� �̵�

		JButton H_RestBtn = new JButton("�޽��ϱ�");
		H_MenuPanel.add(H_RestBtn);
		H_RestBtn.setBounds(170, 538, 300, 48);
		H_RestBtn.addActionListener(event -> {
			new H_Rest(Lb1, Lb2);
		}); // H_Rest Ŭ���� �̵�

		HardBtn.addActionListener(e -> {
			H_MenuPanel.add(Lb1);
			H_MenuPanel.add(Lb2);
			H_MenuPanel.add(LBtn);
			H_MenuPanel.add(H_SBtn);
			H_MenuPanel.add(H_PtBtn);
			H_MenuPanel.add(H_PlayBtn);
			H_MenuPanel.add(H_RestBtn);
			contentPane.add(H_MenuPanel);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
		}); // ���̵� ������ H_MenuPanel�� �̵�

		Font f4 = new Font("�޸տ�����", Font.BOLD, 25);
		LBtn.setFont(f4);
		N_SBtn.setFont(f4);
		N_PtBtn.setFont(f4);
		N_PlayBtn.setFont(f4);
		N_RestBtn.setFont(f4);

		LBtn.setFont(f4);
		H_SBtn.setFont(f4);
		H_PtBtn.setFont(f4);
		H_PlayBtn.setFont(f4);
		H_RestBtn.setFont(f4);

		LBtn.setBackground(Color.WHITE);
		N_SBtn.setBackground(Color.WHITE);
		N_PtBtn.setBackground(Color.WHITE);
		N_PlayBtn.setBackground(Color.WHITE);
		N_RestBtn.setBackground(Color.WHITE);

		LBtn.setBackground(Color.WHITE);
		H_SBtn.setBackground(Color.WHITE);
		H_PtBtn.setBackground(Color.WHITE);
		H_PlayBtn.setBackground(Color.WHITE);
		H_RestBtn.setBackground(Color.WHITE);

		setSize(660, 700);
		contentPane.setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}
}
