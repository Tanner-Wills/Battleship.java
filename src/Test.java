public class Test {

    ublic class BattleShips {
        public static int numRows = 10;
        public static int numCols = 10;
        public static int playerShips;
        public static int computerShips;
        public static String[][] grid = new String[numRows][numCols];
        public static int[][] missedGuesses = new int[numRows][numCols];

        public static void main(String[] args){
            System.out.println("**** Welcome to Battle Ships game ****");
            System.out.println("Right now, sea is empty\n");

            //Step 1 – Create the ocean map
            createOceanMap();

            //Step 2 – Deploy player’s ships
            deployPlayerShips();

            //Step 3 - Deploy computer's ships
            deployComputerShips();

            //Step 4 Battle
            do {
                Battle();
            }while(BattleShips.playerShips != 0 && BattleShips.computerShips != 0);

            //Step 5 - Game over
            gameOver();
        }
}
