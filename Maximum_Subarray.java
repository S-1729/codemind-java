import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum>max)
            max=sum;
            if(sum<0)
            sum=0;
        }
        System.out.print(max);
    }
}