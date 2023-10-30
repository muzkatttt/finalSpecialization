package model;

import java.util.ArrayList;

public interface AnimalListInterface {

    ArrayList<Animal> addAnimal();

    ArrayList<Animal> addAnimal(Animal animal);

    void showCommands();

    //void addComand();

    ArrayList<AnimalIterator> showListAnimalsFromDateOfBirth();

    ArrayList<AnimalIterator> showListAnimalsFromDateOfBirth(Animal animal);

    void showListAllAnimals(ArrayList<Animal>animals);

}
