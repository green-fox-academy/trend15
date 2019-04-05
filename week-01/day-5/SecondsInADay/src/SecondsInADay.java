public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int MaxTimeInSecond = 86400;


        int leftHours = currentHours * 60 * 60;
        int leftMinute = currentMinutes *60;
        int remainingSecond = (MaxTimeInSecond -leftHours - leftMinute - currentSeconds);
        System.out.println("Remaining Second: " + remainingSecond);

        // Write a program that prints the remaining seconds (as an integer) from a day if the current time is represented by the variables
    }
}
