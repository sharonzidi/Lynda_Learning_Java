import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("What is my name?");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.contains("sharon"));

        System.out.println("Am I pretty? Yes/No");

        boolean isPretty = sc.nextLine().toLowerCase().contains("yes");
        if (isPretty) {
            System.out.println("You are right!");
        } else {
            System.out.println("WRONG ANSWER!");
        }


        System.out.println("Want to know more about me? Yes/No");
        boolean knowMore = sc.nextLine().toLowerCase().contains("yes");
        if (knowMore) {
            String[] mySkills = {"design", "flute", "coding", "piano", "dance"};

            System.out.println("Three of my skills: ");

            for (int i = 0; i<3; i++) {
                String topThreeSkills = mySkills[i];
                System.out.println(topThreeSkills);
            }
        } else {
            System.out.println("All right, you miss the chance.");
        }

        System.out.println("What is my age?");
        int age = sc.nextInt();
        sc.nextLine();
        if (age == 22) {
            System.out.println("You know me so well, I guess I know who you are!");
        } else if (age < 22) {
            System.out.println("Sharon is not that young");
        } else if (age > 22) {
            System.out.println("Sharon is not that old!");
        }


        System.out.println("50 years later..., I'll be ");

        int tenYearsAfter = Sharon.timeTravel(50);
        System.out.println(tenYearsAfter + " years old...");

    }
}
