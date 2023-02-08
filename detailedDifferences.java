import java.util.*;

public class detailedDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        String result = "";

        for (int i =0;i<counter;i++) {
            String a = sc.next();
            System.out.println(a);
            String b = sc.next();
            System.out.println(b);
            int lengtha = a.length();
            for (int j=0;j<lengtha;j++) {
                if (a.charAt(j)==b.charAt(j)) {
                    result = result + ".";
                } else {
                    result = result + "*";
                }
            }
            System.out.println(result);
            result = "";
        }
        sc.close();
    }
}
