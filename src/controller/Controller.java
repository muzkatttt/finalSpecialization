package controller;

import model.Animal;
import model.AnimalLog;
import java.util.LinkedList;

public class Controller {
    AnimalLog animalLog;
    LinkedList<Animal> animalLinkedList = new LinkedList<>();
    Animal animal;

    public Controller(AnimalLog animalLog) {
        this.animalLog = animalLog;
    }

    public LinkedList<Animal> addAnimalToList(Animal animal) {
        animalLinkedList.add(animal);
        System.out.println("Животное " + animal.getName() + " добавлено в список");
        return animalLinkedList;
    }
    public LinkedList<Animal> deleteAnimalFromLinkedList(Animal animal){
        animalLog.deleteAnimalFromLinkedList();
        System.out.println("Животное удалено из списка");
        return animalLinkedList;
    }

    public void showAllAnimals() {
        for (Animal animal :
             animalLinkedList) {
            System.out.println(animal);
        }
    }
    public String addCommand(String newCommand){
        animalLog.addCommand(animal, newCommand);
        return newCommand;
    }

    public void showAllCommands(Animal animal){
        System.out.println(animal.getCommands());
    }
}
