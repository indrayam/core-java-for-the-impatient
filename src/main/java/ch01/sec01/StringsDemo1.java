package ch01.sec01;

public class StringsDemo1 {
    public static void main(String[] args) {
        // Concatenation
        String greeting = "Hello, " + "World!";
        System.out.printf("greeting: %s%n", greeting);

        // Using join
        String firstNames = String.join(", ", "Anand", "Shannon", "Emma", "Zachariah");
        System.out.printf("Join approach: %s%n", firstNames);

        // Using the Builder
        String names[] = {"Anand", "Shannon", "Emma", "Zachariah"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            sb.append(names[i] + ", ");
        }
        System.out.printf("StringBuilder approach: %s%n", sb.toString());

        // Splitting String
        String names1 = "Anand,      Shannon, Emma, Zachariah";
        String firstNames1[] = names1.split(",\\s+");
        System.out.printf("Splitting String approach: ");
        for (String s : firstNames1) {
            System.out.printf("%s, ", s);
        }
        System.out.println();

        greeting = "Hello, World!";
        String subsetString = greeting.substring(7, 11);
        String location = greeting.substring(greeting.indexOf('W'), greeting.indexOf('!'));
        System.out.printf("subsetString: %s%n", subsetString);
        System.out.printf("location: %s%n", location);

        // String comparison
        if (subsetString.equals(location)) {
            System.out.printf("%s and %s are the same string!%n", subsetString, location);
        } else {
            System.out.printf("%s and %s are NOT the same string!%n", subsetString, location);
        }

        // Checking if the literal strings have the same memory location
        if (greeting == "Hello, World!") {
            System.out.printf("greeting and \"%s\" literal strings are using the same memory location%n", greeting);
        } else {
            System.out.printf("greeting and \"%s\" literal strings are NOT using the same memory location%n", greeting);
        }
    }
}
