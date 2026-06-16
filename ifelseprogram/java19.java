// Print number of days for a given month in Java
package ifelse;

import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter month");
        int month = scn.nextInt();

        System.out.println("Enter year");
        int year = scn.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {

            System.out.println("This month has 31 days");

        } else if (month == 2) {

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }

        } else if (month==4||month==6||month==9||month==11) {

            System.out.println("30 days");

        } else {

            System.out.println("Invalid month");
        }

        scn.close();
    }
}