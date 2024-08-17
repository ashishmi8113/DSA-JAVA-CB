
public class SearchSpace {
    public static boolean check(int speed,int dist, int time){
        // if(speed>=dist/time){
        //     return true;
        // }
        // return false;

        // //                              O  R

        return (speed>=dist/time);
    }
    public static void main(String[] args) {
        int lowSpeed=0;
        int highSpeed=200;
        int distance=1000;
        int time=2;
        int optimalAns=-1;
        while(lowSpeed<=highSpeed){
            int midSpeed=highSpeed-(highSpeed-lowSpeed)/2;
            if(check(midSpeed,distance,time)){
                optimalAns=midSpeed;
                highSpeed=midSpeed-1;
            }
            else{
                lowSpeed=midSpeed+1;
            }
        }
        System.out.println(optimalAns);
    }
}
