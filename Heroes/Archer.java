package Heroes;
import SuitsFactory.ChainMail;
import WeaponFactory.Arrow;

public class Archer extends Hero{ 
    public Archer() {
        super();
        this.weapon = new Arrow();
        this.suit = new ChainMail();

        System.out.printf("Archer is created, HP = %s\n", HP); 
    }
}
