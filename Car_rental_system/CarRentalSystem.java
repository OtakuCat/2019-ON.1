package Car_rental_system;

import java.util.Scanner;

public class CarRentalSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AutomobileBusiness motoMgr = new AutomobileBusiness();
		motoMgr.init();// ���س�ʼ������
		int fanhui = -1;
		do {
			System.out.println("**********��ӭ����Sakula�������޹�˾**********");
			String trademark = "";// Ʒ��
			int seating = 0;// ��λ��
			String type = "";// �ͺ�
			int tonne = 0;// ��λ
			System.out.println("����������Ҫ���޵��������ͣ�1.�γ�\t2.�ͳ�\t3.����");
				int selective = scan.nextInt();
				if (selective == 1) {// ���޽γ�
					System.out.println("��ѡ������Ҫ���޵Ľγ�Ʒ�ƣ�1.����2.���");
					int selectiveTK = scan.nextInt();
					if (selectiveTK == 1) {
						trademark = "����";
						System.out.println("��ѡ������Ҫ���޵ı����ͺţ�1.X6��2.550i");
						int selectiveTP = scan.nextInt();
						if (selectiveTP == 1) {
							type = "X6";
						} else if (selectiveTP == 2) {
							type = "550i";
						}
					} else if (selectiveTK == 2) {
						trademark = "���";
						System.out.println("��ѡ������Ҫ���޵ı���ͺţ�1.GL8��2.������");
						int selectiveTP = scan.nextInt();
						if (selectiveTP == 1) {
							type = "GL8";
						} else if (selectiveTP == 2) {
							type = "������";
						}
					}
				} else if (selective == 2) {// ���޿ͳ�
					System.out.println("��ѡ������Ҫ���޵Ŀͳ�Ʒ�ƣ�1.�𱭣�2.����");
					int selectiveTK = scan.nextInt();
					if (selectiveTK == 1) {
						trademark = "��";
						System.out.println("��ѡ������Ҫ���޵Ľ���λ����1.16��2.34");
						int selectiveSG = scan.nextInt();
						if (selectiveSG == 1) {
							seating = 16;
						} else if (selectiveSG == 2) {
							seating = 34;
						}
					} else if (selectiveTK == 2) {
						trademark = "����";
						System.out.println("��ѡ������Ҫ���޵Ľ�����λ����1.16��2.34");
						int selectiveSG = scan.nextInt();
						if (selectiveSG == 1) {
							seating = 16;
						} else if (selectiveSG == 2) {
							seating = 34;
						}
					}
				} else if (selective == 3) {// ���޿���
					System.out.println("��ѡ������Ҫ���޵Ŀ���Ʒ�ƣ�1.һ����ţ�2.�������");
					int selectiveTK = scan.nextInt();
					if (selectiveTK == 1) {
						trademark = "һ�����";
						System.out.println("��ѡ������Ҫ���޵�һ����Ŷ�λ����1.1�֣�2.2��");
						int selectiveTE = scan.nextInt();
						if (selectiveTE == 1) {
							tonne = 1;
						} else if (selectiveTE == 2) {
							tonne = 2;
						}
					} else if (selectiveTK == 2) {
						trademark = "�������";
						System.out.println("��ѡ������Ҫ���޵�������Ҷ�λ����1.1�֣�2.2��");
						int selectiveTE = scan.nextInt();
						if (selectiveTE == 1) {
							tonne = 1;
						} else if (selectiveTE == 2) {
							tonne = 2;
						}
					}
				} 
			Car moto = motoMgr.motosLeaseOut(trademark, type, seating, tonne);// ���ҳ���
			if (moto != null) {
				System.out.println("��������Ҫ���޵�������");
				int days = scan.nextInt();
				System.out.println("�⳵�ɹ����밴�����³��ƺ��ᳵ��" + moto.getCarNumber());
				System.out.println("����Ҫ֧��" + moto.calRent(days) + "Ԫ");
				System.out.println("�Ƿ�������ޣ���0����ϵͳ�������ޣ����������ϵͳ��");
				fanhui = scan.nextInt();
			} else {
				System.err.println("������󣬰�0����ϵͳ�������ޣ����������ϵͳ��");
				fanhui = scan.nextInt();
			}
		} while (fanhui == 0);

	}
}
