package JC.Serialization3Parts.Serialization3;
import JC.polymorphism.Human;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteObject3 {
    public static void main(String[] args) {
        Human3[] human = {new Human3(24,"Slave"),new Human3(56,"dungeon master")};

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Object"))){
oos.writeInt(human.length);
for(Human3 write : human){
    oos.writeObject(human);
}

        }catch(IOException e){
           e.printStackTrace();
        }
    }
}
