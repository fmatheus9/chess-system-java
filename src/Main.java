import boardgame.Board;
import boardgame.Position;

public class Main {
    public static void main(String[] args) {
        Position position = new Position(3,5);
        System.out.println(position.toString());

        Board board = new Board(8,8);
        
    }
}