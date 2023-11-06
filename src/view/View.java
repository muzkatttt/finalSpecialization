package view;

import model.Animal;
import model.AnimalLog;
import controller.Controller;
import java.util.LinkedList;
import java.util.Scanner;

public class View {
    private Animal animal;
    private final AnimalLog animalLog = new AnimalLog(animal);
    LinkedList<Animal> animalLinkedList;
    Controller controller;

    public View(Animal animal, Controller controller) {
        this.animal = animal;
        this.controller = controller;
    }

    private String inputFromUser(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    public void start() {

        while (true) {
            System.out.println("Для выбора доступных команд нажмите: \n" +
                    "Показать всех животных в списке >>> 1\n" +
                    "Добавить животное >>> 2\n" +
                    "Посмотреть список команд животного >>> 3\n" +
                    "Добавить новую команду животному >>> 4\n" +
                    "Выход из меню >>> 0");
            String inputMessage = inputFromUser("Введите номер команды или введите 0 для выхода из меню: \n>>> ");
            String stringInputFromUser;

            switch (inputMessage) {
                case ("0"):
                    return;

                case ("1"):
                    System.out.println();
                    controller.showAllAnimals();
                    System.out.println();
                    break;

                case ("2"):
                    System.out.println("Добавить животное\n Id, Имя, Дата рождения, Выполняемые команды");
                    System.out.println();
                    stringInputFromUser = inputFromUser("Введите: Id, Имя, Дата рождения, Выполняемые команды \n>>> ");
                    stringInputFromUser.split("")[0] = String.valueOf(animal.getId());
                    stringInputFromUser.split(" ")[1] = animal.getName();
                    stringInputFromUser.split(" ")[2] = animal.getDateOfBirth();
                    stringInputFromUser.split(" ")[3] = animal.getCommands();
                    controller.addAnimalToList(animal);
                    System.out.println(animal);
                    break;

                case ("3"):
                    stringInputFromUser = inputFromUser("Введите имя животного \n>>> ");
                    if (!animalLog.getClass().getName().equals(stringInputFromUser)) {
                        System.out.println("Животное не найдено");
                        break;
                    }
                    try {
                        System.out.print("Команды животного >>>\n");
                        //System.out.println(controller.showAllCommands());
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case ("4"):
                    stringInputFromUser = inputFromUser("Введите имя животного\n>>> ");
                    if (!animalLog.getClass().getName().equals(stringInputFromUser)) {
                        System.out.println("Животное не найдено");
                        break;
                    } else {
                        String command = inputFromUser("Введите команду для записи >>>\n");
                        stringInputFromUser.split(" ")[0] = animal.getCommands();
                        animal.getCommands().concat(command);
                    }
                    break;

                default:
                    System.out.println("Неизвестная команда, повторите ввод");
                    break;
            }
        }
    }
}
