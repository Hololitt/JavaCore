package JC;
import java.io.*;
import java.util.Scanner;
public class ReadingFromFile {
    public static void main(String[] args) throws IOException, FileNotFoundException{
File file = new File(//path of file);
    Scanner scanner = new Scanner(file);
    while(scanner.hasNextLine){
        System.out.println(scanner.nextLine());
    }
    }
}
