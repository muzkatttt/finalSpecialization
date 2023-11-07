package model;

public class Donkey extends PackAnimal{
    public Donkey(int id, String name, String dateOfBirth, String commands) {
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
