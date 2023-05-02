// take  a two number from user and print their sum using function

import java.util.*;
public class sumNumber {
    public int sum(int num1, int num2) {
       int totalSum = num1 + num2;
        return totalSum;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        sumNumber SumNumber = new sumNumber();
       int total = SumNumber.sum(num1,num2);
        System.out.println("The sum of "+ num1 +" & "+ num2 +" is "+ total);
    }
}
