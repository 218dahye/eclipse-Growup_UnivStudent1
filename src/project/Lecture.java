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
		setSize(800, 680);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(lectureimg, 0, 0, null);
	}
}

@SuppressWarnings("serial")
class Lecture extends JFrame {
	Container contentPane;
	JButton button1 = new JButton("���¼ҽ�����Ʈ����");
	JButton button2 = new JButton("�����ͺ��̽�");
	JButton button3 = new JButton("������ȣ");
	JButton button4 = new JButton("�ڷΰ���");

	Lecture(JLabel Lb1, JLabel Lb2) {
		setTitle("���ǵ��");
		contentPane = getContentPane();
		setLayout(null);

		JLabel LLb1 = new JLabel();
		LLb1.setText("� ������ ���Ǹ� �����ðڽ��ϱ�?");
		LLb1.setBounds(130, 130, 600, 30);

		Font label4font = new Font("monospaced", Font.BOLD, 30);
		LLb1.setFont(label4font);

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
		Panel.add(LLb1);
		Panel.add(button1);
		Panel.add(button2);
		Panel.add(button3);
		Panel.add(button4);

		contentPane.add(Panel);

		button1.addActionListener(event -> {
			init.intelli_up();
			Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " + init.Today + "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.intelli_up();
			Lb1.setText("�������� D-" + init.DdayNumber + " 2020��  " + init.Month + "��  " + init.Day + "��  " + init.Today + "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.intelli_up();
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
