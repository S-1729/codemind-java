import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(sdn(i))
            System.out.print(i+" ");
        }
    }
    public static boolean sdn(int m){
        int n=m,c=0,c1=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            if(rem!=0 && m%rem==0)
            c1++;
            c++;}
        if(c==c1)
        return true;
        return false;
    }
}