import java.util.Scanner;
public class Q5
{
    public static void main(String[] args) 
    {
        double I,V;
        System.out.println("                        Calculate Electric Power ");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter  Voltage                   : ");
        V=input.nextDouble();
        System.out.print("Enter Electric Current in Ampere : ");
        I=input.nextDouble();
        System.out.print("The Electric Power is            : ");
        System.out.print(V*I);
    }
    
}
