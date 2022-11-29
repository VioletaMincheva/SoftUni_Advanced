package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction_Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<int[], Integer> getMinValue = n -> Arrays.stream(numbers).min().getAsInt();
        int minValue = getMinValue.apply(numbers);
        System.out.println(minValue);

    }
}
