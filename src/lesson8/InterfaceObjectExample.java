package lesson8;

public class InterfaceObjectExample {

    public static void main(String[] args) {

        //TestInterface testInterface1 = new TestInterfaceImpl();

        TestInterface testInterface = new TestInterface() {
            @Override
            public String test(String s) {
                return null;
            }
        };


    }
}
