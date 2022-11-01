import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<a || arr[i]>b)
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}