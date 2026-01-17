import java.util.Scanner;
public class Q6 
{
    public static void main(String[] args) 
    {
        System.out.println("               CALCULATE THE AREA OF THE TRAPEZOID");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Length Of Parallel Sides          : ");
        double a = input.nextDouble();
        System.out.print("Enter The Secound Length Of Parallel Sides        : ");
        double b = input.nextDouble();
        System.out.print("Enter The the Perpendicular Distance b/w || lines : ");
        double h = input.nextDouble();
        double area=h*(a+b)/2;
        System.out.print("The Area Of The Trapezoid is                      : ");
        System.out.println(area);
}

}
