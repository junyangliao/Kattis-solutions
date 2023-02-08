import java.util.*;

public class TwoStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        if (number%2==0) {
            System.out.println("Bob");
        } else if (number%2==1) {
            System.out.println("Alice");
        }
    }
}
