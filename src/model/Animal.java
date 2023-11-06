package model;

public class Animal {

    int id;
    String name;
    String dateOfBirth;
    String commands;


    public Animal(int id, String name, String dateOfBirth, String commands) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.commands = commands;
    }

    public Animal(int id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCommands() {
        return commands;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", dateOfBirth='" + this.dateOfBirth + '\'' +
                ", commands=" + this.commands +
                '}';
    }
}
