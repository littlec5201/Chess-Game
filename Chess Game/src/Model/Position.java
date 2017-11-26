/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Callum
 */
public class Position {

    private int x;
    private int y;

    /**
     * Constructor that takes an X and Y value as parameters and constructs a
     * new position using the combination
     *
     * @param x the X value to be assigned to the position
     * @param y the Y value to be assigned to the position
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method that returns the current position X value
     *
     * @return
     */
    public int getX() {
        return this.x;
    }

    /**
     * Method that returns the current position Y value
     *
     * @return y
     */
    public int getY() {
        return this.y;
    }

}
