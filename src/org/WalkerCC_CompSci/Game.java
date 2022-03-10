package org.WalkerCC_CompSci;


import sun.invoke.empty.Empty;

import javax.swing.*;
import java.util.Scanner;

public class Game {
    private GameBoard gameBoard;
    private Player player1;
    private Player player2;
    private boolean isComplete = false;

    public Game(){
        gameBoard = new GameBoard();
        player1 = new Player(Space.X, 1);
        player2 = new Player(Space.O, 2);
    }


    public void Play() {
        //Clean this up so that it handles repetition and ends the game when its over.

        Scanner myScan = new Scanner(System.in);
        gameBoard.Draw();

        while(true) {
            System.out.println("Player 1:  Enter a location number.");
            int location = myScan.nextInt();

            gameBoard.PlaceOnBoard(player1.getPiece(), location);
            boolean ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 1 Wins");
                gameBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                gameBoard.Draw();
                return;
            }
            gameBoard.Draw();

            System.out.println("Player 2:  Enter a location number.");
            location = myScan.nextInt();

            gameBoard.PlaceOnBoard(player2.getPiece(), location);
            ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 2 Wins");
                gameBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                gameBoard.Draw();
                return;
            }
            gameBoard.Draw();
        }




    }

    private boolean CheckForWin() {
        //row
        if(this.gameBoard.spacesText[0] .equals(this.gameBoard.spacesText[1]) && this.gameBoard.spacesText[1] .equals(this.gameBoard.spacesText[2])){
            return true;
        }
        else if(this.gameBoard.spacesText[3] .equals(this.gameBoard.spacesText[4])&& this.gameBoard.spacesText[4] .equals(this.gameBoard.spacesText[5])){
            return true;
        }
        else if(this.gameBoard.spacesText[6] .equals(this.gameBoard.spacesText[7])  && this.gameBoard.spacesText[7] .equals(this.gameBoard.spacesText[8]) ){
            return true;
        }

        //column
        else if (this.gameBoard.spacesText[0] .equals(this.gameBoard.spacesText[3]) && this.gameBoard.spacesText[3] .equals( this.gameBoard.spacesText[6])){
            return true;
        }
        else if(this.gameBoard.spacesText[1] .equals(this.gameBoard.spacesText[4])  && this.gameBoard.spacesText[4] .equals(this.gameBoard.spacesText[7]) ){
            return true;
        }
        else if(this.gameBoard.spacesText[2].equals(this.gameBoard.spacesText[5])  && this.gameBoard.spacesText[5] .equals(this.gameBoard.spacesText[8]) ){
            return true;
        }

        //diag
        else if (this.gameBoard.spacesText[0].equals(this.gameBoard.spacesText[4]) && this.gameBoard.spacesText[4] .equals(this.gameBoard.spacesText[8])){
            return true;
        }
        else if(this.gameBoard.spacesText[2].equals(this.gameBoard.spacesText[4]) && this.gameBoard.spacesText[4].equals(this.gameBoard.spacesText[6])){
            return true;
        }

        return false;



    }

    private boolean IsFilled(){

        for (int i = 0; i < 9; i++) {
           if(this.gameBoard.spaces[i] == Space.EMPTY) {

                return false;

           }
        }

        return true;
        //Implement this method.

    }

}
