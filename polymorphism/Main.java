package JC.polymorphism;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        Human human = (Human) child;
        human.walking();
        //Downcusting

        Human human1 = child;
        child.eat();
        child.cry();
        //Upcasting
    }
}
