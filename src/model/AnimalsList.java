package model;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalsList implements Iterable<Animal>, AnimalListInterface {
    Animal animal;

    public AnimalsList() {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public Iterator<Animal> iterator() {
        return new AnimalIterator(animal);
    }

    @Override
    public ArrayList<Animal> addAnimal() {
        return addAnimal(animal);
    }

    @Override
    public ArrayList<Animal> addAnimal(Animal animal) {
        ArrayList<Animal> animalsLists = new ArrayList<>();
        animalsLists.add(animal);
        return animalsLists;
    }

    @Override
    public void showCommands() {
        System.out.println("Вьючные животные могут исполнять команды:\n");
        System.out.println(CommandsPackAnimals.BRAY);
        System.out.println(CommandsPackAnimals.JUMP);
        System.out.println(CommandsPackAnimals.CANTER);
        System.out.println(CommandsPackAnimals.KICK);
        System.out.println(CommandsPackAnimals.GALLOP);
        System.out.println(CommandsPackAnimals.CARRY_LOAD);
        System.out.println(CommandsPackAnimals.RUN);
        System.out.println(CommandsPackAnimals.TROT);
        System.out.println(CommandsPackAnimals.WALK);

        System.out.println();
        System.out.println("Домашние животные могут исполнять команды:\n");
        System.out.println(CommandsPetAnimal.HIDE);
        System.out.println(CommandsPetAnimal.BARK);
        System.out.println(CommandsPetAnimal.MEOW);
        System.out.println(CommandsPetAnimal.PAW);
        System.out.println(CommandsPetAnimal.FETCH);
        System.out.println(CommandsPetAnimal.SIT);
        System.out.println(CommandsPetAnimal.JUMP);
        System.out.println(CommandsPetAnimal.POUNCE);
        System.out.println(CommandsPetAnimal.ROLL);
        System.out.println(CommandsPetAnimal.SCRATCH);
        System.out.println(CommandsPetAnimal.STAY);
        System.out.println(CommandsPetAnimal.WALK);
    }

    @Override
    public ArrayList<AnimalIterator> showListAnimalsFromDateOfBirth() {
        return showListAnimalsFromDateOfBirth(animal);
    }

    @Override
    public ArrayList<AnimalIterator> showListAnimalsFromDateOfBirth(Animal animal) {
        ArrayList<AnimalIterator> listAnimalsFromBirth = new ArrayList<>();
        AnimalIterator animalIterator = new AnimalIterator(animal);
        listAnimalsFromBirth.add(animalIterator);
        return listAnimalsFromBirth;
    }

    @Override
    public void showListAllAnimals(ArrayList<Animal> animals) {
        ArrayList<AnimalsList> animalsListsAll = new ArrayList<>();
        for (int i = 0; i <animals.size(); i++) {
            System.out.println(animal);
        }

    }

//
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder("AnimalsList{");
//        stringBuilder.append("animal=").append(Animal.class.getName());
//        stringBuilder.append("}");
//        return stringBuilder.toString();
//    }

}
