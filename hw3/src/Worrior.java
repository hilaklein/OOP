import java.util.List;
import java.util.Random;

public class Worrior extends Player {

    private Source source;

    public Worrior(int x, int y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer abilityCD, MessageHandler m) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount, m);
        source = new Source(abilityCD);
    }

    @Override
    public void castAbility() {
        if (this.source.getRemainingCooldown() > 0)
            this.m.sendMessage("can't use the spacial ability");
        else {
            this.source.setRemainingCooldown(this.source.getAbilityCooldwon());
            this.health.setHealthAmount(Math.min(this.health.getHealthAmount() + (10 * this.defensePoints), this.health.getHealthPool()));
            Random r = new Random();
            List<Unit> enemyInRange = null; /////////////
            int selected = r.nextInt(enemyInRange.size());
            Unit u = enemyInRange.get(selected);
            //attack the enemy for an amount equals to 10% of the warrior health pool
        }
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.source.setRemainingCooldown(0);
        this.health.setHealthPool(this.health.getHealthPool()+( 5 * this.level.getLevel()));
        this.attackPoints = this.attackPoints + ( 2 * this.level.getLevel());
        this.defensePoints = this.defensePoints + this.level.getLevel() ;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public void onGameTick() {
        this.source.setRemainingCooldown(this.source.getRemainingCooldown()-1);
    }
}
