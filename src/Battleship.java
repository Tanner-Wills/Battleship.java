import java.util.Scanner;
import java.util.ArrayList;

public class Battleship {
    public static int numRows = 5;
    public static int numCols = 5;
    public static int player1Ships;
    public static int player2Ships;
    public static String[][] grid = new String[numRows][numCols];
    public static int[][] missedGuess = new int[numRows][numRows];

    public static void main(String[] args) {
        // Initial Prompt
        System.out.println("Welcome to Battleship!\n");

        // Step 1 -  Populate the player's ships
        playerShipCoord();
        
}

    public static void playerShipCoord(){
        ArrayList<ArrayList<Integer>> player1Ships = new ArrayList<ArrayList<Integer>>(); //Blank array for player ship X coordinates
        ArrayList<ArrayList<Integer>> player2Ships = new ArrayList<ArrayList<Integer>>(); //Blank array for player ship Y coordinates
        int ship = 1;
        int xCoord = 0;
        int yCoord = 0;
        ArrayList<Integer> shipCoord = new ArrayList<Integer>();
        System.out.println("PLAYER 1, ENTER YOUR SHIP COORDINATES X Y\n");

        Scanner input = new Scanner(System.in); // Create scanner object for user input

        while (ship < 6) {
            System.out.println("Enter ship " + ship + " location");

            if (input.hasNextInt()) {
                xCoord = input.nextInt();
                System.out.println("xCoord = " + xCoord);

                if (input.hasNextInt()) {
                    yCoord = input.nextInt();
                    System.out.println("yCoord = " + yCoord);
                    shipCoord.clear();
                    shipCoord.add(xCoord);
                    shipCoord.add(yCoord);

                    System.out.println("shipCoord = " + shipCoord);
//&& !player1Ships.contains(shipCoord)
                    if (xCoord >= 0 && xCoord < 5 && yCoord >= 0 && yCoord < 5 ){
                        player1Ships.add(shipCoord);
                        ship ++;
                        input.nextLine();

                    } else {
                        System.out.println("Invalid Coordinates, Choose different coordinates");
                        input.nextLine();
                    }

                } else {
                    System.out.println("Invalid Coordinates, Choose different coordinates");
                    input.nextLine();
                }

            } else {
                System.out.println("Invalid Coordinates, Choose different coordinates");
                input.nextLine();
            }

        }
        //Print Player 1 ship X coordinates after entry
        System.out.println("PLAYER 1 SHIP X COORDINATES: \n");
        for (int i = 0; i < player1Ships.size(); i ++){
            System.out.println(player1Ships.get(i));
        }
    }

}
