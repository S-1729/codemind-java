import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[100];
        int i=0,flag=0;
        while(n>0)
        {
            arr[i]=n%10;
            i++;
            n/=10;
        }
        for(int j=i-1;j>=0;j--)
        {
            int c=0;
            for(int k=i-1;k>=0;k--)
            {
            if(arr[j]==arr[k])
            {
                c++;
            }
            }
            if(c>1)
            flag=1;
        }
        if(flag==1)
            System.out.println("Not Unique Number");
        else
            System.out.println("Unique Number");
    }
}