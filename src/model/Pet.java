package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pet extends Animal{
    public Pet(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    public Pet(int id, String name, String dateOfBirth, String commands) {
        super(id, name, dateOfBirth, commands);
    }

    @Override
    public void addCommands(String commands) {
        super.addCommands(commands);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
//        String commandsStr = Mapper.mapListToStr(this.getCommands());
//        return "Pet. Dog. Name: " + this.getName() + ". Commands: " + commandsStr;
    }
    void showAllCommands(ArrayList<CommandsPetAnimal> listCommands){
        ArrayList<CommandsPetAnimal> list =
                new ArrayList<CommandsPetAnimal>(Arrays.asList(CommandsPetAnimal.values()));
        System.out.println("Команды домашних животных: " + list);
    }
}
