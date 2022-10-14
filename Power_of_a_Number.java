import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int p=(int)Math.pow(a,b);
        System.out.print(p%c);
    }
}