package model;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Animal implements AnimalInterface {

    private static int count = 0;
    private int id = count++;
    String name;
    String dateOfBirth;
    LinkedList<String> commands;

    LinkedList<Animal> animalLinkedList;

    public Animal(int id, String name, String dateOfBirth, LinkedList<String> commands) {
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

    public LinkedList<String> getCommands() {
        return commands;
    }

    @Override
    public void showAllAnimals(LinkedList<Animal> animalLinkedList) {
        if(animalLinkedList ==null) {
            System.out.println("В реестре нет животных");
        } else {
            System.out.println("В реестре добавлены животные: ");
            for (int i = 0; i < animalLinkedList.size(); i++) {
                System.out.println(animalLinkedList.element());
            }
        }
    }

    @Override
    public void addAnimalToList(Animal animal) {
        animalLinkedList.add(animal);
    }

    @Override
    public void showAllCommands(Animal animal) {
        if(animal.getCommands().isEmpty()){
            System.out.println("У " + this.name + " нет команд!");
        } else {
            System.out.println("Команды животного " + animal.getCommands());
        }
    }

    @Override
    public void addCommand(Animal animal) {
        if(animal.getCommands().isEmpty()) {
            animal.commands.addAll(0, commands);
        }
    }

    @Override
    public void showAllAnimalByDateOfBirth() {
        // добавлю позже
    }

    @Override
    public int sizeOfCollection(LinkedList<Animal> animalLinkedList) {
        return animalLinkedList.size();
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
