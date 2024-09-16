class Solution {
    public int rules(int current, int n){
        if(current == 1){
            if(n<2){
                return 0;
            }
            else if(n==2 || n==3){
                return 1;
            }
            else{
                return 0;
            }
        }
        else if(current == 0 && n==3){
            return 1;
        }
        return current;
    }
    public void gameOfLife(int[][] board) {
        int[][] new_board = new int[board.length][board[0].length];
        //1x1
        if(board.length == 1 && board[0].length == 1){
            new_board[0][0] = 0;
        }
        //1xn
        else if(board.length == 1 && board[0].length > 1){
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board[i].length; j++){
                    if(i==0 && j==0){
                        new_board[i][j] = rules(board[i][j], board[i][j+1]);
                    }
                    else if(i==0 && j==board[i].length-1){
                        new_board[i][j] = rules(board[i][j], board[i][j-1]);
                    }
                    else{
                        new_board[i][j] = rules(board[i][j], board[i][j-1] + board[i][j+1]);
                    }
                }
            }
        }
        //mx1
        else if(board.length > 1 && board[0].length == 1){
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board[i].length; j++){
                    if(i==0 && j==0){
                        new_board[i][j] = rules(board[i][j], board[i+1][j]);
                    }
                    else if(i==board.length-1 && j==0){
                        new_board[i][j] = rules(board[i][j], board[i-1][j]);
                    }
                    else{
                        new_board[i][j] = rules(board[i][j], board[i-1][j] + board[i+1][j]);
                    }
                }
            }
        }
        //2x2: m,n >=2
        else
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                int ones = 0;
                //corner conditions
                //top-left
                if(i==0 && j==0){
                    ones = board[i][j+1] + board[i+1][j+1] + board[i+1][j];
                }
                //top-right
                else if(i==0 && j==(board[0].length-1))
                {
                   ones = board[i][j-1] + board[i+1][j-1] + board[i+1][j];
                }
                //bottom-left
                else if(i==board.length-1 && j==0){
                    ones = board[i-1][j] + board[i][j+1] + board[i-1][j+1];
                }
                //bottom-right
                else if(i==board.length-1 && j==board[0].length-1){
                    ones = board[i][j-1] + board[i-1][j-1] + board[i-1][j];
                }
                //edging
                else if(i==0){
                    ones = board[i][j-1] + board[i][j+1] + board[i+1][j-1] + board[i+1][j] + board[i+1][j+1];
                }
                else if(i==board.length-1){
                    ones = board[i][j-1] + board[i][j+1] + board[i-1][j-1] + board[i-1][j] + board[i-1][j+1];
                }
                else if(j==0){
                    ones = board[i-1][j] + board[i+1][j] + board[i-1][j+1] + board[i][j+1] + board[i+1][j+1];
                }
                else if(j==board[0].length-1){
                    ones = board[i-1][j] + board[i+1][j] + board[i-1][j-1] + board[i][j-1] + board[i+1][j-1];
                }
                //rest
                else{
                    ones = board[i][j-1] + board[i][j+1] + board[i-1][j-1] + board[i-1][j] + board[i-1][j+1] + board[i+1][j-1] + board[i+1][j] + board[i+1][j+1];
                }
                new_board[i][j] = rules(board[i][j], ones);
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = new_board[i][j];
            }
        }
    }
}