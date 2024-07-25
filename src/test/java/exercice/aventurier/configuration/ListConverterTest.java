package exercice.aventurier.configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListConverterTest {

    private final ListConverter listConverter = new ListConverter();

    @Test
    public void test_convertListTo2DStringArray(){
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{"A", "B", "C"});
        list.add(new String[]{"D", "E", "F"});
        list.add(new String[]{"G", "H", "I"});

        String [][] result = listConverter.convertListTo2DStringArray(list);

        Assertions.assertNotNull(result, "Result should not be null");
        Assertions.assertArrayEquals(new String[] {"A", "B", "C"}, result[0], "First row should be ['A', 'B, 'C']");
    }
}
