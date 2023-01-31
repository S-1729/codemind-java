import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=scan.nextInt();
        
        int m=scan.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        b[i]=scan.nextInt();
        int k=scan.nextInt();
        
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=k && b[i]>=k)
            c++;
        }
        System.out.println(c);
    }
}