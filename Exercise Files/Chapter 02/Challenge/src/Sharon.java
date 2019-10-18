public class Sharon {

    String name;
    static int age = 22;
    boolean appearance;

    public Sharon(String englishName,
                  int realAge,
                  boolean herAppearance) {

            this.name = englishName;
            this.age = realAge;
            this.appearance = herAppearance;
    }


    public static int timeTravel(int newAge) {
        newAge = age + newAge;
        return newAge;
    }
}


