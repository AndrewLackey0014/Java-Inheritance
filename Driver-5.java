package polyLab;

import java.util.Scanner;

public class Driver{
   public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        Airplane p1 = new Airplane();
        System.out.println("enter the speed: ");
        Scanner sc = new Scanner(System.in);
        float speed = sc.nextFloat();
        p1.setSpeed(speed);
        c1.setSpeed(speed);
        v1.setSpeed(speed);
        
        System.out.println("the vehicle speed is");
        System.out.println(v1.getSpeed());
        System.out.println("the car speed is");
        System.out.println(c1.getSpeed());
        System.out.println("the airplane speed is");
        System.out.println(p1.getSpeed());
        sc.close();
   } 
}
