import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1,c;
        c=a+b;
        while(c<=n)
        {
            a=b;
            b=c;
            c=a+b;
        }
        if(Math.abs(n-c)<Math.abs(n-b))
        System.out.print(c);
        else if(Math.abs(n-c)==Math.abs(n-b))
        System.out.print(b+" "+c);
        else
        System.out.print(b);
        
    }
}