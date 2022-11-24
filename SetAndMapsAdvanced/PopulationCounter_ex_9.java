package JavaAdvanced.SetAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter_ex_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Long>> populationAllInfo = new LinkedHashMap<>();
        Map<String, Long> countriesPopulation = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("report")) {
            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            Long cityPopulation = Long.parseLong(tokens[2]);
            populationAllInfo.putIfAbsent(country, new LinkedHashMap<>());
            populationAllInfo.get(country).put(city, cityPopulation);
            if (countriesPopulation.containsKey(country)) {
                countriesPopulation.put(country, countriesPopulation.get(country) + cityPopulation);
            } else {
                countriesPopulation.putIfAbsent(country, cityPopulation);
            }
            input = scanner.nextLine();
        }

        populationAllInfo.entrySet().stream()
                .sorted((c1, c2) -> countriesPopulation.get(c2.getKey()).compareTo(countriesPopulation.get(c1.getKey())))
                .forEach(country ->
                {
                    System.out.printf("%s (total population: %d)%n",
                            country.getKey(), countriesPopulation.get(country.getKey()));
                    country.getValue().entrySet().stream()
                            .sorted((t1,t2)-> t2.getValue().compareTo(t1.getValue()))
                            .forEach(city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));
                });
    }
}
