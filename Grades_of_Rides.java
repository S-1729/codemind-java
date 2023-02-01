import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a>50 && b>60 && c>100)
        System.out.println(10);
        else if(a>50 && b>60)
        System.out.println(9);
        else if(b>60 && c>100)
        System.out.println(8);
        else if(a>50 && c>100)
        System.out.println(7);
        else if(a>50 || b>60 || c>100)
        System.out.println(6);
        else
        System.out.println(5);
    }
}