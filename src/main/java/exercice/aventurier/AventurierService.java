package exercice.aventurier;

import exercice.aventurier.configuration.AventurierInitializer;
import exercice.aventurier.configuration.FileReaderUtility;
import exercice.aventurier.configuration.ListConverter;

import java.util.List;

public class AventurierService {

    private final AventurierInitializer aventurierInitializer;
    private final FileReaderUtility fileReaderUtility;
    private final ListConverter listConverter;

    public AventurierService(AventurierInitializer aventurierInitializer, FileReaderUtility fileReaderUtility, ListConverter listConverter) {
        this.aventurierInitializer = aventurierInitializer;
        this.fileReaderUtility = fileReaderUtility;
        this.listConverter = listConverter;
    }
    
    public void play(final String mapFile, final String deplacementFile, Aventurier aventurier){
        List<String[]> mapList = fileReaderUtility.readFile(mapFile);
        String [][] map = listConverter.convertListTo2DStringArray(mapList);
        String [] deplacement = aventurierInitializer.initializeAventurier(aventurier, deplacementFile);
        this.deplacerAventurier(map, aventurier, deplacement);
    }

    private void deplacerAventurier(String[][] carte, Aventurier aventurier, String[] deplacements){
        if (carte[aventurier.getY()][aventurier.getX()].equals("#")) {
            throw new RuntimeException("L'aventurier est mal positionné");
        } else {
            for (String deplacement : deplacements) {
                switch (deplacement) {
                    case "N": if (aventurier.getY() - 1 > 0 && !carte[aventurier.getY() - 1][aventurier.getX()].equals("#")) {
                        aventurier.setY(aventurier.getY() - 1);
                        break;
                    } else break;
                    case "S": if (aventurier.getY() + 1 < carte.length && !carte[aventurier.getY() + 1][aventurier.getX()].equals("#")) {
                        aventurier.setY(aventurier.getY() + 1);
                        break;
                    } else break;
                    case "O": if (aventurier.getX() - 1 > 0 && !carte[aventurier.getY()][aventurier.getX() - 1].equals("#")) {
                        aventurier.setX(aventurier.getX() - 1);
                        break;
                    } else break;
                    case "E": if (aventurier.getX() + 1 < carte.length && !carte[aventurier.getY()][aventurier.getX() + 1].equals("#")) {
                        aventurier.setX(aventurier.getX() + 1);
                        break;
                    } else break;
                    default:
                        System.out.println("Le deplacement : " + deplacement + " is not valid");
                }
            }
        }

        System.out.println("Position final: (" + aventurier.getX()+ " ," + aventurier.getY() + ")");
    }
}
