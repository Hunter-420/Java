// calculate factorial of given input from the user

import java.util.*;
public class factorial {
    public static int fact(int num) {
        int facto = 1;
        if (num<1) {
            System.out.println("Negative number can't accepted!!");
        } else {
            for (int i = num; i > 1; --i) {
                facto = i*facto;    
            }
        }
        
    return facto;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which number factorial you want :");
        int num = s.nextInt();
        System.out.println("Factorial of "+num+" is "+fact(num));
    }
}
