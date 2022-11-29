package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_Ex_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> consumer = name -> System.out.println("Sir " + name);
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> consumer.accept(e));

    }
}
