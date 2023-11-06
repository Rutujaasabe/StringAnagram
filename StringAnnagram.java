package Java;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second string");
        String str2 = sc.nextLine();
        if (str1.length() == str2.length()) {
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            boolean result = Arrays.equals(a, b);
            if (result == true) {
                System.out.println("Both strings are anagrams");
            } else {
                System.out.println("not anagram");
            }
        } else {
            System.out.println("sorry....given string are not anagram !!");
        }

    }
}
