import java.util.*;
import java.util.Comparator;

class Runner {
    public String runnerName;
    public Double firstTiming;
    public Double secondTiming;

    public Runner (String runnerName, double firstTiming, double secondTiming) {
        this.runnerName = runnerName;
        this.firstTiming = firstTiming;
        this.secondTiming = secondTiming;
    }

    public Double getsecondTiming() {return secondTiming;}
}

public class BestRelay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Runner> runnerarr = new ArrayList<Runner>();
        int numcase = Integer.parseInt(sc.nextLine());
        double trialTiming = 0;
        double finalTiming = 500000;
        List<Integer> finalTeam = new ArrayList<Integer>();
        
        for(int i =0;i<numcase;i++) {
            Runner tmp = new Runner(sc.next(),sc.nextDouble(),sc.nextDouble());
            runnerarr.add(tmp);
        }
        Collections.sort(runnerarr,Comparator.comparing(Runner::getsecondTiming));
        for (int j =0; j<numcase;j++) {
            ArrayList trialTeam = new ArrayList();
            trialTiming = runnerarr.get(j).firstTiming;
            trialTeam.add(j);
            int counter =0;

            for (int k =0;k<numcase;k++) {
                if (k!=j) {
                    trialTeam.add(k);
                    counter++;
                    trialTiming +=runnerarr.get(k).secondTiming;
                }

                if (counter ==3) break;

            }

            if (trialTiming < finalTiming) {
                finalTeam=trialTeam;
                finalTiming = trialTiming;
            }
        }
        System.out.println(finalTiming);
        System.out.println(runnerarr.get(finalTeam.get(0)).runnerName);
        System.out.println(runnerarr.get(finalTeam.get(1)).runnerName);
        System.out.println(runnerarr.get(finalTeam.get(2)).runnerName);
        System.out.println(runnerarr.get(finalTeam.get(3)).runnerName);
        sc.close();
    }
}
