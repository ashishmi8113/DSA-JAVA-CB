package Week10.Day1;

import java.util.Scanner;

public class SodokuSolverClass {
    public static boolean check(int[][] b,int i,int j, int size, int num){
        for(int x=0;x<size;x++)
            if(b[x][j]==num|| b[i][x]==num)
                return false;
        int rn= (int)Math.sqrt(size);
        int sx= (i/rn)*rn;
        int sy= (j/rn)*rn;
        for(int x=sx;x<sx+rn;x++)
            for(int y=sy;y<sy+rn;y++)
                if(b[x][y]==num)
                    return false;
        return true;
    }
    static boolean sudokuSolver(int[][] mat, int i,int j, int n){
        if(i==n) return true; //found ans
        if(j==n) return sudokuSolver(mat, i+1, 0, n);//out of bound
        if(mat[i][j]!=0) return sudokuSolver(mat, i, j+1, n);// prefilled

        for(int num=1;num<=9;num++){
            if(check(mat, i, j, n, num)){
                mat[i][j]=num;
                if(sudokuSolver(mat, i, j+1, n))
                    return true;
            }
        }
        mat[i][j]=0;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=9;
        int[][] mat={{5,3,0,0,7,0,0,0,0},
                    {6,0,0,1,9,5,0,0,0},
                    {0,9,8,0,0,0,0,6,0},
                    {8,0,0,0,6,0,0,0,3},
                    {4,0,0,8,0,3,0,0,1},
                    {7,0,0,0,2,0,0,0,6},
                    {0,6,0,0,0,0,2,8,0},
                    {0,0,0,4,1,9,0,0,5},
                    {0,0,0,0,8,0,0,7,9}};

        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[0].length; j++) {
        //         mat[i][j]=sc.nextInt();
        //     }
        // }

        sudokuSolver(mat,0,0,n);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] +" ");   
            }
            System.out.println();
        }
        sc.close();
    }
}
