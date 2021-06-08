import java.util.*;
public class Matrix
{
    int a[][];
    int n,m;
    int diff;
    Matrix(int n, int m)
    {   
        this.n=n;
        a=new int[n][m];
        diff=0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter order of the Matrix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n!=m)
        {
            System.out.println("Not a Square Matrix");
            System.exit(0);
        }
        else if(n<0 || m<0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else
        {
            Matrix obj=new Matrix(n,m);
            System.out.println("Enter the Matrix");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    obj.a[i][j]=sc.nextInt();
            }
            //display
            int d1=0;
            int d2=0;
            for(int i=0;i<n;i++)
            {   
                for(int j=0;j<m;j++)
                {
                    if(i==j)
                        d1+=obj.a[i][j];
                    if(i+j==n-1)
                        d2+=obj.a[i][j];
                    else
                        continue;
                }
            }
            obj.diff=Math.abs(d1-d2);
            //display
            System.out.println("The Matrix");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    System.out.print(obj.a[i][j]+"\t");
                System.out.println();
            }
            System.out.println("Absolute Difference between Sum of Diagnols is "+obj.diff);
        }
    }
}
