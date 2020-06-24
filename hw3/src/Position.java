public class Position {

    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double range(Position pos){
        return Math.sqrt(Math.pow((this.x-pos.x),2)+Math.pow((this.y-pos.y),2));
    }

}
