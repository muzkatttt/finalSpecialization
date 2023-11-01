import model.*;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(1, "Whiskers", "2019-05-15");
        Dog dog = new Dog(2, "Fido", "2020-01-01");
        Hamster hamster = new Hamster(3, "Hammy", "2021-03-10");
        Horse horse = new Horse(4, "Thunder", "2015-07-21");
        Camel camel = new Camel(5, "Sandy", "2016-11-03");
        Donkey donkey = new Donkey(6, "Burro", "2019-01-23");

        LinkedList<Animal> animals = new LinkedList<>();
        animals.add(cat);
        System.out.println(cat);
        animals.add(dog);
        System.out.println(dog);
        animals.add(hamster);
        System.out.println(hamster);
        animals.add(horse);
        System.out.println(horse);
        animals.add(camel);
        System.out.println(camel);
        animals.add(donkey);
        System.out.println(donkey);

        System.out.println(animals);
        System.out.println(animals.size());
        
    }
}