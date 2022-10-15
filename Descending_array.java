import java.util.Scanner;
class descending
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int flag=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    flag=1;
                    //System.out.print("no");
                    break;
                }
            }
        }
        if(flag==0)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}