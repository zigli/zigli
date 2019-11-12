package exeptions;

class MyException extends Exception{
    String str;

    MyException(String str){
        super(str);
        this.str=str;

    }

    public void myError(){
        System.out.println(str);
    }
}

public class Main {

    public static void main(String[] args) {

        char[] copyFrom = {'a','j','a','v','a'};
        char[] copyTo = new char[2];

        System.arraycopy(copyFrom,1,copyTo,0,2);
        System.out.println(new String(copyTo));


        //MyException ex = new MyException("ERROR");
        try {
            throw new MyException("ERROR");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            //e.myError();
        }finally {
            System.out.println("Final");
        }
        System.out.println("44");
    }
}
