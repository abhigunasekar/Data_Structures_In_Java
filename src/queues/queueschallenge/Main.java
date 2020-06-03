package queues.queueschallenge;

import javax.sound.sampled.Line;
import java.sql.Struct;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
//        "dade"
//                stack: push(d), push(a), push(d), push(e): e, d, a, d;
//                queue: add(d), add(a), add(d): d, a, d, e;

        Stack<Character> stack = new Stack<>();
        LinkedList<Character> queue = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (Character.isAlphabetic(letter)) {
                queue.addLast(Character.toLowerCase(letter));
                stack.push(Character.toLowerCase(letter));
            }
        }
        for (int i = 0; i < queue.size(); i++) {
            if (queue.removeFirst() != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
