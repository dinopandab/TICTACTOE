package org.WalkerCC_CompSci;

public class Player {
    private Space space;
    private int playOrder;//don't need

    public Player(Space space, int playOrder) {
        this.space = space;
        this.playOrder = playOrder;// don't need
    }

    public Space getPiece(){
        return this.space;
    }
}
