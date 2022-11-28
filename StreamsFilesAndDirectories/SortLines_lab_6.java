package JavaAdvanced.StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines_lab_6 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Admin\\Desktop\\input.txt");
        Path out = Paths.get("C:\\Users\\Admin\\Desktop\\02.WriteToFileOutput.txt");

        List<String> lines = Files.readAllLines(path)
                .stream().sorted(String::compareTo).toList();
        Files.write(out, lines);
    }
}
