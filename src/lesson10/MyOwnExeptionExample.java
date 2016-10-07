package lesson10;

public class MyOwnExeptionExample {
    public static void main(String[] args) {
        try {
            checkString("test");
        } catch (Exception e) {
            System.err.println("bad string");
            //send error ticket to admin
        }
    }

    static void checkString(String string) throws Exception {
        if(string.equals("system"))
            System.out.println("happy");
        else throw new Exception("string is not equal system");
    }
}
