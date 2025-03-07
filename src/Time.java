public class Time {
    public static void main(String[] args) {
        int hour = 20;
        int minute = 30;
        int second = 30;

        // Number of seconds since midnight
        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;

        // Total seconds in a day
        int totalSecondInDay = 24 * 3600;

        // Number of seconds remaining in the day
        int secondsRemainingInDay = totalSecondInDay - secondsSinceMidnight;

        // Percentage of the day that has passed
        double percentageOfDayPassed = (secondsSinceMidnight * 100.0) / totalSecondInDay;

        System.out.println("Number of seconds since midnight: " + secondsSinceMidnight);
        System.out.println("Number of seconds remaining in the day: " + secondsRemainingInDay);
        System.out.printf("Percentage of day passed:%.2f%%\n", percentageOfDayPassed);
    }
}
