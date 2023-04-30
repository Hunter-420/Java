/* pattern print in java
 ------------------------
 pattern 1: 
 ****
 ****
 ****
 ****
-------------
pattern 2: 
*****
*   *
*   *
*****
------------
pattern 3:
*
* *
* * *
* * * *
------------
pattern 4:
****
***
**
*
------------
pattern 5:
   *
  ** 
 ***
****
------------
}
*/ 

public class pattern {
    public static void main(String[] args) {
        //pattern 1 code
        System.out.println("pattern 1:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
   //pattern 2 code
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

    //pattern 3 code
    System.out.println("\nPattern 3:");
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pattern 4 code
        System.out.println("\npattern 4:");
        for (int i = 4; i > 0; --i) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

        //pattern 5 code
        System.out.println("\npattern 5:");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j>=5-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

                System.out.println();
        }
    }
}
