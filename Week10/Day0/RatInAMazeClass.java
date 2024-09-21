package Week10.Day0;

public class RatInAMazeClass {
    static int[][] isVisited=new int[4][4];
    public static void rateInMaze(int[][] actualPAth, int i, int j, String ans){
        if(i==actualPAth.length-1 && j==actualPAth[0].length-1){
            System.out.print(ans+" ");
            return;
        }
        if(i>=0 && i<actualPAth.length && j>=0 && j<actualPAth[0].length && actualPAth[i][j]!=0 && isVisited[i][j]==0){
            isVisited[i][j]=1;
            rateInMaze(actualPAth, i+1, j, ans+"D");
            rateInMaze(actualPAth, i, j-1, ans+"L");
            rateInMaze(actualPAth, i, j+1, ans+"R");
            rateInMaze(actualPAth, i-1, j, ans+"U");
            isVisited[i][j]=0;
        }
    }
    
    public static void main(String[] args) {
        int[][] actualPAth={{1,0,0,0},
                            {1,1,0,1},
                            {1,1,1,1},
                            {1,1,1,1}};
        rateInMaze(actualPAth, 0, 0, "");
    }
}
