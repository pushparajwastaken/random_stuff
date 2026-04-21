package java.Recursion;

public class nqueens {
    public static void main(String[] args) {
    
    }
    static int queens(boolean[][]board,int row){
        if(row==board.length ){
            display(board)
            return 1;
        }
        int count=0;
        //placing the queen and checking for everu root and me
        for(int col=0;col<board.length;col++){
if(!isSafe(board,row)){
board[row,col]
}
        }                                      
        }
    }
    private static void display(boolean[][] board){
        for (boolean[] row:board){
            for(boolean element:row){
                if (element){
                    System.out.println("Q");
                }else{
                    System.out.println("X");
                }
            }
        }
        system.out.println()
    }
                        
