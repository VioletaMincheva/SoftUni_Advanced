package JavaAdvanced.SetAndMapsAdvanced;

import java.util.*;

public class FixEmails_ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, ArrayList<String>> info = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String name = command;
            String email = scanner.nextLine();
            boolean isRegular = !email.endsWith("uk")
                    && !email.endsWith("us")
                    && !email.endsWith("com");
            info.putIfAbsent(name, new ArrayList<>());
            if (info.containsKey(name) && isRegular) {
                info.get(name).add(email);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : info.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("%s -> ", entry.getKey());
                entry.getValue().forEach(e -> System.out.printf("%s %n", e));
            }
        }
    }
}