/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bishop;
import Model.ChessPiece;
import Model.King;
import Model.Knight;
import Model.Pawn;
import Model.Queen;
import Model.Rook;
import java.util.ArrayList;

/**
 *
 * @author Callum
 */
public class Player {

    protected ArrayList<ChessPiece> grave;
    protected ArrayList<Pawn> pawns;
    protected ArrayList<Rook> rooks;
    protected ArrayList<Knight> knights;
    protected ArrayList<Bishop> bishops;
    protected King king;
    protected Queen queen;

}
