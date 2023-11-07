package model;

import java.util.Arrays;
import java.util.LinkedList;


public class PetAnimal extends Animal{

    String commands;

    public PetAnimal(int id, String name, String dateOfBirth, String commands) {
        super(id, name, dateOfBirth, commands);
    }

    public PetAnimal(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    void showAllCommandsPetAnimal(String commands) {
        LinkedList<CommandsPetAnimal> list = new LinkedList<>(Arrays.asList(CommandsPetAnimal.values()));
        System.out.println("Команды домашних животных: " + list);
    }

}
