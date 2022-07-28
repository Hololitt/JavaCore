package JC.EqualsStringPool;

public class Test {
    public static void main(String[] args) {
        People people = new People(21);
        People people1 = new People(21);
        System.out.println(people.equals(people1));


    }
}
class People{
    People(int age){
this.age=age;
    }
    private int age;

public boolean equals(Object obj){
    People people = (People) obj;
    return this.age == people.age;
}

}
