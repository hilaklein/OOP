public class Rogue extends Player {

    private Integer cost;
    private Integer currentEnergy;
    private Integer maxEnergy = 100;

    public Rogue(Integer x, Integer y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer cost) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount);
        this.cost = cost;
        this.currentEnergy = maxEnergy;

    }

    @Override
    public void castAbility() {

    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.currentEnergy = maxEnergy;
        this.attackPoints = this.attackPoints + (3 * level.getLevel());
    }
}
