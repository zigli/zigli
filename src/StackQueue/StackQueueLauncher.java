package StackQueue;

import collectionsClass.Card;
import collectionsClass.CardComparator;

import java.util.*;

public class StackQueueLauncher {

    public static void main(String[] args) {
        //passengerProcessing();

/*
        // Честная очередь FIFO
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(4);
        q1.offer(5);
        q1.offer(23);
        q1.offer(1);

        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());

        // вывод отсортированный по возрастанию
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(4);
        q.offer(5);
        q.offer(23);
        q.offer(1);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
*/

        Queue<Card> cardDeck = new PriorityQueue<>(new CardComparator());
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cardDeck.offer(new Card(suit, face));
            }
        }

        for (int i = 0; i<10; i++) {
            System.out.println(cardDeck.poll());
        }

        System.out.println(cardDeck.size());
        System.out.println(cardDeck);

        Iterator<Card> cardIterator = cardDeck.iterator();
        while (cardIterator.hasNext()){
            System.out.println(cardIterator.next());
        }

        System.out.println(cardDeck.peek());
        System.out.println(cardDeck.peek());
        System.out.println(cardDeck.size());
        //cardDeck.clear();
        System.out.println(cardDeck.size());

        Deque<Card> cards = new ArrayDeque<>();
        for(int i =0 ; i< 10;i++){
            cards.addLast(cardDeck.poll());
        }

        Card card = new Card(Card.Suit.SPADES,Card.Face.Ten);
        System.out.println(cards.removeFirstOccurrence(card));

        for(int i =0 ; i< 10;i++){
            System.out.println(cards.pollLast());
        }



    }

    public static void passengerProcessing(){

        Stack<Passenger> bus = new Stack<>();

        Passenger passenger = new Passenger("Katerina", "Ivanova");

        bus.push(new Passenger("Alex", "Vasko"));
        bus.push(new Passenger("Viktor", "Mikhailov"));
        bus.push(new Passenger("Dmitrii", "Petrov"));
        bus.push(passenger);
        bus.push(new Passenger("Ivan", "Ivanov"));

        System.out.println("Last entered passenger is: " + bus.peek());

        System.out.println("Passenger found at position " + bus.search(passenger));

        System.out.println("======================");

        Iterator<Passenger> iterator = bus.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("======================");

        while (!bus.empty()){
            System.out.println(bus.pop());
        }

        //System.out.println(bus.peek());
        //System.out.println(bus.pop());


    }

    private static class Passenger {

        private static int number = 1;
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger " + name + " " + surname;
        }
    }

}


