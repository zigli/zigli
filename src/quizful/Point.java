package quizful;

public class Point {

    int getX() {
        return x;
    }

    int y = getX();
    int x = 3;

    public static void main (String s[]) {
        Point p = new Point();
        System.out.println(p.x + "," + p.y);
    }
}
