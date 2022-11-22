package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackAndQueues_MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= numberOfCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    int elementToPush = Integer.parseInt(command[1]);
                    stack.push(elementToPush);
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case "3":
                    int maxElement = Integer.MIN_VALUE;
                    for (Integer currentElement : stack) {
                        if (currentElement > maxElement) {
                            maxElement = currentElement;
                        }
                    }
                    System.out.println(maxElement);
                    break;
            }
        }
    }
}
