package model;

import java.util.ArrayList;
import java.util.Arrays;

public class PackAnimal extends Animal{

    Animal animal;
    public PackAnimal(int id, String name, String dateOfBirth, ArrayList<String> commands) {
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
