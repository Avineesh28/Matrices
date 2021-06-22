package Practical;
import java.util.*;
class SumMatrix
{
    int a[][];
    int n;
    SumMatrix()
    {
        a=new int[6][6];
        n=6;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<n-1;j++)
                a[i][j]=sc.nextInt();
        }
    }

    void sum()
    {
        int c=0;
        int r=0;
        int d1=0;
        int d2=0;
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<n-1;j++)    
            {
                r+=a[i][j];
            }    
            a[n-1][i]=r;
            for(int j=1;j<n-1;j++)
            {
                c+=a[j][i];
            }
            a[i][n-1]=c;
            r=0;
            c=0;
        }        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    d1+=a[i][j];
                if(i+j==n-1)
                    d2+=a[i][j];
            }
        }
        a[n-1][0]=d1;
        a[n-1][n-1]=d2;
    }

    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==0)
                    System.out.print(" \t");
                else
                    System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main()
    {
        SumMatrix obj=new SumMatrix();
        obj.input();
        obj.sum();
        obj.display();
    }
}