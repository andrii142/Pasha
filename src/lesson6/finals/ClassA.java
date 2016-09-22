package lesson6.finals;

public class ClassA {
    String item;

    final void test() {
        System.out.println(item);
    }

    void test1() {
        item = "PPPP";
    }


}
