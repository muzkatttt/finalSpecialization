package model;

import java.util.ArrayList;

public interface AnimalListInterface {

    ArrayList<Animal> addAnimal();

    ArrayList<Animal> addAnimal(Animal animal);

    void showAllCommands();

    //void addComand();

    void showListAllAnimals(ArrayList<Animal>animals);

    int compare(Animal o1, Animal o2);
}

