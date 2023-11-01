package model;

import java.util.LinkedList;

public class Hamster extends PetAnimal {
    public Hamster(int id, String name, String dateOfBirth, LinkedList<String> commands) {
        super(id, name, dateOfBirth, commands);
    }

    public Hamster(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", commands=" + commands +
                '}';
    }
}
