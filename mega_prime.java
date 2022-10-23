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
            int flag=0;
            while(n>0)
            {
                if(isprime(n%10)==0)
                {
                    System.out.println("Not Mega Prime");
                    flag=1;
                    break;
                }
                else
                n/=10;
            }
            if(flag==0)
            System.out.println("Mega Prime");
        }
        else
            System.out.println("Not Mega Prime");
    }
}