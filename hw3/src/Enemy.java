public abstract class Enemy extends Unit {

    private Integer experience;

    public Enemy(Integer x, Integer y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer experience) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount);
        this.experience = experience;
    }
}
