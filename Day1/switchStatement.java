//switch statements in java same as c/c++

import java.util.*;
public class switchStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose Option\n1. Hello\n2. Hy\n3. Namaste");
        int option = s.nextInt();

        switch (option ) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("hy");
                break;
            case 3:
                System.out.println("Namaste");
            break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}   
