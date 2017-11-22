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
public class Rook extends ChessPiece{

    /**
     * Constructor that creates a new rook chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the rook will be placed on the board initially
     * @param isBlack whether the rook is white or black
     */
    public Rook(Position startPosition, boolean isBlack) {
        super("Rook", startPosition, isBlack);
    }
    
}
