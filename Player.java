abstract class Player {
    Board board;            // board to modify
    final int val;        // integer representation of this player

    public Player(int val, Board b) {
        this.val = val;
        board = b;
    }

    abstract void move();

    /**
     * accessor method for the val variable
     *
     * @return the integer representation of this player
     */
    public int getVal() {
        return val;
    }

    /**
     * accessor method for the color variable
     *
     * @return the color assigned to this player
     */
    public int getColor() {
        return val;
    }
}
