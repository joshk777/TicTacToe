public class GameBoard
{
    private char[][] board;

    /**
     * Construct a new game board
     */
    public GameBoard()
    {
        board = new char[3][3];
        initializeBoard();
    }

    /**
     * Initialize a blank playing board
     */
    public void initializeBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = ' ';
            }
        }
    }

    /**
     * Get the current state of the board
     *
     * @return The game board array
     */
    public char[][] getBoard()
    {
        return board;
    }

    /**
     * Sets a value to a specific cell of the board
     *
     * @param row The row index
     * @param col The column index
     * @param value The value to sets
     */
    public void setCell(int row, int col, char value)
    {
        board[row][col] = value;
    }

    /**
     * Print the state of the game board
     */
    public void printGameBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j]);

                if (j < 2)
                {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2)
            {
                System.out.println("---------");
            }
        }
    }

    public boolean checkWin()
    {
        //TODO: Implement this method
        return false;
    }

    public boolean checkRowWin()
    {
        //TODO: Implement this method
        return false;
    }

    public boolean checkColumnWin()
    {
        //TODO: Implement this method
        return false;
    }

    public boolean checkDiagonalWin()
    {
        //TODO: Implement this method
        return false;
    }

    public boolean checkTie()
    {
        //TODO: Implement this method
        return false;
    }

    public boolean checkRowCol()
    {
        //TODO: Implement this method
        return false;
    }
}
