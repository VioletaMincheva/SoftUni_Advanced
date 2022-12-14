package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class StackAndQueues_HotPotato_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, data);

        int n = Integer.parseInt(scanner.nextLine());
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}


