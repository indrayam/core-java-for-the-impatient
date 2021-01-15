package ch01.sec01;

enum Weekday {
    SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tues"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");

    private String shortName;

    Weekday(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    boolean isWeekday() {
        boolean isTrue = false;
        switch (this) {
            case MONDAY:
                isTrue = true;
                break;
            case TUESDAY:
                isTrue = true;
                break;
            case WEDNESDAY:
                isTrue = true;
                break;
            case THURSDAY:
                isTrue = true;
                break;
            case FRIDAY:
                isTrue = true;
                break;
            case SATURDAY:
                isTrue = false;
                break;
            case SUNDAY:
                isTrue = false;
                break;
        }
        return isTrue;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Weekday anyDay = Weekday.SATURDAY;
        System.out.printf("Is %s a weekday? %b%n", anyDay.getShortName(), anyDay.isWeekday());
        for (Weekday day : Weekday.values()) {
            System.out.printf("%d. %s(%s)%n", day.ordinal(), day, day.getShortName());
        }
    }
}
