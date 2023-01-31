import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
        String str=str1+""+str2;
        int n=str.length();
        char arr[]=str.toCharArray();
        
        /*for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if((int)arr[i]>(int)arr[j])
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }*/
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+"");
    }
}