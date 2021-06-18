package Practical;
import java.util.*;
public class CharMatrix
{
    char a,b,c;
    int n;
    char arr[][];
    public CharMatrix(int n)
    {
        this.n=n;
        arr=new char[n][n];
        a=b=c=' ';
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Diagnol(s) character");
        a=sc.nextLine().charAt(0);
        System.out.println("Enter top and bottom triangle(s) character");
        b=sc.nextLine().charAt(0);
        System.out.println("Enter left and right triangle(s) character");
        c=sc.nextLine().charAt(0);
    }

    void proccessing()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                    arr[i][j]=a;
                else if (i+j<n-1)
                {
                    if(i<j)
                        arr[i][j]=b;
                    else
                        arr[i][j]=c;
                }
                else
                {
                    if(i<j)
                        arr[i][j]=c;
                    else
                        arr[i][j]=b;
                }
            }
        }
        display();
    }

    void display() 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        CharMatrix obj=new CharMatrix(5);
        obj.input();
        obj.proccessing();
    }
}