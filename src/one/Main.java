package one;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        User a = new User("Vlad", "Fomin", 16);
        User b = new User("Alex", "Zjigalko", 16);

        List<User> users = new ArrayList<>();
        users.add(a);
        users.add(b);
        users.add(b);

//        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed()).
//                thenComparing(User::getFirstname).then.Comparing();
//        users.forEach(System.out::println);
        HashMap<String, User> map = new HashMap();
        for (User u : users) {
            UUID uuid = UUID.randomUUID();
            map.put(uuid.toString(), u);


        }

        map.put("1", new User("Dima", "Khatsko", 29));

        for (String s : map.keySet()
        ) {
            System.out.println(map.get(s));
        }


//        map.forEach((s, user) ->{
//            System.out.println(s + ": " + user);
//            System.out.println();
//        });


        users.forEach(System.out::println);

//        for(User u: users) {
//            System.out.println(u);
//        }
//
//        for (int i = 0; i < users.size(); i++){
//            System.out.println(users.get(i));
//        }

        System.out.println(users.indexOf(a));
        System.out.println(users.remove(0));
        System.out.println(users.remove(b));
        System.out.println(users.contains(b));

        System.out.println();

        Set<User> set = new HashSet<>();

        set.add(a);
        set.add(b);
        set.forEach(System.out::println);

        for (User user : set) {
            System.out.println(user);
        }

////        Iterator<User> iterator = set.iterator();
////        while (iterator.hasNext()){
////            System.out.println(iterator.next());
//        }
//


//        LinkedList<User> linkedList = new LinkedList<>();
//        linkedList.add(b);
//        linkedList.add(a);
//        linkedList.add(b);
//
//        linkedList.forEach(System.out::println);
//        for(User u: linkedList){
//            System.out.println(u);
//        }
//
//        Iterator<User> iterator = linkedList.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        linkedList.add(a);
//        linkedList.getFirst();
//        linkedList.getLast();


//        Box box = new Box(10, 10, 10);
//        List<Object> content = box.getContent();
//        content.add(new Box(1, 1, 1));
//        content.add("String");
//        content.add(4);


        Box<Cat> cats = new Box<>(10, 2, 20);
        cats.getContent().add(new Cat("t1"));
        cats.getContent().add(new Cat("t2"));
        cats.getContent().add(new Cat("t3"));


        Box<Dog> dogs = new Box<>(10,10,10);
        dogs.getContent().add(new Dog("Sam"));

        Box<Animal> animal = new Box<>(10,101,10);
        animal.getContent().add(new Dog("sdd"));
        animal.getContent().add(new Cat("jkdgj"));

        for(Animal a: animalBox.getContent()
        ) {
            System.out.println(a);
            if(a instanceon Dog) {
                System.out.println("Кличка" + (((Dog)a)getName));
            } else {
                System.out.println("cat's name:" + (((Cat)a)getName) );
            }
            a.voice;
        }

    }
}
