package project;

import javax.swing.JOptionPane;

class init {
	static int DdayNumber = 14;
	static int Power = 100;
	static int Money = 50000;
	static int Friend = 0;
	static int Intelli = 0;
	static int Month = 5;
	static int Day = 1;
	static String Daily[] = { "��", "��", "��", "��", "ȭ", "��", "��" };
	static String Today = null;
	static int ���ص� = 0;

	static int newpower;
	static int ��ݱٷ� = 0;

	static void MT() {
		if (Month == 5) {
			Today = Daily[Day % 7 - 1];

		} else if (Month == 5 && Day == 32) {
			Day = 1;
			Today = Daily[Day % 7 + 2];
		}
	}

	static void N_helth() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			��ݱٷ� += 10;
			JOptionPane.showMessageDialog(null, "3�� � + ������� ����ִ� �嵦�ö��̱��� �߾�!\n ��ݱٷ� +10�� ������ϴ�.", "�ʹ� �����",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 14) {
			��ݱٷ� += 8;
			JOptionPane.showMessageDialog(null, "3�� ��� ���¾�!\n ��ݱٷ� +8�� ������ϴ�.!", "�Ҹ� ��",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			��ݱٷ� += 5;
			JOptionPane.showMessageDialog(null, "3�� ����� ���߾�.. �ʹ� ���絥?\n ��ݱٷ� +5�� ������ϴ�.!", "�����",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
		MT();

	}

	static void H_helth() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 10) {
			��ݱٷ� += 15;
			JOptionPane.showMessageDialog(null, "3�� � + ������� ����ִ� �嵦�ö��̱��� �߾�!\n ��ݱٷ� +15�� ������ϴ�.", "�ʹ� �����",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 5) {
			��ݱٷ� += 10;
			JOptionPane.showMessageDialog(null, "3�� ��� ���¾� !\n ��ݱٷ� +10�� ������ϴ�.!", "�Ҹ� ��",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			��ݱٷ� += 8;
			JOptionPane.showMessageDialog(null, "3�� ����� ���߾�.. �ʹ� ���絥?\n ��ݱٷ� +8�� ������ϴ�.!", "�����",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 30;
		Day += 1;
		DdayNumber -= 1;
		MT();

	}

	public static void ü������() {
		if (Power <= 0) {
			JOptionPane.showMessageDialog(null, "ü���� " + Power + "��  ü���� ��� �� �̻� �� �� �����ϴ�", "���",
					JOptionPane.WARNING_MESSAGE); // �޽������
			DdayNumber--;
			Day++;

		}

	}

	public static int N_partampower() {
		Power = Power - 25;
		return Power;
	}

	public static int getpower() {
		return Power;
	}

	static void ����() {
		���ص� += 5;
		// DdayNumber--;
		JOptionPane.showMessageDialog(null, "���ص��� 5 �����߽��ϴ�!", "���ص�", JOptionPane.INFORMATION_MESSAGE);
	}

	static void N_Lecture_power() {
		JOptionPane.showMessageDialog(null, "e�������� ���� �������� �ϴ��� ������ ���!", "������", JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "���� ������ �� ���صƾ�!\n ������ 20��ŭ �����ߴ�!", "���ǵ��",
					JOptionPane.INFORMATION_MESSAGE);

		} else if (random >= 8 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "���� ������ ������� ���ذ� ��.\n ������ 10��ŭ �����ߴ�!", "���ǵ��",
					JOptionPane.INFORMATION_MESSAGE);

		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "���� ������ �ϳ��� ���ذ� �ȵ�.\n ������ 5��ŭ �����ߴ�!", "���ǵ��",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 20;
		Money -= 10000;
		MT();
	}

	static int newdaypower() {
		newpower = 100;
		Power = newpower;
		return Power;
	}

	static int newday() {
		DdayNumber = DdayNumber - 1;
		Day++;
		return DdayNumber;

	}

	static void H_Lecture_power() {
		JOptionPane.showMessageDialog(null, "e�������� ���� �������� �ϴ��� 2������ ���!", "������", JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "�ʹ� ������ �ߴ�.\n ������ 20��ŭ �����ߴ�!", "�ʹ� ����",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n ������ 10��ŭ �����ߴ�!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "������� �ߴ�.\n ������ 5��ŭ �����ߴ�!", "�ѳ� ������ ��",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		Power -= 30;
		Money -= 20000;
		MT();
	}

	static void N_Study() {
		JOptionPane.showMessageDialog(null, "e�������� ���� �������� �ϴ��� ������ ���!", "������", JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 30;
			JOptionPane.showMessageDialog(null, "�ʹ� ������ �ߴ�.\n ������ 30��ŭ �����ߴ�!", "�ʹ� ����",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n ������ 20��ŭ �����ߴ�!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "������� �ߴ�.\n ������ 10��ŭ �����ߴ�!", "�ѳ� ������ ��",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 10000;
		Power -= 15;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void N_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 10) {
			Money += 100000;
			JOptionPane.showMessageDialog(null, "���ʽ��� �޾Ҵ�!\n �˹ٺ� 10���� �޾Ҵ�!", "�ʹ� ����", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 5) {
			Money += 50000;
			JOptionPane.showMessageDialog(null, "������ �˹ٸ� ���´�.\n �˹ٺ� 5���� �޾Ҵ�!", "�˹��ϱ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 30000;
			JOptionPane.showMessageDialog(null, "��! �ȵ� �Ǽ��� �ߴ�.\n �˹ٺ� 3���� �޾Ҵ�!", "�˹��ϱ�",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 25;
		Day += 1;
		DdayNumber -= 1;
		MT();

	}

	static void N_friend_up() {

		Money -= 20000;
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void N_sing() {
		Money -= 20000;
		JOptionPane.showMessageDialog(null, "�뷡�� �θ��µ� 2������ ���!", "�뷡��", JOptionPane.INFORMATION_MESSAGE);
	}

	static void N_cinema() {
		Money -= 30000;
		JOptionPane.showMessageDialog(null, "Ƽ�ϰ� ������ ����� 3������ ���!", "��ȭ��", JOptionPane.INFORMATION_MESSAGE);

	}

	static void N_park() {
		Money -= 50000;
		JOptionPane.showMessageDialog(null, "����ǰ� ���� �Դµ� 5������ ���!", "���̰���", JOptionPane.INFORMATION_MESSAGE);

	}

	static void H_sing() {
		Money -= 25000;
		JOptionPane.showMessageDialog(null, "�뷡�� �θ��µ� 2��5õ���� ���!", "�뷡��", JOptionPane.INFORMATION_MESSAGE);

	}

	static void H_cinema() {
		Money -= 35000;
		JOptionPane.showMessageDialog(null, "Ƽ�ϰ� ������ ����� 3��5õ���� ���!", "��ȭ��", JOptionPane.INFORMATION_MESSAGE);

	}

	static void H_park() {
		Money -= 55000;
		JOptionPane.showMessageDialog(null, "Ƽ�ϰ� ������ ����� 5��5õ���� ���!", "��ȭ��", JOptionPane.INFORMATION_MESSAGE);
	}

	static void N_rest() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Power += 25;
			Friend += 30;
			JOptionPane.showMessageDialog(null, "������ �Ǿ���!\n ģȭ���� 30��ŭ �����ߴ�!", "�ʹ� ��ſ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Power += 10;
			Friend += 20;
			JOptionPane.showMessageDialog(null, "����ְ� ��Ҵ�!.\n ģȭ���� 20��ŭ �����ߴ�!", "��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			Friend += 10;
			JOptionPane.showMessageDialog(null, "���� ����߳�...\n ģȭ���� 10��ŭ �����ߴ�!", "�����", JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_rest() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 10) {
			Power += 30;
			Friend += 20;
			JOptionPane.showMessageDialog(null, "������ �Ǿ���!\n ģȭ���� 20��ŭ �����ߴ�!", "�ʹ� ��ſ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 5) {
			Power += 20;
			Friend += 10;
			JOptionPane.showMessageDialog(null, "����ְ� ��Ҵ�!.\n ģȭ���� 10��ŭ �����ߴ�!", "��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			Friend += 5;
			JOptionPane.showMessageDialog(null, "���� ����߳�...\n ģȭ���� 5��ŭ �����ߴ�!", "�����", JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_intelli_up() {
		JOptionPane.showMessageDialog(null, "e�������� ���� �������� �ϴ��� 2������ ���!", "������", JOptionPane.INFORMATION_MESSAGE);
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "�ʹ� ������ �ߴ�.\n ������ 20��ŭ �����ߴ�!", "�ʹ� ����",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n ������ 10��ŭ �����ߴ�!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "������� �ߴ�.\n ������ 5��ŭ �����ߴ�!", "�ѳ� ������ ��",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 30;
		Day += 1;
		DdayNumber -= 1;
		Money -= 20000;
		MT();
	}

	static void H_Study() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "���� ������ �� ���صƾ�!\n ������ 20��ŭ �����ߴ�!", "���ǵ��",

					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "���� ������ ������� ���ذ� ��.\n ������ 10��ŭ �����ߴ�!", "���ǵ��",

					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money -= 10000;
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "���� ������ �ϳ��� ���ذ� �ȵ�.\n ������ 5��ŭ �����ߴ�!", "���ǵ��",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 15) {
			Money += 130000;
			JOptionPane.showMessageDialog(null, "���ʽ��� �޾Ҵ�!\n �˹ٺ� 13���� �޾Ҵ�!", "�˹��ϱ�", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Money += 80000;
			JOptionPane.showMessageDialog(null, "������ �˹ٸ� ���´�.\n �˹ٺ� 8���� �޾Ҵ�!", "�˹��ϱ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 50000;
			Power -= 5;
			JOptionPane.showMessageDialog(null, "��! �ȵ� �Ǽ��� �ߴ�.\n ü���� 5��ŭ �����ϰ� �˹ٺ� 5���� �޾Ҵ�!", "�˹��ϱ�",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 30;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

}