package exercice.aventurier.configuration;

import exercice.aventurier.Aventurier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AventurierInitializerTest {

    AventurierInitializer aventurierInitializer = new AventurierInitializer(new FileReaderUtility());

    @Test
    public void test_initializeAventurier() {
        Aventurier aventurier = new Aventurier();
        String[] deplacement = aventurierInitializer.initializeAventurier(aventurier, "src/test/resources/deplacement.txt");
        Assertions.assertNotNull(deplacement, "The deplacement list should not be null");
        Assertions.assertEquals(aventurier.getX(), 3);
        Assertions.assertEquals(aventurier.getY(), 0);
    }
}
