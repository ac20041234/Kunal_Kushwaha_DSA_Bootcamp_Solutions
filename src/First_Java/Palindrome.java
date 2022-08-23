package First_Java;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kindly , enter the string here : ");
        String word = in.nextLine();
        System.out.println(palindromeChecker(word));
    }

    public static String palindromeChecker(String word) {
        int length = word.length();
        String reverse = "";//take an empty string.
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
            if (word.equals(reverse)) {
                return "It is an palindrome string";
            } else {
                return "It is not an palindrome string";
            }
        }

    }

