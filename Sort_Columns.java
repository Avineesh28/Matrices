package Practical;
import java.util.*;
public class Sort_Columns
{
    public static void main(String args[])
    {
        int a[][]={{3,5,7},{11,3,8},{9,2,4}};
        int r=a.length;
        int c=a[0].length;
        for(int i=0;i<r;i++)
            System.out.println(Arrays.toString(a[i]));
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                //Insertion Sort
                int t=a[j][i];
                int k=j;
                while(k>0 && a[k-1][i]>t)
                {
                    a[k][i]=a[k-1][i];
                    k--;
                }
                a[k][i]=t;
            }
        }
        System.out.println("\n\n\n\n\n\n\n\n\n");
        for(int i=0;i<r;i++)
            System.out.println(Arrays.toString(a[i]));        
    }
}