public abstract class Tile {
    private char tile;
    private Position pos;

    public Tile(char tile, int x, int y){
        this.tile = tile;
        this.pos = new Position(x,y);
    }

    public abstract String toString();
}
