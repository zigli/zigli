package anonymous;

public class Mobile extends Computer{


    Phone instance = new Phone(){
        @Override
        void process() {
            super.process();
        }
    };

    void process(){
        System.out.println("Mobile");
    }
}
