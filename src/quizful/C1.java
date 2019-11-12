package quizful;

class AA { }
class BB extends AA { }
class C1 extends BB {
  public static void main(String[] args) {
              AA obj1 = new AA();
              C1 obj2 = new C1();
                obj1 = (BB) obj2;
              C1 obj3 = (C1)obj1;
           }
 }
