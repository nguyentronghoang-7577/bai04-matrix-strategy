import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void test() {
        String folder = "data";
        String file = "test.txt";

        String expected = "data\\test.txt";
        assertEquals(expected, App.getFilePath(folder, file));
    }
}
