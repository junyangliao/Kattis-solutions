import java.util.*;

public class PeaSoup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean peaSoupFound;
        boolean pancakesFound;
        int counter = Integer.parseInt(sc.nextLine());

        for (int i =0;i<counter;i++) {
            peaSoupFound = false;
            pancakesFound = false;
            int numMenu = Integer.parseInt(sc.nextLine());
            String nameRes = sc.nextLine();
            for (int j=0;j<numMenu;j++) {
                String dish = sc.nextLine();
                if (dish.equals("pancakes")) {
                    pancakesFound=true;
                }
                if (dish.equals("pea soup")) {
                    peaSoupFound=true;
                }
            }
            if (peaSoupFound && pancakesFound) {
                System.out.println(nameRes);
                return;
            }
        }
        System.out.println("Anywhere is fine I guess");
    }
}