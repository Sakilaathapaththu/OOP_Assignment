import java.util.*;
public class RandNum{

	public void getCalculate() 
	{
		Random rand=new Random();
		int [][] array = new int[5][5];
		//fill array random
		for(int a=0;a<5;a++)
		{
			for(int b=0;b<5;b++)
			{
				array[a][b]=rand.nextInt(100);
				System.out.print(array[a][b]+" ");
			}
			System.out.println();
		}
		
		//calculate the min,max and avg
		
		int tot=0;
		int min=array[0][0];
		int max=array[0][0];
		int c=0;
		for(int a=0;a<5;a++)
		{
			for(int i=0;i<5;i++)
			{
				if(min>array[a][i])
				{
					min=array[a][i];
				}
				if(max<array[a][i])
				{
					max=array[a][i];
				}
				tot=tot+array[a][i];
				c++;
				
			}
		}
		
		System.out.println("\nmin num : "+min);
		System.out.println("max num : "+max);
		System.out.println("average : "+tot/c);
		
	}
	
	
	public void getdisplaycal()
	{
		getCalculate();
		
		
	}
	
}

