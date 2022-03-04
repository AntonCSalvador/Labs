
import java.util.Scanner;

public class ConnectFour {

    public static void main(String[] args) {
        System.out.print("What would you like the height of the board to be? ");
        Scanner input = new Scanner(System.in);
        int boardHeight = input.nextInt();
        System.out.print("What would you like the length of the board to be? ");
        int boardLength = input.nextInt();
        //space for board creation
        char[][] board = new char[boardHeight][boardLength];
        initializeBoard(board);
        printBoard(board);
        System.out.println("");
        System.out.println("Player 1: x");
        System.out.println("Player 2: o");
        for (int i = 0; i < (boardHeight * boardLength); i++) {
            if (i % 2 == 0) {
                System.out.print("Player 1: Which column would you like to choose? ");
                int player1Choice = input.nextInt();
                int row = insertChip(board, player1Choice, 'x');
                printBoard(board);
                if(checkIfWinner(board, player1Choice, row, 'x')){
                    System.out.println("Player 1 won the game!");
                    return;
                }

            } else {
                System.out.print("Player 2: Which column would you like to choose? ");
                int player2Choice = input.nextInt();
                int row2 = insertChip(board, player2Choice, 'o');
                printBoard(board);
                if(checkIfWinner(board, player2Choice, row2, 'o')){
                    System.out.println("Player 2 won the game!");
                    return;
                }


            }

        }
        System.out.println("Draw. Nobody wins.");
    }

    public static void printBoard(char[][] array) {
        //exactly same as initialize board
        for (int row = array.length - 1; row >= 0; row--) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col]);
            }
            System.out.println();
        }
    }

    public static void initializeBoard(char[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = '-';
            }
        }
    }

    public static int insertChip(char[][] array, int col, char chipType){
        for (int i = 0; i < array.length; i++) {
            if (array[i][col] == '-') {
                array[i][col] = chipType;
                return i;
            }
            //start row 0 and itterate over how many rows there are and
        /*for (iterate over rows in specific columns){
            while (row[x] isnt filled)put x otherwise*/
            /*x++;*/
        }
        return -1;
    }
    public static boolean checkIfWinner(char[][] array, int col, int row, char chipType){
        /*check four in a row and for in a row in a row*/
        int straight = 0;
        int colWin = 0;
        int rowWin = 0;
        for(int i = 0; i < array[0].length; i++) {
            if(array[row][i] == chipType){
                colWin++;
                if(colWin == 4){
                    return true;
                }
            }
            else{
                colWin = 0;
            }
        }
        for(int j = 0; j < array.length; j++){
            if(array[j][col] == chipType){
                rowWin++;
                if(rowWin == 4){
                    return true;
                }
            }
            else{
                rowWin = 0;
            }
        }
        return false;
    }





}//end of method


//main method, two players, x's and o's
//for constant turns have for loop until height*length which is max turns

//       to print upside down: for(int i = rows; i >= 0; i--){
//         print normally
//         for (int j = 0; j < col; j++){
//             print[i][j]