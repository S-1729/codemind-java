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
            int c=-1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>c)
                c=arr[j];
            }
            arr[i]=c;
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}