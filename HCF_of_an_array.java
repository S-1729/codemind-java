import java.util.*;
class solution{
    public static int check(int arr[],int i)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]%i!=0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            if(arr[i]<min)
            min=arr[i];
        }
        for(int i=min;i>=1;i--)
        {
            if(check(arr,i)==1)
            {
                System.out.print(i);
                break;
            }
        }
        
    }
}