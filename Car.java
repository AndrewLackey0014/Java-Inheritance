package polyLab;

public class Car extends Vehicle {
	private String licensePlate;
	
	public String getLicense() {return this.licensePlate;}
	public void setLicense(String newValue) {this.licensePlate = newValue;}
	
	public void left() {super.left();}
	public void right() {super.right();}
	public void forward() {super.forward();}
	public void reverse() {super.reverse();}

}

