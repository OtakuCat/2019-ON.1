package Car_rental_system;

/**
 * 初始化车：建立数组(Car); 提供租车服务；
 */
public class AutomobileBusiness {
	// 汽车类型数组，声明为父类类型
	public Car[] motos = new Car[12];

	// 初始化车信息
	public void init() {
		motos[0] = new Limousine("宝马", "京N78654", 800, "X6");// Car m=new Limousine();
		motos[1] = new Limousine("宝马", "京CNY3284", 600, "550i");// Car m=new Limousine();
		motos[2] = new Limousine("别克", "京NT37465", 300, "林荫大道");// Car m=new Limousine();
		motos[3] = new Limousine("别克", "京NT96968", 600, "GL8");// Car m=new Limousine();
		motos[4] = new PassengerCar("金杯", "京6566754", 800, 16);// Car m=new PassengerCar();
		motos[5] = new PassengerCar("金杯", "京9696996", 1500, 34);// Car m=new PassengerCar();
		motos[6] = new PassengerCar("金龙", "京8696997", 800, 16);// Car m=new PassengerCar();
		motos[7] = new PassengerCar("金龙", "京8696998", 1500, 34);// Car m=new PassengerCar();
		motos[8] = new Truck("一汽解放", "京MH98725", 50, 1);// Car m=new Truck();
		motos[9] = new Truck("一汽解放", "京MH98270", 100, 2);// Car m=new Truck();
		motos[10] = new Truck("重庆红岩", "京MH99845", 50, 1);// Car m=new Truck();
		motos[11] = new Truck("重庆红岩", "京MH90584", 100, 2);// Car m=new Truck();
	}

	// 租车：根据用户提供的条件去汽车数组查找并返回；
	public Car motosLeaseOut(String trademark, String type, int seating, int tonne) {
		Car moto = null;// 所需要的车
		for (Car mymotos : motos) {
			if (mymotos instanceof Limousine) {
				Limousine linmousne = (Limousine) mymotos;// 向下转型成子类，轿车类。
				if (linmousne.getTrademark().equals(trademark) && linmousne.getType().equals(type)) {
					moto = linmousne;
					break;
				}
			} else if (mymotos instanceof PassengerCar) {
				PassengerCar passengerCar = (PassengerCar) mymotos;// 向下转型成子类，客车类。
				if (passengerCar.getTrademark().equals(trademark) && passengerCar.getSeating() == seating) {
					moto = passengerCar;
					break;
				}
			} else if (mymotos instanceof Truck) {
				Truck truck = (Truck) mymotos;// 向下转型成子类，卡车类。
				if (truck.getTrademark().equals(trademark) && truck.getTonne() == tonne) {
					moto = truck;
					break;
				}
			}
		}
		return moto;
	}
}
