package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement_Ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> getSmallestInteger =
                list -> list.lastIndexOf(list.stream().min(Integer::compareTo).get());
        int indexOfSmallestNumbers = getSmallestInteger.apply(numbers);
        System.out.println(indexOfSmallestNumbers);
    }
}
