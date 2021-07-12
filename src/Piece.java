public abstract class Piece {

    public String color;
    public boolean hasMoved;
    public boolean ep_able;

    /**
     * Gets the color
     * @return the color of the piece
     */

    public abstract String getColor();

     /**
      * Moves the piece
      *
      * @return true if the move was valid or not.
      */

    public abstract boolean validateMove(Piece[][] board, int currentRow, int currentCol, int newRow, int newCol);
}