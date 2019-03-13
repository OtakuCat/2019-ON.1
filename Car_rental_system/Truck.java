package Car_rental_system;

public class Truck extends Car {
	private int tonne;

	public Truck() {
	}

	public Truck(String trademark, String carNumber, int rent, int tonne) {
		super(trademark, carNumber, rent);
		this.tonne = tonne;
	}

	@Override
	public double calRent(int days) {
		double price = this.getRent() * days;
		return price;
	}

	public int getTonne() {
		return tonne;
	}

	public void setTonne(int tonne) {
		this.tonne = tonne;
	}
}
