// Take array input from user 

import java.util.*;
public class takeArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many data you want to store in an array :");
        int size = s.nextInt();
        int array[] = new int[size];
        System.out.println("Enter array vales : ");
        for (int i = 0; i < size; i++) {
            array[i]= s.nextInt();
        }
        System.out.println("Displaying array values : ");
            for (int i = 0; i < size; i++) {
                System.out.println(array[i]+"\t");
            }
    }
}
