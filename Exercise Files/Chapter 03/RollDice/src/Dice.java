import java.util.Random;

public class Dice {

public Dice(){

        }

        public int roll(){
            Random ran = new Random();
            int faceUp = ran.nextInt(6) + 1;
            return faceUp;
        }
}
