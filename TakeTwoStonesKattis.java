import java.util.Scanner;

public class TakeTwoStonesKattis
{
    public static void main (String args[])
    {

    	 	Scanner scan = new Scanner(System.in);

    	 	int n = scan.nextInt();

    	 	int [] ar = new int [n];

    	 	for(int i= 0; i<n; i++)
    	 	{
    	 		ar[i]=i+1;
    	 	}


    	   if(ar[n-1]%2!=0)
    	   {
    	 	  System.out.println("Alice");
    	   }
    	   else
    	   {
    	 	  System.out.println("Bob");
    	   }









    }

}