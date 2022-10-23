import java.util.*;
class solution{
    public static int ispalindrome(int m)
    {
        int temp=m,rev=0;
        if(temp<=9)
        return 2;
        while(temp>0)
        {
            rev=rev*10+(temp%10);
            temp/=10;
        }
        if(m==rev)
        return 2;
        return 1;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        System.out.println(ispalindrome(t));
    }
}