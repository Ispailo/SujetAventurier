package exercice.aventurier.configuration;

import exercice.aventurier.Aventurier;

import java.util.List;

public class AventurierInitializer {
    private final FileReaderUtility fileReaderUtility;

    public AventurierInitializer(FileReaderUtility fileReaderUtility) {
        this.fileReaderUtility = fileReaderUtility;
    }

    public String[] initializeAventurier(Aventurier aventurier, String filePath) {
        List<String[]> list;
        list = this.fileReaderUtility.readFile(filePath);
        aventurier.setX(Integer.parseInt(list.get(0)[0]));
        aventurier.setY(Integer.parseInt(list.get(0)[2]));
        return list.get(1);
    }
}
