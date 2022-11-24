package JavaAdvanced.SetAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_lab_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parkingLot = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String entranceExit = tokens[0];
            String carNumber = tokens[1];
            if (entranceExit.equals("IN")) {
                parkingLot.add(carNumber);
            } else if (entranceExit.equals("OUT")) {
                parkingLot.remove(carNumber);
            }
            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String p : parkingLot) {
                System.out.println(p);
            }
        }
    }
}
