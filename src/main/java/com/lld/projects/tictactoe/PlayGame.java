package com.lld.projects.tictactoe;

import com.lld.projects.tictactoe.models.GameStatus;

public class PlayGame {

    public static void main(String[] args) {
        System.out.println("\n===>>> TicTacToe Game\n");
        Game game = new Game();
        game.initialiseGame();
        GameStatus status = game.startGame();
        System.out.print("\n===>>> GAME OVER: ");
        switch (status) {
            case WIN:
                System.out.print(game.winner.name + " won the game");
                break;
            case DRAW:
                System.out.print(" Its a Draw!");
                break;
            default:
                System.out.print(" Game Ends");
                break;
        }

    }

}