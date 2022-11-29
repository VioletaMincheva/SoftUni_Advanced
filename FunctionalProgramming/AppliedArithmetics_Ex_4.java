package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics_Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        Function<int[], int[]> addOne = arr -> Arrays.stream(arr).map(e -> e += 1).toArray();
        Function<int[], int[]> multiplyTwo = arr -> Arrays.stream(arr).map(e -> e *= 2).toArray();
        Function<int[], int[]> subtractOne = arr -> Arrays.stream(arr).map(e -> e -= 1).toArray();

        Consumer<int[]> printConsumer = arr -> Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = addOne.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyTwo.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractOne.apply(numbers);
                    break;
                case "print":
                    printConsumer.accept(numbers);
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
