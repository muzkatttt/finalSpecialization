package model;


import java.util.LinkedList;

public class AnimalLog implements AnimalLogInterface {

    LinkedList<Animal> animalLinkedList = new LinkedList<>();

    public AnimalLog() {
    }

    @Override
    public void addAnimalToList(Animal animal) {
        animalLinkedList.add(animal);
        System.out.println("Животное " + animal.getName() + " добавлено в список");
    }


    @Override
    public LinkedList<Animal> deleteAnimalFromLinkedList(Animal animal) {
        if(animalLinkedList.contains(animal)){
            animalLinkedList.remove(animal);
        }
        return animalLinkedList;
    }


    @Override
    public void showAllAnimals() {
        if(!animalLinkedList.isEmpty()) {
            for (Animal animal : animalLinkedList) {
                System.out.println(animal.toString());
            }
        } else {
            System.out.println("Список животных пуст");
        }
    }

    @Override
    public String addCommand(Animal animal, String newCommand) {
        StringBuilder sb = new StringBuilder();
        if(animal.getCommands().isEmpty()) {
            sb.append(newCommand);
            sb.append(";");
        } else {
            sb.append(newCommand);
            sb.append(";");
            System.out.println("Добавлена новая команда: " + newCommand);
        }
        return sb.toString();
    }

    public void showAllCommands(Animal animal) {
        if(animal.getCommands().isEmpty()){
            System.out.println("У " + animal.getName() + " нет команд!");
        } else {
            System.out.println("Команды животного " + animal.getCommands());
        }
    }

    public Animal searchAnimal(String name) {
        for (Animal animal:
             animalLinkedList) {
            if(animal.getName().equals(name)){
                return animal;
            }
        }
        return null;
    }

    public Animal searchDateOfBirth(String dateOfBirth) {
        for (Animal animal:
                animalLinkedList) {
            if(animal.getDateOfBirth().equals(dateOfBirth)){
                return animal;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String animalText = "";
        for (Animal animal:
             animalLinkedList) {
            animalText += animal.toString() + "\n";
        }
        return animalText;
    }
}
