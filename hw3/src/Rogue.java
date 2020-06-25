public class Rogue extends Player {

    private Integer cost;
    private Integer currentEnergy;
    private Integer maxEnergy = 100;

    public Rogue(int x, int y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer cost, MessageHandler m) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount, m);
        this.cost = cost;
        this.currentEnergy = maxEnergy;

    }

    @Override
    public void castAbility() {
        if (this.currentEnergy < this.cost)
            m.sendMessage("can't use special ability");
        else{
            this.currentEnergy = this.currentEnergy - this.cost;
            //                - For each enemy within range < 2, deal damage (reduce health value) equals to the rogue’s
            //        attack points (each enemy will try to defend itself).
        }


    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.currentEnergy = maxEnergy;
        this.attackPoints = this.attackPoints + (3 * level.getLevel());
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public void onGameTick() {
        this.currentEnergy = Math.min(this.currentEnergy + 10, maxEnergy);
    }
}
