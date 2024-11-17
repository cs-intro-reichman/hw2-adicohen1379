public class Cheers {
        public static void main(String[] args) {
                String word=args[0];
                Integer num=Integer.parseInt(args[1]);
                for(int i=0;i<args[0].length();i++)
                {
                        word=args[0].toUpperCase();
                        if(word.charAt(i)==('A'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('E'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!"); 
                        else if(word.charAt(i)==('F'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('H'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('I'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('L'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('M'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!"); 
                        else if(word.charAt(i)==('N'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('O'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('R'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('S'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else if(word.charAt(i)==('X'))
                                 System.out.println("Give me an "+word.charAt(i)+": "+word.charAt(i)+"!");
                        else
                                 System.out.println("Give me a "+word.charAt(i)+" :"+word.charAt(i)+"!"); 

                }
                System.out.println("What does that spell?");
                Integer j=0;
                while(j<num)
                {
                        System.out.println(word+"!!!");
                        j++;
                }
                
        }
}
