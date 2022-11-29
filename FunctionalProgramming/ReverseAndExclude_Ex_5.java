package JavaAdvanced.FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReverseAndExclude_Ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collections.reverse(numbers);
        int n =Integer.parseInt(scanner.nextLine());

        Predicate<Integer> predicate = e -> e % n != 0;
        Function<List<Integer>, List<Integer>> notDivisibleByN =
                list -> list.stream().filter(predicate).collect(Collectors.toList());

        numbers = notDivisibleByN.apply(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
/*
import java.util.*;
import java.util.stream.Collectors;

public class ReverseAndExclude_Ex_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int divisibleByNumber = Integer.parseInt(scanner.nextLine());
        List<Integer> reversedNumbers = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % divisibleByNumber != 0) {
                reversedNumbers.add(numbers.get(i));
            }
        }
        for (Integer integer : reversedNumbers) {
            System.out.print(integer + " ");
        }
    }
}
*/