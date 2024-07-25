package exercice.aventurier.configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtility {

    public List<String[]> readFile(String filePath) {
        List<String[]> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into characters and store in an array
                String[] row = line.split("");
                list.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
