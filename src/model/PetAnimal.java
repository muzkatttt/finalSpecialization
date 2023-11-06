package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class PetAnimal extends Animal{

    String commands;

    public PetAnimal(int id, String name, String dateOfBirth, String commands) {
        super(id, name, dateOfBirth, commands);
    }

    public PetAnimal(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    void showAllCommandsPetAnimal(String commands){
        commands.concat("STAY"); // стоять
        commands.concat(" SIT"); // сидеть
        commands.concat(" FETCH"); // Апорт! используется в значении «Взять»
        commands.concat("POUNCE"); // наскочить
        commands.concat("ROLL"); // свернуться в клубок
        commands.concat("HIDE"); // спрятаться
        commands.concat("PAW"); // дай лапу
        commands.concat("BARK"); // подать голос для собаки
        commands.concat("MEOW"); // подать гоос для кошки
        commands.concat("SCRATCH"); // скребсти
        commands.concat("JUMP"); // прыгать
        commands.concat("WALK"); // гулять

        LinkedList<CommandsPetAnimal> list = new LinkedList<>(Arrays.asList(CommandsPetAnimal.values()));
        System.out.println("Команды домашних животных: " + list);
    }

}
