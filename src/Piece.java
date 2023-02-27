import processing.core.PApplet;
import processing.core.PImage;

public class Piece extends PApplet {

    public final int NONE = 0;
    public final int KING = 1;
    public final int PAWN = 2;
    public final int KNIGHT = 3;
    public final int BISHOP = 4;
    public final int ROOK = 5;
    public final int QUEEN = 6;

    public final int WHITE = 8;
    public final int BLACK = 16;


    private PApplet sketch;

    public Piece(PApplet sketch) {
        this.sketch = sketch;
    }

    public void displayBlackKing() {

    }
}
