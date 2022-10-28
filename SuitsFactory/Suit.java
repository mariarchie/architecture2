package SuitsFactory;
import WeaponFactory.Weapon;

public interface Suit {
    int suitHP = Weapon.weaponHP + 5;

    static void protect() {
        System.out.printf("Protection, HP = %s\n", suitHP); 
    }
}
