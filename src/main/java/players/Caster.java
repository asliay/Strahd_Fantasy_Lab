package players;

import behaviours.ISpell;
import enemies.Enemy;

public abstract class Caster extends Player{

    private int spellSlots;
    private ISpell spell;

    public Caster(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints);
        this.spellSlots = spellSlots;
        this.spell = spell;
    }

    public int getSpellSlots() {
        return this.spellSlots;
    }

    public void setSpellSlots(int spellCost) {
        this.spellSlots -= spellCost;
    }

    public ISpell getSpell() {
        return this.spell;
    }

    public void changeSpell(ISpell spell) {
        this.spell = spell;
    }

    abstract void defend();

    public void cast(Enemy enemy){
        int diceSides = spell.getMaxDamage();
        int damageRoll = rollDice(1, diceSides);
        spell.damage(enemy, damageRoll);
        setSpellSlots(spell.getSpellSlotCost());
    }
}
