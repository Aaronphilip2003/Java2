import java.io.*;
class Greatest
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter another number");
        int b=Integer.parseInt(br.readLine());
        if (a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b)
        {
            System.out.println(b+" is greater than "+a);
        }
        else
        {
            System.out.println("The numbers are Equal");
        }
    }
}