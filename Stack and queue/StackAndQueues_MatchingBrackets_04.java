package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackAndQueues_MatchingBrackets_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> expression = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(') {
                expression.push(i);
            } else if (currentChar == ')') {
                int startIndex = expression.pop();
                String content = input.substring(startIndex, i + 1);
                System.out.println(content);
            }
        }
    }
}
