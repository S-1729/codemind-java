import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]==arr[j])
                c++;
            }
        }
        System.out.println(c);
    }
}