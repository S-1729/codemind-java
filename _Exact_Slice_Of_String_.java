import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int s=scan.nextInt();
        int e=scan.nextInt();
        for(int i=s;i<=e;i++)
        System.out.print(str.charAt(i));
    }
}