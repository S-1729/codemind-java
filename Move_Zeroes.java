import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        int zeros[]=new int[n];
        int nonzeros[]=new int[n];
        
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            zeros[c1++]=arr[i];
            else
            nonzeros[c2++]=arr[i];
        }
        for(int i=0;i<c2;i++)
        System.out.print(nonzeros[i]+" ");
        for(int i=0;i<n-c2;i++)
        System.out.print(zeros[i]+" ");
    }
}