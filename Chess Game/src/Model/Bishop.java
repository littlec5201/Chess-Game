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
public class Bishop extends ChessPiece {

    /**
     * Constructor that creates a new bishop chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the bishop will be placed on the board initially
     * @param isBlack whether the bishop is white or black
     */
    public Bishop(Position startPosition, boolean isBlack) {
        super("Bishop", startPosition, isBlack);
    }

}
