import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
        System.out.println("Program To Calculate The Circumference And Area Of The Circle");
        Double r,pi=3.1415;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Radius of a Circle (in cm) : ");
        r = input.nextDouble();
        System.out.print("The Circumference of The Circle is   : ");
        System.out.print(2*pi*r);
        System.out.println("cm");
        System.out.print("And The Area of The Circle is        : ");
        System.out.print(pi*r*r);
        System.out.println("cm^2");
        
    }
}