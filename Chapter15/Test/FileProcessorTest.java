import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    @BeforeEach
    void setUp() {
        String filePath = "C:\\Users\\user\\Desktop\\invoice\\Al-Sharrafi.txt";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void isValidPathWithEmptyPath() {
     assertThrows(FileNotFoundException.class, ()-> FileProcessor.isValidPath(null))  ;
    }

    @Test
    void isValidPath(){
        String filePath = "C:\\Users\\user\\Desktop\\invoice\\Al-Sharrafi.txt";
        try {
            boolean result = FileProcessor.isValidPath(filePath);
        }
        catch (FileNotFoundException error){
            System.err.println(error.getMessage());
            error.printStackTrace();
        }
    }

    @Test
    void isValidPathWithInvalidVariable(){
        String filePath = "C:\\Users\\user\\Desktop\\invoice\\Al-Sharrafi.txt";

    }@Test
    void playWithFileSystems(){
        FileSystem defaultFileSystem = FileSystems.getDefault();
        assertNotNull(defaultFileSystem);
        Iterable<Path> rootDirectories = defaultFileSystem.getRootDirectories();
        Iterator<Path> directories = rootDirectories.iterator();
        while(directories.hasNext()){
            System.out.println(directories.next());
        }
        Path cDrive = directories.next();
        assertNotNull(cDrive);
        try {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(cDrive);
        }
        catch (IOException error){
            error.printStackTrace();
        }
    }


}