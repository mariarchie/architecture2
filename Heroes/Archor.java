package Heroes;
import Suits.ChainMail;
import Weapons.Arrow;

public class Archor extends Hero{ 
    public Archor() {
        super();
        this.weapon = new Arrow();
        this.suit = new ChainMail();

        System.out.println("Archor is created"); 
    }
}
