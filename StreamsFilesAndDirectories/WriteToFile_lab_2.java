package JavaAdvanced.StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFile_lab_2 {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\Admin\\Desktop\\input.txt";
        String outputPath = "C:\\Users\\Admin\\Desktop\\02.WriteToFileOutput.txt";


        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)) {

            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (!symbols.contains((char) oneByte)) {
                    out.write(oneByte);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}