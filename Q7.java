import java.util.Scanner;
public class Q7 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Enter the valuu to check if its EVEN or ODD  : ");   
        a = input.nextInt();
        if(a%2==0)
        {
            System.out.println("The Entered Number Is EVEN");
        }
        if(a%2!=0)
        {
            System.out.println("The Entered Number Is ODD");
        }
    }   
}