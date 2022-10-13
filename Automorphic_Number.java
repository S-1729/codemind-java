import java.util.Scanner;
import java.lang.Math;
class Main{
public static void main(String args[]){
Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
int sq=n*n,c=0,temp=n;
while(temp>0)
{
temp/=10;
c++;
}
int p=(int)Math.pow(10,c);
if(n==sq%p)
System.out.print("Automorphic Number");
else
System.out.print("Not an Automorphic Number");
}
}
