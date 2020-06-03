package stacks.stackschallenge;

import java.nio.file.LinkOption;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
         // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
       // should return false
       System.out.println(checkForPalindrome("hello"));
       // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedStack stack = new LinkedStack();
        int start = 0;
        int end = string.length() - 1;
        int middle = start + end / 2;
        for (int i = middle; i <= end; i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                stack.push(string.charAt(i));
            }
        }
        for (int i = 0; i <= middle; i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                char letter = stack.pop();
                if ((string.charAt(i) != letter) && (string.charAt(i) != letter + 32) &&
                        (string.charAt(i) != letter - 32)) {
                    return false;
                }
            }
        }
        return true;
    }
}
