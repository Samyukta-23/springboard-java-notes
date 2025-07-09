class Tester {
    public static void main(String[] args) {
        int day = 31; 
        int month = 12;
        int year = 2015; 

        // Check for months with 31 days (January, March, May, July, August, October, December)
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                if (month == 12) {
                    System.out.print("1-1-" + (year + 1));
                } else {
                    System.out.print("1-" + (month + 1) + "-" + year);
                }
            } else {
                System.out.print((day + 1) + "-" + month + "-" + year);
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                System.out.print("1-" + (month + 1) + "-" + year);
            } else if (day > 30) {
                System.out.print("Invalid day for this month.");
            }
            else {
                System.out.print((day + 1) + "-" + month + "-" + year);
            }
        }
        // Handle February
        else if (month == 2) {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                if (day == 29) {
                    System.out.print("1-" + (month + 1) + "-" + year);
                } else if (day > 29) {
                    System.out.print("Invalid day for February in a leap year.");
                }
                else {
                    System.out.print((day + 1) + "-" + month + "-" + year);
                }
            } else {
                if (day == 28) {
                    System.out.print("1-" + (month + 1) + "-" + year);
                } else if (day > 28) {
                    System.out.print("Invalid day for February in a non-leap year.");
                }
                else {
                    System.out.print((day + 1) + "-" + month + "-" + year);
                }
            }
        }
        else {
            System.out.print("Invalid month.");
        }
    }
}
