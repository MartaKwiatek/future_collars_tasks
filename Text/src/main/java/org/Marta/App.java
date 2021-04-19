package org.Marta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word or sentence: ");
        String text = scanner.nextLine();

        if (TextUtils.isNotEmpty(text)) {
            System.out.println("It's not empty!");
            if (TextUtils.isPalindrome(text))
                System.out.println("Wow, it's a palindrome :)");
            else
                System.out.println("But it's not a palindrome.");
            System.out.println("Your text contains " + (TextUtils.textLength(text)) + " characters.");
        } else
            System.out.println("It's empty....");

    }
}
