/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.MainGUI;
import java.util.ArrayList;

/**
 *
 * @author Callum
 */
public class ChessPiece {

    private final String pieceName;
    private final boolean isBlack;
    protected Position currentPosition;
    protected ArrayList<Position> possibleMoves;

    /**
     * Constructor for the chess piece class that takes the name of the piece
     * and it's default position
     *
     * @param pieceName the name of the piece
     * @param startPosition the position in which the piece will initially
     * occupy the board
     * @param isBlack whether the piece is black or not
     */
    public ChessPiece(String pieceName, Position startPosition, boolean isBlack) {
        this.pieceName = pieceName;
        this.currentPosition = startPosition;
        this.isBlack = isBlack;
    }

    /**
     * Method checking to see if the position at (x,y) is on the board and if
     * the piece is able to legally move here. Future update: Check if moving
     * the piece will put the player in check.
     *
     * @param x the x component of the position
     * @param y the y component of the position
     * @return whether or not the loop can proceed
     */
    protected boolean add(int x, int y) {
        Position pos = new Position(x, y);
        if (isOnBoard(x, y)) {
            if (MainGUI.board.getGridSquare(y, x) == null) {
                possibleMoves.add(pos);
                return true;
            } else if (MainGUI.board.getGridSquare(y, x).getCurrentPiece().isBlack() != this.isBlack()) {
                possibleMoves.add(pos);
                return false;
            }
        }
        return false;
    }

    /**
     * Moves the current chess piece from it's current position to another
     *
     * @param newPosition the position the chess piece will move to
     */
    public void setCurrentPosition(Position newPosition) {
        this.currentPosition = newPosition;
    }

    /**
     * Method that will figure out the potential moves the current piece can
     * make. The options will be added to the possibleMoves ArrayList.
     *
     * @return the ArrayList of possible moves that the current piece can make
     */
    public ArrayList<Position> possibleMoves() {
        return possibleMoves;
    }

    /**
     * Determines whether the piece is black or not
     *
     * @return isBlack
     */
    public boolean isBlack() {
        return this.isBlack;
    }

    /**
     * Retrieves the pieceName of the current piece
     *
     * @return pieceName
     */
    public String getPieceName() {
        return this.pieceName;
    }

    /**
     * This method checks to see if the x and y values provided are a valid
     * position on the board
     *
     * @param x
     * @param y
     * @return whether the x and y values are a valid position
     */
    protected boolean isOnBoard(int x, int y) {
        return (x < 8 && x >= 0 && y < 8 && y >= 0);
    }
}
