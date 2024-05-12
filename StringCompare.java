public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Iron Man";
        String str2 = "Iron Man";
        String str3 = new String("Iron Man");

        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("strings are not equals");
        }
        if (str1 == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        if (str1.equals(str3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}