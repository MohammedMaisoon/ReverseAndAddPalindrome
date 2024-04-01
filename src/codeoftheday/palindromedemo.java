package codeoftheday;
import java.util.Scanner;
public class palindromedemo {
    static int reverseNumber(int number) {
        int reverse = 0;
        int rem = 0;
        while (number != 0) {
            rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        return reverse;
    }
    static boolean checkPalindrome(int number) {
        int reverse = reverseNumber(number);
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
    static void reverseAndAdd(int number) {
        if (checkPalindrome(number)) {
            System.out.println("The Number " + number + "is palindrome");
        }
        int inputnumber = number;
        int reverse = reverseNumber(number);
        int add = inputnumber + reverse;
        System.out.println("The addition of " + inputnumber + " and its reverse is " + add);

        if (checkPalindrome(add)) {
            System.out.println("the addition of " + add + "is a palindrome");

        } else {
            System.out.println("the addition of " + add + " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        reverseAndAdd(num);

    }
}


