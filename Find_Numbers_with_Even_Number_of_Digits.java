import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            while(arr[i]>0)
            {
                c++;
                arr[i]/=10;
            }
            if(c%2==0)
            s++;
        }
        System.out.print(s);
    }
}