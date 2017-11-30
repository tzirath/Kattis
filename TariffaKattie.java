import java.util.Scanner;

public class TariffaKatt
{

    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);

    	int credit = scan.nextInt();
    	int months = scan.nextInt();
    	int sum = credit * months;
    	int sum2 = 0;

    	int ar[] = new  int[months];

    	for(int i =0; i<months; i++)
    	{
    			ar[i]= scan.nextInt();

    	}

    	for(int i =0; i<months; i++)
    	{

    			sum2= sum2+ar[i];
    	}

    	int sum3 = (sum -sum2)+credit;
    	System.out.println(sum3);
    }
}
