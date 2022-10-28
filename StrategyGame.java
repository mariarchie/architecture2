import Heroes.Archer;
import Heroes.Hero;
import Heroes.Knight;

class StrategyGame {
	public static void main(String[] args) {
		System.out.println("Game started");
		
		Hero knight = new Knight();
		Hero archer = new Archer();
		
		System.out.println("Knight moves");
		knight.HeroAttack();
		archer.HeroProtect();

		System.out.println("Archer moves");
		archer.HeroAttack();
		knight.HeroProtect();
	}
}