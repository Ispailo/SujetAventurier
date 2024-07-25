package exercice.aventurier;

import exercice.aventurier.configuration.AventurierInitializer;
import exercice.aventurier.configuration.FileReaderUtility;
import exercice.aventurier.configuration.ListConverter;

public class Main {
    public static void main(String[] args) {
        FileReaderUtility fileReaderUtility = new FileReaderUtility();
        ListConverter listConverter = new ListConverter();
        AventurierInitializer initializer = new AventurierInitializer(fileReaderUtility);
        AventurierService aventurierService = new AventurierService(initializer, fileReaderUtility, listConverter);
        Aventurier aventurier = new Aventurier();

        if (args.length != 2) {
            throw new RuntimeException("Merci de mettre les noms des fichiers en argument");
        }
        System.out.println("Carte fichier : " + args[0] + " | Deplacement fichier : " + args[1]);
        String mapFile = "src/main/resources/" + args[0] + ".txt";
        String deplacementFile = "src/main/resources/" + args[1] + ".txt";

        aventurierService.play(mapFile, deplacementFile, aventurier);

    }



}