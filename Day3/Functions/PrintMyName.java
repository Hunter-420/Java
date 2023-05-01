// Take their name from user and print them using java function
import java.util.*;
public class PrintMyName {
    public static void myName(String name ) {
        System.out.println("My name is "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = s.nextLine();
        myName(name);
        // myName("Nischal Khanal");
    }
}   
