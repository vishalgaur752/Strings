public class StringLength {
    public static void printLetters(String fullName) {
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String Name = "Vishal Gaur";// Space also Include in Count.
        System.out.println(Name.length());

        // Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // charAt function
        printLetters(fullName);
    }
}
