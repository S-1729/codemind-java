import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        int k=scan.nextInt();
        int b[]=new int[n];
        
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            b[i]=arr[c1++];
            else
            b[i]=arr[k+c2++];
        }
        for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
}