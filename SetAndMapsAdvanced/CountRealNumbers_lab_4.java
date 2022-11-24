package JavaAdvanced.SetAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_lab_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> numbers = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            double currentNumber = input[i];
            if (!numbers.containsKey(currentNumber)) {
                numbers.put(currentNumber, 1);
            } else {
                numbers.put(currentNumber, numbers.get(currentNumber) + 1);
            }
        }
        for (Double number : numbers.keySet()) {
            System.out.printf("%.1f -> %d%n", number, numbers.get(number));
        }
    }
}
