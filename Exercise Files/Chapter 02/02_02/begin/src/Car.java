import java.awt.*;

public class Car {

    int averageMilesPerGallon;
    String license;
    Color paintColor;
    boolean areTailingWorking;

public Car(int inputMPG,
            String inputLicense,
            Color inputColor,
            boolean inputTAW) {

    this.averageMilesPerGallon = inputMPG;
    this.license = inputLicense;
    this.paintColor = inputColor;
    this.areTailingWorking = inputTAW;
    }

    public void changePaintColor(Color newColor) {
        this.paintColor = newColor;
    }
}
