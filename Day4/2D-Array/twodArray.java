// Take 2d matrix input from user and display them

import java.util.Scanner;

public class twodArray {
    public static void main(String[] args) {
        int array[][]=new int[2][4];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter "+(i+1)+" row elements :");
            for (int j = 0; j < 4; j++) {
                Scanner s = new Scanner(System.in);
                array[i][j]=s.nextInt();
            }
        }
        System.out.println("Printing array values:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i+" "+j+" : "+array[i][j]);
            }
        }
    }
}
