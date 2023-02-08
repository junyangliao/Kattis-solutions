import java.util.*;

public class Autori{
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.next();
        String[] result =name.split("-");
        for (int i =0;i < result.length;i++) {
            result[i] = result[i].substring(0,1);
        }
        String joined = String.join("",result);
    System.out.println(joined);
    }
}