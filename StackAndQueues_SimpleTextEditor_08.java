package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackAndQueues_SimpleTextEditor_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //number of operation

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String argument = "";
            if (data.length > 1) {
                argument = data[1];
            }
            switch (data[0]) {
                case "1":
                    stack.push(text.toString());
                    text.append(argument);
                    break;
                case "2":
                    stack.push(text.toString());
                    int countElementsToDelete = Integer.parseInt(argument);
                    int start = text.length() - countElementsToDelete;
                    text.delete(start, start + countElementsToDelete);
                    break;
                case "3":
                    int indexOfElement = Integer.parseInt(argument);
                    System.out.println(text.charAt(indexOfElement - 1));
                    break;
                case "4":
                    if (!stack.isEmpty()) {
                        text = new StringBuilder(stack.pop());
                    }
                    break;
            }
        }
    }
}

