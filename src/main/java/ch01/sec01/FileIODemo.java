package ch01.sec01;

import lombok.SneakyThrows;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIODemo {
    @SneakyThrows
    public static void main(String[] args) {
        String filename = "src/main/resources/test1.txt";
        Path filepath = Path.of(filename);
        PrintWriter pw = new PrintWriter(Files.newOutputStream(filepath), true, StandardCharsets.UTF_8);
        pw.printf("Name: %s%n", "Anand Sharma");
        pw.printf("Name: %s%n", "Shannon R. Sharma");
        pw.printf("Name: %s%n", "Emma R. Sharma");
        pw.printf("Name: %s%n", "Zachariah K. Sharma");
        pw.close();
        Scanner scanner = new Scanner(Files.newInputStream(filepath), StandardCharsets.UTF_8);
        while (scanner.hasNextLine()) {
            System.out.printf("%s%n", scanner.nextLine());
        }
    }
}
