import java.io.*;
class Frequency123
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        String s1="";int c=0;
        System.out.println("Enter the alphabet whose frequency you want to count:");
        char ch=(char)br.read();
        for(int i=0;i<len;i++)
        {
            char ch1=s.charAt(i);
            if(ch1==ch)
            c++;
        }
        System.out.println(c);
    }
}