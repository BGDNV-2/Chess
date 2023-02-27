import processing.core.PApplet;
import processing.core.PImage;

public class GameLogic extends PApplet {

    private Board board;
    private Piece piece;
    PImage blackKing;

    public void settings() {
        super.size(1280, 720);
        board = new Board(this);
        piece = new Piece(this);

        blackKing = loadImage("../assets/Graphics/kingBlack.png");
        blackKing.resize(90,90);


    }

    public void draw() {
        super.background(255);
        this.board.display();

        image(blackKing, 200,200);


    }

}
