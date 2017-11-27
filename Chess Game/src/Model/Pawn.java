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
public class Pawn extends ChessPiece {

    /**
     * Constructor that creates a new pawn chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the pawn will be placed on the board
     * initially
     * @param isBlack whether the pawn is white or black
     */
    public Pawn(Position startPosition, boolean isBlack) {
        super("P", startPosition, isBlack);
    }

    /**
     * Method that calls the possible directions the piece can move and adds any
     * potential moves to an array list, which is returned
     *
     * @return the updated array list of possible moves the piece can make
     */
    @Override
    public ArrayList<Position> possibleMoves() {
        possibleMoves = new ArrayList<Position>();

        return possibleMoves;
    }

    /**
     * Method that attempts to move the pawn forward either 1 or 2 spaces
     */
    public void forward() {
        int x = currentPosition.getX();
        int y = currentPosition.getY();
        boolean loop = true;
        int limit = 2;
        int yMove = 1;

        /**
         * Checks to see if the pawn is in its default position. If it is not,
         * then the maximum spaces it can move forward is 1
         */
        if ((isBlack() && y != 1) || (!isBlack() && y != 6)) {
            limit = 1;
        }

        if (!isBlack()) {
            limit = -limit;
            yMove = -yMove;
        }
        while (y <= (y + limit) && loop) {
            loop = add(x, (y + yMove));
        }
    }

    /**
     * Attempts to add the position forward and to the diagonal left of the
     * pawns current position.
     */
    public void takeLeft() {
        int moveX = 1;
        int moveY = 1;
        if (isBlack()) {
            moveX = -moveX;
            moveY = -moveY;
        }
        int x = currentPosition.getX() + moveX;
        int y = currentPosition.getY() + moveY;

        /**
         * Check to see if the x and y values form a valid position on the
         * board. Also check if there is a piece that the pawn can take (ie
         * opposite color piece)
         */
        if (isOnBoard(x, y)) {
            ChessPiece piece = MainGUI.board.getGridSquare(x, y).getCurrentPiece();
            if (piece != null && piece.isBlack() != this.isBlack()) {
                add(x, y);
            }
        }
    }

    /**
     * Attempts to add the position forward and to the diagonal right of the
     * pawns current position.
     */
    public void takeRight() {
        int moveX = -1;
        int moveY = 1;
        if (isBlack()) {
            moveX = -moveX;
            moveY = -moveY;
        }
        int x = currentPosition.getX() + moveX;
        int y = currentPosition.getY() + moveY;

        /**
         * Check to see if the x and y values form a valid position on the
         * board. Also check if there is a piece that the pawn can take (ie
         * opposite color piece)
         */
        if (isOnBoard(x, y)) {
            ChessPiece piece = MainGUI.board.getGridSquare(x, y).getCurrentPiece();
            if (piece != null && piece.isBlack() != this.isBlack()) {
                add(x, y);
            }
        }
    }
}
