package model;

import java.util.LinkedList;

public interface AnimalLogInterface {
    LinkedList<PetAnimal> addAnimalToList(PetAnimal petAnimal);

    void showAllAnimalByDateOfBirth();

    void showAllAnimals(LinkedList<PetAnimal> animalLinkedList);

    int sizeOfCollection(LinkedList<PetAnimal> animalLinkedList);

}
