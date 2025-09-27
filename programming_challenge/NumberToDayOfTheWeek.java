package programming_challenge;

import java.util.Map;
import java.util.Scanner;

public class NumberToDayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int monthNumber = scanner.nextInt();

        Day day = new Day(monthNumber);
        System.out.println(day.toString());

        scanner.close();
    }
}

class Day {

    String name;

    Map<Integer, String> daysOfTheWeek = Map.of(
        1, "Monday",
        2, "Tuesday",
        3, "Wednesday",
        4, "Thursday",
        5, "Friday",
        6, "Saturday",
        7, "Sunday"
    );

    Day(int dayNumber) {
        this.name = daysOfTheWeek.get(dayNumber);
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name == null ? "Invalid day number" : "Day of the week: " + this.name;
    }
}
