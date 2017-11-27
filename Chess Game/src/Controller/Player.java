/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChessPiece;
import java.util.ArrayList;

/**
 *
 * @author Callum
 */
public class Player {

    private ArrayList<ChessPiece> grave;
    protected boolean myTurn;

    public Player() {
        grave = new ArrayList<ChessPiece>();
    }

    public ArrayList<ChessPiece> getGrave() {
        return grave;
    }

    /**
     * Adds the passed piece to the players grave of pieces
     *
     * @param piece the piece to be added to the grave
     */
    protected void addToGrave(ChessPiece piece) {
        grave.add(piece);
    }

    public boolean isMyTurn() {
        return myTurn;
    }

    public void setMyTurn(boolean myTurn) {
        this.myTurn = myTurn;
    }

}
