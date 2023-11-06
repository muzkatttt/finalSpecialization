import controller.Controller;
import model.*;
import view.View;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1, "Pelmeshka", "2020-10-10", "MEOW");
        AnimalLog animalLog = new AnimalLog(animal);
        Controller controller = new Controller(animalLog);

//        Animal cat = new Animal(0, "Whiskers", "2019-05-15", "Sit, Roll");
//        Animal dog = new Animal(2, "Fido", "2020-01-01", "Sit, Roll");
//        Animal hamster = new Animal(3, "Hammy", "2021-03-10", "Roll");
//        Animal horse = new Animal(4, "Thunder", "2015-07-21");
//        Animal camel = new Animal(5, "Sandy", "2016-11-03");
//        Animal donkey = new Animal(6, "Burro", "2019-01-23");
//        Animal cat2 = new Animal(9, "Pelmeshka", "2020-10-10", "MEOW");


        View view = new View(animal, controller);
        view.start();
        // 1 "Karamel" "2020-04-26" "Meow"
    }
}