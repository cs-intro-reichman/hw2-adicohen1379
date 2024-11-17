public  class  TestRandom {
	public static void main(String[]  args) {
		Integer n=Integer.parseInt(args[0]); 
		Double ratio=0.0;
		Integer greaterNum=0;; 
		Integer lesseqNum=0; 
		for(int i=0;i<n;i++)
		{
			double randomNum=Math.random();  
			if(randomNum>0.5)
			{
				greaterNum++;
			}
			else
			 {
				lesseqNum++;
			 }
			 if((greaterNum<lesseqNum)&&lesseqNum!=0)
			 {
				ratio=(double)greaterNum/lesseqNum;
			 }
			 if((greaterNum>lesseqNum)&&greaterNum!=0)
			 {
				ratio=(double)lesseqNum/greaterNum;
			 }	
		}	
			 System.out.println(">0.5"+" "+greaterNum+" times");
			 System.out.println("<=0.5"+" "+lesseqNum+" times");
			 System.out.println("Ratio: "+ratio);
	}
}
