package project;

import java.util.Scanner;
public class Main 
{
	public static void main(String args[])   
    {  
        int bid=0;        	
        int id =0;  
        String productName = null;  
        int quantity = 0;  
        double price = 0.0;  
        double totalPrice = 0.0;  
        double overAllPrice = 0.0;  
        double cgst, sgst, subtotal=0.0;  
        char choice = '\0';  
        Scanner scan=new Scanner(System.in);
        for(int i=0;;i++)
    	{
    	System.out.println("PRESS ANY OPTION TO CONTINUE");
    	System.out.println("1.INSERTION FOOD & Price");
    	System.out.println("2.INSERT BILL");
    	System.out.println("3.Search ID");
    	System.out.println("4.Show all");
    	System.out.println("5.EXIT");
    	int press;
    	press=scan.nextInt();

}
}
}