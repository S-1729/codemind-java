import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=scan.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
            int c=0;
            
            for(int aa=0;aa<n;aa++)
            {
                for(int b=aa+1;b<n;b++)
                {
                    for(int cc=0;cc<n;cc++)
                    {
                        if(a[cc]==a[aa]+a[b])
                        c++;
                    }
                }
            }
            if(c==0)
            System.out.println(-1);
            else
            System.out.println(c);
        }
    }
}