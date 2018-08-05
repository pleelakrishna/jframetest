/**
 * @author iBotrics 
 *
 */
import java.io.*;
import java.util.Scanner;
class CalcGst 
{
static float original_cost;
static float n_price;

 static float  Calculate_GST(float original_cost , float n_price)
	
	
	 {     
	        return (((n_price-original_cost) * 100) / original_cost);
	  }
	     
	 	public static void main (String[] args) 
	 		{	 
	 		
	 			Scanner sc=new Scanner(System.in);
	 			System.out.println("enter value of original_cost");
	 			original_cost=sc.nextInt();
	 			System.out.println("enter value of n_price");
				    n_price=sc.nextInt();
				    
					System.out.print(" GST = "  + Calculate_GST
				                     (original_cost, n_price) + "%");
	 		}
}