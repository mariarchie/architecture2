import Heroes.Archor;
import Heroes.Hero;
import Heroes.Knight;

class StrategyGame {
	public static void main(String[] args) {
		System.out.println("Game started");
		
		Hero knight = new Knight();
		Hero archor = new Archor();
		
		System.out.println("Knight moves");
		knight.HeroAttack();
		knight.HeroProtect();

		
		System.out.println("Archor moves");
		archor.HeroAttack();
		archor.HeroProtect();
	}
}