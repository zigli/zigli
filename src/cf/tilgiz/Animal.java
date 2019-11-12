package cf.tilgiz;

public class Animal {
    private int weight;
    private String brade;

    public Animal(int weight, String brade) {
        this.weight = weight;
        this.brade = brade;
    }

    public Animal(){

    }

    public int getWeight() {
        return weight;
    }

    public String getBrade() {
        return brade;
    }
}
