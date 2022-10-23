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
        int n=scan.nextInt();
        if(isprime(n)==1)
        {
            int rev=0;
            while(n>0)
            {
                rev=rev*10+(n%10);
                n/=10;
            }
            if(isprime(rev)==1)
                System.out.println("circular prime");
            else
                System.out.println("prime but not a circular prime");
        }
        else
            System.out.println("not prime");
    }
}