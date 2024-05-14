public class QuestionOne {
    public static int countVowels(String str) {
        int count = 0;
        for(int i = 0; i<str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Count how many times lowercase vowels occurred in a String entered by the user
        String str = "I'm vishal gaur";
        System.out.println(countVowels(str));

    }
}
