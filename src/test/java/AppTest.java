import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void test() {
        String folder = "data";
        String file = "test.txt";

        String expected = "data\\test.txt";
        String actual = App.getFilePath(folder, file);

        // In ra log để kiểm tra trên GitHub Actions
        System.out.println("=== DEBUG INFO ===");
        System.out.println("OS Name:  " + System.getProperty("os.name"));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println("==================");

        // String expected = "data" + File.separator + "test.txt";
        assertEquals(expected, actual);
    }
}
