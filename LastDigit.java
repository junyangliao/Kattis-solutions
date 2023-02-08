import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int counter;
        int factorial;
        int result = 1;

        counter = sc.nextInt();
        for (int i =0;i<counter;i++) {
            factorial = sc.nextInt();
            while (factorial>0) {
                result = result * factorial;
                factorial--;
            }
            System.out.println(result%10);
            result = 1;
        }
    }
}
