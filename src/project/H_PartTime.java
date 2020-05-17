package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class H_PartTime extends JFrame {
	Container contentPane;
	JButton button1 = new JButton("������");
	JButton button2 = new JButton("��ȭ��");
	JButton button3 = new JButton("���̽�ũ��");
	JButton button4 = new JButton("�ڷΰ���");

	H_PartTime(JLabel Lb1, JLabel Lb2) {
		setTitle("�˹ٰ���");
		contentPane = getContentPane();
		setLayout(null);

		JLabel PtLb1 = new JLabel();
		PtLb1.setText("��� ������ �˹ٸ� ���ðڽ��ϱ�?");
		PtLb1.setBounds(270, 140, 600, 20);

		Font label4font = new Font("monospaced", Font.BOLD, 30);
		PtLb1.setFont(label4font);
		
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);

		button1.setBounds(235, 260, 300, 50);
		button2.setBounds(235, 330, 300, 50);
		button3.setBounds(235, 400, 300, 50);
		button4.setBounds(235, 470, 300, 50);

		Font f4 = new Font("�޸տ�����", Font.BOLD, 25);
		button1.setFont(f4);
		button2.setFont(f4);
		button3.setFont(f4);
		button4.setFont(f4);

		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);
		button4.setBackground(Color.WHITE);

		lectureImagePanel Panel = new lectureImagePanel(new ImageIcon("./image/lecture.jpg").getImage());
		Panel.setLayout(null);
		Panel.add(PtLb1);
		Panel.add(button1);
		Panel.add(button2);
		Panel.add(button3);
		Panel.add(button4);

		contentPane.add(Panel);

		button1.addActionListener(event -> {
			init.H_money_up();
			Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " + init.Today + "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.H_money_up();
			Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " + init.Today + "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.H_money_up();
			Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " + init.Today + "����");
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
