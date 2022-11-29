package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames_Ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthPossible = Integer.parseInt(scanner.nextLine());
        Predicate<String> predicate = name -> name.length() <= lengthPossible;
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(predicate).forEach(System.out::println);
    }
}
