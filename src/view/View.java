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
                "Найти животноe по дате рождения >>> 5\n" +
                "Показать количество животных в списке >>> 6\n" +
                "Выход из меню >>> 0\n" +
                "Введите номер команды или введите 0 для выхода из меню: \n>>> ");
        return inputFromUser();
    }

    public void exit(){
        System.out.println("Поздравляем с успешным выходом из программы!");
    }

    public void add(){
        System.out.println("Добавить животное\nId, Имя, Дата рождения, Выполняемые команды");
        System.out.println("Введите последовательно через пробел 4 значения: >>> \nId в формате >>> целое число,\nИмя >>> в формате строки, дату рождения в формате >>> гггг-мм-дд," +
                "\nВыполняемые команды >>> в формате строки\n>>> ");
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

    public void animalNotFound(){
        System.out.println("Животное не найдено");
    }

    public void animalHadCommand(){
        System.out.println("Животное уже обучено данной команде!");
    }

    public void printSizeOfCollection(){
        System.out.println("Количество животных в списке >>>");
    }

    public void printZeroAnimals(){
        System.out.println("В списке нет животных");
    }

    public void printUnknownCommandMenu(){
        System.out.println("Неизвестная команда, повторите ввод");
    }
}
