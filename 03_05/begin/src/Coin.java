import java.util.Random;

public class Coin {

    public final static int HEADS = 0;
    public final static int TAILS = 1;

    public int faceUp;

    public Coin(int Start) {
        faceUp = Start;
    }

    public void flip() {
        Random ran = new Random();
        faceUp = ran.nextInt(2);
    }

    public String getFaceUp() {
        if (faceUp == HEADS) {
            return "HEADS";
        } else if (faceUp == TAILS) {
            return "TAILS";
        } else {
            return "INVALID";
        }

    }
}




