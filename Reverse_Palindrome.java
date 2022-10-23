import java.util.*;
class solution{
    public static int isreverse(int k)
    {
        int r1=0,t1=k;
        while(t1>0)
        {
            r1=r1*10+(t1%10);
            t1/=10;
        }
        if(r1==k)
        return 1;
        return 0;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner (System.in);
        int n=scan.nextInt();
        while(true)
        {
            int temp=n,rev=0;
            while(temp>0)
            {
                rev=rev*10+(temp%10);
                temp/=10;
            }
            int r=n+rev;
            if(isreverse(r)==1)
            {
                System.out.print(r);
                break;
            }
            else
            n=r;
        }
    }
}