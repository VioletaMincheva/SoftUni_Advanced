package JavaAdvanced;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackAndQueues_BrowserHistory_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String currentURL = "";
        ArrayDeque<String> browser = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (browser.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentURL = browser.pop();
                }
            } else {
                if (!currentURL.equals("")) {
                    browser.push(currentURL);
                }
                currentURL = input;

            }
            System.out.println(currentURL);
            input = scanner.nextLine();
        }
    }
}
