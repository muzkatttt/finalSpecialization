package model;

import java.util.LinkedList;

public class Cat extends PetAnimal {
    public Cat(int id, String name, String dateOfBirth, LinkedList<String> commands) {
        super(id, name, dateOfBirth, commands);
    }

    public Cat(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", commands=" + commands +
                '}';
    }
}
