// basic mathematical operation using switch statement

import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Which operation you want: \n+ addition\n- subtraction\n* multiplication");
        char option = s.next().charAt(0);
        switch (option ) {
            case '+':
                System.out.println(a+b); 
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
