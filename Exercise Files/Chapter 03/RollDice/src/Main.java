import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Want to roll a dice? ");

        Scanner sc = new Scanner(System.in);

        boolean ifRoll = sc.nextLine().contains("yes");
        if (ifRoll) {
            Dice d = new Dice();
            System.out.println("initial: " + d.roll());

            for (int i = 0; i < 2; i++) {
                System.out.println("number: " + d.roll());
            }
        } else{
            System.out.println("game over!");
        }
    }
}
