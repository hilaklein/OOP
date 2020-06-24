public class Monster extends Enemy {

    private Integer visionRange;

    public Monster(Integer x, Integer y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer experience, Integer visionR) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount, experience);
        this.visionRange = visionR;
    }


}
