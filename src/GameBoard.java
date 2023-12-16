public class GameBoard
{
    private char[][] board;

    public GameBoard()
    {
        board = new char[3][3];
        initializeBoard();
    }

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
}
