import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Problems.TicTacToe.model.PieceType;
import model.Board;
import model.Player;
import model.PlayingPieceO;
import model.PlayingPieceX;

public class TicTacToe {
    Deque<Player> players;
    Board gameBoard;

    TicTacToe() {
        initGame();
    }

    public void initGame() {
        players = new LinkedList<>();
        PlayingPieceX cPieceX = new PlayingPieceX();
        Player player1 = new Player("Player1", cPieceX);

        PlayingPieceO pieceO = new PlayingPieceO();
        Player player2 = new Player("Player2", pieceO);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);

    }

    public String startGame() {

        boolean noWinner = true;
        while (noWinner) {

            // take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();

            // get the free space from the board
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // read the user input
            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                // player can not insert the piece into this cell, player has to choose another
                // cell
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.name;
            }
        }

        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // need to check in row
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // need to check in column
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        // need to check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // need to check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
