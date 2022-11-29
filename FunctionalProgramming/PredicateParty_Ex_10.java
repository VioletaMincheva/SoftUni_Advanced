package JavaAdvanced.FunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty_Ex_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String criteria = tokens[1];
            String string = tokens[2];
            switch (command) {
                case "Remove":
                    switch (criteria) {
                        case "StartsWith":
                            names.removeIf(currentName -> currentName.startsWith(string));
                            break;
                        case "EndsWith":
                            names.removeIf(currentName -> currentName.endsWith(string));
                            break;
                        case "Length":
                            int length = Integer.parseInt(string);
                            names.removeIf(currentName -> currentName.length() == length);
                            break;
                    }
                case "Double":
                    switch (criteria) {
                        case "StartsWith":
                            List<String> doubleNamesStartsWith =
                                    names.stream().filter(currentName -> currentName.startsWith(string))
                                            .collect(Collectors.toList());
                            if (!doubleNamesStartsWith.isEmpty()) {
                                names.addAll(doubleNamesStartsWith);
                            }
                            break;
                        case "EndsWith":
                            List<String> doubleNamesEndsWith =
                                    names.stream().filter(currentName -> currentName.endsWith(string))
                                            .collect(Collectors.toList());
                            if (!doubleNamesEndsWith.isEmpty()) {
                                names.addAll(doubleNamesEndsWith);
                            }
                            break;
                        case "Length":
                            int length = Integer.parseInt(string);
                            List<String> doubleNamesWithLength =
                                    names.stream().filter(currentName -> currentName.length() == length)
                                            .collect(Collectors.toList());
                            if (!doubleNamesWithLength.isEmpty()) {
                                names.addAll(doubleNamesWithLength);
                            }
                            break;
                    }
            }
            input = scanner.nextLine();
        }

        if (names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
          Collections.sort(names);
            System.out.print(names.stream().map(Objects::toString).collect(Collectors.joining(", ")));
            System.out.print(" are going to the party!");
        }

    }
}
