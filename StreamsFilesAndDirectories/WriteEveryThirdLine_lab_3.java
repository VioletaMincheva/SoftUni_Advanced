package JavaAdvanced.StreamsFilesAndDirectories;

import java.io.*;

public class WriteEveryThirdLine_lab_3 {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\Admin\\Desktop\\input.txt";
        String outputPath = "C:\\Users\\Admin\\Desktop\\02.WriteToFileOutput.txt";

        BufferedReader in = new BufferedReader(new FileReader(inputPath));
        BufferedWriter out = new BufferedWriter(new FileWriter(outputPath));

        int counter = 1;
        String line = in.readLine();
        while (line != null) {
            if (counter % 3 == 0) {
                out.write(line);
                out.write(System.lineSeparator());
            }
            counter++;
            line = in.readLine();
        }
        in.close();
        out.close();
    }
}
