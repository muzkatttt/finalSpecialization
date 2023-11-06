package model;

import java.util.LinkedList;

public class AnimalLog implements AnimalLogInterface {

    Animal animal;
    LinkedList<Animal> animalLinkedList = new LinkedList<>();


    public AnimalLog(Animal animal, LinkedList<Animal> animalLinkedList) {
        this.animal = animal;
       this.animalLinkedList = animalLinkedList;
    }

    public AnimalLog(LinkedList<Animal> animalLinkedList) {
        this.animalLinkedList = animalLinkedList;
    }

    public AnimalLog(Animal animal) {
        this.animal = animal;
    }

    public AnimalLog() {
    }

    @Override
    public boolean addAnimalToList(Animal animal) {
        return animalLinkedList.add(animal);
    }


    @Override
    public LinkedList<Animal> deleteAnimalFromLinkedList() {
        if(animalLinkedList.contains(animal)){
            animalLinkedList.remove(animal);
        }
        return animalLinkedList;
    }

    @Override
    public void showAllAnimals() {
        if(animalLinkedList.contains(animal)) {
            for (Animal animal : animalLinkedList) {
                System.out.println(animal.toString());
            }
        } else {
                System.out.println("Список животных пуст");
        }
    }


    @Override
    public void showAllAnimalByDateOfBirth() {
        // добавлю позже
    }

    @Override
    public LinkedList<Animal> createNewLinkedList() {
        return new LinkedList<Animal>();
    }

    @Override
    public String addCommand(Animal animal, String newCommand) {
        StringBuilder sb = new StringBuilder();
        if(animal.commands.isEmpty()) {
            sb.append(newCommand);
            sb.append(";");
        } else {
            sb.append(newCommand);
            sb.append(";");
            System.out.println("Добавлена новая команда: " + newCommand);
        }
        return sb.toString();
    }

    public void showAllCommands(Animal animal) {
        if(animal.getCommands().isEmpty()){
            System.out.println("У " + animal.getName() + " нет команд!");
        } else {
            System.out.println("Команды животного " + animal.getCommands());
        }
    }
    @Override
    public String toString() {
        return "AnimalLog{" +
                "animal=" + animal +
                ", animalLinkedList=" + animalLinkedList +
                '}';
    }
}
