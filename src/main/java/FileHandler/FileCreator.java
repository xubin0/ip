package FileHandler;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    public static void createFileIfNotExists(String filePath, String directoryPath) {
            File file = new File(filePath);
            File directory = new File(directoryPath);

            try {
                if (!directory.exists()) {
                    boolean dirCreated = directory.mkdirs();
                    if (dirCreated) {
                        System.out.println("Created directory: " + directoryPath);
                    }
                }

                if (!file.exists()) {
                    boolean fileCreated = file.createNewFile(); // Creates file if missing
                    if (fileCreated) {
                        System.out.println("Created file: " + filePath);
                    }
                } else {
                    System.out.println("File already exists: " + filePath);
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }
}
