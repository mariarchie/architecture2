package WeaponFactory;
import Heroes.Hero;

public interface Weapon {
    int weaponHP = Hero.HP - 10;
    static void attack() {
        System.out.printf("Fight, HP = %s\n", weaponHP);   
    }

}
