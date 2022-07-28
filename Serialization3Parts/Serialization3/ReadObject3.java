package JC.Serialization3Parts.Serialization3;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadObject3 {
    public static void main(String[] args) throws IOException{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object"))) {
int count = ois.readInt();
Human3[] human = new Human3[count];
for(int i = 0; i<count; i++){
    human[i] = (Human3) ois.readObject();
}

        } catch (ClassNotFoundException e) {
e.printStackTrace();
        }
    }
}