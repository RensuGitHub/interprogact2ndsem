import java.util.Scanner;

class LabInput2 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        int hundreds, tens, ones;
        int theNumber;
        
        System.out.println("Please enter a three-digit integer: ");
        theNumber = input.nextInt();

        if (theNumber <= 999 && theNumber > 99) {
            hundreds = theNumber / 100;
            tens = (theNumber - (hundreds*100)) / 10;
            ones = (theNumber - (tens*10) - (hundreds*100));

            System.out.println("The value of num = " + theNumber);
            System.out.println(hundreds + " hundreds " + tens + " tens " + ones + " ones");
        }

        else {
            if (theNumber > 999)
                System.out.println("Try again. Number is more than 3 digits.");
            if (theNumber < 100)
                System.out.println("Try Again. Number is less than 3 digits.");
        }
    }
}