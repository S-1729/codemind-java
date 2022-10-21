import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int t=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=t)
            sum+=1;
            else
            sum+=2;
        }
        System.out.println(sum);
    }
}