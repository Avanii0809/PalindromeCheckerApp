import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();
        String reversed = "";
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        boolean isPalindrome1 = input.equals(reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome1);

        String input1 = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome2 = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome2 = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input : " + input1);
        System.out.println("Is Palindrome? : " + isPalindrome2);
    }
}
