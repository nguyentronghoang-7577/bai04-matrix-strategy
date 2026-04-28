import java.io.File;

public class App {
    public static String getFilePath(String folder, String fileName) {
        return folder + File.separator + fileName;
    }
}