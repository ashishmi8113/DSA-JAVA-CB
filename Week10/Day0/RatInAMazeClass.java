package Week10.Day0;

public class RatInAMazeClass {
    static int[][] isVisited=new int[4][4];
    public static void ratInMaze(int[][] actualPAth, int i, int j, String ans){
        if(i==actualPAth.length-1 && j==actualPAth[0].length-1){
            System.out.print(ans+" ");
            return;
        }
        if(i>=0 && i<actualPAth.length && j>=0 && j<actualPAth[0].length && actualPAth[i][j]!=0 && isVisited[i][j]==0){
            isVisited[i][j]=1;
            ratInMaze(actualPAth, i+1, j, ans+"D");
            ratInMaze(actualPAth, i, j-1, ans+"L");
            ratInMaze(actualPAth, i, j+1, ans+"R");
            ratInMaze(actualPAth, i-1, j, ans+"U");
            isVisited[i][j]=0;
        }
    }
    
    public static void main(String[] args) {
        int[][] actualPAth={{1,0,0,0},
                            {1,1,0,1},
                            {1,1,1,1},
                            {1,1,1,1}};
        ratInMaze(actualPAth, 0, 0, "");
    }
}
