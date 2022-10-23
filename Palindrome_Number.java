import java.util.*;
class solution{
    public static int ispalindrome(int m)
    {
        int temp=m,rev=0;
        while(temp>0)
        {
            rev=rev*10+(temp%10);
            temp/=10;
        }
        if(m==rev)
        return 1;
        return 0;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=scan.nextInt();
            if(ispalindrome(n)==1)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}