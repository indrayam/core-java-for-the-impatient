package ch01.sec01;

public class StringsDemo {
    public static void main(String[] args) {
        // String java = "Java\u263A\uFE0F";
        String java = "Java\uD83D\uDC96";
        System.out.printf("%s%n", java);
        System.out.printf("java length (number of code units used) = %d%n", java.length());
        System.out.printf("java length (number of code points) = %d%n", java.codePointCount(0, java.length()));
        int cp;
        for (int i = 0; i < java.length(); i++) {
            char ch = java.charAt(i);
            cp = java.codePointAt(i);
            System.out.printf("%c | 0x%x%n", ch, cp);
            if (Character.isSupplementaryCodePoint(cp)) {
                System.out.printf("Supplementary Code Point: YES | Value: %c%n", cp);
                for (char c : Character.toChars(cp)) {
                    if (Character.isHighSurrogate(c)) {
                        System.out.printf("Yes, 0x%x (%c) is High Surrogate%n", (int) c, c);
                    } else if (Character.isLowSurrogate(c)) {
                        System.out.printf("Yes, 0x%x (%c) is Low Surrogate%n", (int) c, c);
                    }
                }
            } else if (Character.isBmpCodePoint(cp)) {
                System.out.printf("BMP Code Point: YES | Value: %c%n", cp);
            } else {
                System.out.printf("Whatever...");
            }
        }

    }
}
