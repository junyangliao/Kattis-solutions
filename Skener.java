import java.util.*;

public class Skener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int zr = sc.nextInt();
        int zc = sc.nextInt();
        sc.nextLine();

        for (int i =0;i<r;i++) {
            String result = "";
            String tmp = sc.nextLine();
            for (int j=0;j<tmp.length();j++) {
                for (int k=0;k<zc;k++) {
                    result += tmp.charAt(j);
                }
            }
            if (r != r*zr) {
                for (int l =0;l<zr;l++) {
                System.out.println(result);
                }
            } else {
                System.out.println(result);
            }
        }
    }
}
