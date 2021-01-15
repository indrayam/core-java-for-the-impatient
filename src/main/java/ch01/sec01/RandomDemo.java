package ch01.sec01;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int aRandomNumber = (int) (100 * random.nextDouble());
        System.out.printf("%d%n", aRandomNumber);
        int anotherRandomNumber = random.nextInt(10);
        System.out.printf("%d%n", anotherRandomNumber);
    }
}
