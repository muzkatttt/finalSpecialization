package model;

import java.util.Comparator;

public class AnimalComporator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int result = o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        if (result == 0) {
            return result;
        }
        return result;
    }
}