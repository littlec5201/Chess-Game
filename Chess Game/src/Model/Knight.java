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
public class Knight extends ChessPiece {

    /**
     * Constructor that creates a new knight chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the knight will be placed on the board
     * initially
     * @param isBlack whether the knight is white or black
     */
    public Knight(Position startPosition, boolean isBlack) {
        super("Kn", startPosition, isBlack);
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
        leftUp();
        leftDown();
        rightUp();
        rightDown();
        upLeft();
        upRight();
        downLeft();
        downRight();
        return possibleMoves;
    }

    /**
     * This method attempts to add the position 1 row above and 2 columns to the
     * left of the knight to the list of possible moves it can make.
     */
    public void upLeft() {
        int x = currentPosition.getX() - 2;
        int y = currentPosition.getY() - 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position 1 row above and 2 columns to the
     * right of the knight to the list of possible moves it can make.
     */
    public void upRight() {
        int x = currentPosition.getX() + 2;
        int y = currentPosition.getY() - 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position 2 rows above and 1 column to the
     * left of the knight to the list of possible moves it can make.
     */
    public void leftUp() {
        int x = currentPosition.getX() - 1;
        int y = currentPosition.getY() - 2;
        add(x, y);
    }

    /**
     * This method attempts to add the position 2 rows above and 1 column to the
     * right of the knight to the list of possible moves it can make.
     */
    public void rightUp() {
        int x = currentPosition.getX() + 1;
        int y = currentPosition.getY() - 2;
        add(x, y);
    }

    /**
     * This method attempts to add the position 1 row below and 2 columns to the
     * left of the knight to the list of possible moves it can make.
     */
    public void downLeft() {
        int x = currentPosition.getX() - 2;
        int y = currentPosition.getY() + 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position 1 row below and 2 columns to the
     * right of the knight to the list of possible moves it can make.
     */
    public void downRight() {
        int x = currentPosition.getX() + 2;
        int y = currentPosition.getY() + 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position 2 rows below and 1 column to the
     * left of the knight to the list of possible moves it can make.
     */
    public void leftDown() {
        int x = currentPosition.getX() - 1;
        int y = currentPosition.getY() + 2;
        add(x, y);
    }

    /**
     * This method attempts to add the position 2 rows below and 1 column to the
     * right of the knight to the list of possible moves it can make.
     */
    public void rightDown() {
        int x = currentPosition.getX() + 1;
        int y = currentPosition.getY() + 2;
        add(x, y);
    }
}
