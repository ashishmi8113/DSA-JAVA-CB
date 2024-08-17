public class LC_875_CocoEatBanana {
    public static boolean check(int speed, int h, int[] piles) {
        
        // for (int pile : piles) {
        //     totalHours += (pile + speed - 1) / speed; 
        //     if (totalHours > h) {
        //         return false;
        //     }
        // }
        // return totalHours <= h;
        int tt=0;
        for (int i = 0; i < piles.length; i++) {
            if(piles[i]%speed==0){
                tt+=piles[i]/speed;
            }
            else{
                tt+=piles[i]/speed+1;
            }
        }
        return (tt<=h);

    }

    public static int minEatingSpeed(int[] piles, int h) {
        int lowSpeed = 0;
        int highSpeed = 11;
        int optimalAns = highSpeed;
        while (lowSpeed <= highSpeed) {
            int midSpeed = (highSpeed + lowSpeed)/2;
            System.out.println(check(midSpeed, h, piles));
            if (check(midSpeed, h, piles)) {
                optimalAns = midSpeed;
                highSpeed = midSpeed - 1;
            } else {
                lowSpeed = midSpeed + 1;
            }
        }
        return optimalAns;
    }
    public static void main(String[] args) {
        // int[] arr={332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        // int[] arr={30,11,23,4,20};
        int[] arr={3,5,7,11};
        System.out.println(minEatingSpeed(arr,8));
    }
}
