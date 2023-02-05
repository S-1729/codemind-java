import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double r=0,i=0;
        while(r<=n)
        {
            r=Math.pow(2,i);
            i++;
        }
        double l=r/2;
        int result=(int)Math.min(n-l,r-n);
        System.out.println(result);
    }
}