// substring(begining index, ending index)

public class subString {
    public static void main(String[] args) {
        String name = "Nischal Khanal Cosmos";
        String subStr = name.substring(0,7);
        String subName = name.substring(8,name.length());
        String subCollege = name.substring(15); 
        // if we didn't pass the ending index then it is by default take index length

        System.out.println(subStr);
        System.out.println(subName);
        System.out.println(subCollege);

        // String are Immutable

    }
}
