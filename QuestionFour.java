import java.util.Arrays;

public class QuestionFour {

    public static void main(String[] args) {
        // Dtermine if 2 Strings are anagrams of each other.
        // if two string contain the same character but in a different order, they can
        // be said to be anagrams. Consider race and care.
        String str = "race";
        String str1 = "care";

        // Conver Strings to lowercase. Why? so that we don't have to check searately
        // for lower & uppercase.
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        // First check - if the lengths are the same
        if (str.length() == str1.length()) {
            // convert strings into char array
            char[] strcharArray = str.toCharArray();
            char[] str1charArray = str1.toCharArray();

            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(strcharArray);

            // if the sorted char arrays are same or identical then the strings are anagram

            boolean result = Arrays.equals(strcharArray, str1charArray);
            if (result) {
                System.out.println(str + " and " + str1 + " are anagrams of each other.");
            } else {
                System.out.println(str + " and " + str1 + " are not anagrams of each other.");
            }
        } else {
            System.out.println(str + " and " + str1 + " are not anagrams of each other.");
        }
    }
}
