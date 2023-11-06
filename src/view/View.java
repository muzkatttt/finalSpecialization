package view;

import model.Animal;
import java.util.Scanner;

public class View {

    public View() {

    }

    public String inputFromUser() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String menu(){
        System.out.println("Для выбора доступных команд нажмите: \n" +
                "Показать всех животных в списке >>> 1\n" +
                "Добавить животное >>> 2\n" +
                "Посмотреть список команд животного >>> 3\n" +
                "Добавить новую команду животному >>> 4\n" +
                "Найти животнок по дате рождения >>> 5\n" +
                "Выход из меню >>> 0\n" +
                "Введите номер команды или введите 0 для выхода из меню: \n>>> ");
        return inputFromUser();
    }

    public void exit(){
        System.out.println("Поздравляю с успешным выходом из программы!");
    }

    public void add(){
        System.out.println("Добавить животное\n Id, Имя, Дата рождения, Выполняемые команды");
        System.out.println("Введите: Id, Имя, Дата рождения, Выполняемые команды \n>>> ");
    }

    public void listCommands(Animal animal) {
        if(animal == null) {
            System.out.println("Животного не существует!");
            return;
        }
        if(animal.getCommands().isEmpty()){
            System.out.println("У животного нет команд");
        } else {
            System.out.println(animal.getCommands());
        }
    }

    public String startListCommand(){
        System.out.println("Введите имя животного \n>>> ");
        String name = inputFromUser();
        return name;
    }

    public void searchName(){
        System.out.println("Введите имя животного\n>>> ");

    }
    public String searchDateOfBirth(){
        System.out.println("Введите дату рождения животного\n>>> ");
        String date = inputFromUser();
        return date;
    }
    public String addCommand(){
        System.out.println("Введите название команды \n>>> ");
        String command = inputFromUser();
        return command;
    }

    public void printCheckAnimal(Animal animal){
        if (animal == null) {
            System.out.println("Животное не найдено");
        } else {
            System.out.println(animal.toString());
        }
    }

}
