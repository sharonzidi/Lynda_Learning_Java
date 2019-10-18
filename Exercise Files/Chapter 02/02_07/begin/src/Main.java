import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car(25.5,
                "1BC32E",
                Color.BLUE,
                true);

        Car sallyCar = new Car(13.9,
                "3D2OBN",
                Color.BLACK,
                false);

       int newSpeed = myCar.speedingUp(100);
        System.out.println(newSpeed);
    }
}
