//write a function that takes in the radius as input and returns the cercumference if a circle

import java.util.Scanner;
public class areaOfCircle {
    public static double  area() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of cirecle : ");
        int radius = s.nextInt();
        double area = 3.1416*radius*radius;
        return area;   
    }

    public static void main(String[] args) {
        
        System.out.println("Circumference of circle : "+area());
    }
}
