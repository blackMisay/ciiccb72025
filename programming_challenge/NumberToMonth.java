package programming_challenge;

import java.util.Scanner;

public class NumberToMonth {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        Month month = new Month(monthNumber);
        month.numberToMonth();
    }
}

class Month {

    int monthNumber;
    String monthName;

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    void Days(int days) {
        System.out.print("\n" + getMonthName());
        int dayOfWeek = 0;
        for (int x = 1; x <= days; x++) {
            if (dayOfWeek % 7 == 0) {
                System.out.println("");
                dayOfWeek = 0;
            }
            System.out.print(x + " ");
            dayOfWeek++;
        }
    }

    void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    String getMonthName() {
        return this.monthName;
    }

    public void numberToMonth() {
        switch (this.monthNumber) {
            case 1:
                setMonthName("January");
                Days(31);
                break;
            case 2:
                setMonthName("February");
                Days(28);
                break;
            case 3:
                setMonthName("March");
                Days(31);
                break;
            case 4:
                setMonthName("April");
                Days(30);
                break;
            case 5:
                setMonthName("May");
                Days(31);
                break;
            case 6:
                setMonthName("June");
                Days(30);
                break;
            case 7:
                setMonthName("July");
                Days(31);
                break;
            case 8:
                setMonthName("August");
                Days(31);
                break;
            case 9:
                setMonthName("September");
                Days(30);
                break;
            case 10:
                setMonthName("October");
                Days(31);
                break;
            case 11:
                setMonthName("November");
                Days(30);
                break;
            case 12:
                setMonthName("December");
                Days(31);
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}
