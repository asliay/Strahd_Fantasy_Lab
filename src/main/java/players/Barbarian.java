package players;

import behaviours.IWeapon;
import enemies.Enemy;

public class Barbarian extends MartialClass{

    public Barbarian(String name, int hitPoints, IWeapon weapon) {
        super(name, hitPoints, weapon);
    }

    public String rage(){
        return "You've flown into a rage!";
    }

}
