package one;

public class User {
    private String firstname;
    private String secondname;

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", age=" + age +
                '}';
    }

    private int age;


    public User(String firstname, String secondname, int age){
        this.firstname = firstname;
        this.secondname = secondname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
