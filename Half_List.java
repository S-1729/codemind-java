import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int b[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i<n/2)
            b[i]=arr[n-i-1];
            else
            b[i]=arr[c++];
        }
        for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
}