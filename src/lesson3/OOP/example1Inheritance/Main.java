package lesson3.OOP.example1Inheritance;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        System.out.println(bird.legsCount);
        bird.sing();

        Cat cat = new Cat();
        cat.miau();

        Parrot parrot = new Parrot();
    }
}
