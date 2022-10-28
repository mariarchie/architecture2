package WeaponFactory;
public class Sword implements Weapon {
    public void attack() {
        System.out.printf("Hero attacks with Sword, HP = %s", weaponHP - 4);
    }
}
