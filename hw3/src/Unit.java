public abstract class Unit extends Tile{
    protected String name;
    protected Integer attackPoints;
    protected Integer defensePoints;
    protected Health health;

    public  Unit(int x, int y,char tile, String name, Integer attackPoints, Integer defensePoints,Integer healthPool, Integer healthAmount){
        super(tile,x,y);
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.health = new Health(healthPool,healthAmount);
    }

    public abstract void onGameTick();


}
