import java.awt.*;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
            double pow = Math.pow(5,2);
            System.out.println(pow);

            double sq = Math.sqrt(49);
            System.out.println(sq);

        Random ran = new Random();
        int ranNum = ran.nextInt();
        int ranNumBand = ran.nextInt(5);
        System.out.println(ranNum);
        System.out.println(ranNumBand);
    }
}
