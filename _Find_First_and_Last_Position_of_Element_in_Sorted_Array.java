import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=scan.nextInt();
        int k=scan.nextInt();
        
        int c=-1,d=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k && c==-1)
            c=i;
            if(a[i]==k)
            d=i;
        }
        System.out.println(c+" "+d);
    }
}