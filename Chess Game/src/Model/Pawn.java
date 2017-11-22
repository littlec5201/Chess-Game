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
public class Pawn extends ChessPiece{

    /**
     * Constructor that creates a new pawn chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the pawn will be placed on the board initially
     * @param isBlack whether the pawn is white or black
     */
    public Pawn(Position startPosition, boolean isBlack) {
        super("Pawn", startPosition, isBlack);
    }
    
    
    
}
