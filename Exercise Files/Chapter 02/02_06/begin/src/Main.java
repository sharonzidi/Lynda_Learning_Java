import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 40;
        numbers[1] = 20;
        numbers[2] = 10;

        int[] numbers2 = {1, 2, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] myFavMusic = {"pop", "classical", "jazz"};
        System.out.println("index 0: " + myFavMusic[0]);
        System.out.println("Length: " + myFavMusic.length);
        myFavMusic[0] = "blues";

        System.out.print(Array.get(myFavMusic,0));
    }
}
