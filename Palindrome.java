import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int rev=0,temp=n;
        while(temp>0)
        {
            rev=rev*10+(temp%10);
            temp/=10;
        }
        if(n==rev)
        System.out.println("True");
        else
        System.out.println("False");
    }
}