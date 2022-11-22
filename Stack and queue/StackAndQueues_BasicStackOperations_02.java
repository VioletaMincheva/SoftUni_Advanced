package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
public class StackAndQueues_BasicStackOperations_02 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] input = scanner.nextLine().split("\\s+");
            int n = Integer.parseInt(input[0]); //numberOfElementsToPushToStack
            int s = Integer.parseInt(input[1]); //numberOfElementsToPopFromStack
            int x = Integer.parseInt(input[2]); //numberToCheckInStack

            int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            ArrayDeque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                stack.push(numbers[i]);
            }
            for (int j = 0; j < s; j++) {
                stack.pop();
            }
            if (stack.contains(x)) {
                System.out.println("true");
            } else {
                if (stack.isEmpty()) {
                    System.out.println("0");
                } else {
                    int minElement = getMinElement(stack);
                    System.out.println(minElement);
                }
            }
        }

        public static int getMinElement(ArrayDeque<Integer> stack) {
            int min = Integer.MAX_VALUE;
            while (!stack.isEmpty()) {
                int currentElement = stack.pop();
                if (currentElement < min) {
                    min = currentElement;
                }
            }
            return min;
        }
    }
