import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int zeros[]=new int[n];
        int ones[]=new int[n];
        int l=0,k=0,j=0;
        
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            zeros[k++]=arr[i];
            else
            ones[l++]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(i<k)
            System.out.print(zeros[i]+" ");
            else
            System.out.print(ones[j++]+" ");
        }
    }
}