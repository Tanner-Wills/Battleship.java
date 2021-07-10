import java.util.Scanner;
import java.util.ArrayList;

public class Battleship {
    public static int numRows = 5;
    public static int numCols = 5;
    public static int player1Ships;
    public static int player2Ships;
    public static String[][] grid = new String[numRows][numCols];
    public static int[][] hits = new int[numRows][numRows];
    public static int[][] misses = new int[numRows][numRows];

    public static void main(String[] args) {
        // Initial Prompt
        System.out.println("Welcome to Battleship!\n");

        // Step 1 - Populate "grid" variable empty spaces
        populateGrid();

        // Step 2 - Identify player1Ships coordinates


        // Step 3 -  Create the game board;
        createGameBoard();


}

        public static void populateGrid(){
            for(int rowEntry = 0; rowEntry < numRows; rowEntry ++){
                for(int colEntry = 0; colEntry < numRows; colEntry ++){
                    grid[rowEntry][colEntry] = " ";
                }
            }
        }

        public static void addPlayerShips(){



        }

        public static void createGameBoard(){
            //create rows and columns of board
            //Rows of "--" and columns of "|"
            //between each row will be a row for entry of "X" for hit and "0" for miss
            System.out.println();
            System.out.println("    1     2     3     4     5");
            System.out.println(" +-----+-----+-----+-----+-----+");
            System.out.println("1|  " + grid[0][0] + "  |  " + grid[0][1]+ "  |  " + grid[0][2]+ "  |  " + grid[0][3]+ "  |  " + grid[0][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("2|  " + grid[1][0] + "  |  " + grid[1][1]+ "  |  " + grid[1][2]+ "  |  " + grid[1][3]+ "  |  " + grid[1][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("3|  " + grid[2][0] + "  |  " + grid[2][1]+ "  |  " + grid[2][2]+ "  |  " + grid[2][3]+ "  |  " + grid[2][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("4|  " + grid[3][0] + "  |  " + grid[3][1]+ "  |  " + grid[3][2]+ "  |  " + grid[3][3]+ "  |  " + grid[3][4] + "  |");
            System.out.println(" |-----+-----+-----+-----+-----|");
            System.out.println("5|  " + grid[4][0] + "  |  " + grid[4][1]+ "  |  " + grid[4][2]+ "  |  " + grid[4][3]+ "  |  " + grid[4][4] + "  |");
            System.out.println(" +-----+-----+-----+-----+-----+");






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



