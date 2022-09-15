package polyLab;

public class Airplane extends Vehicle implements Warplane{
	private String flight_number;
	private String company;
	private String country;
	public void setCountry(String name) {
		country = name;
	}
	public String getCountry() {
		return country;
	}
	public void fireWeapon() {
		System.out.println("weapon fired");
	}
	public String getFlightNumber(){return flight_number;};
	public void setFlightNumber(String newval) {flight_number = newval;};
	public String getCompnay() {return company;};
	public String setCompany(String newval) {company = newval; return company;};
	public void left() {super.left();}
	public void right() {super.right();}
	public void forward() {super.forward();}
	public void reverse() {super.reverse();};
	


}
