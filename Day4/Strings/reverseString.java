
public class reverseString {
    public static void main(String[] args) {
        // String name = "HUNTER";
        StringBuilder sb = new StringBuilder("HUNTER");
        int lenght = sb.length();
        for (int i = 0;i< lenght/2;i++) {
            int front = i;
            int back = lenght-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);

    }
}
