//Enter 3 numbers from the user and make a function to print their average

import java.util.*;
public class problem1Average {
    public static int average(int num1, int num2, int num3) {
        int average = (num1+num2+num3)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 numbers to calculate average :");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        System.out.println("Average :"+average(num1,num2,num3));
    }
}
