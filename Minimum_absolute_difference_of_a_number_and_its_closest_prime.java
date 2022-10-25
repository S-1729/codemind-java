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
        int s1=0;
        while(true)
        {
            if(isprime(n+s1)==1)
            {
                break;
            }
            else
            s1+=1;
        }
        int s2=0;
        while(true)
        {
            if(isprime(n+s2)==1)
            {
                break;
            }
            else
            s2-=1;
        }
        int a=n+s1,b=n-s2;
        int c=Math.abs(a-n),d=Math.abs(n-b);
        if(c<d)
        System.out.print(c);
        else if(c==d)
        System.out.print(c);
        else
        System.out.print(d);
        
    }
}