package JC.Serialization3Parts.Serialization3;

import java.io.Serializable;

public class Human3 implements Serializable {

    private transient int age; //Variables mit index transient sind nicht lesbar
    private String name;
    Human3(int age,String name){
        this.age = age;
        this.name = name;
    }
    public int getAge3(){
        return age;
    }
    public String getName3(){
        return name;
    }
    public String toString(){
        return name + " " + age;
    }

}
