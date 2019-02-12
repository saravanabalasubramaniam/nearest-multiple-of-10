import java.util.*;
import java.io.*;
class Nearestmultipleof10 
{
  public static void main(String args[])
  {
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
	while(a>0)
	{
		if(a%10==0)
		{
			System.out.println(a);
			break;
		}
		else
		{
			a=a+1;
		}
	}
   }
}
