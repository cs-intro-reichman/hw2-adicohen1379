public class CalcPi {
	public static void main(String [] args) { 
		Integer n=Integer.parseInt(args[0]); 
		double sum=1.0;
		double diviser=3.0;
		if(n>1)
		{
			for(int i=1;i<n;i++)
			{
				sum=(sum-(1/diviser));
				diviser=diviser+2;
				i++;
				if(i<n)
				{
					sum=(sum+(1/diviser));
					diviser=diviser+2;
				}
			}
		}
		sum=sum*4;
		System.out.println("pi according to java: "+Math.PI);
		System.out.println("pi, approximated:	 "+sum);
	}
}
