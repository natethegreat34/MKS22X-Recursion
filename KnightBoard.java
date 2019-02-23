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
    return solver(startingRow,startingCol, -1, -1, 0);
}
private boolean solver( int r, int c, int prevr, int prevc, int n){
    // if prevr and prevc are equal to one of the options, make it false
    // if the number of moves equals the area, then we are done and return true
    if (n == rows * cols){
        num ++;
    }
    data[r][c] = n + 1;
    //   __ __
    //  |
    //  x
    // once the knight moves, its other options are pu ton hold whil it finishes
    if (r + 1 < rows ){
      if (c + 2 < cols){
          if (r + 1 != prevr || c + 2 != prevc){
          if (!(data[r + 1] [c +2]== 1)){
              return solver (r + 1, c + 2,r,c, n+1);
          }
      }
  }
     //   __ __
     //        |
     //        x
      if (c - 2  >= 0){
          if (!(data[r + 1] [c - 2]== 1)){
              return solver (r + 1, c - 2,r,c, n+1);
          }
      }
    }
    //   __
    //  |
    //  |
    //  x
    if (r + 2 < rows){
      if (c + 1 < cols){
          if (!(data[r + 2] [c +1]== 1)){
       return solver(r + 2,c + 1,r,c,n+1);
      }
    }
      //  __
      //    |
      //    |
      //    x
      if (c - 1  >= 0){
          if (!(data[r + 1] [c - 1]== 1)){
       return solver(r + 2,c - 1,r,c,n+1);
        }
        }
    }
    //  x
    //  |
    //   __ __
    if (r - 1 >= 0){
      if (c + 2 < cols){
          if (!(data[r - 1] [c + 2]== 1)){
       return solver(r - 1,c + 2,r,c,n+1);
      }
  }
      //        x
      //        |
      //   __ __
      if (c - 2  >= 0){
          if (!(data[r - 1] [c - 2]== 1)){
       return solver(r - 1,c - 2,r,c,n+1);
      }
    }
}
    //  x
    //  |
    //  |
    //   __
    if (r - 2 >= 0){
      if (c + 1 < cols){
          if (!(data[r - 2] [c + 1]== 1)){
              return solver(r - 2,c + 1,r,c,n+1);
      }
  }
      //     x
      //     |
      //     |
      //   __
      if (c - 1  >= 0){
          if (!(data[r + 1] [c - 1]== 1)){
      return solver(r - 2,c - 1,r,c, n+1);
      }
    }
    }
    data[r][c] = 0 ;
    return solver(prevr, prevc, r,c, n - 1);
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
