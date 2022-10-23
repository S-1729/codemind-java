import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        long i,j;
        for(i=0;i<t;i++)
        {
            int flag=0;
            long n=scan.nextLong();
            long m=scan.nextLong();
            for(j=0;j<=m;j++)
            {
                if((j*j)%m==n)
                {
                    System.out.println(j);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            System.out.println("-1");
        }
    }
}