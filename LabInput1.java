import java.util.Scanner;

class LabInput1 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        int timeInSeconds; 
        int timeInHour, timeInMinute, timeInSecond;
        
        System.out.println("Please enter number of seconds: ");
        timeInSeconds = input.nextInt();
        timeInSecond = timeInSeconds % 60;
        timeInHour = timeInSeconds / 60;
        timeInMinute = timeInHour % 60;
        timeInHour = timeInHour / 60;
        System.out.println("\n " + timeInHour + ":" + timeInMinute + ":" + timeInSecond);
    }
}