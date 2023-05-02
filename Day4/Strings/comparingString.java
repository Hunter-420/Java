
public class comparingString {
    public static void main(String[] args) {
        String str1 = "Hunter";
        String str2 = "Hunter420";
        // compareTo function is used 
        // 1. s1 > s2 : +ive value
        // 2. s1 = s2 : 0
        // 3. s1 < s2 : -ive value

        if (str1.compareTo(str2)==0) {
            System.out.println("String 1 is equal to String 2");
        } else { if (str1.compareTo(str2)>0) {
            System.out.println("String 1 is greater then string 2");    
            
        } else {
            System.out.println("String 1 is less than string 2");
        }
            
        }
    }
}
