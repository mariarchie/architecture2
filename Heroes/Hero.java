package Heroes;
import Suits.Suit;
import Weapons.Weapon;

public class Hero {

    int Lvl;
    Weapon weapon;
    Suit suit;

    public void HeroAttack() {
        Weapon.attack();
    }

    public void SetWeapon(Weapon weapon) {
        this.weapon();
    }

    private void weapon() {
    }

    public void HeroProtect() {
        Suit.protect();
    }

    public void SetSuit(Suit suit) {
        this.suit();
    }

    private void suit() {
    }

    
}
