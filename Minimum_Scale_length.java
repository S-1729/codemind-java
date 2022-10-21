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
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        for(int i=max;i>0;i--)
        {
            if(isminimum(arr,i)==1)
            {
                System.out.println(i);
                break;
            }
            
        }
    }
}