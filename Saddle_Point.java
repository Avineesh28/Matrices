/*
 * {1, 2, 3},
 * {4, 5, 6},
 * {7, 8, 9}
*/
import java.util.*;//To use Scannerclass for input
public class Saddle_Point
{
    int n;
    int a[][];
    public Saddle_Point(int n)
    {
        // initialise instance variables
        this.n=n;
        a=new int[n][n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements of array");
        for(int i=0;i<n;i++)
        {
            System.out.println("Row-"+(i+1));
            for(int j=0;j<n;j++)
            {
              System.out.println("Element-"+(j+1));
              a[i][j]=sc.nextInt();
            }
        }
    }
    void Saddle()
    {
        boolean flag;
        int flag2=0;
        int saddle,m;
        for(int i=0;i<n;i++)
        {   
            saddle=a[i][0];
            m=0;
            flag=false;//if elemnt saddle or not
            for(int j=0;j<n;j++)
            {
                //searching for smallest element in row 
                if(a[i][j]<saddle)
                {
                    saddle=a[i][j];
                    m=j;
                }
            }//for 2
            for(int k=0;k<a.length;k++)
            {
                //to check is highest in column
                if(a[k][m]<saddle)
                    flag=true;
                else
                {
                    if(k==i)//same element checking for saddle
                        continue;
                    else
                    {
                        flag=false;
                        break;
                    }
                }
            }//for 3
            if(flag==true)//if saddle present
            {
                display(saddle);
                flag2++;
            }
        }//for 1
        if(flag2==0)//if saddle not present
            display(-999);//Dummy Value
    }//void Saddle()
    void display(int n)
    {
        if(n==-999)
            System.out.println("No Saddle Point");
        else
            System.out.println("\n\n\n\nSaddle Point-"+n);
    }//void display(int n)
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);//Scanner Object
        System.out.println("Ënter array size");
        Saddle_Point obj=new Saddle_Point(sc.nextInt());//Object Creation
        obj.input();//Invoking Functions 
        obj.Saddle();
    }//main()
}//class
