import java.util.*;

class Card {
    public int cardNumber;
    public int buyPrice;
    public int sellPrice;
    public int counter;

    public Card (int cardNumber, int buyPrice, int sellPrice,int counter) {
        this.cardNumber=cardNumber;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.counter = counter;
    }
}

class CardComparator implements Comparator<Card> {
    public int compare(Card p1,Card p2) {
        int p1Cost = (2-p1.counter)*p1.buyPrice + p1.counter*p1.sellPrice;
        int p2Cost = (2-p2.counter)*p2.buyPrice + p2.counter*p2.sellPrice;

        if (p1Cost<p2Cost) {
            return -1;
        } else if (p1Cost>p2Cost) {
            return 1;
        } else {
            if ((2-p1.counter)*p1.buyPrice < (2-p2.counter)*p2.buyPrice) {
                return -1;
            } else if ((2-p1.counter)*p1.buyPrice > (2-p2.counter)*p2.buyPrice) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

public class CardTrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int K = sc.nextInt();
        long profit = 0;
        List<Card> cardarr = new ArrayList<Card>();
        int[] cardNums = new int[100000];
        for (int i =0;i<N;i++) {
            cardNums[sc.nextInt()]++;
        }
        for (int j=0;j<T;j++) {
            Card tmp = new Card(j+1,sc.nextInt(),sc.nextInt(),0);
            cardarr.add(tmp);
        }
        for (int k=0;k<T;k++) {
                cardarr.get(k).counter = cardNums[k+1];
        }
        Collections.sort(cardarr,new CardComparator());
        for (int i=0;i<K;i++) {
            Card nextCard = cardarr.get(i);
            profit -= (2-nextCard.counter)*nextCard.buyPrice;
        }
        for (int j=K;j<T;j++) {
            Card nextCard = cardarr.get(j);
            profit += nextCard.counter*nextCard.sellPrice;
        }
        System.out.println(profit);
    }
}