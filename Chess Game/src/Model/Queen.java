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
public class Queen extends ChessPiece {

    /**
     * Constructor that creates a new queen chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the queen will be placed on the board
     * initially
     * @param isBlack whether the queen is white or black
     */
    public Queen(Position startPosition, boolean isBlack) {
        super("Q", startPosition, isBlack);
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
     * This method adds all possible moves the queen can make moving to the
     * left. The method loops until either it reaches the boundaries of the
     * board, is stopped by a piece of it's own color or takes one of the
     * opposite players pieces.
     */
    public void left() {
        int x = currentPosition.getX();
        int y = currentPosition.getY();
        boolean loop = true;
        while (loop) {
            loop = add(x--, y);
        }
    }

    /**
     * This method adds all possible moves the queen can make moving to the
     * right. The method loops until either it reaches the boundaries of the
     * board, is stopped by a piece of it's own color or takes one of the
     * opposite players pieces.
     */
    public void right() {
        int x = currentPosition.getX();
        int y = currentPosition.getY();
        boolean loop = true;
        while (loop) {
            loop = add(x++, y);
        }
    }

    /**
     * This method adds all possible moves the queen can make moving up. The
     * method loops until either it reaches the boundaries of the board, is
     * stopped by a piece of it's own color or takes one of the opposite players
     * pieces.
     */
    public void up() {
        int x = currentPosition.getX();
        int y = currentPosition.getY();
        boolean loop = true;
        while (loop) {
            loop = add(x, y--);
        }
    }

    /**
     * This method adds all possible moves the queen can make moving down. The
     * method loops until either it reaches the boundaries of the board, is
     * stopped by a piece of it's own color or takes one of the opposite players
     * pieces.
     */
    public void down() {
        int x = currentPosition.getX();
        int y = currentPosition.getY();
        boolean loop = true;
        while (loop) {
            loop = add(x, y++);
        }
    }

    /**
     * This method adds all possible moves the queen can make moving diagonally
     * up and to the left. The method loops until either it reaches the
     * boundaries of the board, is stopped by a piece of it's own color or takes
     * one of the opposite players pieces.
     */
    public void leftUp() {
        int x = currentPosition.getX();
        int y = currentPosition.getY();
        boolean loop = true;
        while (loop) {
            add(x--, y--);
        }
    }

    /**
     * This method adds all possible moves the queen can make moving diagonally
     * up and to the right. The method loops until either it reaches the
     * boundaries of the board, is stopped by a piece of it's own color or takes
     * one of the opposite players pieces.
     */
    public void rightUp() {
        int x = currentPosition.getX();
        int y = currentPosition.getY();
        boolean loop = true;
        while (loop) {
            loop = add(x++, y--);
        }
    }

    /**
     * This method adds all possible moves the queen can make moving diagonally
     * down and to the left. The method loops until either it reaches the
     * boundaries of the board, is stopped by a piece of it's own color or takes
     * one of the opposite players pieces.
     */
    public void leftDown() {
        int x = currentPosition.getX();
        int y = currentPosition.getY();
        boolean loop = true;
        while (loop) {
            loop = add(x--, y++);
        }
    }

    /**
     * This method adds all possible moves the queen can make moving diagonally
     * down and to the right. The method loops until either it reaches the
     * boundaries of the board, is stopped by a piece of it's own color or takes
     * one of the opposite players pieces.
     */
    public void rightDown() {
        int x = currentPosition.getX() + 1;
        int y = currentPosition.getY() + 1;
        boolean loop = true;
        while (loop) {
            loop = add(x++, y++);
        }
    }
}
