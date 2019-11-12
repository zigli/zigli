package methodArgs;

public class Main {

    public static void main(String[] args) {
        double a = 0.56;
        double b = 1.52;
        double c = 2.24;
        double d = 4.65;
        double[] e = {0.56,1.52,2.24,4.65};

        System.out.println(calcAverage_DottetArgs(a,b));
        System.out.println(calcAverage_DottetArgs(a,b,c));
        System.out.println(calcAverage_DottetArgs(a,b,c,d));

        System.out.println(calcAverage(e));
    }

    private static double calcAverage_DottetArgs(double... args){
        double sum = 0;
        for (double t: args){
            sum = sum + t;
        }
        return sum/args.length;
    }

    private static double calcAverage(double[] args){
        double sum = 0;
        for (double t: args){
            sum = sum + t;
        }
        return sum/args.length;
    }

}
