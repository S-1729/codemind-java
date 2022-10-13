import java.util.Scanner;
import java.lang.Math;
class Main{
public static void main(String args[]){
Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
int sq=(int)Math.sqrt(n);
if(sq*sq==n)
System.out.print("True");
else
System.out.print("False");
}
}
