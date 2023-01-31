import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scan.nextInt();
        
        Arrays.sort(arr);
        int c=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                if(arr[i]==c)
                c++;
                else
                break;
            }
        }
        System.out.print(c);
    }
}