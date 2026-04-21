public class Sudoku {
    public static void main(String[] args) {
        char[][]board=[["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]];
        solveSudoku(board);
    }
     public static boolean solveSudoku(char[][] board) {
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=="."){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
}
        }
                //if you found some empty element in row,then break
                if(emptyLeft==false){
                    break;
                }
                }
                if(emptyLeft){
                    return true;
                }

                //backtrack
                for(int i=1;i<=9;i++){
                    if(isSafe(board, col, row, (char)(i))){
                        board[row][col]=i;
                    }
                    if(solveSudoku(board)){
                        return true;
                    }else{
                        board[row][col]=".";
                    }
                }
return false;
    }

 static boolean isSafe(char[][] board,int col,int row,char num){
    //check the row
    for(int i=0;i<board.length;i++){
        //check if the number is in row or not
        if(board[row][col]==num)return false;
    }
 //check the column
    for(int i=0;i<board.length;i++){
        //check if the number is in row or not
        if(board[row][col]==num)return false;
    }
int sqrt=(int)(Math.sqrt(board.length));
int start=row-row%sqrt;
int end=col-col%sqrt;
for(int r=start;r<start+sqrt;r++){
    for(int c=end;c<end+sqrt;c++){
        if(board[r][c]==num)return false;
    }
}
return true;
 }
}
