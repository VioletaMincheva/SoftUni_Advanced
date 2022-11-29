package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates_Ex_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<Integer> dividers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toSet());
        Predicate<Integer> predicate = number -> {
            for (Integer divider : dividers) {
                if (number % divider != 0)
                    return false;
            }
            return true;
        };

        for (int i = 1; i <= n; i++) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
