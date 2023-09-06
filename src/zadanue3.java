//Написать на Javaметод, проверяющий является ли строка палиндромом.

import java.util.Scanner;

public class zadanue3 {
    public static void isPalindrome(String str) {
        if (str.isEmpty()) {
            System.out.println("Строка пустая");
        } else {
            str = str.replaceAll(" ", "").toLowerCase();
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    System.out.println("Строка не полиндром");
                    break;
                }
                left++;
                right--;
            }
            System.out.println("Строка полиндром");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isPalindrome(sc.nextLine());
    }

}
