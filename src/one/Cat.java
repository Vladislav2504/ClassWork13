package one;

public class Cat extends Animal{

    private String name;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat(String name){
        this.name = name;
    }
}
