/* 

write a program to print Fibonacci series of n terms where n is input by user 
0   1 1 2   3   5   8   13 21....
In the fibonacci series, a number is the sum of the previous 2 numbers that came before it 

*/

import java.util.Scanner;
public class fibonacci {
    public static void fiboo(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a+"\t"+b);
        for (int i = 2; i < num; i++) {
            int c = a+b;
            System.out.print("\t"+c);
            a=b;
            b=c;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many fibonacci number you want :");
        int num = s.nextInt();
        fiboo(num);
    }
}
