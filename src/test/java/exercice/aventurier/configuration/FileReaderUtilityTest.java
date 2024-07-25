package exercice.aventurier.configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileReaderUtilityTest {

    FileReaderUtility fileReaderUtility = new FileReaderUtility();

    @Test
    public void test_readFile(){
        List<String[]> result = fileReaderUtility.readFile("src/test/resources/deplacement.txt");

        Assertions.assertNotNull(result, "The result should not be null");
        Assertions.assertEquals(result.size(), 2);
        Assertions.assertArrayEquals(result.get(0), new String[]{"3", ",", "0"});
    }

    @Test
    public void test_read_empty_file(){
        List<String[]> result = fileReaderUtility.readFile("src/test/resources/empty_file.txt");

        Assertions.assertNotNull(result, "The result should not be null");
        Assertions.assertTrue(result.isEmpty(), "The result should be empty");
    }
}
