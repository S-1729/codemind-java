import java.util.*;
class Solution{
    public static int isminimum(int [] arr,int k)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]%k!=0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=i+1;k>1;k--)
            {
                System.out.print(k-1);
            }
            for(int k=0;k<i+1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}