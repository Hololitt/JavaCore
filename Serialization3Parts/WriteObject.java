package JC.Serialization3Parts;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteObject {
    public static void main(String[] args) {
        Person12 person = new Person12("Slave", 19, 1);
        Person12 person2 = new Person12("Van", 34, 2);

        try{
            FileOutputStream fileoutputstream = new FileOutputStream("Info");
            ObjectOutputStream obj= new ObjectOutputStream(fileoutputstream);

            obj.writeObject(person);
            obj.writeObject(person2);

            obj.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
