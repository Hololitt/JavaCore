package JC.Serialization3Parts.Serialization2;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class ReadObject {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis = new FileInputStream("Peoples");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();

            Person[] people = new Person[personCount];

            for (int i = 0; personCount > i; i++) {
                people[i] = (Person) ois.readObject();
            }
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}