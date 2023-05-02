/*
 
 -----------
 Get Bit
 -----------
 Get the 3rd bit(position =2) of a number n.(n = 0101)

 Bit Mask : 1<<i 
 Operation : AND


*/

public class getBit {
    public static void main(String[] args) {
        int n=9;
        int pos = 2;
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
            
        }
    }
}
