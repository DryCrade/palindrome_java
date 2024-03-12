import java.util.*;

public class Palindrome {
    public static String checkPalindrome (String str) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            queue.add(c);
        }

        while (queue.size() > 1) {
            if (!Objects.equals(queue.pollFirst(), queue.pollLast())) {
                return ("This is not a palindrome");
            }
        }
        return ("This is a palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        System.out.println(checkPalindrome(input));
    }
}

