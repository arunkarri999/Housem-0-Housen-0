
import java.util.*;

class Kattis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean err = false;
        double ans = 0, a,b, sum1=0, sum2=0;
        for(int i=0;i<n;++i) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum1 += (a*60);
            sum2 += b;
        }
        if(sum1 >= sum2) {
            System.out.print("measurement error");
        }
        else {
            sum1 = (double)Math.round(sum2/sum1 * 1000000000d) / 1000000000d;
            System.out.print(sum1);
        }
    }
}
