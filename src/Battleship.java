import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        // Initial Prompt
        System.out.println("Welcome to Battleship!\n");

        // Player 1
        int[] player1ShipsX = new int[5]; //Blank array for player ship X coordinates
        int[] player1ShipsY = new int[5]; //Blank array for player ship Y coordinates
        int ship = 1;
        int xCoord = 0;
        int yCoord = 0;
        System.out.println("PLAYER 1, ENTER YOUR SHIP COORDINATES X Y\n");

        //TODO: make the ship coordinate code into a separate method.
        Scanner input = new Scanner(System.in); // Create scanner object for user input

        //&& input.nextInt() < 5 && input.nextInt() >= 0
        while(ship< 6){
            System.out.println("Enter ship " + ship + " location");
            //TODO: add constraints for xCoord and yCoord: min of 0, max of 5, is an int, hasnt already occured in the shipCoordinates


            if (input.hasNextInt()) {
                xCoord = input.nextInt();

                if (input.hasNextInt()) {
                    yCoord = input.nextInt();
                    input.nextLine();
                    System.out.println(xCoord + " " + yCoord);
                    player1ShipsX[ship - 1] = xCoord;
                    player1ShipsY[ship - 1] = xCoord;
                    ship++;

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
        for(int coord :player1ShipsX){
            System.out.println(coord);
        }
        System.out.println("PLAYER 1 SHIP Y COORDINATES: \n");
        for(int coord :player1ShipsY){
            System.out.println(coord);
        }

}
