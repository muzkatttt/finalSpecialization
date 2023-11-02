package model;

import java.util.ArrayList;

public class Dog extends PetAnimal {
    public Dog(int id, String name, String dateOfBirth, ArrayList<String> commands) {
        super(id, name, dateOfBirth, commands);
    }

    public Dog(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", commands=" + commands + '\'' +
                '}';
    }
}
