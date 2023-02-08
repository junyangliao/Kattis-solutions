import java.util.*;
public class NumberFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        

        for (int i =0;i<counter;i++) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            if (a+b==c) {
                System.out.println("Possible");
            } else if (a-b== c) {
                System.out.println("Possible");
            } else if (b-a == c) {
                System.out.println("Possible");
            } else if (a*b == c) {
                System.out.println("Possible");
            } else if (a/b==c) {
                System.out.println("Possible");
            } else if (b/a==c) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
