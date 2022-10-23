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
        int n=scan.nextInt();
        int r1=1;
        while(true)
        {
            if(ispalindrome(n+r1)==1)
            break;
            else
            r1+=1;
        }
        int r2=1;
        while(true)
        {
            if(ispalindrome(n-r2)==1)
            break;
            else
            r2+=1;
        }
        if(r1==r2)
        {
        System.out.print(n-r2+" ");
        System.out.println(n+r1);
        }
        else if(r1<r2)
        System.out.println(n+r1);
        else
        System.out.println(n-r2);
    }
}