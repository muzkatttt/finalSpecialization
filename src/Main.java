import model.*;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Pet(1, "Fido", "2020-01-01");
        Pet cat = new Pet(2, "Whiskers", "2019-05-15");
        Pet hamster = new Pet(3, "Hammy", "2021-03-10");
        Pet dog2 = new Pet(4, "Buddy", "2018-12-10");
        Pet cat2 = new Pet(5, "Smudge", "2020-02-20");
        Pet hamster2 = new Pet(6, "Peanut", "2021-08-01");
        Pet dog3 = new Pet(7, "Bella", "2019-11-11");
        Pet cat3 = new Pet(8, "Oliver", "2020-06-30");

        PackAnimal horse = new PackAnimal(1, "Thunder", "2015-07-21");

        AnimalsList animals = new AnimalsList();
        animals.addAnimal(dog);
        animals.addAnimal(cat);
        animals.addAnimal(hamster);
        animals.addAnimal(dog2);
        animals.addAnimal(cat2);
        animals.addAnimal(hamster2);
        animals.addAnimal(dog3);
        animals.addAnimal(cat3);
        animals.addAnimal(horse);

        System.out.println(horse.getId() + " " + horse.getName()+ " " + horse.getDateOfBirth());
        animals.showAllCommands();


    }
}