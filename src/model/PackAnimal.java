package model;

import java.util.ArrayList;
import java.util.Arrays;

public class PackAnimal extends Animal{

    public PackAnimal(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    void showAllCommands(ArrayList<CommandsPackAnimals> listCommands){
        ArrayList<CommandsPackAnimals> list =
                new ArrayList<CommandsPackAnimals>(Arrays.asList(CommandsPackAnimals.values()));
        System.out.println("Команды вьючных животных: " + list);
    }
}
