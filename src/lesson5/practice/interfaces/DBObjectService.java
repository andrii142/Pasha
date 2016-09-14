package lesson5.practice.interfaces;

public class DBObjectService {

    Object save(Object object) {
        System.out.println(object.toString() + " saved");
        return object;
    }

    Object delete(Object object) {
        System.out.println(object.toString() + " deted");
        return object;
    }

    Object update(Object object) {
        System.out.println(object.toString() + " updated");
        return object;
    }
}
