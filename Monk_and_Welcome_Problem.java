import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=scan.nextInt();
        for(int i=0;i<n;i++)
        b[i]=scan.nextInt();
        for(int i=0;i<n;i++)
        System.out.print(a[i]+b[i]+" ");
    }
}