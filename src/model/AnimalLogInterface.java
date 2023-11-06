package model;

import java.util.LinkedList;

public interface AnimalLogInterface {
    void addAnimalToList(Animal animal);

    void showAllAnimals();
    void showAllCommands(Animal animal);

    LinkedList<Animal> deleteAnimalFromLinkedList(Animal animal);
    String addCommand(Animal animal, String newCommand);
}
