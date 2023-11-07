import controller.Controller;
import model.*;
import view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new AnimalLog(), new View());
        controller.start();

        // 1 Karamel 2020-04-26 Meow
        // 0 Whiskers 2019-05-15 Sit Roll
        // 2 Fido 2020-01-01 Sit Roll
        // 3 Hammy 2021-03-10 Roll
        // 4 Thunder 2015-07-21 Trot Canter Gallop
        // 7 Storm 2014-05-05 Trot Canter
        // 9 Pelmeshka 2020-10-10 Meow
        // 5 Sandy 2016-11-03
        // 6 Burro 2019-01-23

    }
}