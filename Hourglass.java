
/*          9 8 8
 *            8
 *          7 7 7    
 * 
 */
import java.util.*;
public class Hourglass
{
    public static void main(String args[])
    {
        int a[][]={{1,6,4,7,3,},{5,4,8,9,0},{7,2,4,1,5},{2,5,8,4,2},{8,7,4,5,1}};
        int a2[]=new int[a.length*a.length];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                a2[k++]=a[i][j];
            }
        }
        Arrays.sort(a2);
        int flag=0;
        int sum=0;
        for(int i=a2.length-1;i>=0;i--)
        {   
            if(flag<=2)
            {
                System.out.print(a2[i]+" ");
                flag++;
                sum+=a2[i];
            }
            else if(flag<=3)
            {
                System.out.println();
                System.out.print("  "+a2[i]+"  ");
                System.out.println();
                flag++;
                sum+=a2[i];
            }
            else if(flag<=6)
            {
                System.out.print(a2[i]+" ");
                flag++;
                sum+=a2[i];
            }
            else break;
        }
        System.out.println(sum);
    }
}
 