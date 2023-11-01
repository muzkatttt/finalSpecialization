package model;

import java.util.Arrays;
import java.util.LinkedList;


public class PetAnimal extends Animal{

    LinkedList<String> commandsPetAnimal;

    public PetAnimal(int id, String name, String dateOfBirth, LinkedList<String> commands) {
        super(id, name, dateOfBirth, commands);
    }

    public PetAnimal(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    void showAllCommandsPetAnimal(LinkedList<String> commandsPetAnimal){
        commandsPetAnimal.add("STAY"); // стоять
        commandsPetAnimal.add("SIT"); // сидеть
        commandsPetAnimal.add("FETCH"); // Апорт! используется в значении «Взять»
        commandsPetAnimal.add("POUNCE"); // наскочить
        commandsPetAnimal.add("ROLL"); // свернуться в клубок
        commandsPetAnimal.add("HIDE"); // спрятаться
        commandsPetAnimal.add("PAW"); // дай лапу
        commandsPetAnimal.add("BARK"); // подать голос для собаки
        commandsPetAnimal.add("MEOW"); // подать гоос для кошки
        commandsPetAnimal.add("SCRATCH"); // скребсти
        commandsPetAnimal.add("JUMP"); // прыгать
        commandsPetAnimal.add("WALK"); // гулять

        LinkedList<CommandsPetAnimal> list = new LinkedList<>(Arrays.asList(CommandsPetAnimal.values()));
        System.out.println("Команды домашних животных: " + list);
    }

}
