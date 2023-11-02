package model;

import java.util.ArrayList;

public class Donkey extends PackAnimal{
    public Donkey(int id, String name, String dateOfBirth, ArrayList<String> commands) {
        super(id, name, dateOfBirth, commands);
    }

    public Donkey(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", commands=" + commands +
                '}';
    }
}
