import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            System.out.print(arr[i]+" ");
        }
    }
}