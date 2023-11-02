package model;

import java.util.LinkedList;

public class AnimalLog implements AnimalLogInterface {
    PetAnimal petAnimal;
    Cat cat;
    Dog dog;
    Hamster hamster;

    Horse horse;
    Camel camel;
    Donkey donkey;
    LinkedList<PetAnimal> animalLinkedList;

    public AnimalLog(PetAnimal petAnimal, LinkedList<PetAnimal> animalLinkedList) {
        this.petAnimal = petAnimal;
        this.animalLinkedList = animalLinkedList;
    }

    public AnimalLog(PetAnimal petAnimal) {
        this.petAnimal = petAnimal;
    }

    public AnimalLog() {
    }

    @Override
    public LinkedList<PetAnimal> addAnimalToList(PetAnimal petAnimal) {
        LinkedList<PetAnimal> animalLinkedList = new LinkedList<>();
        //animalLinkedList.add(petAnimal);
        System.out.println(animalLinkedList.add(petAnimal)); // проверка добавления в список
        return animalLinkedList;
    }


//    @Override
//    public LinkedList<Animal> addAnimalToList(Animal animal) {
//        LinkedList<Animal> animalLinkedList = new LinkedList<>();
//        animalLinkedList.add(animal);
//        return animalLinkedList;
//    }

    @Override
    public void showAllAnimals(LinkedList<PetAnimal> animalLinkedList) {
        if(sizeOfCollection(animalLinkedList) > 0) {
            for(PetAnimal petAnimal : animalLinkedList) {
                System.out.println(petAnimal);
            }
        } else {
                System.out.println("Список пуст");
            }
    }

    @Override
    public void showAllAnimalByDateOfBirth() {
        // добавлю позже
    }

    @Override
    public int sizeOfCollection(LinkedList<PetAnimal> animalLinkedList) {
        return animalLinkedList.size();
    }

    @Override
    public String toString() {
        return "AnimalLog{" +
                "animal=" + petAnimal +
                ", animalLinkedList=" + animalLinkedList +
                '}';
    }
}
