// take  a two number from user and print their sum using function

import java.util.*;
public class sumNumber {
    public static int sum(int num1, int num2) {
       int totalSum = num1 + num2;
        return totalSum;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("The sum of "+num1+" & "+num2+" is "+ sum(num1,num2));
    }
}
