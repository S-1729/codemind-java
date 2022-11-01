import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[100];
        int i=0;
        while(n>0)
        {
            arr[i]=n%10;
            i++;
            n/=10;
        }
        for(int j=i-1;j>=0;j--)
        {
            if(arr[j]==6)
            {
                arr[j]=9;
                break;
            }
        }
        for(int j=i-1;j>=0;j--)
            System.out.print(arr[j]);
    }
}