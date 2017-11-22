/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Callum
 */
public class ChessPiece {

    private final String pieceName;
    private boolean isBlack;
    private Position currentPosition;
    private ArrayList<Position> possibleMoves;
    private boolean onBoard;

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
        onBoard = true;
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
        return null;
    }

    /**
     * Determines whether the current piece is black or not
     *
     * @param isBlack whether the piece is black
     */
    public void setBlack(boolean isBlack) {
        this.isBlack = isBlack;
    }

    /**
     * Determines whether the piece is black or not
     *
     * @return isBlack
     */
    public boolean isBlack() {
        return this.isBlack;
    }
}
