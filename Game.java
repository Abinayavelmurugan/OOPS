import java.util.Scanner;


class Game{
    public static void main(String[] args){
        char[][] board=new char[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
        Scanner s=new Scanner(System.in);
        char playerMove='X';
        boolean game=false;
        while(!game){
             printBoard(board);
             int row=s.nextInt();
             int col=s.nextInt();
             if(board[row][col]==' '){
                board[row][col]=playerMove;
                game=havewon(board,playerMove);
                if(game){
                    System.out.println("Player " + playerMove +" has won");
                }
                else{
                    playerMove=(playerMove=='X') ? 'O' : 'X'; 
                }
             }
             else{
                System.out.println("Invalid move");
             }
        }
        printBoard(board);

            



    }
    public static  void  printBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print(board[i][j]+" | ");
        }
        System.out.println();
    }

}
public static boolean havewon(char[][] board, char player){
    for(int i=0;i<3;i++){
        if (board[i][0]==player && board[i][1]==player && board[i][2]==player) 
        return true;
    }
    for(int i=0;i<3;i++){
        if (board[0][i]==player && board[1][i]==player && board[2][0]==player) 
        return true;
    }
    if(board[0][0]==player && board[1][1]==player && board[2][2]==player) return true;
    if(board[0][2]==player && board[1][1]==player && board[2][0]==player) return true;
    return false;

}
}