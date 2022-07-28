package JC.Serialization3Parts.Serialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject2 {
    public static void main(String[] args) {
        Person[] people = {new Person("Mike", 23), new Person("Bob", 34)};
        try {
            FileOutputStream fos = new FileOutputStream("Peoples");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(people.length);
            for(Person person : people){
                oos.writeObject(person);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
