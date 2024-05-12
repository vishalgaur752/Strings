public class PrintLargeString {
    public static void main(String[] args) {
        // For a given set of Strings, print the Largest String.
        // Str1.compareTo(str2) (lexico graphic comparision)
        // 0 : equal
        // <0 : negative (str1 < str2>
        // >0 : positive (str1 > str2)
        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
