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
	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/Room.jpg").getImage());
	subImagePanel N_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel H_MenuPanel = new subImagePanel(new ImageIcon("./image/postit.jpg").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());// �̹��� �г� ��ü ����

	JLabel click = new JLabel("click");
	JLabel PL = new JLabel();
	JLabel IL = new JLabel();
	JLabel ML = new JLabel();
	JLabel FL = new JLabel();

	Font Ȱ�����ù�ư��Ʈ = new Font("HY�߰��", Font.BOLD, 15);
	Font Ȱ��������Ʈ = new Font("HY�߰��", Font.PLAIN, 13);
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
		StartBt.setBackground(Color.WHITE);
		StartBt.setBounds(0, 410, 360, 45);
		StartBt.setBorderPainted(false);
		StartBt.setFocusPainted(false);

		EndBt = new JButton(" ���� ���� <<");
		EndBt.setFont(f1);
		EndBt.setBackground(Color.WHITE);
		EndBt.setBounds(290, 470, 360, 45);
		EndBt.setBorderPainted(false);
		EndBt.setFocusPainted(false);

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
		NormalBtn.setBackground(Color.WHITE);
		NormalBtn.setBounds(0, 410, 360, 45);
		NormalBtn.setBorderPainted(false);

		JButton HardBtn = new JButton("����� <<");
		HardBtn.setFont(f1);
		HardBtn.setBackground(Color.WHITE);
		HardBtn.setBounds(290, 470, 360, 45);
		HardBtn.setBorderPainted(false); // LevelPanel ȭ��

		StartBt.addActionListener(e -> {
			LevelPanel.add(Lb3);
			LevelPanel.add(Lb4);
			LevelPanel.add(NormalBtn);
			LevelPanel.add(HardBtn);
			contentPane.add(LevelPanel);
			StartPanel.setVisible(false);
			contentPane.setVisible(true);
		}); // StartBt ��ư ������ LevelPanel ���̵� ���� �гη� �̵�

		init.MT();

		Font weekfont = new Font("�޸յձ�������", Font.PLAIN, 20);
		JLabel Lb1 = new JLabel();
		Lb1.setText("�������� ��, D-" + init.DdayNumber + "!");
		Lb1.setFont(weekfont);
		Lb1.setBounds(20, 10, 640, 50);

		JLabel dateLb = new JLabel();
		dateLb.setText("Today 2020 " + init.Month + "��" + init.Day + "��  " + init.Today + "����");
		Font datefont = new Font("HY�߰��", Font.PLAIN, 23);
		dateLb.setFont(datefont);
		dateLb.setBounds(310, 10, 600, 40);

		JLabel Lb2 = new JLabel();
		Lb2.setBounds(70, 100, 600, 50);
		Font Lb2font = new Font("HY�߰��", Font.PLAIN, 25);
		Lb2.setFont(Lb2font);
		Lb2.setText("<ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend + ">"); // (N+H)ManuPanelȭ��

		JButton N_MoveBtn = new JButton("Ȱ���ϱ�");
		N_MoveBtn.setFont(f1);
		N_MoveBtn.setBackground(Color.WHITE);
		N_MoveBtn.setBounds(0, 410, 250, 45);
		N_MoveBtn.setBorderPainted(false);
		N_MoveBtn.setFocusPainted(false);

		JButton H_MoveBtn = new JButton("Ȱ���ϱ�");
		H_MoveBtn.setFont(f1);
		H_MoveBtn.setBackground(Color.WHITE);
		H_MoveBtn.setBounds(0, 410, 360, 45);
		H_MoveBtn.setBorderPainted(false);
		H_MoveBtn.setFocusPainted(false);

		NormalBtn.addActionListener(e -> {
			HomePanel.add(Lb1);
			HomePanel.add(dateLb);
			HomePanel.add(Lb2);
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

			HomePanel.setBounds(0, 73, 640, 640);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.add(HomePanel);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // ���̵� ������ HomePanel�� �̵�

		HardBtn.addActionListener(e -> {
			HomePanel.add(Lb1);
			HomePanel.add(dateLb);
			HomePanel.add(Lb2);
			HomePanel.add(H_MoveBtn);

			powers.setLayout(null);
			powers.setBounds(25, 5, 100, 100);
			PL.setBounds(15, 5, 50, 50);
			PL.setFont(powerfont);
			powers.add(PL);
			powers.setVisible(true);
			contentPane.add(powers);

			intellis.setLayout(null);
			intellis.setBounds(110, 5, 100, 100);
			IL.setBounds(18, 5, 50, 50);
			IL.setFont(powerfont);
			intellis.add(IL);
			intellis.setVisible(true);
			contentPane.add(intellis);

			moneys.setLayout(null);
			moneys.setBounds(190, 5, 100, 100);
			ML.setBounds(5, 13, 100, 50);
			ML.setFont(powerfont);
			moneys.add(ML);
			moneys.setVisible(true);
			contentPane.add(moneys);

			friends.setLayout(null);
			friends.setBounds(290, 5, 100, 100);
			FL.setBounds(25, 5, 150, 50);
			FL.setFont(powerfont);
			friends.add(FL);
			friends.setVisible(true);
			contentPane.add(friends);

			HomePanel.setBounds(0, 73, 640, 640);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.add(HomePanel);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // ���̵� ������ HomePanel�� �̵�

		JButton N_LBtn = new JButton("���� ���");
		N_LBtn.setFont(Ȱ�����ù�ư��Ʈ);
		N_LBtn.setBounds(195, 80, 130, 30);
		N_LBtn.setBackground(new Color(153, 239, 90));
		N_LBtn.setBorderPainted(false);
		N_LBtn.setFocusPainted(false);

		JLabel detail = new JLabel("[�䱸 �ɷ�ġ: ü�� 20, �� 10000]");
		detail.setFont(Ȱ��������Ʈ);
		detail.setBounds(157, 110, 230, 30);

		JLabel detailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ���� 5~20]");
		detailL.setFont(Ȱ��������Ʈ);
		detailL.setBounds(155, 135, 230, 30);

		N_LBtn.addActionListener(event -> {
			init.N_Cold();
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽������
				StartPanel.setVisible(false);
			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "���� ��� �� �̻� �� �� �����ϴ�", "���", JOptionPane.WARNING_MESSAGE); // �޽���
																												// ���

			} else
				new N_Lecture(Lb1, Lb2);
		}); // N_Lecture Ŭ���� �̵�

		JButton N_SBtn = new JButton("�����ϱ�");
		N_SBtn.setFont(Ȱ�����ù�ư��Ʈ);
		N_SBtn.setBounds(255, 325, 100, 30);
		N_SBtn.setBackground(new Color(210, 89, 242));
		N_SBtn.setFocusPainted(false);
		N_SBtn.setBorderPainted(false);

		JLabel sdetail = new JLabel("[�䱸�ɷ�ġ: ü�� 15]");
		sdetail.setFont(Ȱ��������Ʈ);
		sdetail.setBounds(245, 355, 230, 30);

		JLabel sdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ���� 10~30]");
		sdetailL.setFont(Ȱ��������Ʈ);
		sdetailL.setBounds(205, 380, 230, 30);

		N_SBtn.addActionListener(event -> {
			init.N_Cold();
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new N_Study(PL,IL,ML,FL);
		}); // N_Study Ŭ���� �̵�

		JButton N_PtBtn = new JButton("�˹ٰ���");
		N_PtBtn.setFont(Ȱ�����ù�ư��Ʈ);
		N_PtBtn.setBounds(390, 100, 100, 30);
		N_PtBtn.setBackground(new Color(241, 228, 90));
		N_PtBtn.setFocusPainted(false);
		N_PtBtn.setBorderPainted(false);

		JLabel pdetail = new JLabel("[�䱸 �ɷ�ġ: ü�� 25]");
		pdetail.setFont(Ȱ��������Ʈ);
		pdetail.setBounds(380, 133, 230, 30);

		JLabel pdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: �� 2~40000]");
		pdetailL.setFont(Ȱ��������Ʈ);
		pdetailL.setBounds(350, 158, 230, 30);

		JLabel bonus = new JLabel("���ʽ��� ���� �� ��������?");
		Font bonusfont = new Font("HY�߰��", Font.BOLD, 12);
		bonus.setFont(bonusfont);
		bonus.setBounds(380, 183, 200, 30);

		N_PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new N_PartTime();
		}); // N_PartTime Ŭ���� �̵�

		JButton N_RestBtn = new JButton("���");
		N_RestBtn.setFont(Ȱ�����ù�ư��Ʈ);
		N_RestBtn.setBounds(80, 250, 112, 30);
		N_RestBtn.setBackground(new Color(89, 205, 242));
		N_RestBtn.setFocusPainted(false);
		N_RestBtn.setBorderPainted(false);

		JLabel rdetail = new JLabel("[�䱸�ɷ�ġ: ü�� 20 �� 20000]");
		rdetail.setFont(Ȱ��������Ʈ);
		rdetail.setBounds(50, 280, 200, 30);

		JLabel rdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ģȭ�� 10~30]");
		rdetailL.setFont(Ȱ��������Ʈ);
		rdetailL.setBounds(37, 305, 250, 30);

		N_RestBtn.addActionListener(event -> {
			new N_Rest(Lb1, Lb2);
		}); // N_Rest Ŭ���� �̵�

		JButton N_BackBtn = new JButton("�ڷΰ���");
		N_BackBtn.setFont(Ȱ�����ù�ư��Ʈ);
		N_BackBtn.setBounds(430, 300, 130, 30);
		N_BackBtn.setBackground(new Color(245, 92, 183));
		N_BackBtn.setFocusPainted(false);
		N_BackBtn.setBorderPainted(false);

		N_BackBtn.addActionListener(event -> {

			N_MenuPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // �ٽ� �̵��ϱ� ������ �ƹ� â�� �ȶ�... ����

		N_MoveBtn.addActionListener(e -> {
			N_MenuPanel.add(Lb1);
			N_MenuPanel.add(N_LBtn);
			N_MenuPanel.add(detail);
			N_MenuPanel.add(detailL); // ���ǹ�ư
			N_MenuPanel.add(N_SBtn);
			N_MenuPanel.add(sdetail);
			N_MenuPanel.add(sdetailL); // �����ϱ��ư
			N_MenuPanel.add(N_PtBtn);
			N_MenuPanel.add(pdetail);
			N_MenuPanel.add(pdetailL);
			N_MenuPanel.add(bonus); // �˹ٹ�ư
			N_MenuPanel.add(N_RestBtn);
			N_MenuPanel.add(rdetail);
			N_MenuPanel.add(rdetailL); // �޽Ĺ�ư
			N_MenuPanel.add(N_BackBtn);

			N_MenuPanel.setBounds(0, 110, 640, 640);
			contentPane.add(N_MenuPanel);
			HomePanel.setVisible(false);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.setVisible(true);

		});
		JButton H_LBtn = new JButton("���� ���");
		H_LBtn.setFont(Ȱ�����ù�ư��Ʈ);
		H_LBtn.setBounds(195, 80, 130, 30);
		H_LBtn.setBackground(new Color(153, 239, 90));
		H_LBtn.setBorderPainted(false);
		H_LBtn.setFocusPainted(false);

		JLabel Hdetail = new JLabel("[�䱸 �ɷ�ġ: ü�� 30 �� 20000]");
		Hdetail.setFont(Ȱ��������Ʈ);
		Hdetail.setBounds(157, 110, 230, 30);

		JLabel HdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ���� 5~20]");

		HdetailL.setFont(Ȱ��������Ʈ);
		HdetailL.setBounds(155, 135, 230, 30);

		H_LBtn.addActionListener(event -> {

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
		H_SBtn.setFont(Ȱ�����ù�ư��Ʈ);
		H_SBtn.setBounds(255, 325, 100, 30);
		H_SBtn.setBackground(new Color(210, 89, 242));
		H_SBtn.setFocusPainted(false);
		H_SBtn.setBorderPainted(false);

		JLabel Hsdetail = new JLabel("[�䱸�ɷ�ġ: ü�� 15]");
		Hsdetail.setFont(Ȱ��������Ʈ);
		Hsdetail.setBounds(245, 355, 230, 30);

		JLabel HsdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ���� 5~20]");
		HsdetailL.setFont(Ȱ��������Ʈ);
		HsdetailL.setBounds(205, 380, 230, 30);

		H_SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new H_Study(Lb1, Lb2);
		}); // H_Study Ŭ���� �̵�

		JButton H_PtBtn = new JButton("�˹ٰ���");
		H_PtBtn.setFont(Ȱ�����ù�ư��Ʈ);
		H_PtBtn.setBounds(390, 100, 100, 30);
		H_PtBtn.setBackground(new Color(241, 228, 90));
		H_PtBtn.setFocusPainted(false);
		H_PtBtn.setBorderPainted(false);

		JLabel Hpdetail = new JLabel("[�䱸 �ɷ�ġ: ü�� 30]");
		Hpdetail.setFont(Ȱ��������Ʈ);
		Hpdetail.setBounds(380, 133, 230, 30);

		JLabel HpdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: �� 1~40000]");
		HpdetailL.setFont(Ȱ��������Ʈ);
		HpdetailL.setBounds(350, 158, 230, 30);

		JLabel Hbonus = new JLabel("���ʽ��� ���� �� ��������?");
		Hbonus.setFont(bonusfont);
		Hbonus.setBounds(380, 183, 200, 30);

		H_PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new H_PartTime(Lb1, Lb2);
		}); // H_PartTime Ŭ���� �̵�

		JButton H_RestBtn = new JButton("���");
		H_RestBtn.setFont(Ȱ�����ù�ư��Ʈ);
		H_RestBtn.setBounds(80, 250, 112, 30);
		H_RestBtn.setBackground(new Color(89, 205, 242));
		H_RestBtn.setFocusPainted(false);
		H_RestBtn.setBorderPainted(false);

		JLabel Hrdetail = new JLabel("[�䱸�ɷ�ġ: ü�� 20 �� 30000]");
		Hrdetail.setFont(Ȱ��������Ʈ);
		Hrdetail.setBounds(50, 280, 200, 30);

		JLabel HrdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ģȭ�� 5~20]");
		HrdetailL.setFont(Ȱ��������Ʈ);
		HrdetailL.setBounds(37, 305, 250, 30);

		H_RestBtn.addActionListener(event -> {
			new H_Rest(Lb1, Lb2);
		}); // H_Rest Ŭ���� �̵�

		JButton H_BackBtn = new JButton("�ڷΰ���");
		H_BackBtn.setFont(Ȱ�����ù�ư��Ʈ);
		H_BackBtn.setBounds(430, 300, 130, 30);
		H_BackBtn.setBackground(new Color(245, 92, 183));
		H_BackBtn.setFocusPainted(false);
		H_BackBtn.setBorderPainted(false);

		H_BackBtn.addActionListener(event -> {

			HomePanel.add(Lb1);
			HomePanel.add(dateLb);
			HomePanel.add(Lb2);
			HomePanel.add(H_MoveBtn);

			HomePanel.setBounds(0, 73, 640, 640);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.add(HomePanel);
			LevelPanel.setVisible(false);
			contentPane.setVisible(true);
			contentPane.setBackground(Color.WHITE);
		}); // �ٽ� �̵��ϱ� ������ �ƹ� â�� �ȶ�... ����

		H_MoveBtn.addActionListener(e -> {
			H_MenuPanel.add(Lb1);
			H_MenuPanel.add(H_LBtn);
			H_MenuPanel.add(Hdetail);
			H_MenuPanel.add(HdetailL);// ���ǹ�ư
			H_MenuPanel.add(H_SBtn);
			H_MenuPanel.add(Hsdetail);
			H_MenuPanel.add(HsdetailL); // �����ϱ��ư
			H_MenuPanel.add(H_PtBtn);
			H_MenuPanel.add(Hpdetail);
			H_MenuPanel.add(HpdetailL);
			H_MenuPanel.add(Hbonus); // �˹ٹ�ư
			H_MenuPanel.add(H_RestBtn);
			H_MenuPanel.add(Hrdetail);
			H_MenuPanel.add(HrdetailL); // �޽Ĺ�ư
			H_MenuPanel.add(H_BackBtn);

			H_MenuPanel.setBounds(0, 110, 640, 640);
			contentPane.add(H_MenuPanel);
			HomePanel.setVisible(false);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.setVisible(true);

		});
		setSize(655, 650);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}
}
