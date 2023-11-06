package model;

import java.util.LinkedList;

public interface AnimalLogInterface {
    boolean addAnimalToList(Animal animal);

    void showAllAnimals();
    void showAllCommands(Animal animal);

    LinkedList<Animal> deleteAnimalFromLinkedList();
    String addCommand(Animal animal, String newCommand);
}
