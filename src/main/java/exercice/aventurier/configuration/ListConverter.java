package exercice.aventurier.configuration;

import java.util.List;

public class ListConverter {

    public String[][] convertListTo2DStringArray(List<String[]> list) {
        String[][] array2D = new String[list.size()][];
        array2D = list.toArray(array2D);
        return array2D;
    }
}
