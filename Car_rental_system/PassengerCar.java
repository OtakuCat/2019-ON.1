package Car_rental_system;

public class PassengerCar extends Car {
	private int seating;// 座位数

	public PassengerCar() {
	}

	public PassengerCar(String trademark, String carNumber, int rent, int seating) {
		super(trademark, carNumber, rent);
		this.seating = seating;
	}

	@Override
	public double calRent(int days) {
		double price = this.getRent() * days;// 不打折
		if (days >= 3 && days <= 7) {
			price *= 0.9;
		} else if (days >= 7 && days <= 30) {
			price *= 0.8;
		} else if (days >= 30 && days <= 150) {
			price *= 0.7;
			price *= 0.6;
		}
		return price;
	}

	public int getSeating() {
		return seating;
	}

	public void setSeating(int seating) {
		this.seating = seating;
	}
}
