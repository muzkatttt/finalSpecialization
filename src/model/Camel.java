package model;


public class Camel extends PackAnimal{
    public Camel(int id, String name, String dateOfBirth, String commands) {
        super(id, name, dateOfBirth, commands);
    }

    public Camel(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Camel{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", commands=" + commands +
                '}';
    }
}
