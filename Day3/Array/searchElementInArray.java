
// Take array value as input from user then also take value which need to search and return the index  

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
        System.out.println("Which element you want to search :");
        int val = s.nextInt();
            for (int i = 0; i < size; i++) {
            if (array[i]==val) {
                
                System.out.println("value in "+(i+1)+" index");
            }    
        }
    }
}
