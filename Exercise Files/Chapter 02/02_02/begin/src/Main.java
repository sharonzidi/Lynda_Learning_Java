import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Kathryn");

        Car MyCar = new Car(25,
                            "1B3CE",
                            Color.RED,
                            true);

        Car FrankCar = new Car(15,
                                "3U6KG",
                                Color.BLACK,
                                true);

        System.out.println(MyCar.license);
        System.out.println(FrankCar.license);

        System.out.print(MyCar.paintColor.toString());
        System.out.print(FrankCar.paintColor.toString());
        MyCar.changePaintColor(Color.GREEN);
        System.out.print(MyCar.paintColor.toString());

    }
}
