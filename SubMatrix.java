package Practical;
import java.util.*;
public class SubMatrix
{
    int a[][];
    int n;
    int c;
    SubMatrix(int size)
    {
        n=size;
        c=0;
        a=new int[n][n];
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Values");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        }
    }

    void processing()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1)
                {
                    c++;
                    int b=1;
                    
                    while(true)
                    {
                        System.out.println(j+b+"*"+a.length);
                        if(j+b<a[i].length-1)
                        {
                            System.out.println("I'm here");

                            if(a[i][j+b]==1)
                            {

                                if(i+b>=a.length)
                                    break;
                                for(int l=i;l<i+b;l++)
                                {
                                    for(int k=j;k<j+b;k++)
                                    {
                                        if(a[l][k]!=1)
                                            break;
                                    }
                                }
                                c++;
                                b++;
                            }
                            else
                                break;
                        }
                        else break;
                    }
                }
            }
        }
    }

    void display()
    {
        System.out.println(c);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        SubMatrix obj=new SubMatrix(sc.nextInt());
        obj.input();
        obj.processing();
        obj.display();

    }
}