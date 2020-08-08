import java.io.*;
class Game101
{
        public Game101()
    {
        boolean b2;
    }
    public static void main(String args[])throws IOException

    {
        boolean b2;
        Game101 obj=new Game101();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the two digit number to open your account");
        int a[]=new int[2];
        for(int i=0;i<2;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<2;i++)
        if(a[i]==1)
        System.out.println("Digit 1 is correct");
        for(int i=0;i<2;i++)
        if(a[i]==2)
        System.out.println("Digit 2 is correct");
        b2=true;
        if(b2==true)
        System.out.println("Account is opened");
        else
        System.out.println("Account not opened");
    }
}
        
