import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
int flag=0;
for(int i=0;i<=n;i++)
{
if(i*(i+1)==n)
{
System.out.print("YES");
flag=1;
break;
}
}
if(flag==0)
System.out.print("NO");
}
}
