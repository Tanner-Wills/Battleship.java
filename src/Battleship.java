import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        // Initial Prompt
        System.out.println("Welcome to Battleship!\n");

        // Player 1
        int[] player1Ships = new int[5]; //Blank array for player ship coordinates
        int ship = 1;
        int xCoord = 0;
        int yCoord = 0;
        System.out.println("PLAYER 1, ENTER YOUR SHIP COORDINATES [X,Y]\n");


        Scanner input = new Scanner(System.in); // Create scanner object for user input


        while (ship < 6){
            System.out.println("Enter ship " + ship + " location");
            if (input.hasNextInt()){
                xCoord = input.nextInt();

                if (input.hasNextInt()){
                    yCoord = input.nextInt();
                    input.nextLine();
                    System.out.println(xCoord + " " + yCoord);
                    player1Ships[ship-1] = xCoord;
                    ship ++;

                } else {
                    System.out.println("Invalid Coordinates, Choose different coordinates");
                    input.nextLine();
                }
            } else {
                System.out.println("Invalid Coordinates, Choose different coordinates");
                input.nextLine();
            }
        }
        System.out.println(player1Ships);


    }


}
