import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total minutes: ");

        int totalMinutes  = input.nextInt();
        int days = totalMinutes / 1440;
        int remainingMinutes = totalMinutes % 1400;
        int hours = remainingMinutes / 60;
        int minutes = remainingMinutes % 60;

        System.out.printf("%d minutes = %d days, %d hours, %d minutes\n", totalMinutes, days, hours, minutes);

        input.close();
    }
}
