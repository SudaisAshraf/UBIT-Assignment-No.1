import java.util.Scanner;
public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Original Selling Price");
        double op,dp,dPer=0;                                 //op=originalPrice, dp=PriceAfterDiscount, dPer=discountedPercentage
        
        System.out.print("Enter Disconted Selling Price Of Product  : ");
        dp=input.nextDouble();
        System.out.print("Enter Discounted Percentage of product    : ");
        dPer=input.nextDouble();

        // Formula               originalPrice(100%-Discount%)=Disconted price
        // original Price=Discounted price*100/(100-Discount)
        op = dp *100/ (100 - dPer);
        System.out.print("The Original Selling Price  is            : ");
        System.out.print(op);
    }

}