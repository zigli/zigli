package generics;

class Myclass<T>{
    public T add(T a, T b){
        if(a.getClass().equals(Integer.class)){
            return (T) (Object) ((Integer) a + (Integer) b);
        }
        if(a.getClass().equals(Double.class)){
            return (T) (Object) ((Double) a + (Double) b);
        }

        return (T) (Object) 0;
    }

}

public class Main4 {
    public static void main(String[] args) {
        Myclass<Integer> mv = new Myclass<>();
        int sum = mv.add(2,1);
        System.out.println("sum = " + sum);

        Myclass<Double> mv1 = new Myclass<>();
        double sum1 = mv1.add(2.3,3.1);
        System.out.println("sum1 = " + sum1);

    }
}
