// printing marks using array

import java.util.*;

public class marks {
    public static void main(String[] args) {
        System.out.println("Multiline array declaretion :");
        int[] marks = new int[3];
        marks[0]=97; //java marks
        marks[1]=80; // math marks 
        marks[2]=93; //DBMS marks

        //using loop to print 
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("\nAnother single line array declaretion :");
        int mark[]={98,20,54};
        for (int i = 0; i < 3; i++) {
            System.out.print(mark[i]+"\t");
        }
    }
}
