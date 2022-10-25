import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int oct=scan.nextInt();
        int weight=1,dec=0;
        while(oct>0)
        {
            int rem=oct%10;
            dec+=rem*weight;
            oct/=10;
            weight=weight*8;
        }
        long bin=0,place=1;
        while(dec>0)
        {
            int rem=dec%2;
            bin+=rem*place;
            dec/=2;
            place=place*10;
        }
        System.out.print(bin);
        
    }
}