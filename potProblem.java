import java.util.*;

public class potProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        int result = 0;
        for (int i=0;i<counter;i++) {
            int a = sc.nextInt();
            int power = a%10;
            int number = a/10;
            int combined = (int) Math.pow(number,power);
            result = result+combined;
        }
        System.out.println(result);
    }
}
