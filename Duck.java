import java.io.*;
class Duck
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a=Integer.parseInt(br.readLine());
        int pro=1;
        while(a>0)
        {
            int r=a%10;
            pro*=r;
            a=a/10;
        }
        if(pro==0)
        System.out.println("DUCK NO");
        else
        System.out.println("NOT A DUCK NO.");
    }
}