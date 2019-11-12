package cf.tilgiz;

public class Bicycle {
    private String model;
    private int weight;

    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class SteeringWheel {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {

            System.out.println("Руль влево!");
        }
    }

    public class Seat {

        public void up() {

            System.out.println("сиденье поднято выше!");
        }

        public void down() {

            System.out.println("сиденье опущено ниже!");
        }

        public void getSeatParam(){
            System.out.println("Параметр сиденья: диаметр = " + seatPostDiameter);
            System.out.println("Параметр сиденья: диаметр = " + Bicycle.this.seatPostDiameter);
        }
    }
}
