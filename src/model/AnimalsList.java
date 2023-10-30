package model;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsList implements AnimalListInterface {
    Animal animal;
    Pet pet;

    PackAnimal packAnimal;

    public AnimalsList() {
        this.animal = animal;
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
    public void showAllCommands() {
        ArrayList<CommandsPetAnimal> list1 =
                new ArrayList<CommandsPetAnimal>(Arrays.asList(CommandsPetAnimal.values()));
        System.out.println("Команды домашних животных: " + list1);

        ArrayList<CommandsPackAnimals> list2 =
                new ArrayList<CommandsPackAnimals>(Arrays.asList(CommandsPackAnimals.values()));
        System.out.println("Команды вьючных животных: " + list2);
    }

    @Override
    public void showListAllAnimals(ArrayList<Animal> animals) {

    }
    @Override
    public int compare(Animal o1, Animal o2) {
        int result = o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        if (result == 0) {
            return result;
        }
        return result;
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
