public class Board {

    private Tile[][] board;
    private MessageHandler m;

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                sb.append(board[i][j].toString());
            }
        }
        return sb.toString();
    }

    public void printBoard(){
        m.sendMessage(board.toString());
    }
}
