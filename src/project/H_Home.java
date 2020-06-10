package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class H_Home extends JFrame {

	Container contentPane;

	subImagePanel HomePanel = new subImagePanel(new ImageIcon("./image/home.png").getImage());
	subImagePanel powers = new subImagePanel(new ImageIcon("./image/power.png").getImage());
	subImagePanel intellis = new subImagePanel(new ImageIcon("./image/intelli.png").getImage());
	subImagePanel moneys = new subImagePanel(new ImageIcon("./image/money.png").getImage());
	subImagePanel friends = new subImagePanel(new ImageIcon("./image/friend.png").getImage());
	subImagePanel dates = new subImagePanel(new ImageIcon("./image/date3.png").getImage());

	JLabel ü��Ȯ�η��̺� = new JLabel();
	JLabel ����Ȯ�η��̺� = new JLabel();
	JLabel ��Ȯ�η��̺� = new JLabel();
	JLabel ģ��Ȯ�η��̺� = new JLabel();

	JButton SelectBtn = new JButton("Ȱ������");
	JButton EndBtn = new JButton("�ϰ� ����");

	Font powerfont = new Font("HY������M", Font.BOLD, 15);
	Font f1 = new Font("�޸յձ�������", Font.PLAIN, 22);

	static int cnt=0;

	H_Home(JLabel PL, JLabel IL, JLabel ML, JLabel FL, JLabel DL) {
		setTitle("Ȩ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(655, 655);
		contentPane = getContentPane();

		JLabel dateLb = new JLabel();
		dateLb.setText("Today 2020�� " + init.Month + "��" + init.Day + "��  ");
		Font datefont = new Font("HY�߰��", Font.PLAIN, 23);
		dateLb.setFont(datefont);
		dateLb.setBounds(380, 10, 600, 40);
		dateLb.setVisible(true);
		HomePanel.add(dateLb);

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

		dates.setLayout(null);
		dates.setBounds(390, 5, 100, 100);
		DL.setText("D- " + init.DdayNumber);
		DL.setBounds(12, 16, 150, 50);
		DL.setFont(powerfont);
		dates.add(DL);
		dates.setVisible(true);
		contentPane.add(dates);

		PL.setText("" + init.Power);
		IL.setText("" + init.Intelli);
		ML.setText("" + init.Money);
		FL.setText("" + init.Friend);
		DL.setText("D- " + init.DdayNumber);

		MainGrowStudent.N_MenuPanel.setVisible(false);
		HomePanel.setLayout(null);
		HomePanel.setBounds(0, 0, 640, 452);
		HomePanel.setVisible(true);
		contentPane.add(HomePanel);

		contentPane.setLayout(null);
		contentPane.setBounds(0, 450, 640, 200);
		contentPane.setBackground(Color.WHITE);
		contentPane.setVisible(true);

		if (init.Power <= 40 && cnt == 0) {
			for (cnt = 0; cnt < 1; cnt++) {
				init.Day += 1;
				init.DdayNumber -= 1;
				init.Power += 20;
				JOptionPane.showMessageDialog(null, "ü���� �������� ���⿡ �ɷȴ�!\n���� �Ϸ絿�� ������ ����߰ڴ�", "����",
						JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "�Ϸ絿�� ��� ü���� 20��ŭ �ö���!", "ü�� ȸ��", JOptionPane.INFORMATION_MESSAGE);

			}
		}

		if (init.DdayNumber <= 0) {

			if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "�������� �̵��մϴ�!", "����", JOptionPane.INFORMATION_MESSAGE);
				new BeggarEnding();
			} else if (init.Money >= 500000) {
				JOptionPane.showMessageDialog(null, "�������� �̵��մϴ�!", "����", JOptionPane.INFORMATION_MESSAGE);
				new CafeEnding();
			} else if (init.��ݱٷ� >= 40) {
				JOptionPane.showMessageDialog(null, "�������� �̵��մϴ�!", "����", JOptionPane.INFORMATION_MESSAGE);
				new ExerciseEnding();
			} else if (init.���ص� >= 90) {
				JOptionPane.showMessageDialog(null, "���� �������� �̵��մϴ�!", "����", JOptionPane.INFORMATION_MESSAGE);
				new IntelliEnding();
			} else if (init.Friend >= 85) {
				JOptionPane.showMessageDialog(null, "�������� �̵��մϴ�!", "����", JOptionPane.INFORMATION_MESSAGE);
				new FriendEnding();
			}
		}

	}

}