package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Consumer<String> consumer = name -> System.out.println(name);
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(n-> consumer.accept(n));

    }
}
