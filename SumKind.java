import java.util.*;

public class SumKind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        for (int i =0;i <P;i++) {
            int K = sc.nextInt();
            int N = sc.nextInt();
            int S1 = 0;
            int S2 =0;
            int S3 =0;
            for (int j =1;j<=N;j++) {
                S1 +=j;
            }
            for (int k=1;k<=2*N;k++) {
                if (k%2==0) {
                    S3 +=k;
                } else {
                    S2+=k;
                }
            }
            System.out.println(K + " " +S1 +" "+S2+" "+S3);
        }
    }    
}
