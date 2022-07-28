package JC.Serialization3Parts;

import java.io.Serializable;

public record Person12(String name, int age, int id) implements Serializable {
    public String toString() {
        return name + " " + age + " " + id;
    }
}
