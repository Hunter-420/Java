/* pattern print
 1. 
 ****
 ****
 ****
 ****

2. 
*****
*   *
*   *
*****

3.
*
* *
* * *
* * * *

*/ 

public class pattern {
    public static void main(String[] args) {
        System.out.println("pattern 1:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    System.out.println("\npattern 2:");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
            if (i==0 || j==0 || i==3 ||j==4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
            System.out.println();
    }

    System.out.println("\nPattern 3:");
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
