package lesson5.practice.interfaces;

public class DBCityService implements DBService {

    @Override
    public Object save(Object city) {
        System.out.println(city.toString() + " saved");
        return city;
    }

    @Override
    public Object delete(Object city) {
        System.out.println(city.toString() + " deleted");
        return city;
    }

    @Override
    public Object update(Object city) {
        System.out.println(city.toString() + " updated");
        return city;
    }
}
