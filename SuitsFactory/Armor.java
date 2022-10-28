package SuitsFactory;

public class Armor implements Suit {

    public void protect() {
        System.out.printf("Hero is protected by Armor, HP = %s", suitHP + 2);
    }
}
