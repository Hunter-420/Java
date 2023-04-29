
//Multiplication table in java 
import java.util.*;
public class multable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which number multiplication table you want :");
        int num = s.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num*i);
        }
    }
}
