package Heroes;
import SuitsFactory.Armor;
import WeaponFactory.Sword;

public class Knight extends Hero{
    public Knight(){
        super();
        this.weapon = new Sword();
        this.suit = new Armor();

        System.out.printf("Knight is created, HP = %s\n", HP);  
    }
}
