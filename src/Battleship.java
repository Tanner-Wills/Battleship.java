import java.util.Scanner;
import java.util.*;
import java.io.*;

//TODO: add a do-while loop
// 100 blank lines in terminal after showing boards
// Change String[][] to char[][]
// Change the ASCII display to only use "-"

public class Battleship {
    public static int numRows = 5;
    public static int numCols = 5;
    public static int player1Ships = 5;
    public static int player2Ships = 5;
    public static String[][] gridPlayer1 = new String[numRows][numCols];
    public static String[][] gridPlayer2 = new String[numRows][numCols];
    public static String[][] targetHistory1 = new String[numRows][numRows];
    public static String[][] targetHistory2 = new String[numRows][numRows];

    public static void main(String[] args) {
        // Initial Prompt
        System.out.println("Welcome to Battleship!\n");

        Scanner input = new Scanner(System.in);

        // Step 1 - initialize "grid1" variable and enter player 1 ships
        choosePlayerCoordinates(input);


        // Step 4 - Play Battleship! until a player sinks every ship
        playBattleship(input);

}
// ************* BATTLESHIP FUNCTIONS *************
        public static void choosePlayerCoordinates(Scanner input){
            // ***** Player 1 *****
            //initialize targetHistory matrix
            for(int rowEntry = 0; rowEntry < numRows; rowEntry ++){
                for(int colEntry = 0; colEntry < numRows; colEntry ++){
                    targetHistory1[rowEntry][colEntry] = " ";
                }
            }

            //initialize gridPlayer1 matrix
            for(int rowEntry = 0; rowEntry < numRows; rowEntry ++){
                for(int colEntry = 0; colEntry < numRows; colEntry ++){
                    gridPlayer1[rowEntry][colEntry] = " ";
                }
            }

            //Scanner input = new Scanner(System.in);
            int ship = 0;
            int xCoord = 0;
            int yCoord = 0;
            System.out.println("Ready Player 1: ");

            while (ship < player1Ships){
                System.out.println("Enter ship " + ship + " coordinates");
                if(input.hasNextInt()){
                    xCoord = input.nextInt();

                    if(input.hasNextInt()){
                        yCoord = input.nextInt();

                        if(xCoord >= 0 && xCoord < numRows && yCoord >= 0 && yCoord < numRows){

                            if(gridPlayer1[xCoord][yCoord] != "@"){
                                gridPlayer1[xCoord][yCoord] = "@";
                                ship ++;
                                input.nextLine();
                            } else {
                                System.out.println("You already have a ship there. Choose different coordinates.");
                                input.nextLine();
                            }
                        } else {
                            System.out.println("Invalid coordinates. Choose different coordinates.");
                            input.nextLine();
                        }
                    } else {
                        System.out.println("Invalid coordinates. Choose different coordinates.");
                        input.nextLine();
                    }
                } else {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    input.nextLine();
                }
        }
            createGameBoard1();

            // ***** Player 2 *****
            //initialize targetHistory2 matrix
            for(int rowEntry = 0; rowEntry < numRows; rowEntry ++){
                for(int colEntry = 0; colEntry < numRows; colEntry ++){
                    targetHistory2[rowEntry][colEntry] = " ";
                }
            }
            //initialize gridPlayer2 matrix
            for(int rowEntry = 0; rowEntry < numRows; rowEntry ++){
                for(int colEntry = 0; colEntry < numRows; colEntry ++){
                    gridPlayer2[rowEntry][colEntry] = " ";
                }
            }
            ship = 0;
            System.out.println("Ready Player 2: ");
            while (ship < player2Ships){
                System.out.println("Enter ship " + ship + " coordinates");
                if(input.hasNextInt()){
                    xCoord = input.nextInt();

                    if(input.hasNextInt()){
                        yCoord = input.nextInt();

                        if(xCoord >= 0 && xCoord < numRows && yCoord >= 0 && yCoord < numRows){

                            if(gridPlayer2[xCoord][yCoord] != "@"){
                                gridPlayer2[xCoord][yCoord] = "@";
                                ship ++;
                                input.nextLine();
                            } else {
                                System.out.println("You already have a ship there. Choose different coordinates.");
                                input.nextLine();
                            }
                        } else {
                            System.out.println("Invalid coordinates. Choose different coordinates.");
                            input.nextLine();
                        }
                    } else {
                        System.out.println("Invalid coordinates. Choose different coordinates.");
                        input.nextLine();
                    }
                } else {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    input.nextLine();
                }

            }
            createGameBoard2();
        }

        public static void createGameBoard1() {
            //create rows and columns of board
            //between each row will be a row for entry of "X" for hit and "0" for miss
            System.out.println("Player 1 Board");
            System.out.println();
            System.out.println("    0     1     2     3     4");
            System.out.println(" +-----+-----+-----+-----+-----+");
            System.out.println("0|  " + gridPlayer1[0][0] + "  |  " + gridPlayer1[0][1] + "  |  " + gridPlayer1[0][2] + "  |  " + gridPlayer1[0][3] + "  |  " + gridPlayer1[0][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("1|  " + gridPlayer1[1][0] + "  |  " + gridPlayer1[1][1] + "  |  " + gridPlayer1[1][2] + "  |  " + gridPlayer1[1][3] + "  |  " + gridPlayer1[1][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("2|  " + gridPlayer1[2][0] + "  |  " + gridPlayer1[2][1] + "  |  " + gridPlayer1[2][2] + "  |  " + gridPlayer1[2][3] + "  |  " + gridPlayer1[2][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("3|  " + gridPlayer1[3][0] + "  |  " + gridPlayer1[3][1] + "  |  " + gridPlayer1[3][2] + "  |  " + gridPlayer1[3][3] + "  |  " + gridPlayer1[3][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("4|  " + gridPlayer1[4][0] + "  |  " + gridPlayer1[4][1] + "  |  " + gridPlayer1[4][2] + "  |  " + gridPlayer1[4][3] + "  |  " + gridPlayer1[4][4] + "  |");
            System.out.println(" +-----+-----+-----+-----+-----+");
            System.out.println();

        }

        public static void createGameBoard2(){
            System.out.println("Player 2 Board");
            System.out.println();
            System.out.println("    0     1     2     3     4");
            System.out.println(" +-----+-----+-----+-----+-----+");
            System.out.println("0|  " + gridPlayer2[0][0] + "  |  " + gridPlayer2[0][1]+ "  |  " + gridPlayer2[0][2]+ "  |  " + gridPlayer2[0][3]+ "  |  " + gridPlayer2[0][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("1|  " + gridPlayer2[1][0] + "  |  " + gridPlayer2[1][1]+ "  |  " + gridPlayer2[1][2]+ "  |  " + gridPlayer2[1][3]+ "  |  " + gridPlayer2[1][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("2|  " + gridPlayer2[2][0] + "  |  " + gridPlayer2[2][1]+ "  |  " + gridPlayer2[2][2]+ "  |  " + gridPlayer2[2][3]+ "  |  " + gridPlayer2[2][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("3|  " + gridPlayer2[3][0] + "  |  " + gridPlayer2[3][1]+ "  |  " + gridPlayer2[3][2]+ "  |  " + gridPlayer2[3][3]+ "  |  " + gridPlayer2[3][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("4|  " + gridPlayer2[4][0] + "  |  " + gridPlayer2[4][1]+ "  |  " + gridPlayer2[4][2]+ "  |  " + gridPlayer2[4][3]+ "  |  " + gridPlayer2[4][4] + "  |");
            System.out.println(" +-----+-----+-----+-----+-----+");
            System.out.println();
        }

        public static void createTargetHistory(){
            System.out.println("Target History Board Player 1");
            System.out.println();
            System.out.println("    0     1     2     3     4");
            System.out.println(" +-----+-----+-----+-----+-----+");
            System.out.println("0|  " + targetHistory1[0][0] + "  |  " + targetHistory1[0][1]+ "  |  " + targetHistory1[0][2]+ "  |  " + targetHistory1[0][3]+ "  |  " + targetHistory1[0][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("1|  " + targetHistory1[1][0] + "  |  " + targetHistory1[1][1]+ "  |  " + targetHistory1[1][2]+ "  |  " + targetHistory1[1][3]+ "  |  " + targetHistory1[1][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("2|  " + targetHistory1[2][0] + "  |  " + targetHistory1[2][1]+ "  |  " + targetHistory1[2][2]+ "  |  " + targetHistory1[2][3]+ "  |  " + targetHistory1[2][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("3|  " + targetHistory1[3][0] + "  |  " + targetHistory1[3][1]+ "  |  " + targetHistory1[3][2]+ "  |  " + targetHistory1[3][3]+ "  |  " + targetHistory1[3][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("4|  " + targetHistory1[4][0] + "  |  " + targetHistory1[4][1]+ "  |  " + targetHistory1[4][2]+ "  |  " + targetHistory1[4][3]+ "  |  " + targetHistory1[4][4] + "  |");
            System.out.println(" +-----+-----+-----+-----+-----+");

            System.out.println();
            System.out.println();

            System.out.println("Target History Board Player 2");
            System.out.println();
            System.out.println("    0     1     2     3     4");
            System.out.println(" +-----+-----+-----+-----+-----+");
            System.out.println("0|  " + targetHistory2[0][0] + "  |  " + targetHistory2[0][1]+ "  |  " + targetHistory2[0][2]+ "  |  " + targetHistory2[0][3]+ "  |  " + targetHistory2[0][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("1|  " + targetHistory2[1][0] + "  |  " + targetHistory2[1][1]+ "  |  " + targetHistory2[1][2]+ "  |  " + targetHistory2[1][3]+ "  |  " + targetHistory2[1][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("2|  " + targetHistory2[2][0] + "  |  " + targetHistory2[2][1]+ "  |  " + targetHistory2[2][2]+ "  |  " + targetHistory2[2][3]+ "  |  " + targetHistory2[2][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("3|  " + targetHistory2[3][0] + "  |  " + targetHistory2[3][1]+ "  |  " + targetHistory2[3][2]+ "  |  " + targetHistory2[3][3]+ "  |  " + targetHistory2[3][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("4|  " + targetHistory2[4][0] + "  |  " + targetHistory2[4][1]+ "  |  " + targetHistory2[4][2]+ "  |  " + targetHistory2[4][3]+ "  |  " + targetHistory2[4][4] + "  |");
            System.out.println(" +-----+-----+-----+-----+-----+");

        }

        public static void playBattleship(Scanner input) {
            System.out.println("Board is set up. Begin Battleship! \n");
            //Scanner input = new Scanner(System.in);
            int playerTurn = 1;
            int xStrike = 0;
            int yStrike = 0;

            // ***** While loop until a player has lost *****
            while (player1Ships > 0 && player2Ships > 0) {
                // ***** Player 1 Turn *****
                while (playerTurn == 1) {
                    System.out.println("Player " + playerTurn + " enter a coordinate to strike!");
                    if (input.hasNextInt()) {
                        xStrike = input.nextInt();

                        if (input.hasNextInt()) {
                            yStrike = input.nextInt();

                            if (xStrike >= 0 && xStrike < 5 && yStrike >= 0 && yStrike < 5) {

                                if (!targetHistory1[xStrike][yStrike].contains("X") && !targetHistory1[xStrike][yStrike].contains("O")) {

                                    if (gridPlayer2[xStrike][yStrike].contains("@")) {
                                        System.out.println("Target hit! \n");
                                        targetHistory1[xStrike][yStrike] = "X";
                                        gridPlayer2[xStrike][yStrike] = "X";
                                        player2Ships -= 1;
                                        playerTurn = 2;
                                        input.nextLine();
                                        createTargetHistory();
                                        System.out.println("Player 2 ships remaining: " + player2Ships);
                                    } else {
                                        System.out.println("Miss! \n");
                                        targetHistory1[xStrike][yStrike] = "O";
                                        gridPlayer2[xStrike][yStrike] = "O";
                                        playerTurn = 2;
                                        input.nextLine();
                                        createTargetHistory();
                                    }
                                } else {
                                    System.out.println("You already fired on this spot. Choose different coordinates.");
                                    input.nextLine();
                                }
                            } else {
                                System.out.println("Invalid coordinates. Choose different coordinates.");
                                input.nextLine();
                            }
                        } else {
                            System.out.println("Invalid coordinates. Choose different coordinates.");
                            input.nextLine();
                        }
                    } else {
                        System.out.println("Invalid coordinates. Choose different coordinates.");
                        input.nextLine();
                    }
                    //printBattleShip("01");
                }
            // break statement if player 1 wins mid-loop
            if(player2Ships < 1){
                break;
            }
                // ***** Player 2 Turn *****
                while (playerTurn == 2) {
                    System.out.println("Player " + playerTurn + " enter a coordinate to strike!");
                    if (input.hasNextInt()) {
                        xStrike = input.nextInt();

                        if (input.hasNextInt()) {
                            yStrike = input.nextInt();

                            if (xStrike >= 0 && xStrike < 5 && yStrike >= 0 && yStrike < 5) {

                                if (!targetHistory2[xStrike][yStrike].contains("X") && !targetHistory2[xStrike][yStrike].contains("O")) {

                                    if (gridPlayer1[xStrike][yStrike].contains("@")) {
                                        System.out.println("Target hit! \n");
                                        targetHistory2[xStrike][yStrike] = "X";
                                        gridPlayer1[xStrike][yStrike] = "X";
                                        player1Ships -= 1;
                                        playerTurn = 1;
                                        input.nextLine();
                                        createTargetHistory();
                                        System.out.println("Player 1 ships remaining: " + player1Ships);
                                    } else {
                                        System.out.println("Miss! \n");
                                        targetHistory2[xStrike][yStrike] = "O";
                                        gridPlayer1[xStrike][yStrike] = "O";
                                        playerTurn = 1;
                                        input.nextLine();
                                        createTargetHistory();
                                    }
                                } else {
                                    System.out.println("You already fired on this spot. Choose different coordinates.");
                                    input.nextLine();
                                }
                            } else {
                                System.out.println("Invalid coordinates. Choose different coordinates.");
                                input.nextLine();
                            }
                        } else {
                            System.out.println("Invalid coordinates. Choose different coordinates.");
                            input.nextLine();
                        }
                    } else {
                        System.out.println("Invalid coordinates. Choose different coordinates.");
                        input.nextLine();
                    }
                }
            }

            // ***** If a player lost *****
            if(player1Ships == 0){
                System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
            } else {
                System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
            }
            createGameBoard1();
            createGameBoard2();
        }

        // Use this method to print game boards to the console.
        private static void printBattleShip(char[][] player) {
            System.out.print("  ");
            for (int row = -1; row < 5; row++) {
                if (row > -1) {
                    System.out.print(row + " ");
                }
                for (int column = 0; column < 5; column++) {
                    if (row == -1) {
                        System.out.print(column + " ");
                    } else {
                        System.out.print(player[row][column] + " ");
                    }
                }
                System.out.println("");
            }
        }



            /*
            System.out.println();
            System.out.println("    1     2     3     4     5");
            System.out.println(" +-----+-----+-----+-----+-----+");
            System.out.println("1|     |     |     |     |     |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("2|     |     |     |     |     |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("3|     |     |     |     |     |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("4|     |     |     |     |     |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("5|     |     |     |     |     |");
            System.out.println(" +-----+-----+-----+-----+-----+");
            */
}



