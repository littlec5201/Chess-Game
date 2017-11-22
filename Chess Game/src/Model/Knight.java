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
public class Knight extends ChessPiece {

    /**
     * Constructor that creates a new knight chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the knight will be placed on the board initially
     * @param isBlack whether the knight is white or black
     */
    public Knight(Position startPosition, boolean isBlack) {
        super("Knight", startPosition, isBlack);
    }
    
}
