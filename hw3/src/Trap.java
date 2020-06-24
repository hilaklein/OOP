public class Trap extends Enemy {

    private Integer visibiltyTime;
    private Integer invisibiltyTime;
    private Integer ticksCount;
    private boolean visible;


    public Trap(Integer x, Integer y, char tile, String name, Integer attackPoints, Integer defensePoints, Integer healthPool, Integer healthAmount, Integer experience, Integer visibiltyT, Integer invisibiltyT) {
        super(x, y, tile, name, attackPoints, defensePoints, healthPool, healthAmount, experience);
        this.visibiltyTime = visibiltyT;
        this.invisibiltyTime = invisibiltyT;
        this.ticksCount = 0;
        this.visible = true;
    }


}
