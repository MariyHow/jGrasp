import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        int specialChars = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                switch (Character.toLowerCase(c)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                        vowels++;
                        break;
                    default:
                        consonants++;
                        break;
                }
            } else if (!Character.isWhitespace(c)) {
                specialChars++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of special characters: " + specialChars);
    }
}