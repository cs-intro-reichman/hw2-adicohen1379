// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
        Integer n=Integer.parseInt(args[0]);
		String mode=args[1];
		Integer i=1;
		Integer k=1;
		Integer d=0;
		Integer counter=1;
		Integer counter2=0;
			if(mode.equals("v"))
			{
				System.out.print(i+" ");
				for(int j=0;(j<n+1)&&(counter2!=n);j++)
				{
					j=d;
					if(i%2==0)
					{
						i=(i/2);
						System.out.print(i+" ");
						counter++;
					}
					else
					{
						i=(i*3)+1;
						System.out.print(i+" ");
						counter++;
					}
					if((i==1.0))
					{
						System.out.println("("+counter+")");
						k++;
						i=k;
						counter2++;;
						counter=1;
						d++;
						if(counter2!=n)
						{
							System.out.print(i+" ");
						}
						
					}
				}	
				if(counter2==n)
					{
						System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");
					}
			}
			if(mode.equals("c"))
			{
				for(int j=0;(j<n+1)&&(counter2!=n);j++)
				{
					j=d;
					if(i%2==0)
					{
						i=(i/2);			
					}
					else
					{
						i=(i*3)+1;
					}
					if((i==1.0))
					{
						counter2++;;
						k++;
						i=k;
						d++;
					}
				}
				int newN=n;
				int newCounter2=counter2;	
				if(newN==newCounter2)
				{
					System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");
				}
			}
	}
}
