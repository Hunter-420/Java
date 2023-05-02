// Take a matrix as input from the user. Search for a given number x and print the undicates at which it occurs

import java.util.Scanner;

public class matrixElementSearch {
    public static void main(String[] args) {
        int matrix[][]=new int[2][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter "+(i+1)+" row Elements :");
            for (int j = 0; j < 3; j++) {
               matrix[i][j]=s.nextInt(); 
            }
        }
        System.out.println("What Element you want to search :");
        int search = s.nextInt();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j]==search) {
                    System.out.println("Element Founded in Index : "+i+" "+j);
                    break;
                } else {
                    System.out.println("Element not Founded in Index : "+i+" "+j);
                }
            }
        }
    }
}
