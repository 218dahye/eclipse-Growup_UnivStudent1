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
			JOptionPane.showMessageDialog(null, "�ʹ� ������ �ߴ�.\n ������ 20��ŭ �ö���!", "�ʹ� ����", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n ������ 10��ŭ �ö���!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "������� �ߴ�.\n ������ 5��ŭ �ö���!", "�ѳ� ������ ��", JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		Money -= 5000;
		MT();
	}

	static void N_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Money += 40000;
			JOptionPane.showMessageDialog(null, "�ʹ� ������ �ߴ�.\n �˹ٺ� 4���� �޾Ҵ�!", "�ʹ� ����", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Money += 20000;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n �˹ٺ� 2���� �޾Ҵ�!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 10000;
			Power -= 5;
			JOptionPane.showMessageDialog(null, "�ǿ��� ���� �Ǽ��� �ߴ�.\n ü���� 5��ŭ �����ϰ� �˹ٺ� 1���� �޾Ҵ�!", "�� �ȵ�!",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void N_friend_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Friend += 20;
			JOptionPane.showMessageDialog(null, "������ �Ǿ���!\n ģȭ���� 20��ŭ �ö���!", "�ʹ� ��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Friend += 10;
			JOptionPane.showMessageDialog(null, "����ְ� ��Ҵ�!.\n ģȭ���� 10��ŭ �ö���!", "��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Friend += 5;
			Power -= 2;
			JOptionPane.showMessageDialog(null, "���� ����߳�...\n ģȭ���� 5��ŭ �ö���!", "�����", JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 20000;
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void N_power_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Power += 25;
			JOptionPane.showMessageDialog(null, "�̷� �޽��� �ñ�?\n ü������ 25��ŭ �ö���!", "����� ����",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Power += 15;
			JOptionPane.showMessageDialog(null, "�ʹ� �� ������.\n ü���� 15��ŭ �ö���!", "��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			JOptionPane.showMessageDialog(null, "�ڰ� �Ͼ�µ� ���� �ɷȳ�...\n ü���� 5��ŭ �ö���!", "�����",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_intelli_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "�ʹ� ������ �ߴ�.\n ������ 20��ŭ �ö���!", "�ʹ� ����", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "������ ������ �ߴ�.\n ������ 10��ŭ �ö���!", "���� ��ڳ�",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "������� �ߴ�.\n ������ 5��ŭ �ö���!", "�ѳ� ������ ��", JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
		Money -= 5000;
		MT();
	}

	static void H_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
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
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_friend_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Friend += 20;
			JOptionPane.showMessageDialog(null, "������ �Ǿ���!\n ģȭ���� 20��ŭ �ö���!", "�ʹ� ��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Friend += 10;
			JOptionPane.showMessageDialog(null, "����ְ� ��Ҵ�!.\n ģȭ���� 10��ŭ �ö���!", "��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Friend += 5;
			Power -= 2;
			JOptionPane.showMessageDialog(null, "���� ����߳�...\n ģȭ���� 5��ŭ �ö���!", "�����", JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 20000;
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_power_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Power += 25;
			JOptionPane.showMessageDialog(null, "�̷� �޽��� �ñ�?\n ü������ 25��ŭ �ö���!", "����� ����",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Power += 15;
			JOptionPane.showMessageDialog(null, "�ʹ� �� ������.\n ü���� 15��ŭ �ö���!", "��ſ�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			JOptionPane.showMessageDialog(null, "�ڰ� �Ͼ�µ� ���� �ɷȳ�...\n ü���� 5��ŭ �ö���!", "�����",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		MT();
	}
	
	static void N_Cold() {
		int random = (int) (Math.random() * 15 + 1);
		if(Power<=30) {
			if(random>=13) {
				Day += 1;
				DdayNumber -= 1;
				MT();
				Power+=30;
				JOptionPane.showMessageDialog(null, "ü���� �������� ���⿡ �ɷȴ�!","\n���� �Ϸ絿�� ������ ����߰ڴ�", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "�Ϸ絿�� ��� ü���� 30��ŭ �ö���!", "ü�� ȸ��", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	static void H_Cold() {
		int random = (int) (Math.random() * 10 + 1);
		if(Power<=40) {
			if(random>=10) {
				Day += 1;
				DdayNumber -= 1;
				MT();
				Power+=20;
				JOptionPane.showMessageDialog(null, "ü���� �������� ���⿡ �ɷȴ�! \n���� �Ϸ絿�� ������ ����߰ڴ�","����", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "�Ϸ絿�� ��� ü���� 20��ŭ �ö���!", "ü�� ȸ��", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}