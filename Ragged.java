import java.util.*;
class Ragged
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements in the array");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		//Ragged Array
		int r[][]=new int[n-2][n];
		int x=n-2;
		int y=n;
		int z=1;
		int sum=0;
		int j;
		for(int i=0;i<x;i++)
		{	
 			j=0;
			for(int k=0;k<n-z;k++)
			{
				for(int l=k;l<=k+z;l++)
					sum+=a[l];
				r[i][j++]=sum;	
				sum=0;
			}
			z++;	
		}
/*
		for(int i=0;i<x;i++)
		{
			for(j=0;j<y;j++)		
			{
				if(r[i][j]==0)//Wont work if sum happens to be 0
					System.out.print("- ");
				else
					System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
		To Display the Ragged Array
*/
		int or,xor;
		int flag;
		for(int i=0;i<x;i++)
		{
			flag=0;
			for(j=0;j<y;j++)		
			{
				if(r[i][j]==0)
					break;
				for(int k=j+1;k<y;k++)
				{
					if(r[i][k]==0)
						break;
					xor=r[i][j]^r[i][k];
					or=r[i][j]|r[i][k];
					System.out.println("("+r[i][j]+","+r[i][k]+")\tOR = "+or+"\tXOR = "+xor);
					if(or==xor)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
					break;
			}
			if(flag==1)
				System.out.println("Row "+i+" ended abruptly terminated");
			else
				System.out.println("Row "+i+" ended processed entirely");
		}

	}
}

	