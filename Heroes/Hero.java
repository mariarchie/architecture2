package Heroes;
import SuitsFactory.Suit;
import WeaponFactory.Weapon;

public class Hero {

    Weapon weapon;
    Suit suit;
    public static int HP = 100;

    public void HeroAttack() {
        Weapon.attack();
    }

    public void HeroProtect() {
        Suit.protect();
    }

}
