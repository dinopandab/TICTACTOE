package org.WalkerCC_CompSci;


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
        if(this.gameBoard.spaces[0] == this.gameBoard.spaces[1] && this.gameBoard.spaces[1] == this.gameBoard.spaces[2]){
            return true;
        }
        else if(this.gameBoard.spaces[2] == this.gameBoard.spaces[3] && this.gameBoard.spaces[3] == this.gameBoard.spaces[4]){
            return true;
        }
        else if(this.gameBoard.spaces[4] == this.gameBoard.spaces[5] && this.gameBoard.spaces[5] == this.gameBoard.spaces[6]){
            return true;
        }else if(this.gameBoard.spaces[6] == this.gameBoard.spaces[7] && this.gameBoard.spaces[7] == this.gameBoard.spaces[8]){
            return true;
        }

        //column
        if(this.gameBoard.spaces[0] == this.gameBoard.spaces[3] && this.gameBoard.spaces[3] == this.gameBoard.spaces[6]){
            return true;
        }
        else if(this.gameBoard.spaces[1] == this.gameBoard.spaces[4] && this.gameBoard.spaces[4] == this.gameBoard.spaces[7]){
            return true;
        }
        else if(this.gameBoard.spaces[2] == this.gameBoard.spaces[5] && this.gameBoard.spaces[5] == this.gameBoard.spaces[8]){
            return true;
        }

        //diag
        if(this.gameBoard.spaces[0] == this.gameBoard.spaces[4] && this.gameBoard.spaces[4] == this.gameBoard.spaces[8]){
            return true;
        }
        else if(this.gameBoard.spaces[2] == this.gameBoard.spaces[4] && this.gameBoard.spaces[4] == this.gameBoard.spaces[6]){
            return true;
        }







    }

    private boolean IsFilled(){

        for (int i = 0; i < 9; i++) {
           if(this.gameBoard.spaces[i] == this.gameBoard.spaces[2] ) {




           }
        }


        //Implement this method.

    }

}
