package ch01.sec01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("What's your name? ");
        String name = scanner.nextLine();
        System.out.printf("You entered: |%s|%n", name);
        System.out.printf("What's your age? ");
        int age = scanner.nextInt();
        System.out.printf("You entered: |%d|%n", age);
    }
}
