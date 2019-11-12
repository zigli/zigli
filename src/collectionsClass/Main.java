package collectionsClass;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");
        colors.add("black");
        colors.add("blue");
        colors.add("green");

        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors.toString());
        Collections.sort(colors,Collections.reverseOrder());
        System.out.println(colors.toString());
        */


        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

        printCard(deckOfCards);

        Collections.shuffle(deckOfCards);

        System.out.println("=================");

        printCard(deckOfCards);

        Collections.sort(deckOfCards);

        System.out.println("=================");

        printCard(deckOfCards);

        //Collections.sort(deckOfCards, Collections.reverseOrder());

        System.out.println("=================");

        printCard(deckOfCards);

        Collections.sort(deckOfCards, new CardComparator());

        System.out.println("=================");

        printCard(deckOfCards);

        Card card = new Card(Card.Suit.CLUBS, Card.Face.Eight);

        int searchResult = Collections.binarySearch(deckOfCards, card);

        System.out.println("=================");

        System.out.println(searchResult);

        Collections.reverse(deckOfCards);

        System.out.println("=================");

        printCard(deckOfCards);

        System.out.println("==================");

        List<Card> cardList = new ArrayList<>(deckOfCards);
        Collections.fill(cardList,card);

        Collections.addAll(cardList,card,card,card);

        printCard(cardList);

        Collections.copy(cardList,deckOfCards);

        System.out.println("\n=================");

        printCard(cardList);

        System.out.println("\n=================");

        int frequency = Collections.frequency(cardList, card);

        System.out.println(frequency);

        System.out.println("MIN : " + Collections.min(cardList));
        System.out.println("MAX : " + Collections.max(cardList));


        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        Integer[] array = new Integer[2];
        Integer[] integers = list.toArray(array);
        System.out.println(Arrays.toString(integers));
        System.out.println(list.get(1));

        System.out.println("\n=================");
        List<String> values = new ArrayList<String>() {
            {
                add("one");
                add("two");
                add("three");
            }
        };
        System.out.print("values: ");
        for (String value : values) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
        List<String> values1 = new ArrayList<String>();
        values1.add("one");
        values1.add("two");
        values1.add("three");
        System.out.print("values1: ");
        for (String value : values1) {
            System.out.print(value + " ");
        }

        System.out.println("\n=================");

        V v1 = new V("abc");
        V v2 = new V("abc");

        System.out.println((v1 == v2) + " " + v1.equals(v2));

    }

    private static void printCard(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

}

class V {
    String s = null;
    V(String str){
        this.s = str;
    }

    @Override
    public boolean equals(Object obj) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        V v = (V) o;
//        return Objects.equals(s, v.s);
        return s.equals(((V)obj).s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
