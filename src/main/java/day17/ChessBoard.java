package day17;

public class ChessBoard {
    private ChessPiese[][] board;
    public ChessBoard(ChessPiese[][] board) {
        this.board = board;
    }

    public void print() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j].getStrImage());
            }
            System.out.println("");
        }
    }
}
