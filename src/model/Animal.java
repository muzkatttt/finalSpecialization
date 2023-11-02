package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Animal implements AnimalInterface {

    private static int count = 0;
    int id;
    String name;
    String dateOfBirth;
    //private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
    ArrayList<String> commands;

    public Animal(int id, String name, String dateOfBirth, ArrayList<String> commands) {
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

    public ArrayList<String> getCommands() {
        return commands;
    }

    @Override
    public void showAllCommands(Animal animal) {
        if(animal.getCommands().isEmpty()){
            System.out.println("У " + animal.getName() + " нет команд!");
        } else {
            System.out.println("Команды животного " + animal.getCommands());
        }
    }

    @Override
    public void addCommand(PetAnimal petAnimal, String newCommand) {
        if(petAnimal.commands.isEmpty()) {
            petAnimal.commands.add(newCommand);
        } else {
            petAnimal.commands.add(newCommand);
            System.out.println("Добавлена новая команда: " + newCommand);
        }
    }


    public int id(){
        id = count++;
        return id;
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
