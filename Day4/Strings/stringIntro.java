// String is a class in java it is premittive data type 

import java.util.Scanner;

public class stringIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name :");
        //next is used to take charecters without whitespace
        //nextLine used to take string with whitespace
        String name = s.nextLine();
        System.out.println("Your name is "+name);
    }
}
