import com.sun.xml.internal.ws.api.handler.MessageHandler;

public abstract class Player extends Unit {

    protected MessageHandler m;
    protected Integer experience;
    protected Level level;

    public Player(Integer x,Integer y,char tile,String name, Integer attackPoints, Integer defensePoints,Integer healthPool, Integer healthAmount, MessageHandler m){
        super(x,y,tile,name,attackPoints,defensePoints,healthPool,healthAmount);
        this.experience = 0;
        this.level = new Level(1);
        this.m = m;
    }

    public void levelUp(){
        this.experience = this.experience-(50 * level.getLevel());
        level.setLevel(this.level.getLevel() + 1);
        health.setHealthPool(health.getHealthPool()+( 10 * level.getLevel()));
        health.setHealthPool(health.getHealthPool());
        attackPoints = attackPoints + (4 * level.getLevel());
        defensePoints = defensePoints + (level.getLevel());
    }

    public abstract void castAbility();

}
