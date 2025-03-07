import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // User input
        System.out.print("Enter seconds: ");
        int totalSeconds = in.nextInt();

        // convert seconds to hours, minutes, seconds

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds", totalSeconds, hours, minutes, seconds);

        in.close();
    }
}
