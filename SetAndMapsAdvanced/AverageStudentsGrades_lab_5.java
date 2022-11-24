package JavaAdvanced.SetAndMapsAdvanced;

import java.util.*;

public class AverageStudentsGrades_lab_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsInfo = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if (!studentsInfo.containsKey(name)) {
                studentsInfo.put(name, new ArrayList<>());
            }
            studentsInfo.get(name).add(grade);
        }
        for (Map.Entry<String, List<Double>> currentStudent : studentsInfo.entrySet()) {
            System.out.print(currentStudent.getKey() + " -> ");
            for (Double grades : currentStudent.getValue()) {
                System.out.printf("%.2f ", grades);
            }
            System.out.printf("(avg: %.2f)%n",
                    currentStudent.getValue().stream().mapToDouble(g -> g).average().getAsDouble());
        }
    }
}

