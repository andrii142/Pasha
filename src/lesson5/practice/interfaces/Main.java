package lesson5.practice.interfaces;

public class Main {
    int globarVariable;

    public static void main(String[] args) {
        //object example
        City city1 = new City(1001, "Krakow");
        City city2 = new City(1002, "Kiev");
        City city3 = new City(1003, "Kharkov");

        City[] cities = {city1, city2, city3};

        System.out.println(city1.toString());

        //interface usage example
        DBService dbService = new DBUserService();


        saveArrayToDB(cities, new DBUserService());
    }

    static void saveArrayToDB(Object[] objects, DBService dbService) {

        //for(int i =0)
        for(Object object : objects) {
            dbService.save(object);
        }
    }
}
