package project;

import javax.swing.JOptionPane;

class init {
	static int DdayNumber = 45;
	static int Power = 100;
	static int Money = 100000;
	static int Friend = 50;
	static int Intelli = 30;
	static int Month = 5;
	static int Day = 1;
	static String Daily[] = { "��", "��", "��", "��", "ȭ", "��", "��" };
	static String Today = null;

	static void MT() {
		if (Month == 5) {
			Today = Daily[Day % 7 - 1];

		} else if (Month == 5 && Day == 32) {
			Day = 1;
			Today = Daily[Day % 7 + 2];
		}
	}

	static void N_intelli_up() {
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
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
		Money -= 10000;
		MT();
	}

	static void N_Study() {
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
		Power -= 15;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void N_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Money += 40000;
			JOptionPane.showMessageDialog(null, "���ʽ��� �޾Ҵ�!\n �˹ٺ� 4���� �޾Ҵ�!", "�ʹ� ����", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Money += 30000;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n �˹ٺ� 3���� �޾Ҵ�!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 20000;
			JOptionPane.showMessageDialog(null, "�ǿ��� ���� �Ǽ��� �ߴ�.\n �˹ٺ� 2���� �޾Ҵ�!", "�� �ȵ�!",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 25;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void N_friend_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Friend += 30;
			JOptionPane.showMessageDialog(null, "������ �Ǿ���!\n ģȭ���� 30��ŭ �����ߴ�!", "�ʹ� ��ſ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Friend += 20;
			JOptionPane.showMessageDialog(null, "����ְ� ��Ҵ�!.\n ģȭ���� 20��ŭ �����ߴ�!", "��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Friend += 10;
			JOptionPane.showMessageDialog(null, "���� ����߳�...\n ģȭ���� 10��ŭ �����ߴ�!", "�����", JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 20000;
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	/*
	 * static void N_power_up() { int random = (int) (Math.random() * 20 + 1); if
	 * (random >= 17) { Power += 25; JOptionPane.showMessageDialog(null,
	 * "�̷� �޽��� �ñ�?\n ü������ 25��ŭ �ö���!", "����� ����", JOptionPane.INFORMATION_MESSAGE); }
	 * else if (random >= 8 && random < 17) { Power += 15;
	 * JOptionPane.showMessageDialog(null, "�ʹ� �� ������.\n ü���� 15��ŭ �ö���!", "��ſ�",
	 * JOptionPane.INFORMATION_MESSAGE); } else { Power += 5;
	 * JOptionPane.showMessageDialog(null, "�ڰ� �Ͼ�µ� ���� �ɷȳ�...\n ü���� 5��ŭ �ö���!",
	 * "�����", JOptionPane.INFORMATION_MESSAGE); } Day += 1; DdayNumber -= 1; MT(); }
	 */

	static void N_Cold() {
		for (int count = 0; count < 1; count++) {
			if (Power <= 30) {
				Day += 1;
				DdayNumber -= 1;
				MT();
				Power += 30;
				count++;
				JOptionPane.showMessageDialog(null, "ü���� �������� ���⿡ �ɷȴ�!\n���� �Ϸ絿�� ������ ����߰ڴ�", "����",
						JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "�Ϸ絿�� ��� ü���� 30��ŭ �ö���!", "ü�� ȸ��", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	static void H_intelli_up() {
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
			JOptionPane.showMessageDialog(null, "�ʹ� ������ �ߴ�.\n ������ 20��ŭ �����ߴ�!", "�ʹ� ����",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n ������ 10��ŭ �����ߴ�!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money -= 10000;
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "���θ� �ϴٰ� ���� ���� ��Ծ���.\n���� 1���� �����ϰ� ������ 5��ŭ �����ߴ�!", "�ѳ� ������ ��",
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
			Money += 40000;
			JOptionPane.showMessageDialog(null, "�ʹ� ������ �ߴ�.\n �˹ٺ� 4���� �޾Ҵ�!", "�ʹ� ����", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Money += 20000;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n �˹ٺ� 2���� �޾Ҵ�!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 10000;
			Power -= 5;
			JOptionPane.showMessageDialog(null, "�ǿ��� ���� �Ǽ��� �ߴ�.\n ü���� 5��ŭ �����ϰ� �˹ٺ� 1���� �޾Ҵ�!", "�� �ȵ�!",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 30;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_friend_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Friend += 20;
			JOptionPane.showMessageDialog(null, "������ �Ǿ���!\n ģȭ���� 20��ŭ �����ߴ�!", "�ʹ� ��ſ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Friend += 10;
			JOptionPane.showMessageDialog(null, "����ְ� ��Ҵ�!.\n ģȭ���� 10��ŭ �����ߴ�!", "��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Friend += 5;
			Power -= 5;
			JOptionPane.showMessageDialog(null, "����߳�... ��ġ���� ü���� 5��ŭ �����ߴ�!\n ģȭ���� 5��ŭ �����ߴ�!", "�����",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 30000;
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	/*
	 * static void H_power_up() { int random = (int) (Math.random() * 20 + 1); if
	 * (random >= 17) { Power += 25; JOptionPane.showMessageDialog(null,
	 * "�̷� �޽��� �ñ�?\n ü������ 25��ŭ �ö���!", "����� ����", JOptionPane.INFORMATION_MESSAGE); }
	 * else if (random >= 8 && random < 17) { Power += 15;
	 * JOptionPane.showMessageDialog(null, "�ʹ� �� ������.\n ü���� 15��ŭ �ö���!", "��ſ�",
	 * JOptionPane.INFORMATION_MESSAGE); } else { Power += 5;
	 * JOptionPane.showMessageDialog(null, "�ڰ� �Ͼ�µ� ���� �ɷȳ�...\n ü���� 5��ŭ �ö���!",
	 * "�����", JOptionPane.INFORMATION_MESSAGE); } Day += 1; DdayNumber -= 1; MT(); }
	 */

	static void H_Cold() {
		int random = (int) (Math.random() * 10 + 1);
		for (int count = 0; count < 1; count++) {
			if (Power <= 40) {
				if (random >= 10) {
					Day += 1;
					DdayNumber -= 1;
					MT();
					Power += 20;
					count++;
					JOptionPane.showMessageDialog(null, "ü���� �������� ���⿡ �ɷȴ�! \n���� �Ϸ絿�� ������ ����߰ڴ�", "����",
							JOptionPane.WARNING_MESSAGE);
					JOptionPane.showMessageDialog(null, "�Ϸ絿�� ��� ü���� 20��ŭ �ö���!", "ü�� ȸ��",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}

}