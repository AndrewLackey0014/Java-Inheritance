package polyLab;

public class Airplane extends Vehicle{
	private String flight_number;
	private String company;
	
	public String getFlightNumber(){return flight_number;};
	public void setFlightNumber(String newval) {flight_number = newval;};
	public String getCompnay() {return company;};
	public String setCompany(String newval) {company = newval; return company;};
	public void left() {super.left();}
	public void right() {super.right();}
	public void forward() {super.forward();}
	public void reverse() {super.reverse();};
	


}
