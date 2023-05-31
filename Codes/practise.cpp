#include <iostream>
using namespace std;
#define n 8

bool issafe(int board[n][n], int row, int col)
{
    int i, j;

    for (i = 0; i < col; i++)
    {
        if (board[row][i])
            return false;
    }
    for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
    {
        if (board[i][j])
            return false;
    }
    for (i = row, j = col; i < n && j >= 0; i++, j--)
    {
        if (board[i][j])
            return false;
    }
    return true;
}

bool backtrackqueen(int board[n][n], int col)
{

    if (col >= n)
    {
        return true;
    }

    for (int row = 0; row < n; row++)
    {
        if (issafe(board, row, col))
        {
            board[row][col] = 1;

            if (backtrackqueen(board, col + 1))
            {
                return true;
            }
            board[row][col] = 0;
        }
    }
    return false;
}

int main()
{

    int board[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            board[i][j] = 0;
        }
    }

    if (backtrackqueen(board, 0) == false)
    {
        cout << "solution doesnt exist";
        return 0;
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << board[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}