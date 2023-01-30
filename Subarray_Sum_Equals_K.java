import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}