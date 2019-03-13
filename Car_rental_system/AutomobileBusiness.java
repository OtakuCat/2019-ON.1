package Car_rental_system;

/**
 * ��ʼ��������������(Car); �ṩ�⳵����
 */
public class AutomobileBusiness {
	// �����������飬����Ϊ��������
	public Car[] motos = new Car[12];

	// ��ʼ������Ϣ
	public void init() {
		motos[0] = new Limousine("����", "��N78654", 800, "X6");// Car m=new Limousine();
		motos[1] = new Limousine("����", "��CNY3284", 600, "550i");// Car m=new Limousine();
		motos[2] = new Limousine("���", "��NT37465", 300, "������");// Car m=new Limousine();
		motos[3] = new Limousine("���", "��NT96968", 600, "GL8");// Car m=new Limousine();
		motos[4] = new PassengerCar("��", "��6566754", 800, 16);// Car m=new PassengerCar();
		motos[5] = new PassengerCar("��", "��9696996", 1500, 34);// Car m=new PassengerCar();
		motos[6] = new PassengerCar("����", "��8696997", 800, 16);// Car m=new PassengerCar();
		motos[7] = new PassengerCar("����", "��8696998", 1500, 34);// Car m=new PassengerCar();
		motos[8] = new Truck("һ�����", "��MH98725", 50, 1);// Car m=new Truck();
		motos[9] = new Truck("һ�����", "��MH98270", 100, 2);// Car m=new Truck();
		motos[10] = new Truck("�������", "��MH99845", 50, 1);// Car m=new Truck();
		motos[11] = new Truck("�������", "��MH90584", 100, 2);// Car m=new Truck();
	}

	// �⳵�������û��ṩ������ȥ����������Ҳ����أ�
	public Car motosLeaseOut(String trademark, String type, int seating, int tonne) {
		Car moto = null;// ����Ҫ�ĳ�
		for (Car mymotos : motos) {
			if (mymotos instanceof Limousine) {
				Limousine linmousne = (Limousine) mymotos;// ����ת�ͳ����࣬�γ��ࡣ
				if (linmousne.getTrademark().equals(trademark) && linmousne.getType().equals(type)) {
					moto = linmousne;
					break;
				}
			} else if (mymotos instanceof PassengerCar) {
				PassengerCar passengerCar = (PassengerCar) mymotos;// ����ת�ͳ����࣬�ͳ��ࡣ
				if (passengerCar.getTrademark().equals(trademark) && passengerCar.getSeating() == seating) {
					moto = passengerCar;
					break;
				}
			} else if (mymotos instanceof Truck) {
				Truck truck = (Truck) mymotos;// ����ת�ͳ����࣬�����ࡣ
				if (truck.getTrademark().equals(trademark) && truck.getTonne() == tonne) {
					moto = truck;
					break;
				}
			}
		}
		return moto;
	}
}
