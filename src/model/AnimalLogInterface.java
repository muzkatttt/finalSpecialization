package model;

import java.util.LinkedList;

public interface AnimalLogInterface {
    boolean addAnimalToList(Animal animal);

    void showAllAnimalByDateOfBirth();

    void showAllAnimals();
    void showAllCommands(Animal animal);

    LinkedList<Animal> createNewLinkedList();

    LinkedList<Animal> deleteAnimalFromLinkedList();
    String addCommand(Animal animal, String newCommand);
}
