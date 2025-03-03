package gmail.taras.shevchuk0024.lesson11;

public class Main {
    public static void main(String[] args) {
        int dayNumber = 5;
        String day = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesdey";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
        System.out.println("Today is " + day);
    }
}

