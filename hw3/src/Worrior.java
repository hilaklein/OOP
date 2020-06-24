public class Worrior extends Player {

    private Source source;

    public Worrior(Integer x, Integer y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer abilityCD) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount);
        source = new Source(abilityCD);
    }

    @Override
    public void castAbility() {

    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.source.setRemainingCooldown(0);
        this.health.setHealthPool(this.health.getHealthPool()+( 5 * this.level.getLevel()));
        this.attackPoints = this.attackPoints + ( 2 * this.level.getLevel());
        this.defensePoints = this.defensePoints + this.level.getLevel() ;
    }
}
