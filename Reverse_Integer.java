import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=1;
        if(n<0){
        n=n*-1;
        m=-1;
        }
        int rev=0;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n/=10;
        }
        System.out.println(rev*m);
    }
}