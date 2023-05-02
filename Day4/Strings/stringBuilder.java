/*
 
Strings in Java are Immutable
String Operation:
String str = "h";
str + "e" => he
str + "l" => hel
str + "l" => hel
str + "o" => hello

String Bilder Decleration in Java:
StringBuilder sb = new StringBuilder("string_name")

*/

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hunter420");
        System.out.println(sb);

        // charecter at index 0 
        System.out.println(sb.charAt(0));
        System.out.println(sb.insert(0,'N'));
        System.out.println(sb.delete(0,1));

        // append charecters in string 
        sb.append("-");
        sb.append("420");
        System.out.println(sb);

        // STRING LENGTH SAME FUNCTION AS STRING 
        System.out.println(sb.length());
    }
}
