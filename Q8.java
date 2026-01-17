import java.lang.Math;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("    CALCULATE THE AREA OF TRIANGLE");
        float a,b,c,s;
        System.out.print("Enter the length of 'a' side of triangle : ");
        a=input.nextFloat();
        System.out.print("Enter the length of 'b' side of triangle : ");
        b=input.nextFloat();
        System.out.print("Enter the length of 'c' side of triangle : ");
        c=input.nextFloat();

        s=(a+b+c)/2;
        Double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("The Area Of Triangle Is                  : ");
        System.out.print(area);


    }
    
}
