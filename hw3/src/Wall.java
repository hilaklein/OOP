public class Wall extends Tile {

    public static final char tile = '#';

    public Wall(char tile, int x, int y) {
        super(tile, x, y);
    }

    @Override
    public String toString() {
        return tile+"";
    }

}
