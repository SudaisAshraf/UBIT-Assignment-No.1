import java.util.Scanner;          //library file for input fn
public class Q1
{
    public static void main(String[] args)
    {
        int obt,total;
        double per;

        //For Input
        Scanner input;// Scanner input=new Scanner(System.in);    declaration
        input = new Scanner(System.in); //initialization

        System.out.print("Enter Obtain Marks   :");
        obt = input.nextInt();         //Input

        System.out.print("Enter Total Marks    :");
        total = input.nextInt();         //Input

        per = 1.0*obt/total*100;

        System.out.println(per);


    }
}