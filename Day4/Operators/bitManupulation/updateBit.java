
/*
 -----------
 Clear Bit
 -----------
 Get the 2nd bit(position =1) of a number nto 1.(n = 0101)

 Bit Mask : 1<<i 
 TO change from 1 to 0 
 Operation : AND with NOT

 To change from 0 to 1
 Operation : OR k


*/
import java.util.Scanner;

public class getBit {
    public static void main(String[] args) {
        int n=5;
        int pos = 2;
        int bitMask = 1<<pos;

        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to do :\n1. Set Bit \n2. Clear Bit");
        int choice = s.nextInt();
        if (choice ==1) {
            // set -- OR Operation
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int notBitmask = ~(bitMask);
            int newNumber = notBitmask & n;
            System.out.println(newNumber);
        }
    }
}
