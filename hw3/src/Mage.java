import java.util.List;
import java.util.Random;

public class Mage extends Player {

    private Integer manaPool;
    private Integer currentMana;
    private Integer manaCost;
    private Integer spellPower;
    private Integer hitsCount;
    private Integer abilityRange;

    public Mage(int x, int y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer manaPool, Integer manaCost, Integer spellP, Integer hitsC, Integer abilityR, MessageHandler m) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount, m);
        this.manaPool = manaPool;
        this.currentMana = this.manaPool / 4;
        this.manaCost = manaCost;
        this.spellPower = spellP;
        this.hitsCount = hitsC;
        this.abilityRange = abilityR;


    }

    @Override
    public void castAbility() {
        if (this.currentMana < this.manaCost)
            m.sendMessage("can't use special ability");
        else{
            this.currentMana = this.currentMana - this.manaCost;
            int hits = 0;
            while (hits < this.hitsCount & true){
                Random r = new Random();
                List<Unit> enemyInRange = null; /////////////
                int selected = r.nextInt(enemyInRange.size());
                Unit u = enemyInRange.get(selected);
                //- Deal damage (reduce health value) to the chosen enemy for an amount equal to spell power
                //(each enemy may try to defend itself).
                hits++;
            }
        }
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.manaPool = this.manaPool + (25 * level.getLevel());
        this.currentMana = Math.min((this.currentMana+(this.manaPool/4)), this.manaPool);
        this.spellPower = this.spellPower + (10 * level.getLevel());
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public void onGameTick() {
        this.currentMana = Math.min(this.manaPool, this.currentMana + this.level.getLevel());
    }
}
