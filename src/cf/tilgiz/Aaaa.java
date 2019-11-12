package cf.tilgiz;

public class Aaaa {
    private Double x = 2.0;
    public static void multX(Aaaa a, Double n) {
        a.setX(a.getX()*n);
    }
    public Double getX() { return x; }
    public void setX(Double xn) { x = xn; }
    public static void trippleValue(Double x) {
        x*=3;
    }
    public static Aaaa resetX(Aaaa a) {
        a = new Aaaa();
        return a;
    }
    public static void main(String[] args) {
        Double x = 4.0;
        trippleValue(x);
        Aaaa anA = new Aaaa();
        multX(anA,x);
        resetX(anA);
        System.out.print(anA.getX());
    }
}
