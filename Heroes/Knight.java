package Heroes;
import Suits.Armor;
import Weapons.Sword;

public class Knight extends Hero{
    public Knight(){
        super();
        this.weapon = new Sword();
        this.suit = new Armor();

        System.out.println("Knight is created");  
    }
}
