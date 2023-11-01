package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PackAnimal extends Animal{

    PackAnimal packAnimal;
    public PackAnimal(int id, String name, String dateOfBirth, LinkedList<String> commands) {
        super(id, name, dateOfBirth, commands);
    }

    public PackAnimal(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    void showAllCommands(ArrayList<CommandsPackAnimals> listCommands){
        ArrayList<CommandsPackAnimals> list =
                new ArrayList<CommandsPackAnimals>(Arrays.asList(CommandsPackAnimals.values()));
        System.out.println("Команды вьючных животных: " + list);
    }
}
