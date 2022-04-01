package logics;

public class PrimeNumbers 
{

	public static void main(String[] args) 
	{
		int ll = 10;
		int ul = 100;
		int flag;
		int count = 0;
		
		for(int i=ll; i<=ul; i++)
		{
			flag = 0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag = 1;
					break;
				}
			}
			
			if(flag==0)
			{
				count++;
				System.out.print(i+"\t");
			}
		}
		System.out.println("=========================");
		System.out.println("Total Prime number in the given range is: "+count);
	}

}
