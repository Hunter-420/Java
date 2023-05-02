
public class concatString {
    public static void main(String[] args) {
        String firstName = "Nischal";
        String lastName = "Khanal";
        // + symbol concat two strings
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        
        // 'length' function return lenght of string
        System.out.println("Length of fullName : "+fullName.length());

        //print 1 by 1 charecters from string we use charAt(index) function
        System.out.println("Printing 1 by 1 charecters from string using charAt(index) function :");
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
