import java.util.Scanner;
public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Discounted Selling Price");
        double op,dp,dPer=0;                                 //op=originalPrice, dp=discountedPrice, dPer=discountedPercentage
        
        System.out.print("Enter Original Price Of Product        : ");
        op=input.nextDouble();
        System.out.print("Enter Discounted Percentage of product : ");
        dPer=input.nextDouble();
        dp =op*dPer/100;
        System.out.print("The Price After Discount is             : ");
        System.out.print(op-dp);
    }

}