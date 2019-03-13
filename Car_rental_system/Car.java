package Car_rental_system;

public abstract class Car {
	private String trademark;//品牌
	private String carNumber;//车牌号
	private int rent;//日租金

	public Car(){	
	}
	
	public Car(String trademark,String carNumber,int rent){
		this.trademark=trademark;
		this.carNumber=carNumber;
		this.rent=rent;
		
	}
	public abstract double calRent(int days);
	
	public String getTrademark() {
		return trademark;
	}
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
}
	

