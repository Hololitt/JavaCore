package JC.WildCards;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Animal> listofanimal = new ArrayList<>();
listofanimal.add(new Animal(1));
listofanimal.add(new Animal(2));
entertheanimals(listofanimal);
List<Dog> listofdogs = new ArrayList<>();
listofdogs.add(new Dog());
listofdogs.add(new Dog());
entertheanimals(listofanimal);
entertheanimals(listofdogs);
    }
    private static void entertheanimals(List<? extends Animal> list){
        for(Animal animal: list){
            System.out.println(animal);
        }
    }
}
