package Grundlagen.Inhalt.Algorithmen;

import java.util.Scanner;

public class XO_Game {
    public static Scanner sc;
    public static char[][] gameFiled;
    public static String player1, player2;
    public static char playerOneSymbol, playerTwoSymbol;


    public static void readNames() {
        sc = new Scanner(System.in);

        System.out.print("Player 1: ");
        player1 = sc.next();

        System.out.print("Welcome " + player1 + ". which symbol do u want to use (X,O): ");
        playerOneSymbol = sc.next().charAt(0);

        System.out.print("Player 2: ");
        player2 = sc.next();

        playerTwoSymbol = 'X';

        if (playerOneSymbol == 'X' || playerOneSymbol == 'x') {
            playerTwoSymbol = 'O';
        }

        System.out.println("Welcome in XO Game:");
        System.out.println(player1 + "(" + playerOneSymbol + ")");
        System.out.println(player2 + "(" + playerTwoSymbol + ")");
    }

    public static void main(String[] args) {
        readNames();
        gameStart();
    }

    public static void playerOneTurn() {
        System.out.println(player1 + "(" + playerOneSymbol + ") turn [i,j]?");
        boolean indexUsed = true;
        do {
            System.out.print("i: ");
            int p1I = sc.nextInt();
            System.out.print("j: ");
            int p1J = sc.nextInt();
            if (gameFiled[p1I][p1J] == '-') {
                gameFiled[p1I][p1J] = playerOneSymbol;
                indexUsed = false;
            } else {
                System.out.println("Sorry Stelle ist belegt! bitte nochmal versuchen!");
            }
        } while (indexUsed == true);


    }

    public static void playerTwoTurn() {
        System.out.println(player2 + "(" + playerTwoSymbol + ") turn [i,j]?");
        boolean indexUsed = true;
        do {
            System.out.print("i: ");
            int p2I = sc.nextInt();
            System.out.print("j: ");
            int p2J = sc.nextInt();
            if (gameFiled[p2I][p2J] == '-') {
                gameFiled[p2I][p2J] = playerTwoSymbol;
                indexUsed = false;
            } else {
                System.out.println("Sorry Stelle ist belegt! bitte nochmal versuchen!");
            }
        } while (indexUsed == true);
    }

    public static void initGameField() {
        gameFiled = new char[3][3];
        for (int i = 0; i < gameFiled.length; i++) {
            for (int j = 0; j < gameFiled[i].length; j++) {
                gameFiled[i][j] = '-';
            }
        }
    }

    public static void printGameField() {
        for (int i = 0; i < gameFiled.length; i++) {
            for (int j = 0; j < gameFiled[i].length; j++) {
                System.out.print(gameFiled[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static String determinateWinner() {
        // TODO
        return "No Body!";
    }   

    public static boolean gameFiledIsFull() {
        for (int i = 0; i < gameFiled.length; i++) {
            for (int j = 0; j < gameFiled[i].length; j++) {
                if (gameFiled[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static void gameStart() {
        initGameField();
        printGameField();


        while (!gameFiledIsFull()) {
            playerOneTurn();
            printGameField();
            if (!gameFiledIsFull()) {
                playerTwoTurn();
                printGameField();
            }
        }
        System.out.println("Game Over");
        System.out.println("The winner is:" + determinateWinner());

    }

}
