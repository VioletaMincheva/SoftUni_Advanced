package JavaAdvanced.SetAndMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_lab_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guest = scanner.nextLine();

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while (!guest.equals("PARTY")) {
            if (Character.isDigit(guest.charAt(0))) {
                vip.add(guest);
            } else {
                regular.add(guest);
            }
            guest = scanner.nextLine();
        }
        String inGuest = scanner.nextLine();
        while (!inGuest.equals("END")) {
            vip.remove(inGuest);
            regular.remove(inGuest);
            inGuest = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        for (String vipGuests : vip) {
            System.out.println(vipGuests);
        }
        for (String r : regular) {
            System.out.println(r);
        }
    }
}

