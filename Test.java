package JC.Enum;

import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {

        /*    Animal animal = Animal.elephant;
        switch(animal){
            case elephant:
                System.out.println("Its a elephant");
                break;
        }
        System.out.println(animal instanceof Animal);
        System.out.println(animal.getClass());

         */
        Animal animal = Animal.dog;
        System.out.println(animal.getTranslation());
        System.out.println(animal.toString());
Animal animal2 = Animal.valueOf("elephant");
        System.out.println(animal2.getTranslation());
        Animal getIndex = Animal.cat;
        System.out.println(getIndex.ordinal());

    }
}
