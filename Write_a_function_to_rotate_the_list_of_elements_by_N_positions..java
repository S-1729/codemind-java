import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        int k=scan.nextInt();
        for(int i=0;i<k;i++)
        {
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--)
            arr[j]=arr[j-1];
            arr[0]=temp;
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}