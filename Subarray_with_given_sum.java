import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=scan.nextInt();
            int s=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
            
            int c=0,flag=0,first=0,last=0;
            for(int i=0;i<n;i++)
            {
                int sum=0;
                for(int j=i;j<n;j++)
                {
                    sum+=arr[j];
                    if(sum==s)
                    {
                        first=i+1;
                        last=j+1;
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                break;
            }
            if(flag==0)
            System.out.println(-1);
            else
            System.out.println(first+" "+last);
        }
    }
}