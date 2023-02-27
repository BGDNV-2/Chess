import processing.core.PApplet;

public class Board extends PApplet {

    public final int SQUARE_SIZE = 90;

    private PApplet sketch;

    public Board(PApplet sketch) {
        this.sketch = sketch;
    }

    public static int[] square;

    public void chessBoard() {
        square = new int[64];
    }

    public void display() {
        for (int j = 0; j < 8; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < 8; i++) {
                    if (i % 2 == 0) {
                        this.sketch.fill(21, 76, 121);
                    } else {
                        this.sketch.fill(238, 238, 228);
                    }
                    this.sketch.rect(SQUARE_SIZE * i + 250, SQUARE_SIZE * j, SQUARE_SIZE, SQUARE_SIZE);
                }
            } else {
                for (int i = 0; i < 8; i++) {
                    if (i % 2 == 0) {
                        this.sketch.fill(238, 238, 228);
                    } else {
                        this.sketch.fill(21, 76, 121);
                    }
                    this.sketch.rect(SQUARE_SIZE * i + 250, SQUARE_SIZE * j, SQUARE_SIZE, SQUARE_SIZE);
                }
            }
        }

    }
}
