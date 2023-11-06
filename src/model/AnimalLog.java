package model;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class AnimalLog implements AnimalLogInterface {

    private Animal animal;

    LinkedList<Animal> animalLinkedList = new LinkedList<>();

    public AnimalLog(Animal animal) {
        this.animal = animal;
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
    public String addCommand(@NotNull Animal animal, String newCommand) {
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

    public void showAllCommands(@NotNull Animal animal) {
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
