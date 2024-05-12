import java.util.*;

public class StringIntro {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String atr = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); //This takes one word
        // System.out.println(name);

        String fullName = sc.nextLine(); // This takes line
        System.out.println(fullName);
        sc.close();
    }
}