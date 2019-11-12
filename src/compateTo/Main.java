package compateTo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        User user = new User("Андрей", 19, "andryha@mail.ru");
        User user2 = new User("Олег", 25, "oleg@mail.ru");
        User user3 = new User("Андрей", 24,"opr@google.com");
        User user4 = new User("Игорь", 16, "igor@mail.ru");
        User user5 = new User("Андрей", 44,"stary@google.com");


        NavigableSet<User> navigableSet = new TreeSet<>();
        navigableSet.add(user);
        navigableSet.add(user2);
        navigableSet.add(user3);
        navigableSet.add(user4);
        navigableSet.add(user5);

        for (User u: navigableSet){
            System.out.println(u);
        }

        System.out.println("=========================");

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        Iterator iterator = userList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collections.sort(userList);

        System.out.println("=========================");

        for (User u: userList){
            System.out.println(u);
        }


    }

}
