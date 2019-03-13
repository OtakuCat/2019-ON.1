package Car_rental_system;

public class Limousine extends Car {
	private String type;// ÐÍºÅ

	public Limousine() {

	}

	public Limousine(String trademark, String carNumber, int rent, String type) {
		super(trademark, carNumber, rent);
		this.type = type;
	}

	@Override
	public double calRent(int days) {
		double price = this.getRent() * days;// ²»´òÕÛ
		if (days > 7 && days <= 30) {
			price *= 0.9;
		} else if (days > 30 && days <= 150) {
			price *= 0.8;
		} else if (days > 150) {
			price *= 0.7;
		}
		return price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
