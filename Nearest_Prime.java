import java.util.*;
class solution{
    public static int isprime(int m)
    {
        if(m==1 || m==0)
        return 0;
        for(int j=2;j<=(int)Math.sqrt(m);j++)
        {
            if(m%j==0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int r1=0;
            while(true)
            {
                if(isprime(n+r1)==1)
                break;
                else
                r1+=1;
            }
            int r2=0;
            while(true)
            {
                if(isprime(n-r2)==1)
                break;
                else
                r2+=1;
            }
            if(r1==r2)
            System.out.println(n-r2);
            else if(r1<r2)
            System.out.println(n+r1);
            else
            System.out.println(n-r2);
        }
    }
}