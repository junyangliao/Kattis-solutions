import java.util.*;

public class repeatLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int numLetters = name.length();
        String result = "";
        char first = name.charAt(0);
        result = result +first;

        for (int i=1;i<numLetters;i++) {
            char current = name.charAt(i);
            char previous = name.charAt(i-1);
            if (current==previous) {
                continue;
            } else {
                result = result + current;
            }
        }
        System.out.println(result);
    }
}
