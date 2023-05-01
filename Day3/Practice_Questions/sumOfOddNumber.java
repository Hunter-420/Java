// Write a function to print the sum of a  odd numbers fron 1 to n 

import java.util.*;
public class sumOfOddNumber {
    public static int oddSum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i%2!=0) {
                sum = sum + i;
            } else {
                continue;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to get sum of odd :");
        int num = s.nextInt();
        System.out.println("The sum of odd upto "+num+" is "+oddSum(num));
    }
}
