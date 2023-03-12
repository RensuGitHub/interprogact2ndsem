import java.util.Scanner;

class LabInput3 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        double beforePrice;
        double todayPrice;
        double inflationRate;
        String thing;

        System.out.println("Please enter the name of product: ");
        thing = input.next();
        System.out.println("Please enter the price last year: ");
        beforePrice = input.nextDouble();
        
        System.out.println("Please enter the price this year: ");
        todayPrice = input.nextDouble();
        
        inflationRate = ((todayPrice - beforePrice) / beforePrice) * 100;
        System.out.println(thing + "'s inflation rate is: " + inflationRate);
    }
}