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
public class King extends ChessPiece {

    /**
     * Constructor that creates a new king chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the king will be placed on the board
     * initially
     * @param isBlack whether the king is white or black
     */
    public King(Position startPosition, boolean isBlack) {
        super("Ki", startPosition, isBlack);
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
        left();
        right();
        up();
        down();
        return possibleMoves;
    }

    /**
     * This method attempts to add the position directly to the left of the king
     * to the list of possible moves it can make.
     */
    public void left() {
        int x = currentPosition.getX() - 1;
        int y = currentPosition.getY();
        add(x, y);
    }

    /**
     * This method attempts to add the position directly to the right of the king
     * to the list of possible moves it can make.
     */
    public void right() {
        int x = currentPosition.getX() + 1;
        int y = currentPosition.getY();
        add(x, y);
    }

    /**
     * This method attempts to add the position directly above the king
     * to the list of possible moves it can make.
     */
    public void up() {
        int x = currentPosition.getX();
        int y = currentPosition.getY() - 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position directly below the king
     * to the list of possible moves it can make.
     */
    public void down() {
        int x = currentPosition.getX();
        int y = currentPosition.getY() + 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position directly above and to the left of the king
     * to the list of possible moves it can make.
     */
    public void leftUp() {
        int x = currentPosition.getX() - 1;
        int y = currentPosition.getY() - 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position directly above and to the right of the king
     * to the list of possible moves it can make.
     */
    public void rightUp() {
        int x = currentPosition.getX() + 1;
        int y = currentPosition.getY() - 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position directly below and to the left of the king
     * to the list of possible moves it can make.
     */
    public void leftDown() {
        int x = currentPosition.getX() - 1;
        int y = currentPosition.getY() + 1;
        add(x, y);
    }

    /**
     * This method attempts to add the position directly below and to the right of the king
     * to the list of possible moves it can make.
     */
    public void rightDown() {
        int x = currentPosition.getX() + 1;
        int y = currentPosition.getY() + 1;
        add(x, y);
    }
}
