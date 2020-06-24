public class Mage extends Player {

    private Integer manaPool;
    private Integer currentMana;
    private Integer manaCost;
    private Integer spellPower;
    private Integer hitsCount;
    private Integer abilityRange;

    public Mage(Integer x, Integer y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer manaPool, Integer manaCost, Integer spellP, Integer hitsC, Integer abilityR) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount);
        this.manaPool = manaPool;
        this.currentMana = this.manaPool / 4;
        this.manaCost = manaCost;
        this.spellPower = spellP;
        this.hitsCount = hitsC;
        this.abilityRange = abilityR;


    }

    @Override
    public void castAbility() {

    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.manaPool = this.manaPool + (25 * level.getLevel());
        this.currentMana = Math.min((this.currentMana+(this.manaPool/4)), this.manaPool);
        this.spellPower = this.spellPower + (10 * level.getLevel());
    }
}
