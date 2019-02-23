public class KnightBoard {
    private int rows;
    private int cols;
    private int num;
    private int [][] data;
    public KnightBoard (int startingRows,int startingCols){
        rows = startingRows;
        cols = startingCols;
        data = new int [rows] [cols];
        // System.out.println(startingRows);
    }
//Initialize the board to the correct size and make them all 0's


public String toString(){
    String display = "";
    // System.out.println(data.length);
    for (int r = 0; r < data.length; r ++){
        // System.out.println("ppodle");
        for (int c = 0; c < data [0].length; c ++){
            // System.out.println("hello??");
                if (data [r] [c] == 0){
                    display = display + " " + "__";
                }
                else display = display + " " + "xx";
            }
            // System.out.println("life");
            display = display + "\n";
    }
    return display;
  }

// see format for toString below
// blank boards display 0's as underscores
// you get a blank board if you never called solve or
// when there is no solution
//
// @throws IllegalStateException when the board contains non-zero values.
// @throws IllegalArgumentException when either parameter is negative
//  or out of bounds.
public boolean solve(int startingRow, int startingCol){
    return solver(startingRow,startingCol, 0);
}
private boolean solver( int r, int c, int n){
    if (r < 0 || r > rows - 1 || c < 0 || c > cols - 1){
        return false;
    }
    // if prevr and prevc are equal to one of the options, make it false
    // if the number of moves equals the area, then we are done and return true
    if (n == rows * cols){
        num ++;
        return true;
    }
    data[r][c] = n + 1;
    //   __ __
    //  |
    //  x
    // once the knight moves, its other options are pu ton hold whil it finishes
    return solver (r + 1, c + 2, n+1) ||
    solver(r + 1,c - 2, n+1) ||
    solver(r + 2,c + 1, n+1) ||
    solver(r + 2,c - 1, n+1) ||
    solver(r - 1,c + 2, n+1) ||
    solver(r - 1,c - 2, n+1) ||
    solver(r - 2,c + 1, n+1) ||
    solver(r - 2,c - 1, n+1);

     //   __ __
     //        |
     //        x

    //   __
    //  |
    //  |
    //  x

      //  __
      //    |
      //    |
      //    x

    //  x
    //  |
    //   __ __

      //        x
      //        |
      //   __ __

    //  x
    //  |
    //  |
    //   __

      //     x
      //     |
      //     |
      //   __
  }
public boolean checker(){
    for (int r = 0; r < rows; r ++){
        for (int c = 0; c < cols; c ++){
            if (data [r] [c]== 1){
                ;
            }
            else return false;
        }
    }
    return true;
}


// @throws IllegalStateException when the board contains non-zero values.
// @throws IllegalArgumentException when either parameter is negative
//  or out of bounds.
public int countSolutions(int startingRow, int startingCol){
    solve(startingRow, startingCol);
    return num;
}
}
