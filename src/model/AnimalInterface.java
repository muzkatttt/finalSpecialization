package model;

import java.util.LinkedList;

public interface AnimalInterface {
    void addAnimalToList(Animal animal);

    void showAllCommands(Animal animal);

    void addCommand(Animal animal);

    void showAllAnimalByDateOfBirth();

    void showAllAnimals(LinkedList<Animal> animalLinkedList);

    public int sizeOfCollection(LinkedList<Animal> animalLinkedList);
}
