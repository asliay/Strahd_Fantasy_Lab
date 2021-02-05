package enemies;

import players.Player;

public abstract class Enemy {

    private int hitPoints;
    private int attackDamage;

    public Enemy(int hitPoints, int attackDamage) {
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void attack(Player player){
        player.takeDamage(attackDamage);
    }

    public void takeDamage(int damage) {
        this.hitPoints -= damage;
    }

}
