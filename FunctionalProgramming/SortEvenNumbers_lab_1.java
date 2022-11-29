package JavaAdvanced.FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers_lab_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> evenNumbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).toList());

        evenNumbers.removeIf(e -> e % 2 != 0);
        System.out.print(evenNumbers.stream().map(Objects::toString).collect(Collectors.joining(", ")));
        System.out.println();
        System.out.println(evenNumbers.stream().sorted(Integer::compareTo)
                .map(Objects::toString).collect(Collectors.joining(", ")));

    }
}
