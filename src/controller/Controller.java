package controller;

import model.Animal;
import model.AnimalLog;
import view.View;

public class Controller {

    AnimalLog animalLog;
    View view;

    public Controller(AnimalLog animalLog, View view) {
        this.animalLog = animalLog;
        this.view = view;
    }

    public void start() {

        while (true) {
            String inputMessage = view.menu();
            switch (inputMessage) {
                case ("0"):
                    view.exit();
                    return;

                case ("1"):
                    animalLog.showAllAnimals();
                    break;

                case ("2"):
                    view.add();
                    Animal animal = new Animal();
                    String stringInputFromUser = view.inputFromUser();
                    String[] animalList = stringInputFromUser.split(" ");
                    animal.setId(Integer.parseInt(animalList[0]));
                    animal.setName(animalList[1]);
                    animal.setDateOfBirth(animalList[2]);
                    animal.setCommands(animalList[3]);
                    animalLog.addAnimalToList(animal);
                    break;

                case ("3"):
                    Animal animal1 = animalLog.searchAnimal(view.startListCommand());
                    view.listCommands(animal1);
                    break;

                case ("4"):
                    view.searchName();
                    String name = view.inputFromUser();
                    Animal animal2 = animalLog.searchAnimal(name);
                    if (animal2 == null) {
                        view.animalNotFound();
                        break;
                    } else {
                       String commands = view.addCommand();
                       animal2.getCommands().split(" ");
                        for (String command:
                                animal2.getCommands().split(" ")) {
                            if(command.equals(commands)){
                                view.animalHadCommand();
                                break;
                            } else {
                                animal2.setCommands(animal2.getCommands() + " " + commands);                            }
                        }
                    }
                    break;

                case ("5"):
                    Animal animal3 = animalLog.searchDateOfBirth(view.searchDateOfBirth());
                    view.printCheckAnimal(animal3);
                    break;

                case ("6"):
                    int size = animalLog.sizeOfCollection(animalLog);
                    if (size == 0){
                        view.printZeroAnimals();
                    } else {
                        view.printSizeOfCollection();
                        System.out.println(size);
                    }
                    break;

                default:
                    view.printUnknownCommandMenu();
                    break;
            }
        }
    }
}
