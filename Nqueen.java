package BackTracking;

public class Nqueen {
    static  int N= 4;
    //create a board
     static boolean[][] board=new boolean[N][N];//by default all values are fales.....
     public static boolean issafe(int row,int col){
        //1.check for above row..
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        //2.check in Left Diagonal.....
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        //3.Check in Right Diagonal.....
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
     }
     public static int countqueens(int row){
        int count=0;
        //Termination case rows are exhausted...
        if(row==board.length){
            return 1;//only one posibility...
        }
        //travere by colms...
        for(int col=0;col<board.length;col++){
            if(issafe(row, col)){
                //so place a queen..
                board[row][col]=true;
                //Move to the next row...
                count+=countqueens(row+1);//Stack will build here..
                //now stack will fall..
                //stack fall+somework=backtracking.
                board[row][col]=false;//undo the queen.
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Ways of Queen place will be "+countqueens(0));
    }
}
