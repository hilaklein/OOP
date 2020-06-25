public class Empty extends Tile {

    public static final char tile = '.';

    public Empty(char tile, int x, int y) {
        super(tile, x, y);
    }

    @Override
    public String toString() {
        return tile+"";
    }
}
