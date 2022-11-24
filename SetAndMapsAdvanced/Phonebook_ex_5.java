package JavaAdvanced.SetAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Phonebook_ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phoneNumber = tokens[1];
            phonebook.putIfAbsent(name, phoneNumber);
            if (phonebook.containsKey(name)) {
                phonebook.put(name, phoneNumber);
            }
            input = scanner.nextLine();
        }
        String searchName = scanner.nextLine();
        while (!searchName.equals("stop")) {
            if (phonebook.containsKey(searchName)) {
                System.out.printf("%s -> %s%n", searchName, phonebook.get(searchName));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchName);
            }
            searchName = scanner.nextLine();
        }
    }
}
