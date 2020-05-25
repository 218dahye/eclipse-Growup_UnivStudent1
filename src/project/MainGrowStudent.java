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
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage()); // �̹��� �г� ��ü ����
	JLabel click = new JLabel("click");
	JLabel powerlabel = new JLabel("" + init.Power);
	JLabel ü��Ȯ�η��̺� = new JLabel();
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
		Lb1.setBounds(10, 30, 640, 50);

		JLabel dateLb = new JLabel();
		dateLb.setText("Today 2020 " + init.Month + "��" + init.Day + "��  " + init.Today + "����");
		Font datefont = new Font("HY�߰��", Font.PLAIN, 23);
		dateLb.setFont(datefont);
		dateLb.setBounds(10, 0, 600, 40);

		JLabel Lb2 = new JLabel();
		Lb2.setBounds(350, 0, 600, 50);
		Font Lb2font = new Font("HY�߰��", Font.PLAIN, 15);
		Lb2.setFont(Lb2font);
		Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend); // (N+H)ManuPanelȭ��

		JButton LBtn = new JButton("���� ���");
		LBtn.setFont(Ȱ�����ù�ư��Ʈ);
		LBtn.setBounds(195, 80, 130, 30);
		LBtn.setBackground(new Color(153, 239, 90));
		LBtn.setBorderPainted(false);
		LBtn.setFocusPainted(false);

		JLabel detail = new JLabel("[�䱸 �ɷ�ġ: ü�� 20]");
		detail.setFont(Ȱ��������Ʈ);
		detail.setBounds(197, 110, 230, 30);

		JLabel detailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ���� 5~20]");
		detailL.setFont(Ȱ��������Ʈ);
		detailL.setBounds(155, 135, 230, 30);

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

		JButton SBtn = new JButton("�����ϱ�");
		SBtn.setFont(Ȱ�����ù�ư��Ʈ);
		SBtn.setBounds(255, 325, 100, 30);
		SBtn.setBackground(new Color(210, 89, 242));
		SBtn.setFocusPainted(false);
		SBtn.setBorderPainted(false);

		JLabel sdetail = new JLabel("[�䱸�ɷ�ġ: ü�� 15]");
		sdetail.setFont(Ȱ��������Ʈ);
		sdetail.setBounds(245, 355, 230, 30);

		JLabel sdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ���� 5~20]");
		sdetailL.setFont(Ȱ��������Ʈ);
		sdetailL.setBounds(220, 380, 230, 30);

		SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new N_Study(Lb1, Lb2);
		}); // N_Study Ŭ���� �̵�

		JButton PtBtn = new JButton("�˹ٰ���");
		PtBtn.setFont(Ȱ�����ù�ư��Ʈ);
		PtBtn.setBounds(390, 100, 100, 30);
		PtBtn.setBackground(new Color(241, 228, 90));
		PtBtn.setFocusPainted(false);
		PtBtn.setBorderPainted(false);

		JLabel pdetail = new JLabel("[�䱸 �ɷ�ġ: ü�� 25]");
		pdetail.setFont(Ȱ��������Ʈ);
		pdetail.setBounds(385, 133, 230, 30);

		JLabel pdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: �� 2~40000]");
		pdetailL.setFont(Ȱ��������Ʈ);
		pdetailL.setBounds(359, 158, 230, 30);

		JLabel bonus = new JLabel("���ʽ��� ���� �� ��������?");
		Font bonusfont = new Font("HY�߰��", Font.BOLD, 12);
		bonus.setFont(bonusfont);
		bonus.setBounds(380, 183, 200, 30);

		PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new N_PartTime(Lb1, Lb2);
		}); // N_PartTime Ŭ���� �̵�

		JButton PlayBtn = new JButton("ģ���� ���");
		PlayBtn.setFont(Ȱ�����ù�ư��Ʈ);
		PlayBtn.setBounds(430, 300, 130, 30);
		PlayBtn.setBackground(new Color(243, 91, 182));
		PlayBtn.setBorderPainted(false);
		PlayBtn.setFocusPainted(false);

		JLabel Playdetail = new JLabel("[�䱸 �ɷ�ġ: ü�� 20 �� 30000]");
		Playdetail.setFont(Ȱ��������Ʈ);
		Playdetail.setBounds(430, 330, 230, 30);

		JLabel PlaydetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ģȭ��  1~20]");
		PlaydetailL.setFont(Ȱ��������Ʈ);
		PlaydetailL.setBounds(410, 355, 230, 30);

		PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "���� ��� �� �̻� �� �� �����ϴ�", "���", JOptionPane.WARNING_MESSAGE); // �޽���
																												// ���
			} else
				new N_Play(Lb1, Lb2);
		}); // N_Play Ŭ���� �̵�

		JButton RestBtn = new JButton("�޽��ϱ�");
		RestBtn.setFont(Ȱ�����ù�ư��Ʈ);
		RestBtn.setBounds(80, 250, 112, 30);
		RestBtn.setBackground(new Color(89, 205, 242));
		RestBtn.setFocusPainted(false);
		RestBtn.setBorderPainted(false);

		JLabel rdetail = new JLabel("[�䱸�ɷ�ġ: ����]");
		rdetail.setFont(Ȱ��������Ʈ);
		rdetail.setBounds(85, 280, 200, 30);

		JLabel rdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ü�� 1~30]");
		rdetailL.setFont(Ȱ��������Ʈ);
		rdetailL.setBounds(55, 305, 200, 30);

		RestBtn.addActionListener(event -> {
			new N_Rest(Lb1, Lb2);
		}); // N_Rest Ŭ���� �̵�

		NormalBtn.addActionListener(e -> {
			N_MenuPanel.add(Lb1);
			N_MenuPanel.add(dateLb);
			N_MenuPanel.add(Lb2);
			N_MenuPanel.add(LBtn);
			N_MenuPanel.add(detail);
			N_MenuPanel.add(detailL); // ���ǹ�ư
			N_MenuPanel.add(SBtn);
			N_MenuPanel.add(sdetail);
			N_MenuPanel.add(sdetailL); // �����ϱ��ư
			N_MenuPanel.add(PtBtn);
			N_MenuPanel.add(pdetail);
			N_MenuPanel.add(pdetailL);
			N_MenuPanel.add(bonus); // �˹ٹ�ư
			N_MenuPanel.add(PlayBtn);
			N_MenuPanel.add(Playdetail);
			N_MenuPanel.add(PlaydetailL); // ģ���ͳ���ư
			N_MenuPanel.add(RestBtn);
			N_MenuPanel.add(rdetail);
			N_MenuPanel.add(rdetailL); // �޽Ĺ�ư

			powers.setLayout(null);
			powers.setBounds(25, 5, 80, 80);
			powerlabel.setBounds(15, 15, 40, 30);
			powerlabel.setFont(powerfont);
			powers.add(powerlabel);
			powers.setVisible(true);
			contentPane.add(powers);

			N_MenuPanel.setBounds(0, 110, 640, 640);
			contentPane.add(N_MenuPanel);
			LevelPanel.setVisible(false);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.setVisible(true);
		}); // ���̵� ������ N_MenuPanel�� �̵�
		
		JLabel Hdetail = new JLabel("[�䱸 �ɷ�ġ: ü�� 30]");
		Hdetail.setFont(Ȱ��������Ʈ);
		Hdetail.setBounds(197, 110, 230, 30);

		JLabel HdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ���� 5~20]");
		HdetailL.setFont(Ȱ��������Ʈ);
		HdetailL.setBounds(155, 135, 230, 30);

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

		JLabel Hsdetail = new JLabel("[�䱸�ɷ�ġ: ü�� 15]");
		Hsdetail.setFont(Ȱ��������Ʈ);
		Hsdetail.setBounds(245, 355, 230, 30);

		JLabel HsdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ���� 5~20]");
		HsdetailL.setFont(Ȱ��������Ʈ);
		HsdetailL.setBounds(220, 380, 230, 30);
		
		SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new H_Study(Lb1, Lb2);
		}); // H_Study Ŭ���� �̵�

		JLabel Hpdetail = new JLabel("[�䱸 �ɷ�ġ: ü�� 25]");
		Hpdetail.setFont(Ȱ��������Ʈ);
		Hpdetail.setBounds(385, 133, 230, 30);

		JLabel HpdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: �� 2~40000]");
		HpdetailL.setFont(Ȱ��������Ʈ);
		HpdetailL.setBounds(359, 158, 230, 30);

		JLabel Hbonus = new JLabel("���ʽ��� ���� �� ��������?");
		Hbonus.setFont(bonusfont);
		Hbonus.setBounds(380, 183, 200, 30);
		
		PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else
				new H_PartTime(Lb1, Lb2);
		}); // H_PartTime Ŭ���� �̵�

		JLabel HPlaydetail = new JLabel("[�䱸 �ɷ�ġ: ü�� 20 �� 30000]");
		HPlaydetail.setFont(Ȱ��������Ʈ);
		HPlaydetail.setBounds(430, 330, 230, 30);

		JLabel HPlaydetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ģȭ��  1~20]");
		HPlaydetailL.setFont(Ȱ��������Ʈ);
		HPlaydetailL.setBounds(410, 355, 230, 30);
		
		PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "ü���� " + init.Power + "�Դϴ�" + "\nü���� ��� �� �̻� �� �� �����ϴ�", "���",
						JOptionPane.WARNING_MESSAGE); // �޽��� ���

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "���� ��� �� �̻� �� �� �����ϴ�", "���", JOptionPane.WARNING_MESSAGE); // �޽���
																												// ���
			} else
				new H_Play(Lb1, Lb2);
		}); // H_Play Ŭ���� �̵�

		JLabel Hrdetail = new JLabel("[�䱸�ɷ�ġ: ����]");
		Hrdetail.setFont(Ȱ��������Ʈ);
		Hrdetail.setBounds(85, 280, 200, 30);

		JLabel HrdetailL = new JLabel("[���� �� �ִ� �ɷ�ġ: ü�� 1~30]");
		HrdetailL.setFont(Ȱ��������Ʈ);
		HrdetailL.setBounds(55, 305, 200, 30);
		
		RestBtn.addActionListener(event -> {
			new H_Rest(Lb1, Lb2);
		}); // H_Rest Ŭ���� �̵�

		HardBtn.addActionListener(e -> {
			H_MenuPanel.add(Lb1);
			H_MenuPanel.add(dateLb);
			H_MenuPanel.add(Lb2);
			H_MenuPanel.add(LBtn);
			H_MenuPanel.add(Hdetail);
			H_MenuPanel.add(HdetailL); // ���ǹ�ư
			H_MenuPanel.add(SBtn);
			H_MenuPanel.add(Hsdetail);
			H_MenuPanel.add(HsdetailL); // �����ϱ��ư
			H_MenuPanel.add(PtBtn);
			H_MenuPanel.add(Hpdetail);
			H_MenuPanel.add(HpdetailL);
			H_MenuPanel.add(Hbonus); // �˹ٹ�ư
			H_MenuPanel.add(PlayBtn);
			H_MenuPanel.add(HPlaydetail);
			H_MenuPanel.add(HPlaydetailL); // ģ���ͳ���ư
			H_MenuPanel.add(RestBtn);
			H_MenuPanel.add(Hrdetail);
			H_MenuPanel.add(HrdetailL); // �޽Ĺ�ư

			powers.setLayout(null);
			powers.setBounds(25, 5, 80, 80);
			powerlabel.setBounds(15, 15, 40, 30);
			powerlabel.setFont(powerfont);
			powers.add(powerlabel);
			powers.setVisible(true);
			contentPane.add(powers);

			H_MenuPanel.setBounds(0, 110, 640, 640);
			contentPane.add(H_MenuPanel);
			LevelPanel.setVisible(false);
			contentPane.setBounds(0, 0, 640, 109);
			contentPane.setVisible(true);
		}); // ���̵� ������ H_MenuPanel�� �̵�

		setSize(655, 650);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}
}
