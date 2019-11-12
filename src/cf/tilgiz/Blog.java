package cf.tilgiz;

public class Blog {
    String name;
    int popularity;

    // parameterized constructor
    public Blog(String name, int popularity) {
        this.name = name;
        this.popularity = popularity;
    }

    // Copy-Constructor
    public Blog(Blog b) {
        this.popularity = b.popularity;
        this.name = b.name;
    }

    public void display() {
        System.out.println("name: " + this.name);
        System.out.println("popularity: " + this.popularity + " %");
    }

    public static void main(String[] args) {
        // parameterized constructor call
        Blog obj1 = new Blog("JournalDev", 100);
        obj1.display();
        // Copy-Constructor call
        Blog obj2 = new Blog(obj1);
        obj2.display();

    }

}
