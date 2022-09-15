package polyLab;

import java.util.Scanner;

public class Driver{
   public static void main(String[] args){
	   	Vehicle []arr;

	   	System.out.println("enter flag (true or false)");
	  	Scanner sc2 = new Scanner(System.in);
	   	boolean flag = sc2.hasNext();
	   	sc2.close();
	   	
	   	if(flag == true)
	   	{

	   	arr= new Car[3];
	   	arr[0] = new Car();
	   	arr[1] = new Car();
	   	arr[2] = new Car();
	   	arr[0].setSpeed(100);


	   	System.out.println("speed of car: " + arr[0].getSpeed());


	   	arr[1].setSpeed(100);

	   	System.out.println("speed of car: " + arr[1].getSpeed());


	   	arr[2].setSpeed(100);

	   	System.out.println("speed of car: " + arr[2].getSpeed());

	   	}
	   	else{
	   		arr = new Airplane[2];
		   	arr[0] = new Airplane();
		   	arr[1] = new Airplane();
	   		arr[0].setSpeed(100); 
	   		System.out.println("speed of airplane: " + arr[0].getSpeed());
	   		arr[1].setSpeed(100); 
	   		System.out.println("speed of airplane: " + arr[1].getSpeed());
	   	}

//	    System.out.println("enter the speed: ");
//	    Scanner sc = new Scanner(System.in);
//	    float speed = sc.nextFloat();
//        Vehicle v1 = new Vehicle();
//        Car c1 = new Car();
//        Airplane p1 = new Airplane();
//        p1.setSpeed(speed);
//        c1.setSpeed(speed);
//        v1.setSpeed(speed);
//        
//        System.out.println("the vehicle speed is");
//        System.out.println(v1.getSpeed());
//        System.out.println("the car speed is");
//        System.out.println(c1.getSpeed());
//        System.out.println("the airplane speed is");
//        System.out.println(p1.getSpeed());
//	    sc.close();
   } 
}
