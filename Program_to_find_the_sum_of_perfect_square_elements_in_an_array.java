import java.util.*;
class Solution{
    public static int isSquare(int k)
    {
        int temp=(int)Math.sqrt(k);
        if(temp*temp==k)
        return 1;
        else
        return 0;
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(isSquare(arr[i])==1)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}