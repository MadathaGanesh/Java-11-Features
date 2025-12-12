import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_Demo {
    
    public static void main(String[] args) throws IOException {
        
        // Create a Path object pointing to the file "demoFile.txt"
        // If the file doesn't exist, Files.writeString() will create it.
        Path path = Paths.get("demoFile.txt");
        Files.writeString(path, "Adding new data to file  !!!");


        // Create another Path object for reading the file 
        Path read_path = Paths.get("demoFile.txt");

         // Files.readString() :  Reads the complete content of the file as a single String
        String read_Context = Files.readString(read_path);
        System.out.println(read_Context);

    }
}
