import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String s = input.next();

        if (s.length() != 1 || !Character.isLetter(s.charAt(0))) {
            System.out.println(s + " is an invalid input");
        } else {
            char ch = Character.toLowerCase(s.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(s + " is a vowel");
            } else {
                System.out.println(s + " is a consonant");
            }
        }
    }
}
