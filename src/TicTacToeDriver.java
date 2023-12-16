import java.util.Scanner;
public class TicTacToeDriver
{
    public static void main(String[] args)
    {
        GameBoard ticTacToeBoard = new GameBoard();
        Scanner input = new Scanner(System.in);

        char currentPlayer = 'X';

        //TODO: Change loop control
        while(true)
        {
            ticTacToeBoard.printGameBoard();
            int position;

            System.out.println("Player: " + currentPlayer + "enter your placement (1-9): ");
            position = input.nextInt();

            int row = (position - 1) / 3;
            int col = (position - 1) % 3;

            // Check if the selected cell is empty before making a move
            if (ticTacToeBoard.getBoard()[row][col] == ' ')
            {
                ticTacToeBoard.setCell(row, col, currentPlayer);


                //TODO: Check for a win or a tie here

                // Switch to the other player for the next turn
                if (currentPlayer == 'X')
                {
                    currentPlayer = 'O';
                }
                else
                {
                    currentPlayer = 'X';
                }
            }
            else
            {
                System.out.println("Cell already occupied. Try again.");
            }
        }
    }
}