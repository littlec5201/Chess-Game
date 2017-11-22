/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.GridSquare;

/**
 *
 * @author Callum
 */
public class Board {

    private GridSquare[][] chessGrid;
    private int size = 0;

    /**
     * Default constructor that creates a new 8x8 chess board and places
     * ChessPieces in the appropriate position
     */
    public Board() {
        size = 8;
        chessGrid = new GridSquare[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; i < size; j++) {
                Position pos = new Position(i, j);
                chessGrid[i][j] = new GridSquare(pos);
                GridSquare current = chessGrid[i][j];
                boolean isBlack = true;

                /**
                 * Checks to see if the current row is 0 or 1. If it is, then
                 * the piece belongs to the white player
                 */
                if (i == 0 || i == 1) {
                    isBlack = false;
                }

                if (i == 1 || i == 6) {
                    current.addPiece(new Pawn(pos, isBlack));
                } else if (i == 0 || i == 7) {
                    switch (j) {
                        case 0:
                        case 7:
                            current.addPiece(new Rook(pos, isBlack));
                            break;
                        case 1:
                        case 6:
                            current.addPiece(new Knight(pos, isBlack));
                            break;
                        case 2:
                        case 5:
                            current.addPiece(new Bishop(pos, isBlack));
                            break;
                        case 3:
                            current.addPiece(new Queen(pos, isBlack));
                            break;
                        case 4:
                            current.addPiece(new King(pos, isBlack));
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}
