package model;

public class Pet extends Animal{
    public Pet(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
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
        return "Pets{" +
                "name='" + getName() +
                ", dateOfBirth='" + getDateOfBirth() +
                '}';
    }
}
