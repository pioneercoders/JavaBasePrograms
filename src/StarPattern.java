import java.util.Scanner;

public class StarPattern
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("enter n value");
		n = in.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}