package RecursionProject;
import java.io.File;

public class FileSystem {
    public static void explore(File folder) {
        if(folder == null || !folder.exists()) return;
        File[] files = folder.listFiles();

        if(files == null) return;

        for(File file : files) {
            if(file.isDirectory()) {
                System.out.println("Folder: " + file.getName());
                explore(file);   // recursion
            }
            else {
                System.out.println("File: " + file.getName());
            }
        }
    }

    public static void main(String[] args) {
        File folder = new File("C:\\Users");
        explore(folder);
    }
}
