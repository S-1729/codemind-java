import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int x=scan.nextInt();
        int r1,r2,temp=n,c=0;
        r1=n%(int)(Math.pow(10,x));
        
        while(temp>0)
        {
            c++;
            temp/=10;
        }
        r2=n/(int)(Math.pow(10,c-x));
        int result=r1-r2;
        System.out.println(Math.abs(result));
        
    }
}