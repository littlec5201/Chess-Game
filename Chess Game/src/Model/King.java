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
public class King extends ChessPiece{

    /**
     * Constructor that creates a new king chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the king will be placed on the board initially
     * @param isBlack whether the king is white or black
     */
    public King(Position startPosition, boolean isBlack) {
        super("King", startPosition, isBlack);
    }
    
}
