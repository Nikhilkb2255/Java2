import java.util.*;
public class avg 
{
	public static void main(String args[]) 
	{
		double total = 0, N, userInput;
		Scanner input = new Scanner(System.in);
		while (true)
		{
		 System.out.print("Enter how many numbers(N) to calculate average : ");
		 userInput = input.nextDouble();
		  if (userInput > 0)
		    {
			    N = userInput;
			    break;
		    } 
		else
				System.out.println("N must be positive");
		}
		for (int i = 0; i < N; i++) 
		{
			while (true) 
			{
				System.out.print("Enter number :");
				
                try 
				{
					userInput = input.nextDouble();
					total += userInput;
					break;

				}
				
                catch (InputMismatchException e) 
				{
					input.nextLine();
					System.out.println("Input must be a number");
				} 
			} 
		}
		System.out.println("Average: "+ total / N);
	}
}