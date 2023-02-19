package JC;
import java.io.*;

public class WriteInFile {
    public static void main(String[] args) {
File file = new File(//path of file);
    FileWriter fileWriter = new FileWriter(//path of file);
fileWriter.write(//text);
    fileWriter.close();
    }
}
