import java.util.Scanner;

public class AreaCalculator{
    public static void main(String[] args) {

        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to the Circle Area Calculator !!");
        System.out.print("Plase enter the radius of the circle: ");

        try {
            double radius = scanner.nextDouble();
          
            if (radius <= 0 ){
                 System.out.println("Error : The radius must be a positive number . Please try again .");
            } else {
                double area = PI * radius * radius ;

                System.out.println(" The  area of the circle with radius " + radius + " is " + area );

            }
         
        } catch (java.util.InputMismatchException e ) {

            System.out.println(" Error : Invalid input . Please rnter a valid number for the radius .");

        }finally{

            scanner.close();
        }
    }
}