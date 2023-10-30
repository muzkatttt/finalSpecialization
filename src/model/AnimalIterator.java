package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class AnimalIterator implements Iterator<Animal> {
    private int count;
    public List<Animal> listAnimals;

    public AnimalIterator(Animal animal){
        this.count = count;
    }

    public AnimalIterator(int count, List<Animal> listAnimals) {
        this.count = count;
        this.listAnimals = listAnimals;
    }

    @Override
    public boolean hasNext() {
        return count < listAnimals.size();
    }

    @Override
    public Animal next() {
        if(!hasNext()) {
            throw new RuntimeException("В списке нет животных");
        }
        return listAnimals.get(count++);
    }

}
