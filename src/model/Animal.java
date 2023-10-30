package model;

abstract class Animal{

    int id;
    String name;
    String dateOfBirth;

    public Animal(int id, String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
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


    @Override
    public String toString() {
        return "Animal{" +
                "id=" + this.id + this.name +
                ", dateOfBirth=" + this.dateOfBirth +
                '}';
    }
}
