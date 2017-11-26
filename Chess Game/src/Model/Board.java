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

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                Position pos = new Position(x, y);
                chessGrid[x][y] = new GridSquare(pos);
                GridSquare current = chessGrid[x][y];
                boolean isBlack = true;

                /**
                 * Checks to see if the current row is 0 or 1. If it is, then
                 * the piece belongs to the white player
                 */
                if (y == 0 || y == 1) {
                    isBlack = false;
                }

                if (y == 1 || y == 6) {
                    current.addPiece(new Pawn(pos, isBlack));
                } else if (y == 0 || y == 7) {
                    switch (x) {
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

    /**
     * Retrieves the grid square for the board at the position (x,y)
     *
     * @param x the x component of the position
     * @param y the y component of the position
     * @return the grid square at the specified location
     */
    public GridSquare getGridSquare(int x, int y) {
        return this.chessGrid[x][y];
    }
}
