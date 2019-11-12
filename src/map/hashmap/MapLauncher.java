package map.hashmap;

import java.util.*;

public class MapLauncher {

    public static void main(String[] args) {
/*
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        System.out.println(numbers.get("Two"));

        System.out.println("======================================");

        Map<Car,Integer> carNumbers = new HashMap<>();
        carNumbers.put(new Car("Toyota", "Auris", 40),133);
        Car rav4 = new Car("Toyota", "RAV4", 40);
        carNumbers.put(rav4,231);
        carNumbers.put(new Car("Audi", "A5", 40),42);

        System.out.println(carNumbers.get(rav4));
        Set<Car> cars = carNumbers.keySet();

        System.out.println(cars);

        System.out.println("======================================");

        Map<String,Integer> cars1 = new HashMap<>();
        cars1.put("Toyota",40);
        cars1.put("Audi",29);
        System.out.println(cars1.put("Toyota", 37));
*/

        Map<String, Integer> wordMap = new HashMap<>();
//        System.out.println("Please enter some text");
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
        String string = "If it was dictated by this unlettered man (Peace be upon him), then it begs the question why didn’t Quran spend more time speaking about him. Why does the Quran spend the most time speaking about a man named Moses (as) that lived at least 2000 years before Muhammad (saw) (14–15th century Before Christ B.C) on a different continent, N.Africa? That is very strange. Why would Quran mention a man who lived 600 years before him, Jesus, more than himself? Why does Quran continuously debunk the idea that God has a son in multiple places? Why would Quran dedicate an entire chapter on the story of Joseph (Yusuf), who lived over 2600 years before him? Why does Quran mention Adam so many times, more than Muhammad (Saw). Why does Quran have complete love for Abraham and a chapter is named after him? Quran goes so far as to call this man Abraham an entire nation. The Quran should have praised Muhammad more, and called him an entire nation. Shouldn’t he spend time explaining his own ideology rather then telling stories of people that lived centuries even millennium before him? Obviously the one who wrote it is trying to tell us a pattern within the stories. A predictable pattern that humans play. History does repeat itself.";
        String[] tokens = string.split("\\s+");
        for(String token: tokens){
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);
            if(count == null){
                wordMap.put(word,1);
            }else{
                wordMap.put(word,count+1);
            }
        }

        NavigableSet<WordWrapper> wordSet = convertToSet(wordMap);

        //printMap(wordMap);
        //printMapSorted(wordMap);
        printMapWrappered(wordSet);

    }

    private static void printMapWrappered(NavigableSet<WordWrapper> wordSet) {
        for (WordWrapper wordWrapper: wordSet){
            System.out.println(wordWrapper);
        }
    }

    private static NavigableSet<WordWrapper> convertToSet(Map<String, Integer> wordMap) {
        System.out.println("Removed value is:"+wordMap.remove("the"));
        System.out.println("Removed value is:"+wordMap.remove("why", 7));
        NavigableSet<WordWrapper> wordset = new TreeSet<>(Collections.reverseOrder());
        for (Map.Entry<String,Integer> e: wordMap.entrySet()){
            wordset.add(new WordWrapper(e.getKey(),e.getValue()));
        }
        return wordset;
    }

    private static void printMap(Map<String, Integer> wordMap) {
        Set<String> keys = wordMap.keySet();
        for (String key: keys){
            System.out.printf("%-15s%-15s\n",key,wordMap.get(key));
        }
    }

    private static void printMapSorted(Map<String, Integer> wordMap) {
        Map<String,Integer> wordMapTree = new TreeMap<>(wordMap);
        Set<String> keys = wordMapTree.keySet();
        for (String key: keys){
            System.out.printf("%-15s%-15s\n",key,wordMap.get(key));
        }
    }


}
