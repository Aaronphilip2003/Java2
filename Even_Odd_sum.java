import java.io.*;
class Even_Odd_sum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        int s=0,s1=0;
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        if(a[i]%2==0)
        s+=a[i];
        else
        s1+=a[i];
        System.out.println("Sum of Even numbers:"+s);
        System.out.println("Sum of Odd numbers:"+s1);
    }
}
    
