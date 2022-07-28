package JC.Enum;

public enum Animal {
    dog("собака"), cat("кошка"), frog("лягушка"), elephant("слон");
    private String translation;
    Animal(String translation){
        this.translation=translation;
    }
    public String getTranslation(){
        return translation;
    }
    public String toString(){
        return "перевод" + translation;
    }
}
