import java.util.*;
class solution{
    public static int check(int arr[],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            if(m%arr[i]!=0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            if(arr[i]>max)
            max=arr[i];
        }
        while(true)
        {
            if(check(arr,n,max)==1)
            {
                System.out.print(max);
                break;
            }
            else
            max+=1;
        }
        
    }
}