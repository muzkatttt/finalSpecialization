package model;

public interface AnimalInterface {

    void showAllCommands(Animal animal);

    void addCommand(PetAnimal petAnimal,String newCommand);

    int id();
}
