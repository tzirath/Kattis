import java.util.Scanner;

public class SolvingForCarrots
{

    public static void main(String args[])
    {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int p = scan.nextInt();

		String des = new String();

		for(int i =0; i<=n; i++)
		{
			des = scan.nextLine();
		}

		System.out.println(p);
    }


}