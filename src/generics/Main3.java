package generics;

abstract class Shape{
}

class Circle extends Shape{
}

interface IContainer<T>{
    T getFigure();
    void setFigure(T figure);
}

class Container1<T> implements IContainer<T>{
    private T figure;
    public Container1(T figure) {
        this.figure = figure;
    }
    @Override
    public T getFigure() {
        return figure;
    }
    @Override
    public void setFigure(T figure) {
        this.figure = figure;
    }
}

public class Main3 {

    public static void main(String[] args) {
        Circle circle = new Circle();

        IContainer<Circle> container1 = new Container1<>(circle);
        Container1<Circle> container2 = new Container1<>(circle);
        IContainer<Shape> container3 = new Container1<>(circle);
        Container1<Shape> container4 = new Container1<>(circle);

        System.out.println(container1.getFigure().toString());
        System.out.println(container2.getFigure());
        System.out.println(container3.getFigure());
        System.out.println(container4.getFigure());
    }



}
