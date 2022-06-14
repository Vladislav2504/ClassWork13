package one;

public class Dog extends Animal {

    private String owner;

    @Override
    public String toString() {
        return "Dog{" +
                "owner='" + owner + '\'' +
                '}';
    }

    public Dog(String owner){
        this.owner = owner;
    }

}
