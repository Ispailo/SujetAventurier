package exercice.aventurier;

import exercice.aventurier.configuration.AventurierInitializer;
import exercice.aventurier.configuration.FileReaderUtility;
import exercice.aventurier.configuration.ListConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AventurierServiceTest {

    private final AventurierService aventurierService = new AventurierService(new AventurierInitializer(new FileReaderUtility()), new FileReaderUtility(), new ListConverter());
    private final Aventurier aventurier = new Aventurier();

    @Test
    public void test_play(){
        aventurierService.play("src/test/resources/carte.txt", "src/test/resources/deplacement.txt", aventurier);

        Assertions.assertNotNull(aventurier, "Aventurier should not be null");
        Assertions.assertEquals(aventurier.getX(), 2);
        Assertions.assertEquals(aventurier.getY(), 2);
    }

    @Test
    public void test_play_wrong_position(){
        try {
            aventurierService.play("src/test/resources/carte.txt", "src/test/resources/deplacement_wrong_position.txt", aventurier);
        } catch (Exception e) {
            Assertions.assertNotNull(aventurier, "Aventurier should not be null");
        }
    }
}
