
//conditional statement -- if else

import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check odd even :");
        int num = s.nextInt();
        if (num%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
