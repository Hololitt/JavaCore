package JC.Serialization3Parts.Serialization2;

import java.io.Serializable;

public class Person implements Serializable {
private int age;
private String name;
Person(String name, int age){
    this.name = name;
    this.age = age;
}
String getName(){
    return name;
}
int getAge(){
    return age;
}
public String toString(){
    return name + " : " + age;
}
}
