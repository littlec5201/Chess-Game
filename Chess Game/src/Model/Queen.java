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
public class Queen extends ChessPiece {

    /**
     * Constructor that creates a new queen chessPiece. The class extends
     * ChessPiece, so the "super" constructor is called within
     *
     * @param startPosition the position the queen will be placed on the board initially
     * @param isBlack whether the queen is white or black
     */
    public Queen(Position startPosition, boolean isBlack) {
        super("Queen", startPosition, isBlack);
    }
    
}
