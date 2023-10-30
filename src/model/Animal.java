package model;

import java.util.ArrayList;
import java.util.List;

abstract class Animal{

    int id;
    String name;
    String dateOfBirth;
    private String commands;

    public Animal(int id, String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Animal(int id, String name, String dateOfBirth, String commands) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.commands = commands;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addCommands(String commands){
        //
    }
}
