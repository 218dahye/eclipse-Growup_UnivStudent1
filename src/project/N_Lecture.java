package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

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
		setSize(800, 680);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(lectureimg, 0, 0, null);
	}
}

@SuppressWarnings("serial")
class N_Lecture extends JFrame {
	Container contentPane;
	JButton button1 = new JButton("N1. ���¼ҽ�����Ʈ����");
	JButton button2 = new JButton("N2. �����ͺ��̽�");
	JButton button3 = new JButton("N3. ������ȣ");
	JLabel ��ư1������ = new JLabel("1) ���� ������: �����米����");
	JLabel ��ư1������� = new JLabel("2) ���� ���: ��7514");
	JLabel ��ư1�����ڷ� = new JLabel("3) ����: LMS �����ڷ� ");
	JLabel ��ư2������ = new JLabel("1) ���� ������: ���α汳����");
	JLabel ��ư2������� = new JLabel("2) ���� ���: ��7507");
	JLabel ��ư2�����ڷ� = new JLabel("3) ����: ����Ŭ�� ���� �����ͺ��̽� ");
	JLabel ��ư3������ = new JLabel("1) ���� ������: ��â�Ʊ�����");
	JLabel ��ư3������� = new JLabel("2) ���� ���: ��7714");
	JLabel ��ư3�����ڷ� = new JLabel("3) ����: ����Ŭ�� ���� �����ͺ��̽� ");
	JLabel Ÿ��Ʋ = new JLabel("���Ǽ���");
	JButton button4 = new JButton("�ڷΰ���");

	 JLabel ���۸�Ʈ = new JLabel();
	 Font ��緹�̺���Ʈ = new Font("HY�߰��", Font.PLAIN, 15);
	 JLabel �����Ը�Ʈ = new JLabel();
	 JLabel �ý��۸�Ʈ = new JLabel("������ ������! ���Ǹ� �� ������?");
	 JLabel �˸���Ʈ = new JLabel();
	 
	N_Lecture(JLabel Lb1, JLabel Lb2) {
		setTitle("���ǵ��");
		contentPane = getContentPane();
		setLayout(null);

		check.setLayout(null);
		check.setBounds(0, 30, 200, 40);
		lecturelist.setLayout(null);
		lecturelist.setBounds(194, 10, 640, 640);
		back.setLayout(null);
		back.setBounds(0, 73, 200, 40);

		Font lecture = new Font("�޸տ�ü", Font.BOLD, 22);
		Font labelfont = new Font("HY�߰��", Font.PLAIN, 15);
		Font titlefont = new Font("HY������M", Font.BOLD, 20);

		MainGrowStudent.contentPane.add(Ÿ��Ʋ);
		MainGrowStudent.contentPane.add(check);

		MainGrowStudent.contentPane.add(�ڷΰ���);
		MainGrowStudent.contentPane.add(back);

		�ڷΰ���.setVisible(true);
		�ڷΰ���.setBounds(0, 73, 120, 35);
		�ڷΰ���.setBorderPainted(false);
		�ڷΰ���.setFocusPainted(false);
		�ڷΰ���.setBackground(new Color(230, 62, 34));
		�ڷΰ���.setFont(titlefont);
		Ÿ��Ʋ.setVisible(true);
		Ÿ��Ʋ.setBounds(17, 20, 300, 60);
		Ÿ��Ʋ.setFont(titlefont);
		button1.setFont(lecture);
		button2.setFont(lecture);
		button3.setFont(lecture);

		��ư1������.setBounds(95, 155, 500, 20);
		��ư1�������.setBounds(95, 175, 200, 20);
		��ư1�����ڷ�.setBounds(95, 195, 200, 20);

		��ư1������.setFont(labelfont);
		��ư1�������.setFont(labelfont);
		��ư1�����ڷ�.setFont(labelfont);

		��ư2������.setBounds(95, 295, 500, 20);
		��ư2�������.setBounds(95, 315, 500, 20);
		��ư2�����ڷ�.setBounds(95, 335, 500, 20);

		��ư2������.setFont(labelfont);
		��ư2�������.setFont(labelfont);
		��ư2�����ڷ�.setFont(labelfont);

		��ư3������.setBounds(95, 455, 500, 20);
		��ư3�������.setBounds(95, 475, 500, 20);
		��ư3�����ڷ�.setBounds(95, 495, 500, 20);

		��ư3������.setFont(labelfont);
		��ư3�������.setFont(labelfont);
		��ư3�����ڷ�.setFont(labelfont);

		lecturelist.add(��ư1������);
		lecturelist.add(��ư1�������);
		lecturelist.add(��ư1�����ڷ�);
		lecturelist.add(��ư2������);
		lecturelist.add(��ư2�������);
		lecturelist.add(��ư2�����ڷ�);
		lecturelist.add(��ư3������);
		lecturelist.add(��ư3�������);
		lecturelist.add(��ư3�����ڷ�);
		lecturelist.add(button1);
		lecturelist.add(button2);
		lecturelist.add(button3);

		// MainGrowStudent.contentPane.add(Ÿ��Ʋ);
		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);

		button1.setFocusPainted(false);
		button2.setFocusPainted(false);
		button3.setFocusPainted(false);

		button1.setBorderPainted(false);
		button2.setBorderPainted(false);
		button3.setBorderPainted(false);

		// ����.setBounds(10, 5, 400, 40);
		// lecturelist.add(����);
		button1.setBounds(50, 110, 300, 30);
		button2.setBounds(50, 250, 228, 30);
		button3.setBounds(56, 410, 170, 30);

		lecturelist.setVisible(true);

		button1.addActionListener(event -> {
			init.N_intelli_up();
			Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " + init.Today
					+ "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.N_intelli_up();
			Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " + init.Today
					+ "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.N_intelli_up();
			Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " + init.Today
					+ "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button4.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "�ڷ� �̵��մϴ�", "�ڷ� �̵�", JOptionPane.INFORMATION_MESSAGE); // �޽���
			dispose();
		});
		setSize(800, 680);
		setVisible(true);
	}

}
