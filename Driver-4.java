package polyLab;

import java.util.Scanner;

public class Driver{
   public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        System.out.println("enter the speed: ");
        Scanner sc = new Scanner(System.in);
        float speed = sc.nextFloat();
        v1.setSpeed(speed);
        System.out.println("the cars speed is");
        System.out.println(v1.getSpeed());
        sc.close();
   } 
}
