import java.util.*;

public class ExactlyElectrical {
    public static void main(String[] args) {
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int charge = sc.nextInt();

        int totaldistance = Math.abs(a-c)+Math.abs(b-d);
        if (charge < totaldistance) { 
            result = false;
        } else {
            if(Math.abs(charge-totaldistance)%2==0) {
                result = true;
            }
        }
        if (result) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
